package com.example.stocklocator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Admin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val btn: Button = findViewById(R.id.button2)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, CrearCuenta::class.java)
            startActivity(intent)

        }

    }
}
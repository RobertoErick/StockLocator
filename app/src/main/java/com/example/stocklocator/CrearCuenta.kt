package com.example.stocklocator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CrearCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, Admin::class.java)
            startActivity(intent)
        }
    }
}
package com.example.stocklocator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CargaDeArticulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carga_de_articulo)

        val btn0: Button = findViewById(R.id.button6)
        btn0.setOnClickListener{
            val intent: Intent = Intent(this, Scanner:: class.java)
            startActivity(intent)
        }

        val btn: Button = findViewById(R.id.button8)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, CargaDeCatalogosYPedidos:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button11)
        btn2.setOnClickListener{
            val intent: Intent = Intent(this, CargaDeCatalogosYPedidos:: class.java)
            startActivity(intent)
        }


    }
}
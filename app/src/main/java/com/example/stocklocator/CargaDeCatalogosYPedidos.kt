package com.example.stocklocator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CargaDeCatalogosYPedidos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carga_de_catalogos_ypedidos)

        val btn: Button = findViewById(R.id.button5)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, CargaDeArticulo:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button7)
        btn2.setOnClickListener{
            val intent: Intent = Intent(this, CargaDeArticulo:: class.java)
            startActivity(intent)
        }
    }
}
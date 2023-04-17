package com.example.stocklocator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_iniciar_sesion: Button = findViewById(R.id.iniciar_sesion)
        btn_iniciar_sesion.setOnClickListener{
            val intent: Intent = Intent(this, Admin:: class.java)
            startActivity(intent)
        }

        lateinit var spinner: Spinner
        spinner = findViewById(R.id.spinner) as Spinner

        val opciones = arrayOf("Administrador", "Scanner")
        val adapter = ArrayAdapter(this, R.layout.spinner_item_opciones, opciones)
        spinner.adapter = adapter

        btn_iniciar_sesion.setOnClickListener {
            val seleccion = spinner.selectedItem.toString()
            if (seleccion == "Administrador") {
                val intent = Intent(this, Admin::class.java)
                startActivity(intent)
            } else if (seleccion == "Scanner") {
                val intent2 = Intent(this, Scanner::class.java)
                startActivity(intent2)
            }
        }
    }
}
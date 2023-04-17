package com.example.stocklocator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.stocklocator.databinding.ActivityScannerBinding
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult

class Scanner : AppCompatActivity() {
    private lateinit var binding: ActivityScannerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScannerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnScanner.setOnClickListener { initScanner() }
    }

    private fun initScanner() {
        val integrator = IntentIntegrator(this)
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES)     //Tipos de codigos que puede escanear
        integrator.setPrompt("Escanea el articulo")                             //Menzaje en la aprte inferior del escaner
        //integrator.setTorchEnabled(true)                                      //Si se quiere la linterna encendida
        integrator.setBeepEnabled(true)                                         //Lanza un pitido al escanear
        integrator.initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result:IntentResult = IntentIntegrator.parseActivityResult(requestCode,resultCode,data)
        if(result != null){
            if(result.contents == null){
                Toast.makeText(this,"Cancelado", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"El valor escaneado es: ${result.contents}", Toast.LENGTH_SHORT).show()
            }
        }else
        {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
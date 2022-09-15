package com.guilhermegalanti.introduoocean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var btnVoltar: Button? = null
        var tvResultado: TextView? = null

        val texto = intent.getStringExtra("Texto")

        btnVoltar = findViewById(R.id.btn_voltar)
        tvResultado = findViewById(R.id.tvResultado)

        tvResultado?.text = texto

        btnVoltar?.setOnClickListener {
            finish()
        }
    }
}
package com.guilhermegalanti.introduoocean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botaoMeAperte: Button? = null
        var tvPrincipal: TextView? = null
        var etName: EditText? = null

        var contador = 0

        botaoMeAperte = findViewById(R.id.botao_me_aperte)
        tvPrincipal = findViewById(R.id.tvPrincipal)
        etName = findViewById(R.id.etNome)

        botaoMeAperte?.setOnClickListener {

            val texto = etName?.text
            if(texto!!.isNotBlank()) {
                contador++
                Toast.makeText(this, "Ai que delícia!", Toast.LENGTH_LONG)
                    .show()
                tvPrincipal?.text = etName.text?.toString()
            } else etName.error = "Digite algo válido!"
        }
    }
}
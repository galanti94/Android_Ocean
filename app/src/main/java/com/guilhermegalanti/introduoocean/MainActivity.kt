package com.guilhermegalanti.introduoocean

import android.content.Intent
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
        var botaoNovaTela: Button? = null
        var tvPrincipal: TextView? = null
        var etName: EditText? = null

        var contador = 0

        botaoMeAperte = findViewById(R.id.botao_me_aperte)
        botaoNovaTela = findViewById(R.id.btnNovaTela)
        tvPrincipal = findViewById(R.id.tvPrincipal)
        etName = findViewById(R.id.etNome)

        botaoMeAperte?.setOnClickListener {

            val texto = etName?.text
            if(texto!!.isNotBlank()) {
                contador++
                Toast.makeText(this, "Ai que delícia!", Toast.LENGTH_LONG)
                    .show()
                tvPrincipal?.text = etName?.text?.toString()
            } else etName?.error = "Digite algo válido!"
        }

        botaoNovaTela?.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("Texto", etName?.text?.toString())
            startActivity(intent)
        }
    }
}
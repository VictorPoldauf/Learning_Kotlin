package br.com.possodirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        txvNome.text = intent.getStringExtra("nomeUsuario")

        val listaNumeros = arrayListOf<Int>()

        for (i in 0..100){
            listaNumeros.add(i)
        }

        spnIdade.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listaNumeros)

        btnCalcular.setOnClickListener {
            var valorSelecionado = spnIdade.selectedItem.toString().toInt()
            if (valorSelecionado >= 18){
                txvResultado.text = "Pode Dirigir"
            }else{
                txvResultado.text = "Não pode dirigir"
            }
        }
    }
}

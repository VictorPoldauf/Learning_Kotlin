package br.com.possodirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContinuar.setOnClickListener {

            if(edtNome.text.isNotEmpty()){
                val intentTela2 = Intent(this, Tela2::class.java)
                intentTela2.putExtra("nomeUsuario", edtNome.text.toString())
                startActivity(intentTela2)
            }else{
                Toast.makeText(this, "Preencha o campo corretamente", Toast.LENGTH_LONG).show()
            }

        }
    }
}

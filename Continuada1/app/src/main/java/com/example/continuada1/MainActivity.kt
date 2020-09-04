package com.example.continuada1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clique (componente: View){
        val idade = et_idade.text.toString().toInt()
        val rg = et_RG.text.toString().toInt()
        val nome = et_nome.text.toString().toString()
        val final = 18 - idade

        if (et_nome.length() < 2){
            Toast.makeText(
                this,
                "Escreve um nome real seu Zé!",
                Toast.LENGTH_SHORT
            ).show()
        }

        if (et_RG.length() < 9){
            Toast.makeText(
                this,
                "Coloca um RG de gente normal po!",
                Toast.LENGTH_LONG
            ).show()

        }

        if (et_idade.length() < 1){
            Toast.makeText(
                this,
                "Tu tem zero anos e saber ler? ",
            Toast.LENGTH_LONG
            ).show()
        }

        if (idade <= 17) {
                tv_resultado.text = "$nome vc nao tem idade para entrar seu tiriça, faltam $final ano/s :("
            tv_resultado.setTextColor(Color.RED)
        }
        else{
            tv_resultado.text = "$nome vc tem idade para entrar seu tiriça, bora cachaçar!!!!! :)"
            tv_resultado.setTextColor(Color.BLUE)
        }
    }
    }









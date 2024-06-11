package com.example.avaliacaokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.avaliacaokotlin.MainActivity
import com.example.avaliacaokotlin.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener{

            val celcius = binding.editCelsius.text.toString().toDouble()

            val celsiusParaFahrenheit = (celcius * 9/5) + 32

            val celsiusParaKelvin = celcius + 273.15

            val kelvinParaFahrenheit = (celsiusParaKelvin - 273.15) * 9/5 + 32

            binding.conversao1.text = "$celsiusParaFahrenheit"
            binding.conversao2.text = "$celsiusParaKelvin"
            binding.conversao3.text = "$kelvinParaFahrenheit"
        }

        binding.btnVoltar.setOnClickListener{
            val navegarVoltar = Intent(this, MainActivity::class.java)

            startActivity(navegarVoltar)
        }
    }
}

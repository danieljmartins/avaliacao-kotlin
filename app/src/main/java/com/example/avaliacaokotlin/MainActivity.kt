package com.example.avaliacaokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.avaliacaokotlin.SegundaTela
import com.example.avaliacaokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.icSegundaTela.setOnClickListener{
            val navegarSegundaTela = Intent(this, SegundaTela::class.java)

            startActivity(navegarSegundaTela)
        }
    }
}

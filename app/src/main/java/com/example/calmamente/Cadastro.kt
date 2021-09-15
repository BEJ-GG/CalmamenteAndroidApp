package com.example.calmamente

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class Cadastro : AppCompatActivity() {

    lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        spinner = findViewById(R.id.spinner)
        var gen = arrayOf("Masculino", "Feminino", "Não-binário")

        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, gen)

        fun onChatbot(v: View?) {

            val intent = Intent(this, ChatBot::class.java)
            startActivity(intent)
        }
    }
}
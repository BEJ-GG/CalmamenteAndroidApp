package com.example.calmamente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EstouMaisCalmo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estou_mais_calmo)

        fun onMain(v: View?) {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.calmamente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

//-----------------------------------------------------------
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun onCadastro(v: View?) {

            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }

        fun onLogin(v: View?) {

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        fun onEstouEmCrise(v: View?) {

            val intent = Intent(this, EstouMaisCalmo::class.java)
            startActivity(intent)
        }

    }
}
    /*
    override fun onStart() {
        super.onStart()

        Log.i("onStart", "onStart Ativado")
    }

    //-----------------------------------------------------------
    override fun onResume() {
        super.onResume()

        Log.i("onResume", "onResume Ativado")
    }

    //-----------------------------------------------------------
    override fun onPause() {
        super.onPause()

        Log.i("onPause", "onPause Ativado")
    }

    //-----------------------------------------------------------
    override fun onStop() {
        super.onStop()

        Log.i("onStop", "onStop Ativado")
    }

    //-----------------------------------------------------------
    override fun onDestroy() {
        super.onDestroy()

        Log.i("onDestroy", "onDestroy Ativado")
    }

    //-----------------------------------------------------------
    override fun onRestart() {
        super.onRestart()

        Log.i("onRestart", "onRestart Ativado")
    }
}
*/

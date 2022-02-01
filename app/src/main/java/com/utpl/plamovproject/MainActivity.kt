package com.utpl.plamovproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup() {
        title = "Menu"
        btn_registro.setOnClickListener {
            val registerIntent: Intent = Intent(this,RegisterActivity::class.java).apply {

            }
            startActivity(registerIntent)
        }
        btn_login.setOnClickListener {
            val loginIntent: Intent = Intent(this,LoginActivity::class.java).apply {

            }
            startActivity(loginIntent)
        }
    }
}

package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form01.*
import kotlinx.android.synthetic.main.activity_home.*


class Form01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form01)
    }

    private fun setup(email:String, provider:String){

        guardar.setOnClickListener{
            val mainActivity: Intent = Intent(this,Form01::class.java).apply {

                putExtra("email", email)
                putExtra("provider", provider)

            }
            startActivity(mainActivity)
        }
    }
}

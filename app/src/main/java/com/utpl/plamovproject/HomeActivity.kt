package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

enum class ProviderType {
    BASIC
}


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")


        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        btn01.setOnClickListener{
            val form01Intent: Intent = Intent(this,Form01::class.java).apply {

                putExtra("email", email)
                putExtra("provider", provider)

            }
            startActivity(form01Intent)
        }
        btn02.setOnClickListener{
            val form02Intent: Intent = Intent(this,Form02::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form02Intent)
        }
        btn03.setOnClickListener{
            val form03Intent: Intent = Intent(this,Form03::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form03Intent)
        }
        btn04.setOnClickListener{
            val form04Intent: Intent = Intent(this,Form04::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form04Intent)
        }
        btn05.setOnClickListener{
            val form05Intent: Intent = Intent(this,Form05::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form05Intent)
        }
        btn06.setOnClickListener{
            val form06Intent: Intent = Intent(this,Form06::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form06Intent)
        }
        btn07.setOnClickListener{
            val form07Intent: Intent = Intent(this,Form07::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form07Intent)
        }
        btn08.setOnClickListener{
            val form08Intent: Intent = Intent(this,Form08::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form08Intent)
        }
        btn09.setOnClickListener{
            val form09Intent: Intent = Intent(this,Form09::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form09Intent)
        }
        btn10.setOnClickListener{
            val form10Intent: Intent = Intent(this,Form10::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form10Intent)
        }
        btn11.setOnClickListener{
            val form11Intent: Intent = Intent(this,Form11::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form11Intent)
        }
        btn12.setOnClickListener{
            val form12Intent: Intent = Intent(this,Form12::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form12Intent)
        }
        btn13.setOnClickListener{
            val form13Intent: Intent = Intent(this,Form13::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form13Intent)
        }
        btn14.setOnClickListener{
            val form14Intent: Intent = Intent(this,Form14::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form14Intent)
        }
        btn15.setOnClickListener{
            val form15Intent: Intent = Intent(this,Form15::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form15Intent)
        }
        btn16.setOnClickListener{
            val form16Intent: Intent = Intent(this,Form16::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form16Intent)
        }
        btn17.setOnClickListener{
            val form17Intent: Intent = Intent(this,Form17::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form17Intent)
        }
        btn18.setOnClickListener{
            val form18Intent: Intent = Intent(this,Form18::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form18Intent)
        }
        btn19.setOnClickListener{
            val form19Intent: Intent = Intent(this,Form19::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form19Intent)
        }
        btn20.setOnClickListener{
            val form20Intent: Intent = Intent(this,Form20::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form20Intent)
        }
        btn21.setOnClickListener{
            val form21Intent: Intent = Intent(this,Form21::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form21Intent)
        }
        btn22.setOnClickListener{
            val form22Intent: Intent = Intent(this,Form22::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form22Intent)
        }

        btn_salir.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }
}
package com.utpl.plamovproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form18.atras
import kotlinx.android.synthetic.main.activity_form18.menu
import kotlinx.android.synthetic.main.activity_form18.siguiente
import kotlinx.android.synthetic.main.activity_form21.*

class Form21 : AppCompatActivity() {
    var formulario = "fo21"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form21)
        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)

            }
            startActivity(MenuIntent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form12Intent: Intent = Intent(this,Form12::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form12Intent)
        }

        menu.setOnClickListener{
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(MenuIntent)

        }
    }

    fun guardarDatos(email: String, provider: String){
        db.collection(email).document(formulario).set(

            hashMapOf("provider" to provider,
                //f21_01

                "f21_1 " to f21_1.text.toString(),
                "f21_2 " to f21_2.text.toString(),

                "f21_3 " to f21_3.text.toString(),
                "f21_4 " to f21_4.text.toString(),
                "f21_5 " to f21_5.text.toString(),

                "f21_6 " to f21_6.text.toString(),
                "f21_7 " to f21_7.text.toString(),
                "f21_8 " to f21_8.text.toString(),

                "f21_9 " to f21_9.text.toString(),
                "f21_10 " to f21_10.text.toString(),
                "f21_11 " to f21_11.text.toString(),

                "f21_12 " to f21_12.text.toString(),
                "f21_13 " to f21_13.text.toString(),
                "f21_14 " to f21_14.text.toString(),
                "f21_15 " to f21_15.text.toString(),
                "f21_16 " to f21_16.text.toString(),



                "completef21" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if  (f21_1 .text.toString().equals("")){complete = false;}
        if  (f21_2 .text.toString().equals("")){complete = false;}
        if  (f21_3 .text.toString().equals("")){complete = false;}

        if  (f21_4 .text.toString().equals("")){complete = false;}
        if  (f21_5 .text.toString().equals("")){complete = false;}
        if  (f21_6 .text.toString().equals("")){complete = false;}

        if  (f21_7 .text.toString().equals("")){complete = false;}
        if  (f21_8 .text.toString().equals("")){complete = false;}
        if  (f21_9 .text.toString().equals("")){complete = false;}

        if  (f21_10 .text.toString().equals("")){complete = false;}
        if  (f21_11 .text.toString().equals("")){complete = false;}
        if  (f21_12 .text.toString().equals("")){complete = false;}

        if  (f21_13 .text.toString().equals("")){complete = false;}
        if  (f21_14 .text.toString().equals("")){complete = false;}
        if  (f21_15 .text.toString().equals("")){complete = false;}

        if  (f21_16 .text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {

            f21_1.setText(it.get("f21_1") as String?)
            f21_2.setText(it.get("f21_2") as String?)

            f21_3.setText(it.get("f21_3") as String?)
            f21_4.setText(it.get("f21_4") as String?)
            f21_5.setText(it.get("f21_5") as String?)

            f21_6.setText(it.get("f21_6") as String?)
            f21_7.setText(it.get("f21_7") as String?)
            f21_8.setText(it.get("f21_8") as String?)

            f21_9.setText(it.get("f21_9") as String?)
            f21_10.setText(it.get("f21_10") as String?)
            f21_11.setText(it.get("f21_11") as String?)

            f21_12.setText(it.get("f21_12") as String?)
            f21_13.setText(it.get("f21_13") as String?)
            f21_14.setText(it.get("f21_14") as String?)

            f21_15.setText(it.get("f21_15") as String?)
            f21_16.setText(it.get("f21_16") as String?)






            if (completeFun().equals("true")){
                progressTextf21.setText("Sección Completa")
            }else{
                progressTextf21.setText("Sección Incompleta")
            }


        }
    }
}
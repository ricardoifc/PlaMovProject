package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form04.*


class Form04 : AppCompatActivity() {
    var formulario = "fo04"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form04)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form06Intent: Intent = Intent(this,Form06::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form06Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form03Intent: Intent = Intent(this,Form03::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form03Intent)
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

                "f04_01" to f04_01.text.toString(),
                "f04_02" to f04_02.text.toString(),
                "f04_03" to f04_03.text.toString(),
                "f04_04" to f04_04.text.toString(),
                "f04_05" to f04_05.text.toString(),
                "f04_06" to f04_06.text.toString(),
                "f04_07" to f04_07.text.toString(),
                "f04_08" to f04_08.text.toString(),
                "f04_09" to f04_09.text.toString(),
                "f04_10" to f04_10.text.toString(),
                "f04_11" to f04_11.text.toString(),
                "f04_12" to f04_12.text.toString(),
                "f04_13" to f04_13.text.toString(),
                "f04_14" to f04_14.text.toString(),
                "f04_15" to f04_15.text.toString(),
                "f04_16" to f04_16.text.toString(),
                "f04_17" to f04_17.text.toString(),
                "f04_18" to f04_18.text.toString(),
                "f04_19" to f04_19.text.toString(),
                "f04_20" to f04_20.text.toString(),
                "f04_21" to f04_21.text.toString(),
                "f04_22" to f04_22.text.toString(),
                "f04_23" to f04_23.text.toString(),
                "f04_24" to f04_24.text.toString(),

                "completef04" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f04_01.text.toString().equals("")){complete = false;}
        if(f04_02.text.toString().equals("")){complete = false;}
        if(f04_03.text.toString().equals("")){complete = false;}
        if(f04_04.text.toString().equals("")){complete = false;}
        if(f04_05.text.toString().equals("")){complete = false;}
        if(f04_06.text.toString().equals("")){complete = false;}
        if(f04_07.text.toString().equals("")){complete = false;}
        if(f04_08.text.toString().equals("")){complete = false;}
        if(f04_09.text.toString().equals("")){complete = false;}
        if(f04_10.text.toString().equals("")){complete = false;}
        if(f04_11.text.toString().equals("")){complete = false;}
        if(f04_12.text.toString().equals("")){complete = false;}
        if(f04_13.text.toString().equals("")){complete = false;}
        if(f04_14.text.toString().equals("")){complete = false;}
        if(f04_15.text.toString().equals("")){complete = false;}
        if(f04_16.text.toString().equals("")){complete = false;}
        if(f04_17.text.toString().equals("")){complete = false;}
        if(f04_18.text.toString().equals("")){complete = false;}
        if(f04_19.text.toString().equals("")){complete = false;}
        if(f04_20.text.toString().equals("")){complete = false;}
        if(f04_21.text.toString().equals("")){complete = false;}
        if(f04_22.text.toString().equals("")){complete = false;}
        if(f04_23.text.toString().equals("")){complete = false;}
        if(f04_24.text.toString().equals("")){complete = false;}


        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f04_01.setText(it.get("f04_01") as String?)
            f04_02.setText(it.get("f04_02") as String?)
            f04_03.setText(it.get("f04_03") as String?)
            f04_04.setText(it.get("f04_04") as String?)
            f04_05.setText(it.get("f04_05") as String?)
            f04_06.setText(it.get("f04_06") as String?)
            f04_07.setText(it.get("f04_07") as String?)
            f04_08.setText(it.get("f04_08") as String?)
            f04_09.setText(it.get("f04_09") as String?)
            f04_10.setText(it.get("f04_10") as String?)
            f04_11.setText(it.get("f04_11") as String?)
            f04_12.setText(it.get("f04_12") as String?)
            f04_13.setText(it.get("f04_13") as String?)
            f04_14.setText(it.get("f04_14") as String?)
            f04_15.setText(it.get("f04_15") as String?)
            f04_16.setText(it.get("f04_16") as String?)
            f04_17.setText(it.get("f04_17") as String?)
            f04_18.setText(it.get("f04_18") as String?)
            f04_19.setText(it.get("f04_19") as String?)
            f04_20.setText(it.get("f04_20") as String?)
            f04_21.setText(it.get("f04_21") as String?)
            f04_22.setText(it.get("f04_22") as String?)
            f04_23.setText(it.get("f04_23") as String?)
            f04_24.setText(it.get("f04_24") as String?)

            if (completeFun().equals("true")){
                progressTextF04.setText("Sección Completa")
            }else{
                progressTextF04.setText("Sección Incompleta")
            }


        }
    }


}

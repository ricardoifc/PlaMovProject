package com.utpl.plamovproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form14.*
import kotlinx.android.synthetic.main.activity_form14.atras
import kotlinx.android.synthetic.main.activity_form14.menu
import kotlinx.android.synthetic.main.activity_form14.siguiente
import kotlinx.android.synthetic.main.activity_form14.*

class Form14 : AppCompatActivity() {
    var formulario = "fo14"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form14)

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
                //14_01
                "f14_01" to f14_01.text.toString(),
                "f14_03" to f14_03.text.toString(),
                "f14_04" to f14_04.text.toString(),
                "f14_05" to f14_05.text.toString(),
                "f14_06" to f14_06.text.toString(),
                "f14_07" to f14_07.text.toString(),
                "f14_08" to f14_08.text.toString(),
                "f14_09" to f14_09.text.toString(),
                "f14_10" to f14_10.text.toString(),
                "f14_11" to f14_11.text.toString(),
                "f14_12" to f14_12.text.toString(),
                "f14_13" to f14_13.text.toString(),
                "f14_14" to f14_14.text.toString(),
                "f14_15" to f14_15.text.toString(),
                "f14_16" to f14_16.text.toString(),
                "f14_17" to f14_17.text.toString(),
                "f14_18" to f14_18.text.toString(),
                "f14_19" to f14_19.text.toString(),
                "f14_20" to f14_20.text.toString(),
                "f14_21" to f14_21.text.toString(),
                "f14_22" to f14_22.text.toString(),
                "f14_23" to f14_23.text.toString(),
                "f14_24" to f14_24.text.toString(),
                "f14_25" to f14_25.text.toString(),
                "f14_26" to f14_26.text.toString(),
                "f14_27" to f14_27.text.toString(),
                "f14_28" to f14_28.text.toString(),
                "completef14" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f14_01.text.toString().equals("")){complete = false;}
        if(f14_03.text.toString().equals("")){complete = false;}
        if(f14_04.text.toString().equals("")){complete = false;}
        if(f14_05.text.toString().equals("")){complete = false;}
        if(f14_06.text.toString().equals("")){complete = false;}
        if(f14_07.text.toString().equals("")){complete = false;}
        if(f14_08.text.toString().equals("")){complete = false;}
        if(f14_09.text.toString().equals("")){complete = false;}
        if(f14_10.text.toString().equals("")){complete = false;}
        if(f14_11.text.toString().equals("")){complete = false;}
        if(f14_12.text.toString().equals("")){complete = false;}
        if(f14_13.text.toString().equals("")){complete = false;}
        if(f14_14.text.toString().equals("")){complete = false;}
        if(f14_15.text.toString().equals("")){complete = false;}
        if(f14_16.text.toString().equals("")){complete = false;}
        if(f14_17.text.toString().equals("")){complete = false;}
        if(f14_18.text.toString().equals("")){complete = false;}
        if(f14_19.text.toString().equals("")){complete = false;}
        if(f14_20.text.toString().equals("")){complete = false;}
        if(f14_21.text.toString().equals("")){complete = false;}
        if(f14_22.text.toString().equals("")){complete = false;}
        if(f14_23.text.toString().equals("")){complete = false;}
        if(f14_24.text.toString().equals("")){complete = false;}
        if(f14_25.text.toString().equals("")){complete = false;}
        if(f14_26.text.toString().equals("")){complete = false;}
        if(f14_27.text.toString().equals("")){complete = false;}
        if(f14_28.text.toString().equals("")){complete = false;}


        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f14_01.setText(it.get("f14_01") as String?)
            f14_03.setText(it.get("f14_03") as String?)
            f14_04.setText(it.get("f14_04") as String?)
            f14_05.setText(it.get("f14_05") as String?)
            f14_06.setText(it.get("f14_06") as String?)
            f14_07.setText(it.get("f14_07") as String?)
            f14_08.setText(it.get("f14_08") as String?)
            f14_09.setText(it.get("f14_09") as String?)
            f14_10.setText(it.get("f14_10") as String?)
            f14_11.setText(it.get("f14_11") as String?)
            f14_12.setText(it.get("f14_12") as String?)
            f14_13.setText(it.get("f14_13") as String?)
            f14_14.setText(it.get("f14_14") as String?)
            f14_15.setText(it.get("f14_15") as String?)
            f14_16.setText(it.get("f14_16") as String?)
            f14_17.setText(it.get("f14_17") as String?)
            f14_18.setText(it.get("f14_18") as String?)
            f14_19.setText(it.get("f14_19") as String?)
            f14_20.setText(it.get("f14_20") as String?)
            f14_21.setText(it.get("f14_21") as String?)
            f14_22.setText(it.get("f14_22") as String?)
            f14_23.setText(it.get("f14_23") as String?)
            f14_24.setText(it.get("f14_24") as String?)
            f14_25.setText(it.get("f14_25") as String?)
            f14_26.setText(it.get("f14_26") as String?)
            f14_27.setText(it.get("f14_27") as String?)
            f14_28.setText(it.get("f14_28") as String?)

            if (completeFun().equals("true")){
                progressTextf14.setText("Sección Completa")
            }else{
                progressTextf14.setText("Sección Incompleta")
            }


        }
    }

}
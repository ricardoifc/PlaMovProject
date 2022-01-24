package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form01.*
import kotlinx.android.synthetic.main.activity_form12.*
import kotlinx.android.synthetic.main.activity_form12.atras
import kotlinx.android.synthetic.main.activity_form12.menu
import kotlinx.android.synthetic.main.activity_form12.siguiente

class Form12 : AppCompatActivity() {
    var formulario = "fo12"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form12)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form13Intent: Intent = Intent(this,Form13::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form13Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form11Intent: Intent = Intent(this,Form11::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form11Intent)
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

                "f12_01" to f12_01.text.toString(),
                "f12_02" to f12_02.text.toString(),
                "f12_03" to f12_03.text.toString(),
                "f12_04" to f12_04.text.toString(),
                "f12_05" to f12_05.text.toString(),
                "f12_06" to f12_06.text.toString(),
                "f12_07" to f12_07.text.toString(),
                "f12_08" to f12_08.text.toString(),
                "f12_09" to f12_09.text.toString(),
                "f12_10" to f12_10.text.toString(),
                "f12_11" to f12_11.text.toString(),
                "f12_12" to f12_12.text.toString(),
                "f12_13" to f12_13.text.toString(),
                "f12_14" to f12_14.text.toString(),
                "f12_15" to f12_15.text.toString(),
                "f12_16" to f12_16.text.toString(),
                "f12_17" to f12_17.text.toString(),
                "f12_18" to f12_18.text.toString(),
                "f12_19" to f12_19.text.toString(),
                "f12_20" to f12_20.text.toString(),
                "f12_21" to f12_21.text.toString(),
                "f12_22" to f12_22.text.toString(),
                "f12_23" to f12_23.text.toString(),
                "completef12" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f12_01.text.toString().equals("")){complete = false;}
        if(f12_02.text.toString().equals("")){complete = false;}
        if(f12_03.text.toString().equals("")){complete = false;}
        if(f12_04.text.toString().equals("")){complete = false;}
        if(f12_05.text.toString().equals("")){complete = false;}
        if(f12_06.text.toString().equals("")){complete = false;}
        if(f12_07.text.toString().equals("")){complete = false;}
        if(f12_08.text.toString().equals("")){complete = false;}
        if(f12_09.text.toString().equals("")){complete = false;}
        if(f12_10.text.toString().equals("")){complete = false;}
        if(f12_11.text.toString().equals("")){complete = false;}
        if(f12_12.text.toString().equals("")){complete = false;}
        if(f12_13.text.toString().equals("")){complete = false;}
        if(f12_14.text.toString().equals("")){complete = false;}
        if(f12_15.text.toString().equals("")){complete = false;}
        if(f12_16.text.toString().equals("")){complete = false;}
        if(f12_17.text.toString().equals("")){complete = false;}
        if(f12_18.text.toString().equals("")){complete = false;}
        if(f12_19.text.toString().equals("")){complete = false;}
        if(f12_20.text.toString().equals("")){complete = false;}
        if(f12_21.text.toString().equals("")){complete = false;}
        if(f12_22.text.toString().equals("")){complete = false;}
        if(f12_23.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f12_01.setText(it.get("f12_01") as String?)
            f12_02.setText(it.get("f12_02") as String?)
            f12_03.setText(it.get("f12_03") as String?)
            f12_04.setText(it.get("f12_04") as String?)
            f12_05.setText(it.get("f12_05") as String?)
            f12_06.setText(it.get("f12_06") as String?)
            f12_07.setText(it.get("f12_07") as String?)
            f12_08.setText(it.get("f12_08") as String?)
            f12_09.setText(it.get("f12_09") as String?)
            f12_10.setText(it.get("f12_10") as String?)
            f12_11.setText(it.get("f12_11") as String?)
            f12_12.setText(it.get("f12_12") as String?)
            f12_13.setText(it.get("f12_13") as String?)
            f12_14.setText(it.get("f12_14") as String?)
            f12_15.setText(it.get("f12_15") as String?)
            f12_16.setText(it.get("f12_16") as String?)
            f12_17.setText(it.get("f12_17") as String?)
            f12_18.setText(it.get("f12_18") as String?)
            f12_19.setText(it.get("f12_19") as String?)
            f12_20.setText(it.get("f12_20") as String?)
            f12_21.setText(it.get("f12_21") as String?)
            f12_22.setText(it.get("f12_22") as String?)
            f12_23.setText(it.get("f12_23") as String?)

            if (completeFun().equals("true")){
                progressTextf12.setText("Sección Completa")
            }else{
                progressTextf12.setText("Sección Incompleta")
            }


        }
    }
}

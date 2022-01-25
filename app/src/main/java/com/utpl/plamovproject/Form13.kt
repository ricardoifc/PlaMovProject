package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form13.*
import kotlinx.android.synthetic.main.activity_form13.atras
import kotlinx.android.synthetic.main.activity_form13.menu
import kotlinx.android.synthetic.main.activity_form13.siguiente

class Form13 : AppCompatActivity() {
    var formulario = "fo13"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form13)

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

                "f13_01" to f13_01.text.toString(),
                "f13_03" to f13_03.text.toString(),
                "f13_04" to f13_04.text.toString(),
                "f13_05" to f13_05.text.toString(),
                "f13_06" to f13_06.text.toString(),
                "f13_07" to f13_07.text.toString(),
                "f13_08" to f13_08.text.toString(),
                "f13_09" to f13_09.text.toString(),
                "f13_10" to f13_10.text.toString(),
                "f13_11" to f13_11.text.toString(),
                "f13_12" to f13_12.text.toString(),
                "f13_13" to f13_13.text.toString(),
                "f13_14" to f13_14.text.toString(),
                "f13_15" to f13_15.text.toString(),
                "f13_16" to f13_16.text.toString(),
                "f13_17" to f13_17.text.toString(),
                "f13_18" to f13_18.text.toString(),
                "f13_19" to f13_19.text.toString(),
                "f13_20" to f13_20.text.toString(),
                "f13_21" to f13_21.text.toString(),
                "f13_22" to f13_22.text.toString(),
                "f13_23" to f13_23.text.toString(),
                "f13_24" to f13_24.text.toString(),
                "f13_25" to f13_25.text.toString(),
                "f13_26" to f13_26.text.toString(),
                "f13_27" to f13_27.text.toString(),
                "f13_28" to f13_28.text.toString(),
                "f13_29" to f13_29.text.toString(),
                "f13_30" to f13_30.text.toString(),
                "f13_31" to f13_31.text.toString(),
                "f13_32" to f13_32.text.toString(),
                "f13_33" to f13_33.text.toString(),
                "f13_34" to f13_34.text.toString(),
                "f13_35" to f13_35.text.toString(),
                "completef13" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f13_01.text.toString().equals("")){complete = false;}
        if(f13_03.text.toString().equals("")){complete = false;}
        if(f13_04.text.toString().equals("")){complete = false;}
        if(f13_05.text.toString().equals("")){complete = false;}
        if(f13_06.text.toString().equals("")){complete = false;}
        if(f13_07.text.toString().equals("")){complete = false;}
        if(f13_08.text.toString().equals("")){complete = false;}
        if(f13_09.text.toString().equals("")){complete = false;}
        if(f13_10.text.toString().equals("")){complete = false;}
        if(f13_11.text.toString().equals("")){complete = false;}
        if(f13_12.text.toString().equals("")){complete = false;}
        if(f13_13.text.toString().equals("")){complete = false;}
        if(f13_14.text.toString().equals("")){complete = false;}
        if(f13_15.text.toString().equals("")){complete = false;}
        if(f13_16.text.toString().equals("")){complete = false;}
        if(f13_17.text.toString().equals("")){complete = false;}
        if(f13_18.text.toString().equals("")){complete = false;}
        if(f13_19.text.toString().equals("")){complete = false;}
        if(f13_20.text.toString().equals("")){complete = false;}
        if(f13_21.text.toString().equals("")){complete = false;}
        if(f13_22.text.toString().equals("")){complete = false;}
        if(f13_23.text.toString().equals("")){complete = false;}
        if(f13_24.text.toString().equals("")){complete = false;}
        if(f13_25.text.toString().equals("")){complete = false;}
        if(f13_26.text.toString().equals("")){complete = false;}
        if(f13_27.text.toString().equals("")){complete = false;}
        if(f13_28.text.toString().equals("")){complete = false;}
        if(f13_29.text.toString().equals("")){complete = false;}
        if(f13_30.text.toString().equals("")){complete = false;}
        if(f13_31.text.toString().equals("")){complete = false;}
        if(f13_32.text.toString().equals("")){complete = false;}
        if(f13_33.text.toString().equals("")){complete = false;}
        if(f13_34.text.toString().equals("")){complete = false;}
        if(f13_35.text.toString().equals("")){complete = false;}


        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f13_01.setText(it.get("f13_01") as String?)
            f13_03.setText(it.get("f13_03") as String?)
            f13_04.setText(it.get("f13_04") as String?)
            f13_05.setText(it.get("f13_05") as String?)
            f13_06.setText(it.get("f13_06") as String?)
            f13_07.setText(it.get("f13_07") as String?)
            f13_08.setText(it.get("f13_08") as String?)
            f13_09.setText(it.get("f13_09") as String?)
            f13_10.setText(it.get("f13_10") as String?)
            f13_11.setText(it.get("f13_11") as String?)
            f13_12.setText(it.get("f13_12") as String?)
            f13_13.setText(it.get("f13_13") as String?)
            f13_14.setText(it.get("f13_14") as String?)
            f13_15.setText(it.get("f13_15") as String?)
            f13_16.setText(it.get("f13_16") as String?)
            f13_17.setText(it.get("f13_17") as String?)
            f13_18.setText(it.get("f13_18") as String?)
            f13_19.setText(it.get("f13_19") as String?)
            f13_20.setText(it.get("f13_20") as String?)
            f13_21.setText(it.get("f13_21") as String?)
            f13_22.setText(it.get("f13_22") as String?)
            f13_23.setText(it.get("f13_23") as String?)
            f13_24.setText(it.get("f13_24") as String?)
            f13_25.setText(it.get("f13_25") as String?)
            f13_26.setText(it.get("f13_26") as String?)
            f13_27.setText(it.get("f13_27") as String?)
            f13_28.setText(it.get("f13_28") as String?)
            f13_29.setText(it.get("f13_29") as String?)
            f13_30.setText(it.get("f13_30") as String?)
            f13_31.setText(it.get("f13_31") as String?)
            f13_32.setText(it.get("f13_32") as String?)
            f13_33.setText(it.get("f13_33") as String?)
            f13_34.setText(it.get("f13_34") as String?)
            f13_35.setText(it.get("f13_35") as String?)

            if (completeFun().equals("true")){
                progressTextf13.setText("Sección Completa")
            }else{
                progressTextf13.setText("Sección Incompleta")
            }


        }
    }


}

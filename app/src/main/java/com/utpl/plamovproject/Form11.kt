package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form11.*

class Form11 : AppCompatActivity() {
    var formulario = "fo11"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form11)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form12Intent: Intent = Intent(this,Form12::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form12Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form09Intent: Intent = Intent(this,Form09::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form09Intent)
        }

        menu.setOnClickListener{
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(MenuIntent)

        }
    }

    fun guardarDatos(email: String, provider: String){
        db.collection(email).document(formulario).set(

            hashMapOf("provider" to provider,

                "f11_01" to f11_01.text.toString(),
                "f11_02" to f11_02.text.toString(),
                "f11_03" to f11_03.text.toString(),
                "f11_04" to f11_04.text.toString(),
                "f11_05" to f11_05.text.toString(),
                "f11_06" to f11_06.text.toString(),
                "f11_07" to f11_07.text.toString(),
                "f11_08" to f11_08.text.toString(),
                "f11_09" to f11_09.text.toString(),
                "f11_10" to f11_10.text.toString(),
                "f11_11" to f11_11.text.toString(),
                "f11_12" to f11_12.text.toString(),
                "f11_13" to f11_13.text.toString(),
                "f11_14" to f11_14.text.toString(),
                "f11_15" to f11_15.text.toString(),
                "f11_16" to f11_16.text.toString(),
                "f11_17" to f11_17.text.toString(),
                "f11_18" to f11_18.text.toString(),
                "f11_19" to f11_19.text.toString(),
                "f11_20" to f11_20.text.toString(),
                "f11_21" to f11_21.text.toString(),
                "f11_22" to f11_22.text.toString(),
                "f11_23" to f11_23.text.toString(),
                "f11_24" to f11_24.text.toString(),
                "f11_25" to f11_25.text.toString(),
                "f11_26" to f11_26.text.toString(),
                "f11_27" to f11_27.text.toString(),
                "f11_28" to f11_28.text.toString(),
                "f11_29" to f11_29.text.toString(),
                "completef11" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f11_01.text.toString().equals("")){complete = false;}
        if(f11_02.text.toString().equals("")){complete = false;}
        if(f11_03.text.toString().equals("")){complete = false;}
        if(f11_04.text.toString().equals("")){complete = false;}
        if(f11_05.text.toString().equals("")){complete = false;}
        if(f11_06.text.toString().equals("")){complete = false;}
        if(f11_07.text.toString().equals("")){complete = false;}
        if(f11_08.text.toString().equals("")){complete = false;}
        if(f11_09.text.toString().equals("")){complete = false;}
        if(f11_10.text.toString().equals("")){complete = false;}
        if(f11_11.text.toString().equals("")){complete = false;}
        if(f11_12.text.toString().equals("")){complete = false;}
        if(f11_13.text.toString().equals("")){complete = false;}
        if(f11_14.text.toString().equals("")){complete = false;}
        if(f11_15.text.toString().equals("")){complete = false;}
        if(f11_16.text.toString().equals("")){complete = false;}
        if(f11_17.text.toString().equals("")){complete = false;}
        if(f11_18.text.toString().equals("")){complete = false;}
        if(f11_19.text.toString().equals("")){complete = false;}
        if(f11_20.text.toString().equals("")){complete = false;}
        if(f11_21.text.toString().equals("")){complete = false;}
        if(f11_22.text.toString().equals("")){complete = false;}
        if(f11_23.text.toString().equals("")){complete = false;}
        if(f11_24.text.toString().equals("")){complete = false;}
        if(f11_25.text.toString().equals("")){complete = false;}
        if(f11_26.text.toString().equals("")){complete = false;}
        if(f11_27.text.toString().equals("")){complete = false;}
        if(f11_28.text.toString().equals("")){complete = false;}
        if(f11_29.text.toString().equals("")){complete = false;}
        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f11_01.setText(it.get("f11_01") as String?)
            f11_02.setText(it.get("f11_02") as String?)
            f11_03.setText(it.get("f11_03") as String?)
            f11_04.setText(it.get("f11_04") as String?)
            f11_05.setText(it.get("f11_05") as String?)
            f11_06.setText(it.get("f11_06") as String?)
            f11_07.setText(it.get("f11_07") as String?)
            f11_08.setText(it.get("f11_08") as String?)
            f11_09.setText(it.get("f11_09") as String?)
            f11_10.setText(it.get("f11_10") as String?)
            f11_11.setText(it.get("f11_11") as String?)
            f11_12.setText(it.get("f11_12") as String?)
            f11_13.setText(it.get("f11_13") as String?)
            f11_14.setText(it.get("f11_14") as String?)
            f11_15.setText(it.get("f11_15") as String?)
            f11_16.setText(it.get("f11_16") as String?)
            f11_17.setText(it.get("f11_17") as String?)
            f11_18.setText(it.get("f11_18") as String?)
            f11_19.setText(it.get("f11_19") as String?)
            f11_20.setText(it.get("f11_20") as String?)
            f11_21.setText(it.get("f11_21") as String?)
            f11_22.setText(it.get("f11_22") as String?)
            f11_23.setText(it.get("f11_23") as String?)
            f11_24.setText(it.get("f11_24") as String?)
            f11_25.setText(it.get("f11_25") as String?)
            f11_26.setText(it.get("f11_26") as String?)
            f11_27.setText(it.get("f11_27") as String?)
            f11_28.setText(it.get("f11_28") as String?)
            f11_29.setText(it.get("f11_29") as String?)

            if (completeFun().equals("true")){
                progressTextF11.setText("Sección Completa")
            }else{
                progressTextF11.setText("Sección Incompleta")
            }


        }
    }

}

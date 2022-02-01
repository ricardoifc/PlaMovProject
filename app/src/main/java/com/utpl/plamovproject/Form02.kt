package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form02.*



class Form02 : AppCompatActivity() {
    var formulario = "fo02"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form02)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form03Intent: Intent = Intent(this,Form03::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish()
            startActivity(form03Intent)


        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val atrasIntent: Intent = Intent(this,Form01::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(atrasIntent)

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

                "f02_01" to f02_01.text.toString(),
                "f02_02" to f02_02.text.toString(),
                "f02_03" to f02_03.text.toString(),
                "f02_04" to f02_04.text.toString(),
                "f02_05" to f02_05.text.toString(),
                "f02_06" to f02_06.text.toString(),
                "f02_07" to f02_07.text.toString(),
                "f02_08" to f02_08.text.toString(),
                "f02_09" to f02_09.text.toString(),
                "f02_10" to f02_10.text.toString(),
                "f02_11" to f02_11.text.toString(),
                "f02_12" to f02_12.text.toString(),
                "f02_13" to f02_13.text.toString(),
                "f02_14" to f02_14.text.toString(),
                "f02_15" to f02_15.text.toString(),
                "f02_16" to f02_16.text.toString(),
                "f02_17" to f02_17.text.toString(),
                "f02_18" to f02_18.text.toString(),
                "f02_19" to f02_19.text.toString(),
                "f02_20" to f02_20.text.toString(),
                "f02_21" to f02_21.text.toString(),
                "f02_22" to f02_22.text.toString(),
                "f02_23" to f02_23.text.toString(),
                "f02_24" to f02_24.text.toString(),
                "f02_25" to f02_25.text.toString(),
                "f02_26" to f02_26.text.toString(),
                "f02_27" to f02_27.text.toString(),
                "f02_28" to f02_28.text.toString(),
                "f02_29" to f02_29.text.toString(),
                "f02_30" to f02_30.text.toString(),
                "f02_31" to f02_31.text.toString(),


                "completef02" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f02_01.text.toString().equals("")){complete = false;}
        if(f02_02.text.toString().equals("")){complete = false;}
        if(f02_03.text.toString().equals("")){complete = false;}
        if(f02_04.text.toString().equals("")){complete = false;}
        if(f02_05.text.toString().equals("")){complete = false;}
        if(f02_06.text.toString().equals("")){complete = false;}
        if(f02_07.text.toString().equals("")){complete = false;}
        if(f02_08.text.toString().equals("")){complete = false;}
        if(f02_09.text.toString().equals("")){complete = false;}
        if(f02_10.text.toString().equals("")){complete = false;}
        if(f02_11.text.toString().equals("")){complete = false;}
        if(f02_12.text.toString().equals("")){complete = false;}
        if(f02_13.text.toString().equals("")){complete = false;}
        if(f02_14.text.toString().equals("")){complete = false;}
        if(f02_15.text.toString().equals("")){complete = false;}
        if(f02_16.text.toString().equals("")){complete = false;}
        if(f02_17.text.toString().equals("")){complete = false;}
        if(f02_18.text.toString().equals("")){complete = false;}
        if(f02_19.text.toString().equals("")){complete = false;}
        if(f02_20.text.toString().equals("")){complete = false;}
        if(f02_21.text.toString().equals("")){complete = false;}
        if(f02_22.text.toString().equals("")){complete = false;}
        if(f02_23.text.toString().equals("")){complete = false;}
        if(f02_24.text.toString().equals("")){complete = false;}
        if(f02_25.text.toString().equals("")){complete = false;}
        if(f02_26.text.toString().equals("")){complete = false;}
        if(f02_27.text.toString().equals("")){complete = false;}
        if(f02_28.text.toString().equals("")){complete = false;}
        if(f02_29.text.toString().equals("")){complete = false;}
        if(f02_30.text.toString().equals("")){complete = false;}
        if(f02_31.text.toString().equals("")){complete = false;}



        if (complete == false){
            completeS= "false"
        }
        return completeS
    }

    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f02_01.setText(it.get("f02_01") as String?)

            f02_02.setText(it.get("f02_02") as String?)
            f02_03.setText(it.get("f02_03") as String?)
            f02_04.setText(it.get("f02_04") as String?)
            f02_05.setText(it.get("f02_05") as String?)
            f02_06.setText(it.get("f02_06") as String?)
            f02_07.setText(it.get("f02_07") as String?)
            f02_08.setText(it.get("f02_08") as String?)
            f02_09.setText(it.get("f02_09") as String?)
            f02_10.setText(it.get("f02_10") as String?)
            f02_11.setText(it.get("f02_11") as String?)
            f02_12.setText(it.get("f02_12") as String?)
            f02_13.setText(it.get("f02_13") as String?)
            f02_14.setText(it.get("f02_14") as String?)
            f02_15.setText(it.get("f02_15") as String?)
            f02_16.setText(it.get("f02_16") as String?)
            f02_17.setText(it.get("f02_17") as String?)
            f02_18.setText(it.get("f02_18") as String?)
            f02_19.setText(it.get("f02_19") as String?)
            f02_20.setText(it.get("f02_20") as String?)
            f02_21.setText(it.get("f02_21") as String?)
            f02_22.setText(it.get("f02_22") as String?)
            f02_23.setText(it.get("f02_23") as String?)
            f02_24.setText(it.get("f02_24") as String?)
            f02_25.setText(it.get("f02_25") as String?)
            f02_26.setText(it.get("f02_26") as String?)
            f02_27.setText(it.get("f02_27") as String?)
            f02_28.setText(it.get("f02_28") as String?)
            f02_29.setText(it.get("f02_29") as String?)
            f02_30.setText(it.get("f02_30") as String?)
            f02_31.setText(it.get("f02_31") as String?)

            if (completeFun().equals("true")){
                progressTextf02.setText("Sección Completa")
            }else{
                progressTextf02.setText("Sección Incompleta")
            }
        }
    }
}
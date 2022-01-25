package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form09.*

class Form09 : AppCompatActivity() {
    var formulario = "fo09"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form09)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form10Intent: Intent = Intent(this,Form10::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form10Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form08Intent: Intent = Intent(this,Form08::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form08Intent)
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

                "f09_01" to f09_01.text.toString(),
                "f09_02" to f09_02.text.toString(),
                "f09_03" to f09_03.text.toString(),
                "f09_04" to f09_04.text.toString(),
                "f09_05" to f09_05.text.toString(),
                "f09_06" to f09_06.text.toString(),
                "f09_07" to f09_07.text.toString(),
                "f09_08" to f09_08.text.toString(),
                "f09_09" to f09_09.text.toString(),
                "f09_10" to f09_10.text.toString(),
                "f09_11" to f09_11.text.toString(),
                "f09_12" to f09_12.text.toString(),
                "f09_13" to f09_13.text.toString(),
                "f09_14" to f09_14.text.toString(),
                "f09_15" to f09_15.text.toString(),
                "f09_16" to f09_16.text.toString(),
                "f09_17" to f09_17.text.toString(),
                "f09_18" to f09_18.text.toString(),
                "f09_19" to f09_19.text.toString(),
                "f09_20" to f09_20.text.toString(),
                "f09_21" to f09_21.text.toString(),
                "f09_22" to f09_22.text.toString(),
                "f09_23" to f09_23.text.toString(),
                "f09_24" to f09_24.text.toString(),
                "f09_25" to f09_25.text.toString(),
                "f09_26" to f09_26.text.toString(),
                "f09_27" to f09_27.text.toString(),
                "f09_28" to f09_28.text.toString(),
                "f09_29" to f09_29.text.toString(),
                "f09_30" to f09_30.text.toString(),
                "f09_31" to f09_31.text.toString(),
                "f09_32" to f09_32.text.toString(),
                "f09_33" to f09_33.text.toString(),
                "f09_34" to f09_34.text.toString(),
                "f09_35" to f09_35.text.toString(),
                "f09_36" to f09_36.text.toString(),
                "f09_37" to f09_37.text.toString(),
                "f09_38" to f09_38.text.toString(),
                "f09_39" to f09_39.text.toString(),
                "f09_40" to f09_40.text.toString(),
                "f09_41" to f09_41.text.toString(),
                "f09_42" to f09_42.text.toString(),
                "f09_43" to f09_43.text.toString(),
                "f09_44" to f09_44.text.toString(),
                "f09_45" to f09_45.text.toString(),
                "completef09" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f09_01.text.toString().equals("")){complete = false;}
        if(f09_02.text.toString().equals("")){complete = false;}
        if(f09_03.text.toString().equals("")){complete = false;}
        if(f09_04.text.toString().equals("")){complete = false;}
        if(f09_05.text.toString().equals("")){complete = false;}
        if(f09_06.text.toString().equals("")){complete = false;}
        if(f09_07.text.toString().equals("")){complete = false;}
        if(f09_08.text.toString().equals("")){complete = false;}
        if(f09_09.text.toString().equals("")){complete = false;}
        if(f09_10.text.toString().equals("")){complete = false;}
        if(f09_11.text.toString().equals("")){complete = false;}
        if(f09_12.text.toString().equals("")){complete = false;}
        if(f09_13.text.toString().equals("")){complete = false;}
        if(f09_14.text.toString().equals("")){complete = false;}
        if(f09_15.text.toString().equals("")){complete = false;}
        if(f09_16.text.toString().equals("")){complete = false;}
        if(f09_17.text.toString().equals("")){complete = false;}
        if(f09_18.text.toString().equals("")){complete = false;}
        if(f09_19.text.toString().equals("")){complete = false;}
        if(f09_20.text.toString().equals("")){complete = false;}
        if(f09_21.text.toString().equals("")){complete = false;}
        if(f09_22.text.toString().equals("")){complete = false;}
        if(f09_23.text.toString().equals("")){complete = false;}
        if(f09_24.text.toString().equals("")){complete = false;}
        if(f09_25.text.toString().equals("")){complete = false;}
        if(f09_26.text.toString().equals("")){complete = false;}
        if(f09_27.text.toString().equals("")){complete = false;}
        if(f09_28.text.toString().equals("")){complete = false;}
        if(f09_29.text.toString().equals("")){complete = false;}
        if(f09_30.text.toString().equals("")){complete = false;}
        if(f09_31.text.toString().equals("")){complete = false;}
        if(f09_32.text.toString().equals("")){complete = false;}
        if(f09_33.text.toString().equals("")){complete = false;}
        if(f09_34.text.toString().equals("")){complete = false;}
        if(f09_35.text.toString().equals("")){complete = false;}
        if(f09_36.text.toString().equals("")){complete = false;}
        if(f09_37.text.toString().equals("")){complete = false;}
        if(f09_38.text.toString().equals("")){complete = false;}
        if(f09_39.text.toString().equals("")){complete = false;}
        if(f09_40.text.toString().equals("")){complete = false;}
        if(f09_41.text.toString().equals("")){complete = false;}
        if(f09_42.text.toString().equals("")){complete = false;}
        if(f09_43.text.toString().equals("")){complete = false;}
        if(f09_44.text.toString().equals("")){complete = false;}
        if(f09_45.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f09_01.setText(it.get("f09_01") as String?)
            f09_02.setText(it.get("f09_02") as String?)
            f09_03.setText(it.get("f09_03") as String?)
            f09_04.setText(it.get("f09_04") as String?)
            f09_05.setText(it.get("f09_05") as String?)
            f09_06.setText(it.get("f09_06") as String?)
            f09_07.setText(it.get("f09_07") as String?)
            f09_08.setText(it.get("f09_08") as String?)
            f09_09.setText(it.get("f09_09") as String?)
            f09_10.setText(it.get("f09_10") as String?)
            f09_11.setText(it.get("f09_11") as String?)
            f09_12.setText(it.get("f09_12") as String?)
            f09_13.setText(it.get("f09_13") as String?)
            f09_14.setText(it.get("f09_14") as String?)
            f09_15.setText(it.get("f09_15") as String?)
            f09_16.setText(it.get("f09_16") as String?)
            f09_17.setText(it.get("f09_17") as String?)
            f09_18.setText(it.get("f09_18") as String?)
            f09_19.setText(it.get("f09_19") as String?)
            f09_20.setText(it.get("f09_20") as String?)
            f09_21.setText(it.get("f09_21") as String?)
            f09_22.setText(it.get("f09_22") as String?)
            f09_23.setText(it.get("f09_23") as String?)
            f09_24.setText(it.get("f09_24") as String?)
            f09_25.setText(it.get("f09_25") as String?)
            f09_26.setText(it.get("f09_26") as String?)
            f09_27.setText(it.get("f09_27") as String?)
            f09_28.setText(it.get("f09_28") as String?)
            f09_29.setText(it.get("f09_29") as String?)
            f09_30.setText(it.get("f09_30") as String?)
            f09_31.setText(it.get("f09_31") as String?)
            f09_32.setText(it.get("f09_32") as String?)
            f09_33.setText(it.get("f09_33") as String?)
            f09_34.setText(it.get("f09_34") as String?)
            f09_35.setText(it.get("f09_35") as String?)
            f09_36.setText(it.get("f09_36") as String?)
            f09_37.setText(it.get("f09_37") as String?)
            f09_38.setText(it.get("f09_38") as String?)
            f09_39.setText(it.get("f09_39") as String?)
            f09_40.setText(it.get("f09_40") as String?)
            f09_41.setText(it.get("f09_41") as String?)
            f09_42.setText(it.get("f09_42") as String?)
            f09_43.setText(it.get("f09_43") as String?)
            f09_44.setText(it.get("f09_44") as String?)
            f09_45.setText(it.get("f09_45") as String?)
            if (completeFun().equals("true")){
                progressTextF09.setText("Sección Completa")
            }else{
                progressTextF09.setText("Sección Incompleta")
            }


        }
    }


}

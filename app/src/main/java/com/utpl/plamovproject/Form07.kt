package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form04.*
import kotlinx.android.synthetic.main.activity_form07.*
import kotlinx.android.synthetic.main.activity_form07.atras
import kotlinx.android.synthetic.main.activity_form07.menu
import kotlinx.android.synthetic.main.activity_form07.siguiente

class Form07 : AppCompatActivity() {
    var formulario = "fo07"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form07)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form08Intent: Intent = Intent(this,Form08::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form08Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form05Intent: Intent = Intent(this,Form05::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form05Intent)
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

                "f07_01" to f07_01.text.toString(),
                "f07_02" to f07_02.text.toString(),
                "f07_03" to f07_03.text.toString(),
                "f07_04" to f07_04.text.toString(),
                "f07_05" to f07_05.text.toString(),
                "f07_06" to f07_06.text.toString(),
                "f07_07" to f07_07.text.toString(),
                "f07_08" to f07_08.text.toString(),
                "f07_09" to f07_09.text.toString(),
                "f07_10" to f07_10.text.toString(),
                "f07_11" to f07_11.text.toString(),
                "f07_12" to f07_12.text.toString(),
                "f07_13" to f07_13.text.toString(),
                "f07_14" to f07_14.text.toString(),
                "f07_15" to f07_15.text.toString(),
                "f07_16" to f07_16.text.toString(),
                "f07_17" to f07_17.text.toString(),
                "f07_18" to f07_18.text.toString(),
                "f07_19" to f07_19.text.toString(),
                "f07_20" to f07_20.text.toString(),
                "f07_21" to f07_21.text.toString(),
                "f07_22" to f07_22.text.toString(),
                "f07_23" to f07_23.text.toString(),
                "f07_24" to f07_24.text.toString(),
                "f07_25" to f07_25.text.toString(),
                "f07_26" to f07_26.text.toString(),
                "f07_27" to f07_27.text.toString(),
                "f07_28" to f07_28.text.toString(),
                "f07_29" to f07_29.text.toString(),
                "f07_30" to f07_30.text.toString(),
                "f07_31" to f07_31.text.toString(),
                "f07_32" to f07_32.text.toString(),
                "f07_33" to f07_33.text.toString(),
                "f07_34" to f07_34.text.toString(),
                "f07_35" to f07_35.text.toString(),
                "f07_36" to f07_36.text.toString(),
                "f07_37" to f07_37.text.toString(),
                "f07_38" to f07_38.text.toString(),
                "f07_39" to f07_39.text.toString(),
                "f07_40" to f07_40.text.toString(),
                "f07_41" to f07_41.text.toString(),
                "f07_42" to f07_42.text.toString(),


                "completef07" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f07_01.text.toString().equals("")){complete = false;}
        if(f07_02.text.toString().equals("")){complete = false;}
        if(f07_03.text.toString().equals("")){complete = false;}
        if(f07_04.text.toString().equals("")){complete = false;}
        if(f07_05.text.toString().equals("")){complete = false;}
        if(f07_06.text.toString().equals("")){complete = false;}
        if(f07_07.text.toString().equals("")){complete = false;}
        if(f07_08.text.toString().equals("")){complete = false;}
        if(f07_09.text.toString().equals("")){complete = false;}
        if(f07_10.text.toString().equals("")){complete = false;}
        if(f07_11.text.toString().equals("")){complete = false;}
        if(f07_12.text.toString().equals("")){complete = false;}
        if(f07_13.text.toString().equals("")){complete = false;}
        if(f07_14.text.toString().equals("")){complete = false;}
        if(f07_15.text.toString().equals("")){complete = false;}
        if(f07_16.text.toString().equals("")){complete = false;}
        if(f07_17.text.toString().equals("")){complete = false;}
        if(f07_18.text.toString().equals("")){complete = false;}
        if(f07_19.text.toString().equals("")){complete = false;}
        if(f07_20.text.toString().equals("")){complete = false;}
        if(f07_21.text.toString().equals("")){complete = false;}
        if(f07_22.text.toString().equals("")){complete = false;}
        if(f07_23.text.toString().equals("")){complete = false;}
        if(f07_24.text.toString().equals("")){complete = false;}
        if(f07_25.text.toString().equals("")){complete = false;}
        if(f07_26.text.toString().equals("")){complete = false;}
        if(f07_27.text.toString().equals("")){complete = false;}
        if(f07_28.text.toString().equals("")){complete = false;}
        if(f07_29.text.toString().equals("")){complete = false;}
        if(f07_30.text.toString().equals("")){complete = false;}
        if(f07_31.text.toString().equals("")){complete = false;}
        if(f07_32.text.toString().equals("")){complete = false;}
        if(f07_33.text.toString().equals("")){complete = false;}
        if(f07_34.text.toString().equals("")){complete = false;}
        if(f07_35.text.toString().equals("")){complete = false;}
        if(f07_36.text.toString().equals("")){complete = false;}
        if(f07_37.text.toString().equals("")){complete = false;}
        if(f07_38.text.toString().equals("")){complete = false;}
        if(f07_39.text.toString().equals("")){complete = false;}
        if(f07_40.text.toString().equals("")){complete = false;}
        if(f07_41.text.toString().equals("")){complete = false;}
        if(f07_42.text.toString().equals("")){complete = false;}


        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f07_01.setText(it.get("f07_01") as String?)
            f07_02.setText(it.get("f07_02") as String?)
            f07_03.setText(it.get("f07_03") as String?)
            f07_04.setText(it.get("f07_04") as String?)
            f07_05.setText(it.get("f07_05") as String?)
            f07_06.setText(it.get("f07_06") as String?)
            f07_07.setText(it.get("f07_07") as String?)
            f07_08.setText(it.get("f07_08") as String?)
            f07_09.setText(it.get("f07_09") as String?)
            f07_10.setText(it.get("f07_10") as String?)
            f07_11.setText(it.get("f07_11") as String?)
            f07_12.setText(it.get("f07_12") as String?)
            f07_13.setText(it.get("f07_13") as String?)
            f07_14.setText(it.get("f07_14") as String?)
            f07_15.setText(it.get("f07_15") as String?)
            f07_16.setText(it.get("f07_16") as String?)
            f07_17.setText(it.get("f07_17") as String?)
            f07_18.setText(it.get("f07_18") as String?)
            f07_19.setText(it.get("f07_19") as String?)
            f07_20.setText(it.get("f07_20") as String?)
            f07_21.setText(it.get("f07_21") as String?)
            f07_22.setText(it.get("f07_22") as String?)
            f07_23.setText(it.get("f07_23") as String?)
            f07_24.setText(it.get("f07_24") as String?)
            f07_25.setText(it.get("f07_25") as String?)
            f07_26.setText(it.get("f07_26") as String?)
            f07_27.setText(it.get("f07_27") as String?)
            f07_28.setText(it.get("f07_28") as String?)
            f07_29.setText(it.get("f07_29") as String?)
            f07_30.setText(it.get("f07_30") as String?)
            f07_31.setText(it.get("f07_31") as String?)
            f07_32.setText(it.get("f07_32") as String?)
            f07_33.setText(it.get("f07_33") as String?)
            f07_34.setText(it.get("f07_34") as String?)
            f07_35.setText(it.get("f07_35") as String?)
            f07_36.setText(it.get("f07_36") as String?)
            f07_37.setText(it.get("f07_37") as String?)
            f07_38.setText(it.get("f07_38") as String?)
            f07_39.setText(it.get("f07_39") as String?)
            f07_40.setText(it.get("f07_40") as String?)
            f07_41.setText(it.get("f07_41") as String?)
            f07_42.setText(it.get("f07_42") as String?)

            if (completeFun().equals("true")){
                progressTextF07.setText("Sección Completa")
            }else{
                progressTextF07.setText("Sección Incompleta")
            }


        }
    }

}

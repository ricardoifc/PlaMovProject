package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form03.*


class Form03 : AppCompatActivity() {
    var formulario = "fo03"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form03)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form04Intent: Intent = Intent(this,Form04::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form04Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form02Intent: Intent = Intent(this,Form02::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form02Intent)
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

                "f03_01" to f03_01.text.toString(),
                "f03_02" to f03_02.text.toString(),
                "f03_03" to f03_03.text.toString(),
                "f03_04" to f03_04.text.toString(),
                "f03_05" to f03_05.text.toString(),
                "f03_06" to f03_06.text.toString(),
                "f03_07" to f03_07.text.toString(),
                "f03_08" to f03_08.text.toString(),
                "f03_09" to f03_09.text.toString(),
                "f03_10" to f03_10.text.toString(),
                "f03_11" to f03_11.text.toString(),
                "f03_12" to f03_12.text.toString(),
                "f03_13" to f03_13.text.toString(),
                "f03_14" to f03_14.text.toString(),
                "f03_15" to f03_15.text.toString(),
                "f03_16" to f03_16.text.toString(),
                "f03_17" to f03_17.text.toString(),
                "f03_18" to f03_18.text.toString(),
                "f03_19" to f03_19.text.toString(),
                "f03_20" to f03_20.text.toString(),
                "f03_21" to f03_21.text.toString(),
                "f03_22" to f03_22.text.toString(),
                "f03_23" to f03_23.text.toString(),
                "f03_24" to f03_24.text.toString(),
                "f03_25" to f03_25.text.toString(),
                "f03_26" to f03_26.text.toString(),
                "f03_27" to f03_27.text.toString(),
                "f03_28" to f03_28.text.toString(),
                "f03_29" to f03_29.text.toString(),
                "f03_30" to f03_30.text.toString(),
                "f03_31" to f03_31.text.toString(),
                "f03_32" to f03_32.text.toString(),
                "f03_33" to f03_33.text.toString(),
                "f03_34" to f03_34.text.toString(),
                "f03_35" to f03_35.text.toString(),

                "completef03" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f03_01.text.toString().equals("")){complete = false;}
        if(f03_02.text.toString().equals("")){complete = false;}
        if(f03_03.text.toString().equals("")){complete = false;}
        if(f03_04.text.toString().equals("")){complete = false;}
        if(f03_05.text.toString().equals("")){complete = false;}
        if(f03_06.text.toString().equals("")){complete = false;}
        if(f03_07.text.toString().equals("")){complete = false;}
        if(f03_08.text.toString().equals("")){complete = false;}
        if(f03_09.text.toString().equals("")){complete = false;}
        if(f03_10.text.toString().equals("")){complete = false;}
        if(f03_11.text.toString().equals("")){complete = false;}
        if(f03_12.text.toString().equals("")){complete = false;}
        if(f03_13.text.toString().equals("")){complete = false;}
        if(f03_14.text.toString().equals("")){complete = false;}
        if(f03_15.text.toString().equals("")){complete = false;}
        if(f03_16.text.toString().equals("")){complete = false;}
        if(f03_17.text.toString().equals("")){complete = false;}
        if(f03_18.text.toString().equals("")){complete = false;}
        if(f03_19.text.toString().equals("")){complete = false;}
        if(f03_20.text.toString().equals("")){complete = false;}
        if(f03_21.text.toString().equals("")){complete = false;}
        if(f03_22.text.toString().equals("")){complete = false;}
        if(f03_23.text.toString().equals("")){complete = false;}
        if(f03_24.text.toString().equals("")){complete = false;}
        if(f03_25.text.toString().equals("")){complete = false;}
        if(f03_26.text.toString().equals("")){complete = false;}
        if(f03_27.text.toString().equals("")){complete = false;}
        if(f03_28.text.toString().equals("")){complete = false;}
        if(f03_29.text.toString().equals("")){complete = false;}
        if(f03_30.text.toString().equals("")){complete = false;}
        if(f03_31.text.toString().equals("")){complete = false;}
        if(f03_32.text.toString().equals("")){complete = false;}
        if(f03_33.text.toString().equals("")){complete = false;}
        if(f03_34.text.toString().equals("")){complete = false;}
        if(f03_35.text.toString().equals("")){complete = false;}


        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f03_01.setText(it.get("f03_01") as String?)
            f03_02.setText(it.get("f03_02") as String?)
            f03_03.setText(it.get("f03_03") as String?)
            f03_04.setText(it.get("f03_04") as String?)
            f03_05.setText(it.get("f03_05") as String?)
            f03_06.setText(it.get("f03_06") as String?)
            f03_07.setText(it.get("f03_07") as String?)
            f03_08.setText(it.get("f03_08") as String?)
            f03_09.setText(it.get("f03_09") as String?)
            f03_10.setText(it.get("f03_10") as String?)
            f03_11.setText(it.get("f03_11") as String?)
            f03_12.setText(it.get("f03_12") as String?)
            f03_13.setText(it.get("f03_13") as String?)
            f03_14.setText(it.get("f03_14") as String?)
            f03_15.setText(it.get("f03_15") as String?)
            f03_16.setText(it.get("f03_16") as String?)
            f03_17.setText(it.get("f03_17") as String?)
            f03_18.setText(it.get("f03_18") as String?)
            f03_19.setText(it.get("f03_19") as String?)
            f03_20.setText(it.get("f03_20") as String?)
            f03_21.setText(it.get("f03_21") as String?)
            f03_22.setText(it.get("f03_22") as String?)
            f03_23.setText(it.get("f03_23") as String?)
            f03_24.setText(it.get("f03_24") as String?)
            f03_25.setText(it.get("f03_25") as String?)
            f03_26.setText(it.get("f03_26") as String?)
            f03_27.setText(it.get("f03_27") as String?)
            f03_28.setText(it.get("f03_28") as String?)
            f03_29.setText(it.get("f03_29") as String?)
            f03_30.setText(it.get("f03_30") as String?)
            f03_31.setText(it.get("f03_31") as String?)
            f03_32.setText(it.get("f03_32") as String?)
            f03_33.setText(it.get("f03_33") as String?)
            f03_34.setText(it.get("f03_34") as String?)
            f03_35.setText(it.get("f03_35") as String?)

            if (completeFun().equals("true")){
                progressTextF03.setText("Sección Completa")
            }else{
                progressTextF03.setText("Sección Incompleta")
            }


        }
    }


}

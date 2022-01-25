package com.utpl.plamovproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form18.atras
import kotlinx.android.synthetic.main.activity_form18.menu
import kotlinx.android.synthetic.main.activity_form18.siguiente
import kotlinx.android.synthetic.main.activity_form22.*

class Form22 : AppCompatActivity() {
    var formulario = "fo22"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form22)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }
    private fun setup(email:String, provider:String){

        refrescar(email, provider)

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form12Intent: Intent = Intent(this,Form21::class.java).apply {
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
                //f18_01

                "f22_01" to f22_01.text.toString(),
                "f22_02" to f22_02.text.toString(),
                "f22_03" to f22_03.text.toString(),
                "f22_04" to f22_04.text.toString(),
                "f22_05" to f22_05.text.toString(),
                "f22_06" to f22_06.text.toString(),
                "f22_07" to f22_07.text.toString(),
                "f22_08" to f22_08.text.toString(),
                "f22_09" to f22_09.text.toString(),
                "f22_10" to f22_10.text.toString(),
                "f22_11" to f22_11.text.toString(),
                "f22_12" to f22_12.text.toString(),
                "f22_13" to f22_13.text.toString(),
                "f22_14" to f22_14.text.toString(),
                "f22_15" to f22_15.text.toString(),
                "f22_16" to f22_16.text.toString(),
                "f22_17" to f22_17.text.toString(),
                "f22_18" to f22_18.text.toString(),
                "f22_19" to f22_19.text.toString(),
                "f22_20" to f22_20.text.toString(),
                "f22_21" to f22_21.text.toString(),
                "f22_22" to f22_22.text.toString(),
                "f22_23" to f22_23.text.toString(),
                "f22_24" to f22_24.text.toString(),
                "f22_25" to f22_25.text.toString(),
                "f22_26" to f22_26.text.toString(),
                "f22_27" to f22_27.text.toString(),
                "f22_28" to f22_28.text.toString(),
                "f22_29" to f22_29.text.toString(),
                "f22_30" to f22_30.text.toString(),
                "f22_31" to f22_31.text.toString(),
                "f22_32" to f22_32.text.toString(),
                "f22_33" to f22_33.text.toString(),
                "f22_34" to f22_34.text.toString(),
                "f22_35" to f22_35.text.toString(),
                "f22_36" to f22_36.text.toString(),
                "f22_37" to f22_37.text.toString(),
                "f22_38" to f22_38.text.toString(),
                "f22_39" to f22_39.text.toString(),
                "f22_40" to f22_40.text.toString(),
                "f22_41" to f22_41.text.toString(),
                "f22_42" to f22_42.text.toString(),
                "f22_43" to f22_43.text.toString(),
                "f22_44" to f22_44.text.toString(),
                "f22_45" to f22_45.text.toString(),
                "f22_46" to f22_46.text.toString(),
                "f22_47" to f22_47.text.toString(),
                "f22_48" to f22_48.text.toString(),
                "f22_49" to f22_49.text.toString(),
                "f22_50" to f22_50.text.toString(),
                "f22_51" to f22_51.text.toString(),
                "f22_52" to f22_52.text.toString(),
                "f22_53" to f22_53.text.toString(),
                "f22_54" to f22_54.text.toString(),
                "f22_55" to f22_55.text.toString(),
                "f22_56" to f22_56.text.toString(),





                "completef22" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;


        if  (f22_01 .text.toString().equals("")){complete = false;}
        if  (f22_02 .text.toString().equals("")){complete = false;}
        if  (f22_03 .text.toString().equals("")){complete = false;}
        if  (f22_04 .text.toString().equals("")){complete = false;}
        if  (f22_05 .text.toString().equals("")){complete = false;}
        if  (f22_06 .text.toString().equals("")){complete = false;}
        if  (f22_07 .text.toString().equals("")){complete = false;}
        if  (f22_08 .text.toString().equals("")){complete = false;}
        if  (f22_09 .text.toString().equals("")){complete = false;}
        if  (f22_10 .text.toString().equals("")){complete = false;}
        if  (f22_11 .text.toString().equals("")){complete = false;}
        if  (f22_12 .text.toString().equals("")){complete = false;}
        if  (f22_13 .text.toString().equals("")){complete = false;}
        if  (f22_14 .text.toString().equals("")){complete = false;}
        if  (f22_15 .text.toString().equals("")){complete = false;}
        if  (f22_16 .text.toString().equals("")){complete = false;}
        if  (f22_17 .text.toString().equals("")){complete = false;}
        if  (f22_18 .text.toString().equals("")){complete = false;}
        if  (f22_19 .text.toString().equals("")){complete = false;}
        if  (f22_20 .text.toString().equals("")){complete = false;}
        if  (f22_21 .text.toString().equals("")){complete = false;}
        if  (f22_22 .text.toString().equals("")){complete = false;}
        if  (f22_23 .text.toString().equals("")){complete = false;}
        if  (f22_24 .text.toString().equals("")){complete = false;}
        if  (f22_25 .text.toString().equals("")){complete = false;}
        if  (f22_26 .text.toString().equals("")){complete = false;}
        if  (f22_27 .text.toString().equals("")){complete = false;}
        if  (f22_28 .text.toString().equals("")){complete = false;}
        if  (f22_29 .text.toString().equals("")){complete = false;}
        if  (f22_30 .text.toString().equals("")){complete = false;}
        if  (f22_31 .text.toString().equals("")){complete = false;}
        if  (f22_32 .text.toString().equals("")){complete = false;}
        if  (f22_33 .text.toString().equals("")){complete = false;}
        if  (f22_34 .text.toString().equals("")){complete = false;}
        if  (f22_35 .text.toString().equals("")){complete = false;}
        if  (f22_36 .text.toString().equals("")){complete = false;}
        if  (f22_37 .text.toString().equals("")){complete = false;}
        if  (f22_38 .text.toString().equals("")){complete = false;}
        if  (f22_39 .text.toString().equals("")){complete = false;}
        if  (f22_40 .text.toString().equals("")){complete = false;}
        if  (f22_41 .text.toString().equals("")){complete = false;}
        if  (f22_42 .text.toString().equals("")){complete = false;}
        if  (f22_43 .text.toString().equals("")){complete = false;}
        if  (f22_44 .text.toString().equals("")){complete = false;}
        if  (f22_45 .text.toString().equals("")){complete = false;}
        if  (f22_46 .text.toString().equals("")){complete = false;}
        if  (f22_47 .text.toString().equals("")){complete = false;}
        if  (f22_48 .text.toString().equals("")){complete = false;}
        if  (f22_49 .text.toString().equals("")){complete = false;}
        if  (f22_50 .text.toString().equals("")){complete = false;}
        if  (f22_51 .text.toString().equals("")){complete = false;}
        if  (f22_52 .text.toString().equals("")){complete = false;}
        if  (f22_53 .text.toString().equals("")){complete = false;}
        if  (f22_54 .text.toString().equals("")){complete = false;}
        if  (f22_55 .text.toString().equals("")){complete = false;}
        if  (f22_56 .text.toString().equals("")){complete = false;}


        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {

            f22_01.setText(it.get("f22_01") as String?)
            f22_02.setText(it.get("f22_02") as String?)
            f22_03.setText(it.get("f22_03") as String?)
            f22_04.setText(it.get("f22_04") as String?)
            f22_05.setText(it.get("f22_05") as String?)
            f22_06.setText(it.get("f22_06") as String?)
            f22_07.setText(it.get("f22_07") as String?)
            f22_08.setText(it.get("f22_08") as String?)
            f22_09.setText(it.get("f22_09") as String?)
            f22_10.setText(it.get("f22_10") as String?)
            f22_11.setText(it.get("f22_11") as String?)
            f22_12.setText(it.get("f22_12") as String?)
            f22_13.setText(it.get("f22_13") as String?)
            f22_14.setText(it.get("f22_14") as String?)
            f22_15.setText(it.get("f22_15") as String?)
            f22_16.setText(it.get("f22_16") as String?)
            f22_17.setText(it.get("f22_17") as String?)
            f22_18.setText(it.get("f22_18") as String?)
            f22_19.setText(it.get("f22_19") as String?)
            f22_20.setText(it.get("f22_20") as String?)
            f22_21.setText(it.get("f22_21") as String?)
            f22_22.setText(it.get("f22_22") as String?)
            f22_23.setText(it.get("f22_23") as String?)
            f22_24.setText(it.get("f22_24") as String?)
            f22_25.setText(it.get("f22_25") as String?)
            f22_26.setText(it.get("f22_26") as String?)
            f22_27.setText(it.get("f22_27") as String?)
            f22_28.setText(it.get("f22_28") as String?)
            f22_29.setText(it.get("f22_29") as String?)
            f22_30.setText(it.get("f22_30") as String?)
            f22_31.setText(it.get("f22_31") as String?)
            f22_32.setText(it.get("f22_32") as String?)
            f22_33.setText(it.get("f22_33") as String?)
            f22_34.setText(it.get("f22_34") as String?)
            f22_35.setText(it.get("f22_35") as String?)
            f22_36.setText(it.get("f22_36") as String?)
            f22_37.setText(it.get("f22_37") as String?)
            f22_38.setText(it.get("f22_38") as String?)
            f22_39.setText(it.get("f22_39") as String?)
            f22_40.setText(it.get("f22_40") as String?)
            f22_41.setText(it.get("f22_41") as String?)
            f22_42.setText(it.get("f22_42") as String?)
            f22_43.setText(it.get("f22_43") as String?)
            f22_44.setText(it.get("f22_44") as String?)
            f22_45.setText(it.get("f22_45") as String?)
            f22_46.setText(it.get("f22_46") as String?)
            f22_47.setText(it.get("f22_47") as String?)
            f22_48.setText(it.get("f22_48") as String?)
            f22_49.setText(it.get("f22_49") as String?)
            f22_50.setText(it.get("f22_50") as String?)
            f22_51.setText(it.get("f22_51") as String?)
            f22_52.setText(it.get("f22_52") as String?)
            f22_53.setText(it.get("f22_53") as String?)
            f22_54.setText(it.get("f22_54") as String?)
            f22_55.setText(it.get("f22_55") as String?)
            f22_56.setText(it.get("f22_56") as String?)



            if (completeFun().equals("true")){
                progressTextf22.setText("Sección Completa")
            }else{
                progressTextf22.setText("Sección Incompleta")
            }


        }
    }
}
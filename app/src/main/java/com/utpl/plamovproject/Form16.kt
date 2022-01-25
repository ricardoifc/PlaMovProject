package com.utpl.plamovproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form16.*
import kotlinx.android.synthetic.main.activity_form16.atras
import kotlinx.android.synthetic.main.activity_form16.menu
import kotlinx.android.synthetic.main.activity_form16.siguiente
import kotlinx.android.synthetic.main.activity_form16.*

class Form16 : AppCompatActivity() {
    var formulario = "fo16"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form16)
        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,Form17::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)

            }
            startActivity(MenuIntent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form12Intent: Intent = Intent(this,Form14::class.java).apply {
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
                //f16_01
                "f16_01" to f16_01.text.toString(),
                "f16_03" to f16_03.text.toString(),
                "f16_04" to f16_04.text.toString(),
                "f16_05" to f16_05.text.toString(),
                "f16_06" to f16_06.text.toString(),
                "f16_07" to f16_07.text.toString(),
                "f16_08" to f16_08.text.toString(),
                "f16_09" to f16_09.text.toString(),
                "f16_10" to f16_10.text.toString(),
                "f16_11" to f16_11.text.toString(),
                "f16_12" to f16_12.text.toString(),
                "f16_16" to f16_16.text.toString(),
                "f16_14" to f16_14.text.toString(),
                "f16_15" to f16_15.text.toString(),
                "f16_16" to f16_16.text.toString(),
                "f16_17" to f16_17.text.toString(),
                "f16_18" to f16_18.text.toString(),
                "f16_19" to f16_19.text.toString(),
                "f16_20" to f16_20.text.toString(),
                "f16_21" to f16_21.text.toString(),
                "f16_22" to f16_22.text.toString(),
                "f16_23" to f16_23.text.toString(),
                "f16_24" to f16_24.text.toString(),
                "f16_25" to f16_25.text.toString(),
                "f16_26" to f16_26.text.toString(),
                "f16_27" to f16_27.text.toString(),
                "f16_28" to f16_28.text.toString(),
                "f16_29" to f16_29.text.toString(),
                "f16_30" to f16_30.text.toString(),
                "f16_31" to f16_31.text.toString(),
                "f16_32" to f16_32.text.toString(),
                "f16_33" to f16_33.text.toString(),
                "f16_34" to f16_34.text.toString(),
                "f16_35" to f16_35.text.toString(),
                "f16_36" to f16_36.text.toString(),
                "f16_37" to f16_37.text.toString(),
                "f16_38" to f16_38.text.toString(),
                "f16_39" to f16_39.text.toString(),
                "f16_40" to f16_40.text.toString(),
                "f16_41" to f16_41.text.toString(),
                "f16_42" to f16_42.text.toString(),
                "f16_43" to f16_43.text.toString(),
                "f16_44" to f16_44.text.toString(),
                "f16_45" to f16_45.text.toString(),
                "f16_46" to f16_46.text.toString(),
                "f16_47" to f16_47.text.toString(),
                "f16_48" to f16_48.text.toString(),
                "f16_49" to f16_49.text.toString(),
                "f16_50" to f16_50.text.toString(),
                "f16_51" to f16_51.text.toString(),
                "f16_52" to f16_52.text.toString(),
                "f16_53" to f16_53.text.toString(),
                "f16_54" to f16_54.text.toString(),
                "f16_55" to f16_55.text.toString(),
                "f16_56" to f16_56.text.toString(),
                "f16_57" to f16_57.text.toString(),
                "f16_58" to f16_58.text.toString(),
                "f16_59" to f16_59.text.toString(),
                "f16_60" to f16_60.text.toString(),
                "f16_61" to f16_61.text.toString(),
                "f16_62" to f16_62.text.toString(),
                "f16_63" to f16_63.text.toString(),
                "f16_64" to f16_64.text.toString(),
                "f16_65" to f16_65.text.toString(),
                "f16_66" to f16_66.text.toString(),

                "completef16" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f16_01.text.toString().equals("")){complete = false;}
        if(f16_03.text.toString().equals("")){complete = false;}
        if(f16_04.text.toString().equals("")){complete = false;}
        if(f16_05.text.toString().equals("")){complete = false;}
        if(f16_06.text.toString().equals("")){complete = false;}
        if(f16_07.text.toString().equals("")){complete = false;}
        if(f16_08.text.toString().equals("")){complete = false;}
        if(f16_09.text.toString().equals("")){complete = false;}
        if(f16_10.text.toString().equals("")){complete = false;}
        if(f16_11.text.toString().equals("")){complete = false;}
        if(f16_12.text.toString().equals("")){complete = false;}
        if(f16_16.text.toString().equals("")){complete = false;}
        if(f16_14.text.toString().equals("")){complete = false;}
        if(f16_15.text.toString().equals("")){complete = false;}
        if(f16_16.text.toString().equals("")){complete = false;}
        if(f16_17.text.toString().equals("")){complete = false;}
        if(f16_18.text.toString().equals("")){complete = false;}
        if(f16_19.text.toString().equals("")){complete = false;}
        if(f16_20.text.toString().equals("")){complete = false;}
        if(f16_21.text.toString().equals("")){complete = false;}
        if(f16_22.text.toString().equals("")){complete = false;}
        if(f16_23.text.toString().equals("")){complete = false;}
        if(f16_24.text.toString().equals("")){complete = false;}
        if(f16_25.text.toString().equals("")){complete = false;}
        if(f16_26.text.toString().equals("")){complete = false;}
        if(f16_27.text.toString().equals("")){complete = false;}
        if(f16_28.text.toString().equals("")){complete = false;}
        if(f16_29.text.toString().equals("")){complete = false;}
        if(f16_30.text.toString().equals("")){complete = false;}
        if(f16_31.text.toString().equals("")){complete = false;}
        if(f16_32.text.toString().equals("")){complete = false;}
        if(f16_33.text.toString().equals("")){complete = false;}
        if(f16_34.text.toString().equals("")){complete = false;}
        if(f16_35.text.toString().equals("")){complete = false;}
        if(f16_36.text.toString().equals("")){complete = false;}
        if(f16_37.text.toString().equals("")){complete = false;}
        if(f16_38.text.toString().equals("")){complete = false;}
        if(f16_39.text.toString().equals("")){complete = false;}
        if(f16_40.text.toString().equals("")){complete = false;}
        if(f16_41.text.toString().equals("")){complete = false;}
        if(f16_42.text.toString().equals("")){complete = false;}
        if(f16_43.text.toString().equals("")){complete = false;}
        if(f16_44.text.toString().equals("")){complete = false;}
        if(f16_45.text.toString().equals("")){complete = false;}
        if(f16_46.text.toString().equals("")){complete = false;}
        if(f16_47.text.toString().equals("")){complete = false;}
        if(f16_48.text.toString().equals("")){complete = false;}
        if(f16_49.text.toString().equals("")){complete = false;}
        if(f16_50.text.toString().equals("")){complete = false;}
        if(f16_51.text.toString().equals("")){complete = false;}
        if(f16_52.text.toString().equals("")){complete = false;}
        if(f16_53.text.toString().equals("")){complete = false;}
        if(f16_54.text.toString().equals("")){complete = false;}
        if(f16_55.text.toString().equals("")){complete = false;}
        if(f16_56.text.toString().equals("")){complete = false;}
        if(f16_57.text.toString().equals("")){complete = false;}
        if(f16_58.text.toString().equals("")){complete = false;}
        if(f16_59.text.toString().equals("")){complete = false;}
        if(f16_60.text.toString().equals("")){complete = false;}
        if(f16_61.text.toString().equals("")){complete = false;}
        if(f16_62.text.toString().equals("")){complete = false;}
        if(f16_63.text.toString().equals("")){complete = false;}
        if(f16_64.text.toString().equals("")){complete = false;}
        if(f16_65.text.toString().equals("")){complete = false;}
        if(f16_66.text.toString().equals("")){complete = false;}



        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f16_01.setText(it.get("f16_01") as String?)
            f16_03.setText(it.get("f16_03") as String?)
            f16_04.setText(it.get("f16_04") as String?)
            f16_05.setText(it.get("f16_05") as String?)
            f16_06.setText(it.get("f16_06") as String?)
            f16_07.setText(it.get("f16_07") as String?)
            f16_08.setText(it.get("f16_08") as String?)
            f16_09.setText(it.get("f16_09") as String?)
            f16_10.setText(it.get("f16_10") as String?)
            f16_11.setText(it.get("f16_11") as String?)
            f16_12.setText(it.get("f16_12") as String?)
            f16_16.setText(it.get("f16_16") as String?)
            f16_14.setText(it.get("f16_14") as String?)
            f16_15.setText(it.get("f16_15") as String?)
            f16_16.setText(it.get("f16_16") as String?)
            f16_17.setText(it.get("f16_17") as String?)
            f16_18.setText(it.get("f16_18") as String?)
            f16_19.setText(it.get("f16_19") as String?)
            f16_20.setText(it.get("f16_20") as String?)
            f16_21.setText(it.get("f16_21") as String?)
            f16_22.setText(it.get("f16_22") as String?)
            f16_23.setText(it.get("f16_23") as String?)
            f16_24.setText(it.get("f16_24") as String?)
            f16_25.setText(it.get("f16_25") as String?)
            f16_26.setText(it.get("f16_26") as String?)
            f16_27.setText(it.get("f16_27") as String?)
            f16_28.setText(it.get("f16_28") as String?)
            f16_29.setText(it.get("f16_29") as String?)
            f16_30.setText(it.get("f16_30") as String?)
            f16_31.setText(it.get("f16_31") as String?)
            f16_32.setText(it.get("f16_32") as String?)
            f16_33.setText(it.get("f16_33") as String?)
            f16_34.setText(it.get("f16_34") as String?)
            f16_35.setText(it.get("f16_35") as String?)

            f16_36.setText(it.get("f16_36") as String?)
            f16_37.setText(it.get("f16_37") as String?)
            f16_38.setText(it.get("f16_38") as String?)
            f16_39.setText(it.get("f16_39") as String?)
            f16_40.setText(it.get("f16_40") as String?)
            f16_41.setText(it.get("f16_41") as String?)
            f16_42.setText(it.get("f16_42") as String?)
            f16_43.setText(it.get("f16_43") as String?)
            f16_44.setText(it.get("f16_44") as String?)
            f16_45.setText(it.get("f16_45") as String?)
            f16_46.setText(it.get("f16_46") as String?)
            f16_47.setText(it.get("f16_47") as String?)
            f16_48.setText(it.get("f16_48") as String?)
            f16_49.setText(it.get("f16_49") as String?)
            f16_50.setText(it.get("f16_50") as String?)
            f16_51.setText(it.get("f16_51") as String?)
            f16_52.setText(it.get("f16_52") as String?)
            f16_53.setText(it.get("f16_53") as String?)
            f16_54.setText(it.get("f16_54") as String?)
            f16_55.setText(it.get("f16_55") as String?)
            f16_56.setText(it.get("f16_56") as String?)
            f16_57.setText(it.get("f16_57") as String?)
            f16_58.setText(it.get("f16_58") as String?)
            f16_59.setText(it.get("f16_59") as String?)
            f16_60.setText(it.get("f16_60") as String?)
            f16_61.setText(it.get("f16_61") as String?)
            f16_62.setText(it.get("f16_62") as String?)
            f16_63.setText(it.get("f16_63") as String?)
            f16_64.setText(it.get("f16_64") as String?)
            f16_65.setText(it.get("f16_65") as String?)
            f16_66.setText(it.get("f16_66") as String?)

            if (completeFun().equals("true")){
                progressTextf16.setText("Sección Completa")
            }else{
                progressTextf16.setText("Sección Incompleta")
            }


        }
    }

}
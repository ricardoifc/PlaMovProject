package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form01.*

enum class ProviderTypef01{
    BASIC
}

class Form01 : AppCompatActivity() {
    var formulario = "fo01"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form01)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form02Intent: Intent = Intent(this,Form02::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form02Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(MenuIntent)
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

                "f01_01" to f01_01.text.toString(),
                "f01_02" to f01_02.text.toString(),
                "f01_03" to f01_03.text.toString(),
                "f01_04" to f01_04.text.toString(),
                "f01_05" to f01_05.text.toString(),
                "f01_06" to f01_06.text.toString(),
                "f01_07" to f01_07.text.toString(),
                "f01_08" to f01_08.text.toString(),
                "f01_09" to f01_09.text.toString(),
                "f01_10" to f01_10.text.toString(),
                "f01_11" to f01_11.text.toString(),
                "f01_12" to f01_12.text.toString(),
                "f01_13" to f01_13.text.toString(),
                "f01_14" to f01_14.text.toString(),
                "f01_15" to f01_15.text.toString(),
                "f01_16" to f01_16.text.toString(),
                "f01_17" to f01_17.text.toString(),
                "f01_18" to f01_18.text.toString(),
                "f01_19" to f01_19.text.toString(),
                "f01_20" to f01_20.text.toString(),
                "f01_21" to f01_21.text.toString(),
                "f01_22" to f01_22.text.toString(),
                "f01_23" to f01_23.text.toString(),
                "f01_24" to f01_24.text.toString(),
                "f01_25" to f01_25.text.toString(),
                "f01_26" to f01_26.text.toString(),
                "f01_27" to f01_27.text.toString(),
                "f01_28" to f01_28.text.toString(),
                "f01_29" to f01_29.text.toString(),
                "f01_30" to f01_30.text.toString(),
                "f01_31" to f01_31.text.toString(),
                "f01_32" to f01_32.text.toString(),
                "f01_33" to f01_33.text.toString(),
                "f01_34" to f01_34.text.toString(),
                "f01_35" to f01_35.text.toString(),
                "f01_36" to f01_36.text.toString(),
                "f01_37" to f01_37.text.toString(),
                "f01_38" to f01_38.text.toString(),
                "f01_39" to f01_39.text.toString(),
                "f01_40" to f01_40.text.toString(),
                "f01_41" to f01_41.text.toString(),
                "f01_42" to f01_42.text.toString(),
                "f01_43" to f01_43.text.toString(),
                "f01_44" to f01_44.text.toString(),
                "f01_45" to f01_45.text.toString(),
                "f01_46" to f01_46.text.toString(),
                "f01_47" to f01_47.text.toString(),
                "f01_48" to f01_48.text.toString(),
                "f01_49" to f01_49.text.toString(),
                "f01_50" to f01_50.text.toString(),
                "f01_51" to f01_51.text.toString(),
                "f01_52" to f01_52.text.toString(),
                "f01_53" to f01_53.text.toString(),
                "f01_54" to f01_54.text.toString(),
                "f01_55" to f01_55.text.toString(),
                "f01_56" to f01_56.text.toString(),
                "f01_57" to f01_57.text.toString(),
                "f01_58" to f01_58.text.toString(),
                "f01_59" to f01_59.text.toString(),
                "f01_60" to f01_60.text.toString(),
                "f01_61" to f01_61.text.toString(),
                "f01_62" to f01_62.text.toString(),
                "f01_63" to f01_63.text.toString(),
                "f01_64" to f01_64.text.toString(),
                "f01_65" to f01_65.text.toString(),
                "f01_66" to f01_66.text.toString(),
                "f01_67" to f01_67.text.toString(),
                "completef01" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f01_01.text.toString().equals("")){complete = false;}
        if(f01_02.text.toString().equals("")){complete = false;}
        if(f01_03.text.toString().equals("")){complete = false;}
        if(f01_04.text.toString().equals("")){complete = false;}
        if(f01_05.text.toString().equals("")){complete = false;}
        if(f01_06.text.toString().equals("")){complete = false;}
        if(f01_07.text.toString().equals("")){complete = false;}
        if(f01_08.text.toString().equals("")){complete = false;}
        if(f01_09.text.toString().equals("")){complete = false;}
        if(f01_10.text.toString().equals("")){complete = false;}
        if(f01_11.text.toString().equals("")){complete = false;}
        if(f01_12.text.toString().equals("")){complete = false;}
        if(f01_13.text.toString().equals("")){complete = false;}
        if(f01_14.text.toString().equals("")){complete = false;}
        if(f01_15.text.toString().equals("")){complete = false;}
        if(f01_16.text.toString().equals("")){complete = false;}
        if(f01_17.text.toString().equals("")){complete = false;}
        if(f01_18.text.toString().equals("")){complete = false;}
        if(f01_19.text.toString().equals("")){complete = false;}
        if(f01_20.text.toString().equals("")){complete = false;}
        if(f01_21.text.toString().equals("")){complete = false;}
        if(f01_22.text.toString().equals("")){complete = false;}
        if(f01_23.text.toString().equals("")){complete = false;}
        if(f01_24.text.toString().equals("")){complete = false;}
        if(f01_25.text.toString().equals("")){complete = false;}
        if(f01_26.text.toString().equals("")){complete = false;}
        if(f01_27.text.toString().equals("")){complete = false;}
        if(f01_28.text.toString().equals("")){complete = false;}
        if(f01_29.text.toString().equals("")){complete = false;}
        if(f01_30.text.toString().equals("")){complete = false;}
        if(f01_31.text.toString().equals("")){complete = false;}
        if(f01_32.text.toString().equals("")){complete = false;}
        if(f01_33.text.toString().equals("")){complete = false;}
        if(f01_34.text.toString().equals("")){complete = false;}
        if(f01_35.text.toString().equals("")){complete = false;}
        if(f01_36.text.toString().equals("")){complete = false;}
        if(f01_37.text.toString().equals("")){complete = false;}
        if(f01_38.text.toString().equals("")){complete = false;}
        if(f01_39.text.toString().equals("")){complete = false;}
        if(f01_40.text.toString().equals("")){complete = false;}
        if(f01_41.text.toString().equals("")){complete = false;}
        if(f01_42.text.toString().equals("")){complete = false;}
        if(f01_43.text.toString().equals("")){complete = false;}
        if(f01_44.text.toString().equals("")){complete = false;}
        if(f01_45.text.toString().equals("")){complete = false;}
        if(f01_46.text.toString().equals("")){complete = false;}
        if(f01_47.text.toString().equals("")){complete = false;}
        if(f01_48.text.toString().equals("")){complete = false;}
        if(f01_49.text.toString().equals("")){complete = false;}
        if(f01_50.text.toString().equals("")){complete = false;}
        if(f01_51.text.toString().equals("")){complete = false;}
        if(f01_52.text.toString().equals("")){complete = false;}
        if(f01_53.text.toString().equals("")){complete = false;}
        if(f01_54.text.toString().equals("")){complete = false;}
        if(f01_55.text.toString().equals("")){complete = false;}
        if(f01_56.text.toString().equals("")){complete = false;}
        if(f01_57.text.toString().equals("")){complete = false;}
        if(f01_58.text.toString().equals("")){complete = false;}
        if(f01_59.text.toString().equals("")){complete = false;}
        if(f01_60.text.toString().equals("")){complete = false;}
        if(f01_61.text.toString().equals("")){complete = false;}
        if(f01_62.text.toString().equals("")){complete = false;}
        if(f01_63.text.toString().equals("")){complete = false;}
        if(f01_64.text.toString().equals("")){complete = false;}
        if(f01_65.text.toString().equals("")){complete = false;}
        if(f01_66.text.toString().equals("")){complete = false;}
        if(f01_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f01_01.setText(it.get("f01_01") as String?)
            f01_02.setText(it.get("f01_02") as String?)
            f01_03.setText(it.get("f01_03") as String?)
            f01_04.setText(it.get("f01_04") as String?)
            f01_05.setText(it.get("f01_05") as String?)
            f01_06.setText(it.get("f01_06") as String?)
            f01_07.setText(it.get("f01_07") as String?)
            f01_08.setText(it.get("f01_08") as String?)
            f01_09.setText(it.get("f01_09") as String?)
            f01_10.setText(it.get("f01_10") as String?)
            f01_11.setText(it.get("f01_11") as String?)
            f01_12.setText(it.get("f01_12") as String?)
            f01_13.setText(it.get("f01_13") as String?)
            f01_14.setText(it.get("f01_14") as String?)
            f01_15.setText(it.get("f01_15") as String?)
            f01_16.setText(it.get("f01_16") as String?)
            f01_17.setText(it.get("f01_17") as String?)
            f01_18.setText(it.get("f01_18") as String?)
            f01_19.setText(it.get("f01_19") as String?)
            f01_20.setText(it.get("f01_20") as String?)
            f01_21.setText(it.get("f01_21") as String?)
            f01_22.setText(it.get("f01_22") as String?)
            f01_23.setText(it.get("f01_23") as String?)
            f01_24.setText(it.get("f01_24") as String?)
            f01_25.setText(it.get("f01_25") as String?)
            f01_26.setText(it.get("f01_26") as String?)
            f01_27.setText(it.get("f01_27") as String?)
            f01_28.setText(it.get("f01_28") as String?)
            f01_29.setText(it.get("f01_29") as String?)
            f01_30.setText(it.get("f01_30") as String?)
            f01_31.setText(it.get("f01_31") as String?)
            f01_32.setText(it.get("f01_32") as String?)
            f01_33.setText(it.get("f01_33") as String?)
            f01_34.setText(it.get("f01_34") as String?)
            f01_35.setText(it.get("f01_35") as String?)
            f01_36.setText(it.get("f01_36") as String?)
            f01_37.setText(it.get("f01_37") as String?)
            f01_38.setText(it.get("f01_38") as String?)
            f01_39.setText(it.get("f01_39") as String?)
            f01_40.setText(it.get("f01_40") as String?)
            f01_41.setText(it.get("f01_41") as String?)
            f01_42.setText(it.get("f01_42") as String?)
            f01_43.setText(it.get("f01_43") as String?)
            f01_44.setText(it.get("f01_44") as String?)
            f01_45.setText(it.get("f01_45") as String?)
            f01_46.setText(it.get("f01_46") as String?)
            f01_47.setText(it.get("f01_47") as String?)
            f01_48.setText(it.get("f01_48") as String?)
            f01_49.setText(it.get("f01_49") as String?)
            f01_50.setText(it.get("f01_50") as String?)
            f01_51.setText(it.get("f01_51") as String?)
            f01_52.setText(it.get("f01_52") as String?)
            f01_53.setText(it.get("f01_53") as String?)
            f01_54.setText(it.get("f01_54") as String?)
            f01_55.setText(it.get("f01_55") as String?)
            f01_56.setText(it.get("f01_56") as String?)
            f01_57.setText(it.get("f01_57") as String?)
            f01_58.setText(it.get("f01_58") as String?)
            f01_59.setText(it.get("f01_59") as String?)
            f01_60.setText(it.get("f01_60") as String?)
            f01_61.setText(it.get("f01_61") as String?)
            f01_62.setText(it.get("f01_62") as String?)
            f01_63.setText(it.get("f01_63") as String?)
            f01_64.setText(it.get("f01_64") as String?)
            f01_65.setText(it.get("f01_65") as String?)
            f01_66.setText(it.get("f01_66") as String?)
            f01_67.setText(it.get("f01_67") as String?)
            if (completeFun().equals("true")){
                progressTextF01.setText("Sección Completa")
            }else{
                progressTextF01.setText("Sección Incompleta")
            }


        }
    }
}

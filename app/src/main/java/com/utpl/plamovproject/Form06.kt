package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form04.*
import kotlinx.android.synthetic.main.activity_form06.*
import kotlinx.android.synthetic.main.activity_form06.atras
import kotlinx.android.synthetic.main.activity_form06.menu
import kotlinx.android.synthetic.main.activity_form06.siguiente

class Form06 : AppCompatActivity() {
    var formulario = "fo06"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form06)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        //refrescar(email, provider)
        siguiente.setOnClickListener{
            //guardarDatos(email, provider)
            val form07Intent: Intent = Intent(this,Form07::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form07Intent)

        }

        atras.setOnClickListener {
            //guardarDatos(email, provider)
            val form04Intent: Intent = Intent(this,Form04::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form04Intent)
        }

        menu.setOnClickListener{
            //guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(MenuIntent)

        }
    }
    /*
    fun guardarDatos(email: String, provider: String){
        db.collection(email).document(formulario).set(

            hashMapOf("provider" to provider,

                "f06_01" to f06_01.text.toString(),
                "f06_02" to f06_02.text.toString(),
                "f06_03" to f06_03.text.toString(),
                "f06_04" to f06_04.text.toString(),
                "f06_05" to f06_05.text.toString(),
                "f06_06" to f06_06.text.toString(),
                "f06_07" to f06_07.text.toString(),
                "f06_08" to f06_08.text.toString(),
                "f06_09" to f06_09.text.toString(),
                "f06_10" to f06_10.text.toString(),
                "f06_11" to f06_11.text.toString(),
                "f06_12" to f06_12.text.toString(),
                "f06_13" to f06_13.text.toString(),
                "f06_14" to f06_14.text.toString(),
                "f06_15" to f06_15.text.toString(),
                "f06_16" to f06_16.text.toString(),
                "f06_17" to f06_17.text.toString(),
                "f06_18" to f06_18.text.toString(),
                "f06_19" to f06_19.text.toString(),
                "f06_20" to f06_20.text.toString(),
                "f06_21" to f06_21.text.toString(),
                "f06_22" to f06_22.text.toString(),
                "f06_23" to f06_23.text.toString(),
                "f06_24" to f06_24.text.toString(),
                "f06_25" to f06_25.text.toString(),
                "f06_26" to f06_26.text.toString(),
                "f06_27" to f06_27.text.toString(),
                "f06_28" to f06_28.text.toString(),
                "f06_29" to f06_29.text.toString(),
                "f06_30" to f06_30.text.toString(),
                "f06_31" to f06_31.text.toString(),
                "f06_32" to f06_32.text.toString(),
                "f06_33" to f06_33.text.toString(),
                "f06_34" to f06_34.text.toString(),
                "f06_35" to f06_35.text.toString(),
                "f06_36" to f06_36.text.toString(),
                "f06_37" to f06_37.text.toString(),
                "f06_38" to f06_38.text.toString(),
                "f06_39" to f06_39.text.toString(),
                "f06_40" to f06_40.text.toString(),
                "f06_41" to f06_41.text.toString(),
                "f06_42" to f06_42.text.toString(),
                "f06_43" to f06_43.text.toString(),
                "f06_44" to f06_44.text.toString(),
                "f06_45" to f06_45.text.toString(),
                "f06_46" to f06_46.text.toString(),
                "f06_47" to f06_47.text.toString(),
                "f06_48" to f06_48.text.toString(),
                "f06_49" to f06_49.text.toString(),
                "f06_50" to f06_50.text.toString(),
                "f06_51" to f06_51.text.toString(),
                "f06_52" to f06_52.text.toString(),
                "f06_53" to f06_53.text.toString(),
                "f06_54" to f06_54.text.toString(),
                "f06_55" to f06_55.text.toString(),
                "f06_56" to f06_56.text.toString(),
                "f06_57" to f06_57.text.toString(),
                "f06_58" to f06_58.text.toString(),
                "f06_59" to f06_59.text.toString(),
                "f06_60" to f06_60.text.toString(),
                "f06_61" to f06_61.text.toString(),
                "f06_62" to f06_62.text.toString(),
                "f06_63" to f06_63.text.toString(),
                "f06_64" to f06_64.text.toString(),
                "f06_65" to f06_65.text.toString(),
                "f06_66" to f06_66.text.toString(),
                "f06_67" to f06_67.text.toString(),
                "completef06" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f06_01.text.toString().equals("")){complete = false;}
        if(f06_02.text.toString().equals("")){complete = false;}
        if(f06_03.text.toString().equals("")){complete = false;}
        if(f06_04.text.toString().equals("")){complete = false;}
        if(f06_05.text.toString().equals("")){complete = false;}
        if(f06_06.text.toString().equals("")){complete = false;}
        if(f06_07.text.toString().equals("")){complete = false;}
        if(f06_08.text.toString().equals("")){complete = false;}
        if(f06_09.text.toString().equals("")){complete = false;}
        if(f06_10.text.toString().equals("")){complete = false;}
        if(f06_11.text.toString().equals("")){complete = false;}
        if(f06_12.text.toString().equals("")){complete = false;}
        if(f06_13.text.toString().equals("")){complete = false;}
        if(f06_14.text.toString().equals("")){complete = false;}
        if(f06_15.text.toString().equals("")){complete = false;}
        if(f06_16.text.toString().equals("")){complete = false;}
        if(f06_17.text.toString().equals("")){complete = false;}
        if(f06_18.text.toString().equals("")){complete = false;}
        if(f06_19.text.toString().equals("")){complete = false;}
        if(f06_20.text.toString().equals("")){complete = false;}
        if(f06_21.text.toString().equals("")){complete = false;}
        if(f06_22.text.toString().equals("")){complete = false;}
        if(f06_23.text.toString().equals("")){complete = false;}
        if(f06_24.text.toString().equals("")){complete = false;}
        if(f06_25.text.toString().equals("")){complete = false;}
        if(f06_26.text.toString().equals("")){complete = false;}
        if(f06_27.text.toString().equals("")){complete = false;}
        if(f06_28.text.toString().equals("")){complete = false;}
        if(f06_29.text.toString().equals("")){complete = false;}
        if(f06_30.text.toString().equals("")){complete = false;}
        if(f06_31.text.toString().equals("")){complete = false;}
        if(f06_32.text.toString().equals("")){complete = false;}
        if(f06_33.text.toString().equals("")){complete = false;}
        if(f06_34.text.toString().equals("")){complete = false;}
        if(f06_35.text.toString().equals("")){complete = false;}
        if(f06_36.text.toString().equals("")){complete = false;}
        if(f06_37.text.toString().equals("")){complete = false;}
        if(f06_38.text.toString().equals("")){complete = false;}
        if(f06_39.text.toString().equals("")){complete = false;}
        if(f06_40.text.toString().equals("")){complete = false;}
        if(f06_41.text.toString().equals("")){complete = false;}
        if(f06_42.text.toString().equals("")){complete = false;}
        if(f06_43.text.toString().equals("")){complete = false;}
        if(f06_44.text.toString().equals("")){complete = false;}
        if(f06_45.text.toString().equals("")){complete = false;}
        if(f06_46.text.toString().equals("")){complete = false;}
        if(f06_47.text.toString().equals("")){complete = false;}
        if(f06_48.text.toString().equals("")){complete = false;}
        if(f06_49.text.toString().equals("")){complete = false;}
        if(f06_50.text.toString().equals("")){complete = false;}
        if(f06_51.text.toString().equals("")){complete = false;}
        if(f06_52.text.toString().equals("")){complete = false;}
        if(f06_53.text.toString().equals("")){complete = false;}
        if(f06_54.text.toString().equals("")){complete = false;}
        if(f06_55.text.toString().equals("")){complete = false;}
        if(f06_56.text.toString().equals("")){complete = false;}
        if(f06_57.text.toString().equals("")){complete = false;}
        if(f06_58.text.toString().equals("")){complete = false;}
        if(f06_59.text.toString().equals("")){complete = false;}
        if(f06_60.text.toString().equals("")){complete = false;}
        if(f06_61.text.toString().equals("")){complete = false;}
        if(f06_62.text.toString().equals("")){complete = false;}
        if(f06_63.text.toString().equals("")){complete = false;}
        if(f06_64.text.toString().equals("")){complete = false;}
        if(f06_65.text.toString().equals("")){complete = false;}
        if(f06_66.text.toString().equals("")){complete = false;}
        if(f06_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f06_01.setText(it.get("f06_01") as String?)
            f06_02.setText(it.get("f06_02") as String?)
            f06_03.setText(it.get("f06_03") as String?)
            f06_04.setText(it.get("f06_04") as String?)
            f06_05.setText(it.get("f06_05") as String?)
            f06_06.setText(it.get("f06_06") as String?)
            f06_07.setText(it.get("f06_07") as String?)
            f06_08.setText(it.get("f06_08") as String?)
            f06_09.setText(it.get("f06_09") as String?)
            f06_10.setText(it.get("f06_10") as String?)
            f06_11.setText(it.get("f06_11") as String?)
            f06_12.setText(it.get("f06_12") as String?)
            f06_13.setText(it.get("f06_13") as String?)
            f06_14.setText(it.get("f06_14") as String?)
            f06_15.setText(it.get("f06_15") as String?)
            f06_16.setText(it.get("f06_16") as String?)
            f06_17.setText(it.get("f06_17") as String?)
            f06_18.setText(it.get("f06_18") as String?)
            f06_19.setText(it.get("f06_19") as String?)
            f06_20.setText(it.get("f06_20") as String?)
            f06_21.setText(it.get("f06_21") as String?)
            f06_22.setText(it.get("f06_22") as String?)
            f06_23.setText(it.get("f06_23") as String?)
            f06_24.setText(it.get("f06_24") as String?)
            f06_25.setText(it.get("f06_25") as String?)
            f06_26.setText(it.get("f06_26") as String?)
            f06_27.setText(it.get("f06_27") as String?)
            f06_28.setText(it.get("f06_28") as String?)
            f06_29.setText(it.get("f06_29") as String?)
            f06_30.setText(it.get("f06_30") as String?)
            f06_31.setText(it.get("f06_31") as String?)
            f06_32.setText(it.get("f06_32") as String?)
            f06_33.setText(it.get("f06_33") as String?)
            f06_34.setText(it.get("f06_34") as String?)
            f06_35.setText(it.get("f06_35") as String?)
            f06_36.setText(it.get("f06_36") as String?)
            f06_37.setText(it.get("f06_37") as String?)
            f06_38.setText(it.get("f06_38") as String?)
            f06_39.setText(it.get("f06_39") as String?)
            f06_40.setText(it.get("f06_40") as String?)
            f06_41.setText(it.get("f06_41") as String?)
            f06_42.setText(it.get("f06_42") as String?)
            f06_43.setText(it.get("f06_43") as String?)
            f06_44.setText(it.get("f06_44") as String?)
            f06_45.setText(it.get("f06_45") as String?)
            f06_46.setText(it.get("f06_46") as String?)
            f06_47.setText(it.get("f06_47") as String?)
            f06_48.setText(it.get("f06_48") as String?)
            f06_49.setText(it.get("f06_49") as String?)
            f06_50.setText(it.get("f06_50") as String?)
            f06_51.setText(it.get("f06_51") as String?)
            f06_52.setText(it.get("f06_52") as String?)
            f06_53.setText(it.get("f06_53") as String?)
            f06_54.setText(it.get("f06_54") as String?)
            f06_55.setText(it.get("f06_55") as String?)
            f06_56.setText(it.get("f06_56") as String?)
            f06_57.setText(it.get("f06_57") as String?)
            f06_58.setText(it.get("f06_58") as String?)
            f06_59.setText(it.get("f06_59") as String?)
            f06_60.setText(it.get("f06_60") as String?)
            f06_61.setText(it.get("f06_61") as String?)
            f06_62.setText(it.get("f06_62") as String?)
            f06_63.setText(it.get("f06_63") as String?)
            f06_64.setText(it.get("f06_64") as String?)
            f06_65.setText(it.get("f06_65") as String?)
            f06_66.setText(it.get("f06_66") as String?)
            f06_67.setText(it.get("f06_67") as String?)
            if (completeFun().equals("true")){
                progressTextf06.setText("Sección Completa")
            }else{
                progressTextf06.setText("Sección Incompleta")
            }


        }
    }

     */
}

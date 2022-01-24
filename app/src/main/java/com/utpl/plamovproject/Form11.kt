package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form01.*
import kotlinx.android.synthetic.main.activity_form11.*
import kotlinx.android.synthetic.main.activity_form11.atras
import kotlinx.android.synthetic.main.activity_form11.menu
import kotlinx.android.synthetic.main.activity_form11.siguiente

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

        //refrescar(email, provider)
        siguiente.setOnClickListener{
            //guardarDatos(email, provider)
            val form12Intent: Intent = Intent(this,Form12::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form12Intent)

        }

        atras.setOnClickListener {
            //guardarDatos(email, provider)
            val form09Intent: Intent = Intent(this,Form09::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form09Intent)
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
                "f11_30" to f11_30.text.toString(),
                "f11_31" to f11_31.text.toString(),
                "f11_32" to f11_32.text.toString(),
                "f11_33" to f11_33.text.toString(),
                "f11_34" to f11_34.text.toString(),
                "f11_35" to f11_35.text.toString(),
                "f11_36" to f11_36.text.toString(),
                "f11_37" to f11_37.text.toString(),
                "f11_38" to f11_38.text.toString(),
                "f11_39" to f11_39.text.toString(),
                "f11_40" to f11_40.text.toString(),
                "f11_41" to f11_41.text.toString(),
                "f11_42" to f11_42.text.toString(),
                "f11_43" to f11_43.text.toString(),
                "f11_44" to f11_44.text.toString(),
                "f11_45" to f11_45.text.toString(),
                "f11_46" to f11_46.text.toString(),
                "f11_47" to f11_47.text.toString(),
                "f11_48" to f11_48.text.toString(),
                "f11_49" to f11_49.text.toString(),
                "f11_50" to f11_50.text.toString(),
                "f11_51" to f11_51.text.toString(),
                "f11_52" to f11_52.text.toString(),
                "f11_53" to f11_53.text.toString(),
                "f11_54" to f11_54.text.toString(),
                "f11_55" to f11_55.text.toString(),
                "f11_56" to f11_56.text.toString(),
                "f11_57" to f11_57.text.toString(),
                "f11_58" to f11_58.text.toString(),
                "f11_59" to f11_59.text.toString(),
                "f11_60" to f11_60.text.toString(),
                "f11_61" to f11_61.text.toString(),
                "f11_62" to f11_62.text.toString(),
                "f11_63" to f11_63.text.toString(),
                "f11_64" to f11_64.text.toString(),
                "f11_65" to f11_65.text.toString(),
                "f11_66" to f11_66.text.toString(),
                "f11_67" to f11_67.text.toString(),
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
        if(f11_30.text.toString().equals("")){complete = false;}
        if(f11_31.text.toString().equals("")){complete = false;}
        if(f11_32.text.toString().equals("")){complete = false;}
        if(f11_33.text.toString().equals("")){complete = false;}
        if(f11_34.text.toString().equals("")){complete = false;}
        if(f11_35.text.toString().equals("")){complete = false;}
        if(f11_36.text.toString().equals("")){complete = false;}
        if(f11_37.text.toString().equals("")){complete = false;}
        if(f11_38.text.toString().equals("")){complete = false;}
        if(f11_39.text.toString().equals("")){complete = false;}
        if(f11_40.text.toString().equals("")){complete = false;}
        if(f11_41.text.toString().equals("")){complete = false;}
        if(f11_42.text.toString().equals("")){complete = false;}
        if(f11_43.text.toString().equals("")){complete = false;}
        if(f11_44.text.toString().equals("")){complete = false;}
        if(f11_45.text.toString().equals("")){complete = false;}
        if(f11_46.text.toString().equals("")){complete = false;}
        if(f11_47.text.toString().equals("")){complete = false;}
        if(f11_48.text.toString().equals("")){complete = false;}
        if(f11_49.text.toString().equals("")){complete = false;}
        if(f11_50.text.toString().equals("")){complete = false;}
        if(f11_51.text.toString().equals("")){complete = false;}
        if(f11_52.text.toString().equals("")){complete = false;}
        if(f11_53.text.toString().equals("")){complete = false;}
        if(f11_54.text.toString().equals("")){complete = false;}
        if(f11_55.text.toString().equals("")){complete = false;}
        if(f11_56.text.toString().equals("")){complete = false;}
        if(f11_57.text.toString().equals("")){complete = false;}
        if(f11_58.text.toString().equals("")){complete = false;}
        if(f11_59.text.toString().equals("")){complete = false;}
        if(f11_60.text.toString().equals("")){complete = false;}
        if(f11_61.text.toString().equals("")){complete = false;}
        if(f11_62.text.toString().equals("")){complete = false;}
        if(f11_63.text.toString().equals("")){complete = false;}
        if(f11_64.text.toString().equals("")){complete = false;}
        if(f11_65.text.toString().equals("")){complete = false;}
        if(f11_66.text.toString().equals("")){complete = false;}
        if(f11_67.text.toString().equals("")){complete = false;}

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
            f11_30.setText(it.get("f11_30") as String?)
            f11_31.setText(it.get("f11_31") as String?)
            f11_32.setText(it.get("f11_32") as String?)
            f11_33.setText(it.get("f11_33") as String?)
            f11_34.setText(it.get("f11_34") as String?)
            f11_35.setText(it.get("f11_35") as String?)
            f11_36.setText(it.get("f11_36") as String?)
            f11_37.setText(it.get("f11_37") as String?)
            f11_38.setText(it.get("f11_38") as String?)
            f11_39.setText(it.get("f11_39") as String?)
            f11_40.setText(it.get("f11_40") as String?)
            f11_41.setText(it.get("f11_41") as String?)
            f11_42.setText(it.get("f11_42") as String?)
            f11_43.setText(it.get("f11_43") as String?)
            f11_44.setText(it.get("f11_44") as String?)
            f11_45.setText(it.get("f11_45") as String?)
            f11_46.setText(it.get("f11_46") as String?)
            f11_47.setText(it.get("f11_47") as String?)
            f11_48.setText(it.get("f11_48") as String?)
            f11_49.setText(it.get("f11_49") as String?)
            f11_50.setText(it.get("f11_50") as String?)
            f11_51.setText(it.get("f11_51") as String?)
            f11_52.setText(it.get("f11_52") as String?)
            f11_53.setText(it.get("f11_53") as String?)
            f11_54.setText(it.get("f11_54") as String?)
            f11_55.setText(it.get("f11_55") as String?)
            f11_56.setText(it.get("f11_56") as String?)
            f11_57.setText(it.get("f11_57") as String?)
            f11_58.setText(it.get("f11_58") as String?)
            f11_59.setText(it.get("f11_59") as String?)
            f11_60.setText(it.get("f11_60") as String?)
            f11_61.setText(it.get("f11_61") as String?)
            f11_62.setText(it.get("f11_62") as String?)
            f11_63.setText(it.get("f11_63") as String?)
            f11_64.setText(it.get("f11_64") as String?)
            f11_65.setText(it.get("f11_65") as String?)
            f11_66.setText(it.get("f11_66") as String?)
            f11_67.setText(it.get("f11_67") as String?)
            if (completeFun().equals("true")){
                progressTextf11.setText("Sección Completa")
            }else{
                progressTextf11.setText("Sección Incompleta")
            }


        }
    }

     */
}

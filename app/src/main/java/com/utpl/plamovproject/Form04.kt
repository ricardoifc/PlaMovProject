package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form03.*
import kotlinx.android.synthetic.main.activity_form04.*
import kotlinx.android.synthetic.main.activity_form04.atras
import kotlinx.android.synthetic.main.activity_form04.menu
import kotlinx.android.synthetic.main.activity_form04.siguiente


class Form04 : AppCompatActivity() {
    var formulario = "fo04"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form04)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        //refrescar(email, provider)
        siguiente.setOnClickListener{
            //guardarDatos(email, provider)
            val form05Intent: Intent = Intent(this,Form05::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form05Intent)

        }

        atras.setOnClickListener {
            //guardarDatos(email, provider)
            val form03Intent: Intent = Intent(this,Form03::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form03Intent)
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

                "f04_01" to f04_01.text.toString(),
                "f04_02" to f04_02.text.toString(),
                "f04_03" to f04_03.text.toString(),
                "f04_04" to f04_04.text.toString(),
                "f04_05" to f04_05.text.toString(),
                "f04_06" to f04_06.text.toString(),
                "f04_07" to f04_07.text.toString(),
                "f04_08" to f04_08.text.toString(),
                "f04_09" to f04_09.text.toString(),
                "f04_10" to f04_10.text.toString(),
                "f04_11" to f04_11.text.toString(),
                "f04_12" to f04_12.text.toString(),
                "f04_13" to f04_13.text.toString(),
                "f04_14" to f04_14.text.toString(),
                "f04_15" to f04_15.text.toString(),
                "f04_16" to f04_16.text.toString(),
                "f04_17" to f04_17.text.toString(),
                "f04_18" to f04_18.text.toString(),
                "f04_19" to f04_19.text.toString(),
                "f04_20" to f04_20.text.toString(),
                "f04_21" to f04_21.text.toString(),
                "f04_22" to f04_22.text.toString(),
                "f04_23" to f04_23.text.toString(),
                "f04_24" to f04_24.text.toString(),
                "f04_25" to f04_25.text.toString(),
                "f04_26" to f04_26.text.toString(),
                "f04_27" to f04_27.text.toString(),
                "f04_28" to f04_28.text.toString(),
                "f04_29" to f04_29.text.toString(),
                "f04_30" to f04_30.text.toString(),
                "f04_31" to f04_31.text.toString(),
                "f04_32" to f04_32.text.toString(),
                "f04_33" to f04_33.text.toString(),
                "f04_34" to f04_34.text.toString(),
                "f04_35" to f04_35.text.toString(),
                "f04_36" to f04_36.text.toString(),
                "f04_37" to f04_37.text.toString(),
                "f04_38" to f04_38.text.toString(),
                "f04_39" to f04_39.text.toString(),
                "f04_40" to f04_40.text.toString(),
                "f04_41" to f04_41.text.toString(),
                "f04_42" to f04_42.text.toString(),
                "f04_43" to f04_43.text.toString(),
                "f04_44" to f04_44.text.toString(),
                "f04_45" to f04_45.text.toString(),
                "f04_46" to f04_46.text.toString(),
                "f04_47" to f04_47.text.toString(),
                "f04_48" to f04_48.text.toString(),
                "f04_49" to f04_49.text.toString(),
                "f04_50" to f04_50.text.toString(),
                "f04_51" to f04_51.text.toString(),
                "f04_52" to f04_52.text.toString(),
                "f04_53" to f04_53.text.toString(),
                "f04_54" to f04_54.text.toString(),
                "f04_55" to f04_55.text.toString(),
                "f04_56" to f04_56.text.toString(),
                "f04_57" to f04_57.text.toString(),
                "f04_58" to f04_58.text.toString(),
                "f04_59" to f04_59.text.toString(),
                "f04_60" to f04_60.text.toString(),
                "f04_61" to f04_61.text.toString(),
                "f04_62" to f04_62.text.toString(),
                "f04_63" to f04_63.text.toString(),
                "f04_64" to f04_64.text.toString(),
                "f04_65" to f04_65.text.toString(),
                "f04_66" to f04_66.text.toString(),
                "f04_67" to f04_67.text.toString(),
                "completef04" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f04_01.text.toString().equals("")){complete = false;}
        if(f04_02.text.toString().equals("")){complete = false;}
        if(f04_03.text.toString().equals("")){complete = false;}
        if(f04_04.text.toString().equals("")){complete = false;}
        if(f04_05.text.toString().equals("")){complete = false;}
        if(f04_06.text.toString().equals("")){complete = false;}
        if(f04_07.text.toString().equals("")){complete = false;}
        if(f04_08.text.toString().equals("")){complete = false;}
        if(f04_09.text.toString().equals("")){complete = false;}
        if(f04_10.text.toString().equals("")){complete = false;}
        if(f04_11.text.toString().equals("")){complete = false;}
        if(f04_12.text.toString().equals("")){complete = false;}
        if(f04_13.text.toString().equals("")){complete = false;}
        if(f04_14.text.toString().equals("")){complete = false;}
        if(f04_15.text.toString().equals("")){complete = false;}
        if(f04_16.text.toString().equals("")){complete = false;}
        if(f04_17.text.toString().equals("")){complete = false;}
        if(f04_18.text.toString().equals("")){complete = false;}
        if(f04_19.text.toString().equals("")){complete = false;}
        if(f04_20.text.toString().equals("")){complete = false;}
        if(f04_21.text.toString().equals("")){complete = false;}
        if(f04_22.text.toString().equals("")){complete = false;}
        if(f04_23.text.toString().equals("")){complete = false;}
        if(f04_24.text.toString().equals("")){complete = false;}
        if(f04_25.text.toString().equals("")){complete = false;}
        if(f04_26.text.toString().equals("")){complete = false;}
        if(f04_27.text.toString().equals("")){complete = false;}
        if(f04_28.text.toString().equals("")){complete = false;}
        if(f04_29.text.toString().equals("")){complete = false;}
        if(f04_30.text.toString().equals("")){complete = false;}
        if(f04_31.text.toString().equals("")){complete = false;}
        if(f04_32.text.toString().equals("")){complete = false;}
        if(f04_33.text.toString().equals("")){complete = false;}
        if(f04_34.text.toString().equals("")){complete = false;}
        if(f04_35.text.toString().equals("")){complete = false;}
        if(f04_36.text.toString().equals("")){complete = false;}
        if(f04_37.text.toString().equals("")){complete = false;}
        if(f04_38.text.toString().equals("")){complete = false;}
        if(f04_39.text.toString().equals("")){complete = false;}
        if(f04_40.text.toString().equals("")){complete = false;}
        if(f04_41.text.toString().equals("")){complete = false;}
        if(f04_42.text.toString().equals("")){complete = false;}
        if(f04_43.text.toString().equals("")){complete = false;}
        if(f04_44.text.toString().equals("")){complete = false;}
        if(f04_45.text.toString().equals("")){complete = false;}
        if(f04_46.text.toString().equals("")){complete = false;}
        if(f04_47.text.toString().equals("")){complete = false;}
        if(f04_48.text.toString().equals("")){complete = false;}
        if(f04_49.text.toString().equals("")){complete = false;}
        if(f04_50.text.toString().equals("")){complete = false;}
        if(f04_51.text.toString().equals("")){complete = false;}
        if(f04_52.text.toString().equals("")){complete = false;}
        if(f04_53.text.toString().equals("")){complete = false;}
        if(f04_54.text.toString().equals("")){complete = false;}
        if(f04_55.text.toString().equals("")){complete = false;}
        if(f04_56.text.toString().equals("")){complete = false;}
        if(f04_57.text.toString().equals("")){complete = false;}
        if(f04_58.text.toString().equals("")){complete = false;}
        if(f04_59.text.toString().equals("")){complete = false;}
        if(f04_60.text.toString().equals("")){complete = false;}
        if(f04_61.text.toString().equals("")){complete = false;}
        if(f04_62.text.toString().equals("")){complete = false;}
        if(f04_63.text.toString().equals("")){complete = false;}
        if(f04_64.text.toString().equals("")){complete = false;}
        if(f04_65.text.toString().equals("")){complete = false;}
        if(f04_66.text.toString().equals("")){complete = false;}
        if(f04_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f04_01.setText(it.get("f04_01") as String?)
            f04_02.setText(it.get("f04_02") as String?)
            f04_03.setText(it.get("f04_03") as String?)
            f04_04.setText(it.get("f04_04") as String?)
            f04_05.setText(it.get("f04_05") as String?)
            f04_06.setText(it.get("f04_06") as String?)
            f04_07.setText(it.get("f04_07") as String?)
            f04_08.setText(it.get("f04_08") as String?)
            f04_09.setText(it.get("f04_09") as String?)
            f04_10.setText(it.get("f04_10") as String?)
            f04_11.setText(it.get("f04_11") as String?)
            f04_12.setText(it.get("f04_12") as String?)
            f04_13.setText(it.get("f04_13") as String?)
            f04_14.setText(it.get("f04_14") as String?)
            f04_15.setText(it.get("f04_15") as String?)
            f04_16.setText(it.get("f04_16") as String?)
            f04_17.setText(it.get("f04_17") as String?)
            f04_18.setText(it.get("f04_18") as String?)
            f04_19.setText(it.get("f04_19") as String?)
            f04_20.setText(it.get("f04_20") as String?)
            f04_21.setText(it.get("f04_21") as String?)
            f04_22.setText(it.get("f04_22") as String?)
            f04_23.setText(it.get("f04_23") as String?)
            f04_24.setText(it.get("f04_24") as String?)
            f04_25.setText(it.get("f04_25") as String?)
            f04_26.setText(it.get("f04_26") as String?)
            f04_27.setText(it.get("f04_27") as String?)
            f04_28.setText(it.get("f04_28") as String?)
            f04_29.setText(it.get("f04_29") as String?)
            f04_30.setText(it.get("f04_30") as String?)
            f04_31.setText(it.get("f04_31") as String?)
            f04_32.setText(it.get("f04_32") as String?)
            f04_33.setText(it.get("f04_33") as String?)
            f04_34.setText(it.get("f04_34") as String?)
            f04_35.setText(it.get("f04_35") as String?)
            f04_36.setText(it.get("f04_36") as String?)
            f04_37.setText(it.get("f04_37") as String?)
            f04_38.setText(it.get("f04_38") as String?)
            f04_39.setText(it.get("f04_39") as String?)
            f04_40.setText(it.get("f04_40") as String?)
            f04_41.setText(it.get("f04_41") as String?)
            f04_42.setText(it.get("f04_42") as String?)
            f04_43.setText(it.get("f04_43") as String?)
            f04_44.setText(it.get("f04_44") as String?)
            f04_45.setText(it.get("f04_45") as String?)
            f04_46.setText(it.get("f04_46") as String?)
            f04_47.setText(it.get("f04_47") as String?)
            f04_48.setText(it.get("f04_48") as String?)
            f04_49.setText(it.get("f04_49") as String?)
            f04_50.setText(it.get("f04_50") as String?)
            f04_51.setText(it.get("f04_51") as String?)
            f04_52.setText(it.get("f04_52") as String?)
            f04_53.setText(it.get("f04_53") as String?)
            f04_54.setText(it.get("f04_54") as String?)
            f04_55.setText(it.get("f04_55") as String?)
            f04_56.setText(it.get("f04_56") as String?)
            f04_57.setText(it.get("f04_57") as String?)
            f04_58.setText(it.get("f04_58") as String?)
            f04_59.setText(it.get("f04_59") as String?)
            f04_60.setText(it.get("f04_60") as String?)
            f04_61.setText(it.get("f04_61") as String?)
            f04_62.setText(it.get("f04_62") as String?)
            f04_63.setText(it.get("f04_63") as String?)
            f04_64.setText(it.get("f04_64") as String?)
            f04_65.setText(it.get("f04_65") as String?)
            f04_66.setText(it.get("f04_66") as String?)
            f04_67.setText(it.get("f04_67") as String?)
            if (completeFun().equals("true")){
                progressTextf04.setText("Sección Completa")
            }else{
                progressTextf04.setText("Sección Incompleta")
            }


        }
    }

     */
}

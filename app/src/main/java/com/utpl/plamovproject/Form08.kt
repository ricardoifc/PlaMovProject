package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form08.*


class Form08 : AppCompatActivity() {
    var formulario = "fo08"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form08)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        //refrescar(email, provider)
        siguiente.setOnClickListener{
            //guardarDatos(email, provider)
            val form02Intent: Intent = Intent(this,Form02::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form02Intent)

        }

        atras.setOnClickListener {
            //guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(MenuIntent)
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

                "f08_01" to f08_01.text.toString(),
                "f08_02" to f08_02.text.toString(),
                "f08_03" to f08_03.text.toString(),
                "f08_04" to f08_04.text.toString(),
                "f08_05" to f08_05.text.toString(),
                "f08_06" to f08_06.text.toString(),
                "f08_07" to f08_07.text.toString(),
                "f08_08" to f08_08.text.toString(),
                "f08_09" to f08_09.text.toString(),
                "f08_10" to f08_10.text.toString(),
                "f08_11" to f08_11.text.toString(),
                "f08_12" to f08_12.text.toString(),
                "f08_13" to f08_13.text.toString(),
                "f08_14" to f08_14.text.toString(),
                "f08_15" to f08_15.text.toString(),
                "f08_16" to f08_16.text.toString(),
                "f08_17" to f08_17.text.toString(),
                "f08_18" to f08_18.text.toString(),
                "f08_19" to f08_19.text.toString(),
                "f08_20" to f08_20.text.toString(),
                "f08_21" to f08_21.text.toString(),
                "f08_22" to f08_22.text.toString(),
                "f08_23" to f08_23.text.toString(),
                "f08_24" to f08_24.text.toString(),
                "f08_25" to f08_25.text.toString(),
                "f08_26" to f08_26.text.toString(),
                "f08_27" to f08_27.text.toString(),
                "f08_28" to f08_28.text.toString(),
                "f08_29" to f08_29.text.toString(),
                "f08_30" to f08_30.text.toString(),
                "f08_31" to f08_31.text.toString(),
                "f08_32" to f08_32.text.toString(),
                "f08_33" to f08_33.text.toString(),
                "f08_34" to f08_34.text.toString(),
                "f08_35" to f08_35.text.toString(),
                "f08_36" to f08_36.text.toString(),
                "f08_37" to f08_37.text.toString(),
                "f08_38" to f08_38.text.toString(),
                "f08_39" to f08_39.text.toString(),
                "f08_40" to f08_40.text.toString(),
                "f08_41" to f08_41.text.toString(),
                "f08_42" to f08_42.text.toString(),
                "f08_43" to f08_43.text.toString(),
                "f08_44" to f08_44.text.toString(),
                "f08_45" to f08_45.text.toString(),
                "f08_46" to f08_46.text.toString(),
                "f08_47" to f08_47.text.toString(),
                "f08_48" to f08_48.text.toString(),
                "f08_49" to f08_49.text.toString(),
                "f08_50" to f08_50.text.toString(),
                "f08_51" to f08_51.text.toString(),
                "f08_52" to f08_52.text.toString(),
                "f08_53" to f08_53.text.toString(),
                "f08_54" to f08_54.text.toString(),
                "f08_55" to f08_55.text.toString(),
                "f08_56" to f08_56.text.toString(),
                "f08_57" to f08_57.text.toString(),
                "f08_58" to f08_58.text.toString(),
                "f08_59" to f08_59.text.toString(),
                "f08_60" to f08_60.text.toString(),
                "f08_61" to f08_61.text.toString(),
                "f08_62" to f08_62.text.toString(),
                "f08_63" to f08_63.text.toString(),
                "f08_64" to f08_64.text.toString(),
                "f08_65" to f08_65.text.toString(),
                "f08_66" to f08_66.text.toString(),
                "f08_67" to f08_67.text.toString(),
                "completef08" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f08_01.text.toString().equals("")){complete = false;}
        if(f08_02.text.toString().equals("")){complete = false;}
        if(f08_03.text.toString().equals("")){complete = false;}
        if(f08_04.text.toString().equals("")){complete = false;}
        if(f08_05.text.toString().equals("")){complete = false;}
        if(f08_06.text.toString().equals("")){complete = false;}
        if(f08_07.text.toString().equals("")){complete = false;}
        if(f08_08.text.toString().equals("")){complete = false;}
        if(f08_09.text.toString().equals("")){complete = false;}
        if(f08_10.text.toString().equals("")){complete = false;}
        if(f08_11.text.toString().equals("")){complete = false;}
        if(f08_12.text.toString().equals("")){complete = false;}
        if(f08_13.text.toString().equals("")){complete = false;}
        if(f08_14.text.toString().equals("")){complete = false;}
        if(f08_15.text.toString().equals("")){complete = false;}
        if(f08_16.text.toString().equals("")){complete = false;}
        if(f08_17.text.toString().equals("")){complete = false;}
        if(f08_18.text.toString().equals("")){complete = false;}
        if(f08_19.text.toString().equals("")){complete = false;}
        if(f08_20.text.toString().equals("")){complete = false;}
        if(f08_21.text.toString().equals("")){complete = false;}
        if(f08_22.text.toString().equals("")){complete = false;}
        if(f08_23.text.toString().equals("")){complete = false;}
        if(f08_24.text.toString().equals("")){complete = false;}
        if(f08_25.text.toString().equals("")){complete = false;}
        if(f08_26.text.toString().equals("")){complete = false;}
        if(f08_27.text.toString().equals("")){complete = false;}
        if(f08_28.text.toString().equals("")){complete = false;}
        if(f08_29.text.toString().equals("")){complete = false;}
        if(f08_30.text.toString().equals("")){complete = false;}
        if(f08_31.text.toString().equals("")){complete = false;}
        if(f08_32.text.toString().equals("")){complete = false;}
        if(f08_33.text.toString().equals("")){complete = false;}
        if(f08_34.text.toString().equals("")){complete = false;}
        if(f08_35.text.toString().equals("")){complete = false;}
        if(f08_36.text.toString().equals("")){complete = false;}
        if(f08_37.text.toString().equals("")){complete = false;}
        if(f08_38.text.toString().equals("")){complete = false;}
        if(f08_39.text.toString().equals("")){complete = false;}
        if(f08_40.text.toString().equals("")){complete = false;}
        if(f08_41.text.toString().equals("")){complete = false;}
        if(f08_42.text.toString().equals("")){complete = false;}
        if(f08_43.text.toString().equals("")){complete = false;}
        if(f08_44.text.toString().equals("")){complete = false;}
        if(f08_45.text.toString().equals("")){complete = false;}
        if(f08_46.text.toString().equals("")){complete = false;}
        if(f08_47.text.toString().equals("")){complete = false;}
        if(f08_48.text.toString().equals("")){complete = false;}
        if(f08_49.text.toString().equals("")){complete = false;}
        if(f08_50.text.toString().equals("")){complete = false;}
        if(f08_51.text.toString().equals("")){complete = false;}
        if(f08_52.text.toString().equals("")){complete = false;}
        if(f08_53.text.toString().equals("")){complete = false;}
        if(f08_54.text.toString().equals("")){complete = false;}
        if(f08_55.text.toString().equals("")){complete = false;}
        if(f08_56.text.toString().equals("")){complete = false;}
        if(f08_57.text.toString().equals("")){complete = false;}
        if(f08_58.text.toString().equals("")){complete = false;}
        if(f08_59.text.toString().equals("")){complete = false;}
        if(f08_60.text.toString().equals("")){complete = false;}
        if(f08_61.text.toString().equals("")){complete = false;}
        if(f08_62.text.toString().equals("")){complete = false;}
        if(f08_63.text.toString().equals("")){complete = false;}
        if(f08_64.text.toString().equals("")){complete = false;}
        if(f08_65.text.toString().equals("")){complete = false;}
        if(f08_66.text.toString().equals("")){complete = false;}
        if(f08_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f08_01.setText(it.get("f08_01") as String?)
            f08_02.setText(it.get("f08_02") as String?)
            f08_03.setText(it.get("f08_03") as String?)
            f08_04.setText(it.get("f08_04") as String?)
            f08_05.setText(it.get("f08_05") as String?)
            f08_06.setText(it.get("f08_06") as String?)
            f08_07.setText(it.get("f08_07") as String?)
            f08_08.setText(it.get("f08_08") as String?)
            f08_09.setText(it.get("f08_09") as String?)
            f08_10.setText(it.get("f08_10") as String?)
            f08_11.setText(it.get("f08_11") as String?)
            f08_12.setText(it.get("f08_12") as String?)
            f08_13.setText(it.get("f08_13") as String?)
            f08_14.setText(it.get("f08_14") as String?)
            f08_15.setText(it.get("f08_15") as String?)
            f08_16.setText(it.get("f08_16") as String?)
            f08_17.setText(it.get("f08_17") as String?)
            f08_18.setText(it.get("f08_18") as String?)
            f08_19.setText(it.get("f08_19") as String?)
            f08_20.setText(it.get("f08_20") as String?)
            f08_21.setText(it.get("f08_21") as String?)
            f08_22.setText(it.get("f08_22") as String?)
            f08_23.setText(it.get("f08_23") as String?)
            f08_24.setText(it.get("f08_24") as String?)
            f08_25.setText(it.get("f08_25") as String?)
            f08_26.setText(it.get("f08_26") as String?)
            f08_27.setText(it.get("f08_27") as String?)
            f08_28.setText(it.get("f08_28") as String?)
            f08_29.setText(it.get("f08_29") as String?)
            f08_30.setText(it.get("f08_30") as String?)
            f08_31.setText(it.get("f08_31") as String?)
            f08_32.setText(it.get("f08_32") as String?)
            f08_33.setText(it.get("f08_33") as String?)
            f08_34.setText(it.get("f08_34") as String?)
            f08_35.setText(it.get("f08_35") as String?)
            f08_36.setText(it.get("f08_36") as String?)
            f08_37.setText(it.get("f08_37") as String?)
            f08_38.setText(it.get("f08_38") as String?)
            f08_39.setText(it.get("f08_39") as String?)
            f08_40.setText(it.get("f08_40") as String?)
            f08_41.setText(it.get("f08_41") as String?)
            f08_42.setText(it.get("f08_42") as String?)
            f08_43.setText(it.get("f08_43") as String?)
            f08_44.setText(it.get("f08_44") as String?)
            f08_45.setText(it.get("f08_45") as String?)
            f08_46.setText(it.get("f08_46") as String?)
            f08_47.setText(it.get("f08_47") as String?)
            f08_48.setText(it.get("f08_48") as String?)
            f08_49.setText(it.get("f08_49") as String?)
            f08_50.setText(it.get("f08_50") as String?)
            f08_51.setText(it.get("f08_51") as String?)
            f08_52.setText(it.get("f08_52") as String?)
            f08_53.setText(it.get("f08_53") as String?)
            f08_54.setText(it.get("f08_54") as String?)
            f08_55.setText(it.get("f08_55") as String?)
            f08_56.setText(it.get("f08_56") as String?)
            f08_57.setText(it.get("f08_57") as String?)
            f08_58.setText(it.get("f08_58") as String?)
            f08_59.setText(it.get("f08_59") as String?)
            f08_60.setText(it.get("f08_60") as String?)
            f08_61.setText(it.get("f08_61") as String?)
            f08_62.setText(it.get("f08_62") as String?)
            f08_63.setText(it.get("f08_63") as String?)
            f08_64.setText(it.get("f08_64") as String?)
            f08_65.setText(it.get("f08_65") as String?)
            f08_66.setText(it.get("f08_66") as String?)
            f08_67.setText(it.get("f08_67") as String?)
            if (completeFun().equals("true")){
                progressTextf08.setText("Sección Completa")
            }else{
                progressTextf08.setText("Sección Incompleta")
            }


        }
    }
    */
}

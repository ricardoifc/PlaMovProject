package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form05.*


class Form05 : AppCompatActivity() {
    var formulario = "fo05"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form05)

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

                "f05_01" to f05_01.text.toString(),
                "f05_02" to f05_02.text.toString(),
                "f05_03" to f05_03.text.toString(),
                "f05_04" to f05_04.text.toString(),
                "f05_05" to f05_05.text.toString(),
                "f05_06" to f05_06.text.toString(),
                "f05_07" to f05_07.text.toString(),
                "f05_08" to f05_08.text.toString(),
                "f05_09" to f05_09.text.toString(),
                "f05_10" to f05_10.text.toString(),
                "f05_11" to f05_11.text.toString(),
                "f05_12" to f05_12.text.toString(),
                "f05_13" to f05_13.text.toString(),
                "f05_14" to f05_14.text.toString(),
                "f05_15" to f05_15.text.toString(),
                "f05_16" to f05_16.text.toString(),
                "f05_17" to f05_17.text.toString(),
                "f05_18" to f05_18.text.toString(),
                "f05_19" to f05_19.text.toString(),
                "f05_20" to f05_20.text.toString(),
                "f05_21" to f05_21.text.toString(),
                "f05_22" to f05_22.text.toString(),
                "f05_23" to f05_23.text.toString(),
                "f05_24" to f05_24.text.toString(),
                "f05_25" to f05_25.text.toString(),
                "f05_26" to f05_26.text.toString(),
                "f05_27" to f05_27.text.toString(),
                "f05_28" to f05_28.text.toString(),
                "f05_29" to f05_29.text.toString(),
                "f05_30" to f05_30.text.toString(),
                "f05_31" to f05_31.text.toString(),
                "f05_32" to f05_32.text.toString(),
                "f05_33" to f05_33.text.toString(),
                "f05_34" to f05_34.text.toString(),
                "f05_35" to f05_35.text.toString(),
                "f05_36" to f05_36.text.toString(),
                "f05_37" to f05_37.text.toString(),
                "f05_38" to f05_38.text.toString(),
                "f05_39" to f05_39.text.toString(),
                "f05_40" to f05_40.text.toString(),
                "f05_41" to f05_41.text.toString(),
                "f05_42" to f05_42.text.toString(),
                "f05_43" to f05_43.text.toString(),
                "f05_44" to f05_44.text.toString(),
                "f05_45" to f05_45.text.toString(),
                "f05_46" to f05_46.text.toString(),
                "f05_47" to f05_47.text.toString(),
                "f05_48" to f05_48.text.toString(),
                "f05_49" to f05_49.text.toString(),
                "f05_50" to f05_50.text.toString(),
                "f05_51" to f05_51.text.toString(),
                "f05_52" to f05_52.text.toString(),
                "f05_53" to f05_53.text.toString(),
                "f05_54" to f05_54.text.toString(),
                "f05_55" to f05_55.text.toString(),
                "f05_56" to f05_56.text.toString(),
                "f05_57" to f05_57.text.toString(),
                "f05_58" to f05_58.text.toString(),
                "f05_59" to f05_59.text.toString(),
                "f05_60" to f05_60.text.toString(),
                "f05_61" to f05_61.text.toString(),
                "f05_62" to f05_62.text.toString(),
                "f05_63" to f05_63.text.toString(),
                "f05_64" to f05_64.text.toString(),
                "f05_65" to f05_65.text.toString(),
                "f05_66" to f05_66.text.toString(),
                "f05_67" to f05_67.text.toString(),
                "completef05" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f05_01.text.toString().equals("")){complete = false;}
        if(f05_02.text.toString().equals("")){complete = false;}
        if(f05_03.text.toString().equals("")){complete = false;}
        if(f05_04.text.toString().equals("")){complete = false;}
        if(f05_05.text.toString().equals("")){complete = false;}
        if(f05_06.text.toString().equals("")){complete = false;}
        if(f05_07.text.toString().equals("")){complete = false;}
        if(f05_08.text.toString().equals("")){complete = false;}
        if(f05_09.text.toString().equals("")){complete = false;}
        if(f05_10.text.toString().equals("")){complete = false;}
        if(f05_11.text.toString().equals("")){complete = false;}
        if(f05_12.text.toString().equals("")){complete = false;}
        if(f05_13.text.toString().equals("")){complete = false;}
        if(f05_14.text.toString().equals("")){complete = false;}
        if(f05_15.text.toString().equals("")){complete = false;}
        if(f05_16.text.toString().equals("")){complete = false;}
        if(f05_17.text.toString().equals("")){complete = false;}
        if(f05_18.text.toString().equals("")){complete = false;}
        if(f05_19.text.toString().equals("")){complete = false;}
        if(f05_20.text.toString().equals("")){complete = false;}
        if(f05_21.text.toString().equals("")){complete = false;}
        if(f05_22.text.toString().equals("")){complete = false;}
        if(f05_23.text.toString().equals("")){complete = false;}
        if(f05_24.text.toString().equals("")){complete = false;}
        if(f05_25.text.toString().equals("")){complete = false;}
        if(f05_26.text.toString().equals("")){complete = false;}
        if(f05_27.text.toString().equals("")){complete = false;}
        if(f05_28.text.toString().equals("")){complete = false;}
        if(f05_29.text.toString().equals("")){complete = false;}
        if(f05_30.text.toString().equals("")){complete = false;}
        if(f05_31.text.toString().equals("")){complete = false;}
        if(f05_32.text.toString().equals("")){complete = false;}
        if(f05_33.text.toString().equals("")){complete = false;}
        if(f05_34.text.toString().equals("")){complete = false;}
        if(f05_35.text.toString().equals("")){complete = false;}
        if(f05_36.text.toString().equals("")){complete = false;}
        if(f05_37.text.toString().equals("")){complete = false;}
        if(f05_38.text.toString().equals("")){complete = false;}
        if(f05_39.text.toString().equals("")){complete = false;}
        if(f05_40.text.toString().equals("")){complete = false;}
        if(f05_41.text.toString().equals("")){complete = false;}
        if(f05_42.text.toString().equals("")){complete = false;}
        if(f05_43.text.toString().equals("")){complete = false;}
        if(f05_44.text.toString().equals("")){complete = false;}
        if(f05_45.text.toString().equals("")){complete = false;}
        if(f05_46.text.toString().equals("")){complete = false;}
        if(f05_47.text.toString().equals("")){complete = false;}
        if(f05_48.text.toString().equals("")){complete = false;}
        if(f05_49.text.toString().equals("")){complete = false;}
        if(f05_50.text.toString().equals("")){complete = false;}
        if(f05_51.text.toString().equals("")){complete = false;}
        if(f05_52.text.toString().equals("")){complete = false;}
        if(f05_53.text.toString().equals("")){complete = false;}
        if(f05_54.text.toString().equals("")){complete = false;}
        if(f05_55.text.toString().equals("")){complete = false;}
        if(f05_56.text.toString().equals("")){complete = false;}
        if(f05_57.text.toString().equals("")){complete = false;}
        if(f05_58.text.toString().equals("")){complete = false;}
        if(f05_59.text.toString().equals("")){complete = false;}
        if(f05_60.text.toString().equals("")){complete = false;}
        if(f05_61.text.toString().equals("")){complete = false;}
        if(f05_62.text.toString().equals("")){complete = false;}
        if(f05_63.text.toString().equals("")){complete = false;}
        if(f05_64.text.toString().equals("")){complete = false;}
        if(f05_65.text.toString().equals("")){complete = false;}
        if(f05_66.text.toString().equals("")){complete = false;}
        if(f05_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f05_01.setText(it.get("f05_01") as String?)
            f05_02.setText(it.get("f05_02") as String?)
            f05_03.setText(it.get("f05_03") as String?)
            f05_04.setText(it.get("f05_04") as String?)
            f05_05.setText(it.get("f05_05") as String?)
            f05_06.setText(it.get("f05_06") as String?)
            f05_07.setText(it.get("f05_07") as String?)
            f05_08.setText(it.get("f05_08") as String?)
            f05_09.setText(it.get("f05_09") as String?)
            f05_10.setText(it.get("f05_10") as String?)
            f05_11.setText(it.get("f05_11") as String?)
            f05_12.setText(it.get("f05_12") as String?)
            f05_13.setText(it.get("f05_13") as String?)
            f05_14.setText(it.get("f05_14") as String?)
            f05_15.setText(it.get("f05_15") as String?)
            f05_16.setText(it.get("f05_16") as String?)
            f05_17.setText(it.get("f05_17") as String?)
            f05_18.setText(it.get("f05_18") as String?)
            f05_19.setText(it.get("f05_19") as String?)
            f05_20.setText(it.get("f05_20") as String?)
            f05_21.setText(it.get("f05_21") as String?)
            f05_22.setText(it.get("f05_22") as String?)
            f05_23.setText(it.get("f05_23") as String?)
            f05_24.setText(it.get("f05_24") as String?)
            f05_25.setText(it.get("f05_25") as String?)
            f05_26.setText(it.get("f05_26") as String?)
            f05_27.setText(it.get("f05_27") as String?)
            f05_28.setText(it.get("f05_28") as String?)
            f05_29.setText(it.get("f05_29") as String?)
            f05_30.setText(it.get("f05_30") as String?)
            f05_31.setText(it.get("f05_31") as String?)
            f05_32.setText(it.get("f05_32") as String?)
            f05_33.setText(it.get("f05_33") as String?)
            f05_34.setText(it.get("f05_34") as String?)
            f05_35.setText(it.get("f05_35") as String?)
            f05_36.setText(it.get("f05_36") as String?)
            f05_37.setText(it.get("f05_37") as String?)
            f05_38.setText(it.get("f05_38") as String?)
            f05_39.setText(it.get("f05_39") as String?)
            f05_40.setText(it.get("f05_40") as String?)
            f05_41.setText(it.get("f05_41") as String?)
            f05_42.setText(it.get("f05_42") as String?)
            f05_43.setText(it.get("f05_43") as String?)
            f05_44.setText(it.get("f05_44") as String?)
            f05_45.setText(it.get("f05_45") as String?)
            f05_46.setText(it.get("f05_46") as String?)
            f05_47.setText(it.get("f05_47") as String?)
            f05_48.setText(it.get("f05_48") as String?)
            f05_49.setText(it.get("f05_49") as String?)
            f05_50.setText(it.get("f05_50") as String?)
            f05_51.setText(it.get("f05_51") as String?)
            f05_52.setText(it.get("f05_52") as String?)
            f05_53.setText(it.get("f05_53") as String?)
            f05_54.setText(it.get("f05_54") as String?)
            f05_55.setText(it.get("f05_55") as String?)
            f05_56.setText(it.get("f05_56") as String?)
            f05_57.setText(it.get("f05_57") as String?)
            f05_58.setText(it.get("f05_58") as String?)
            f05_59.setText(it.get("f05_59") as String?)
            f05_60.setText(it.get("f05_60") as String?)
            f05_61.setText(it.get("f05_61") as String?)
            f05_62.setText(it.get("f05_62") as String?)
            f05_63.setText(it.get("f05_63") as String?)
            f05_64.setText(it.get("f05_64") as String?)
            f05_65.setText(it.get("f05_65") as String?)
            f05_66.setText(it.get("f05_66") as String?)
            f05_67.setText(it.get("f05_67") as String?)
            if (completeFun().equals("true")){
                progressTextf05.setText("Sección Completa")
            }else{
                progressTextf05.setText("Sección Incompleta")
            }


        }
    }
    */
}

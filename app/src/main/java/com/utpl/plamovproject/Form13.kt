package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form13.*

class Form13 : AppCompatActivity() {
    var formulario = "fo13"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form13)

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

                "f13_01" to f13_01.text.toString(),
                "f13_02" to f13_02.text.toString(),
                "f13_03" to f13_03.text.toString(),
                "f13_04" to f13_04.text.toString(),
                "f13_05" to f13_05.text.toString(),
                "f13_06" to f13_06.text.toString(),
                "f13_07" to f13_07.text.toString(),
                "f13_08" to f13_08.text.toString(),
                "f13_09" to f13_09.text.toString(),
                "f13_10" to f13_10.text.toString(),
                "f13_11" to f13_11.text.toString(),
                "f13_12" to f13_12.text.toString(),
                "f13_13" to f13_13.text.toString(),
                "f13_14" to f13_14.text.toString(),
                "f13_15" to f13_15.text.toString(),
                "f13_16" to f13_16.text.toString(),
                "f13_17" to f13_17.text.toString(),
                "f13_18" to f13_18.text.toString(),
                "f13_19" to f13_19.text.toString(),
                "f13_20" to f13_20.text.toString(),
                "f13_21" to f13_21.text.toString(),
                "f13_22" to f13_22.text.toString(),
                "f13_23" to f13_23.text.toString(),
                "f13_24" to f13_24.text.toString(),
                "f13_25" to f13_25.text.toString(),
                "f13_26" to f13_26.text.toString(),
                "f13_27" to f13_27.text.toString(),
                "f13_28" to f13_28.text.toString(),
                "f13_29" to f13_29.text.toString(),
                "f13_30" to f13_30.text.toString(),
                "f13_31" to f13_31.text.toString(),
                "f13_32" to f13_32.text.toString(),
                "f13_33" to f13_33.text.toString(),
                "f13_34" to f13_34.text.toString(),
                "f13_35" to f13_35.text.toString(),
                "f13_36" to f13_36.text.toString(),
                "f13_37" to f13_37.text.toString(),
                "f13_38" to f13_38.text.toString(),
                "f13_39" to f13_39.text.toString(),
                "f13_40" to f13_40.text.toString(),
                "f13_41" to f13_41.text.toString(),
                "f13_42" to f13_42.text.toString(),
                "f13_43" to f13_43.text.toString(),
                "f13_44" to f13_44.text.toString(),
                "f13_45" to f13_45.text.toString(),
                "f13_46" to f13_46.text.toString(),
                "f13_47" to f13_47.text.toString(),
                "f13_48" to f13_48.text.toString(),
                "f13_49" to f13_49.text.toString(),
                "f13_50" to f13_50.text.toString(),
                "f13_51" to f13_51.text.toString(),
                "f13_52" to f13_52.text.toString(),
                "f13_53" to f13_53.text.toString(),
                "f13_54" to f13_54.text.toString(),
                "f13_55" to f13_55.text.toString(),
                "f13_56" to f13_56.text.toString(),
                "f13_57" to f13_57.text.toString(),
                "f13_58" to f13_58.text.toString(),
                "f13_59" to f13_59.text.toString(),
                "f13_60" to f13_60.text.toString(),
                "f13_61" to f13_61.text.toString(),
                "f13_62" to f13_62.text.toString(),
                "f13_63" to f13_63.text.toString(),
                "f13_64" to f13_64.text.toString(),
                "f13_65" to f13_65.text.toString(),
                "f13_66" to f13_66.text.toString(),
                "f13_67" to f13_67.text.toString(),
                "completef13" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f13_01.text.toString().equals("")){complete = false;}
        if(f13_02.text.toString().equals("")){complete = false;}
        if(f13_03.text.toString().equals("")){complete = false;}
        if(f13_04.text.toString().equals("")){complete = false;}
        if(f13_05.text.toString().equals("")){complete = false;}
        if(f13_06.text.toString().equals("")){complete = false;}
        if(f13_07.text.toString().equals("")){complete = false;}
        if(f13_08.text.toString().equals("")){complete = false;}
        if(f13_09.text.toString().equals("")){complete = false;}
        if(f13_10.text.toString().equals("")){complete = false;}
        if(f13_11.text.toString().equals("")){complete = false;}
        if(f13_12.text.toString().equals("")){complete = false;}
        if(f13_13.text.toString().equals("")){complete = false;}
        if(f13_14.text.toString().equals("")){complete = false;}
        if(f13_15.text.toString().equals("")){complete = false;}
        if(f13_16.text.toString().equals("")){complete = false;}
        if(f13_17.text.toString().equals("")){complete = false;}
        if(f13_18.text.toString().equals("")){complete = false;}
        if(f13_19.text.toString().equals("")){complete = false;}
        if(f13_20.text.toString().equals("")){complete = false;}
        if(f13_21.text.toString().equals("")){complete = false;}
        if(f13_22.text.toString().equals("")){complete = false;}
        if(f13_23.text.toString().equals("")){complete = false;}
        if(f13_24.text.toString().equals("")){complete = false;}
        if(f13_25.text.toString().equals("")){complete = false;}
        if(f13_26.text.toString().equals("")){complete = false;}
        if(f13_27.text.toString().equals("")){complete = false;}
        if(f13_28.text.toString().equals("")){complete = false;}
        if(f13_29.text.toString().equals("")){complete = false;}
        if(f13_30.text.toString().equals("")){complete = false;}
        if(f13_31.text.toString().equals("")){complete = false;}
        if(f13_32.text.toString().equals("")){complete = false;}
        if(f13_33.text.toString().equals("")){complete = false;}
        if(f13_34.text.toString().equals("")){complete = false;}
        if(f13_35.text.toString().equals("")){complete = false;}
        if(f13_36.text.toString().equals("")){complete = false;}
        if(f13_37.text.toString().equals("")){complete = false;}
        if(f13_38.text.toString().equals("")){complete = false;}
        if(f13_39.text.toString().equals("")){complete = false;}
        if(f13_40.text.toString().equals("")){complete = false;}
        if(f13_41.text.toString().equals("")){complete = false;}
        if(f13_42.text.toString().equals("")){complete = false;}
        if(f13_43.text.toString().equals("")){complete = false;}
        if(f13_44.text.toString().equals("")){complete = false;}
        if(f13_45.text.toString().equals("")){complete = false;}
        if(f13_46.text.toString().equals("")){complete = false;}
        if(f13_47.text.toString().equals("")){complete = false;}
        if(f13_48.text.toString().equals("")){complete = false;}
        if(f13_49.text.toString().equals("")){complete = false;}
        if(f13_50.text.toString().equals("")){complete = false;}
        if(f13_51.text.toString().equals("")){complete = false;}
        if(f13_52.text.toString().equals("")){complete = false;}
        if(f13_53.text.toString().equals("")){complete = false;}
        if(f13_54.text.toString().equals("")){complete = false;}
        if(f13_55.text.toString().equals("")){complete = false;}
        if(f13_56.text.toString().equals("")){complete = false;}
        if(f13_57.text.toString().equals("")){complete = false;}
        if(f13_58.text.toString().equals("")){complete = false;}
        if(f13_59.text.toString().equals("")){complete = false;}
        if(f13_60.text.toString().equals("")){complete = false;}
        if(f13_61.text.toString().equals("")){complete = false;}
        if(f13_62.text.toString().equals("")){complete = false;}
        if(f13_63.text.toString().equals("")){complete = false;}
        if(f13_64.text.toString().equals("")){complete = false;}
        if(f13_65.text.toString().equals("")){complete = false;}
        if(f13_66.text.toString().equals("")){complete = false;}
        if(f13_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f13_01.setText(it.get("f13_01") as String?)
            f13_02.setText(it.get("f13_02") as String?)
            f13_03.setText(it.get("f13_03") as String?)
            f13_04.setText(it.get("f13_04") as String?)
            f13_05.setText(it.get("f13_05") as String?)
            f13_06.setText(it.get("f13_06") as String?)
            f13_07.setText(it.get("f13_07") as String?)
            f13_08.setText(it.get("f13_08") as String?)
            f13_09.setText(it.get("f13_09") as String?)
            f13_10.setText(it.get("f13_10") as String?)
            f13_11.setText(it.get("f13_11") as String?)
            f13_12.setText(it.get("f13_12") as String?)
            f13_13.setText(it.get("f13_13") as String?)
            f13_14.setText(it.get("f13_14") as String?)
            f13_15.setText(it.get("f13_15") as String?)
            f13_16.setText(it.get("f13_16") as String?)
            f13_17.setText(it.get("f13_17") as String?)
            f13_18.setText(it.get("f13_18") as String?)
            f13_19.setText(it.get("f13_19") as String?)
            f13_20.setText(it.get("f13_20") as String?)
            f13_21.setText(it.get("f13_21") as String?)
            f13_22.setText(it.get("f13_22") as String?)
            f13_23.setText(it.get("f13_23") as String?)
            f13_24.setText(it.get("f13_24") as String?)
            f13_25.setText(it.get("f13_25") as String?)
            f13_26.setText(it.get("f13_26") as String?)
            f13_27.setText(it.get("f13_27") as String?)
            f13_28.setText(it.get("f13_28") as String?)
            f13_29.setText(it.get("f13_29") as String?)
            f13_30.setText(it.get("f13_30") as String?)
            f13_31.setText(it.get("f13_31") as String?)
            f13_32.setText(it.get("f13_32") as String?)
            f13_33.setText(it.get("f13_33") as String?)
            f13_34.setText(it.get("f13_34") as String?)
            f13_35.setText(it.get("f13_35") as String?)
            f13_36.setText(it.get("f13_36") as String?)
            f13_37.setText(it.get("f13_37") as String?)
            f13_38.setText(it.get("f13_38") as String?)
            f13_39.setText(it.get("f13_39") as String?)
            f13_40.setText(it.get("f13_40") as String?)
            f13_41.setText(it.get("f13_41") as String?)
            f13_42.setText(it.get("f13_42") as String?)
            f13_43.setText(it.get("f13_43") as String?)
            f13_44.setText(it.get("f13_44") as String?)
            f13_45.setText(it.get("f13_45") as String?)
            f13_46.setText(it.get("f13_46") as String?)
            f13_47.setText(it.get("f13_47") as String?)
            f13_48.setText(it.get("f13_48") as String?)
            f13_49.setText(it.get("f13_49") as String?)
            f13_50.setText(it.get("f13_50") as String?)
            f13_51.setText(it.get("f13_51") as String?)
            f13_52.setText(it.get("f13_52") as String?)
            f13_53.setText(it.get("f13_53") as String?)
            f13_54.setText(it.get("f13_54") as String?)
            f13_55.setText(it.get("f13_55") as String?)
            f13_56.setText(it.get("f13_56") as String?)
            f13_57.setText(it.get("f13_57") as String?)
            f13_58.setText(it.get("f13_58") as String?)
            f13_59.setText(it.get("f13_59") as String?)
            f13_60.setText(it.get("f13_60") as String?)
            f13_61.setText(it.get("f13_61") as String?)
            f13_62.setText(it.get("f13_62") as String?)
            f13_63.setText(it.get("f13_63") as String?)
            f13_64.setText(it.get("f13_64") as String?)
            f13_65.setText(it.get("f13_65") as String?)
            f13_66.setText(it.get("f13_66") as String?)
            f13_67.setText(it.get("f13_67") as String?)
            if (completeFun().equals("true")){
                progressTextf13.setText("Sección Completa")
            }else{
                progressTextf13.setText("Sección Incompleta")
            }


        }
    }

     */
}

package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form07.*

class Form07 : AppCompatActivity() {
    var formulario = "fo07"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form07)

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

                "f07_01" to f07_01.text.toString(),
                "f07_02" to f07_02.text.toString(),
                "f07_03" to f07_03.text.toString(),
                "f07_04" to f07_04.text.toString(),
                "f07_05" to f07_05.text.toString(),
                "f07_06" to f07_06.text.toString(),
                "f07_07" to f07_07.text.toString(),
                "f07_08" to f07_08.text.toString(),
                "f07_09" to f07_09.text.toString(),
                "f07_10" to f07_10.text.toString(),
                "f07_11" to f07_11.text.toString(),
                "f07_12" to f07_12.text.toString(),
                "f07_13" to f07_13.text.toString(),
                "f07_14" to f07_14.text.toString(),
                "f07_15" to f07_15.text.toString(),
                "f07_16" to f07_16.text.toString(),
                "f07_17" to f07_17.text.toString(),
                "f07_18" to f07_18.text.toString(),
                "f07_19" to f07_19.text.toString(),
                "f07_20" to f07_20.text.toString(),
                "f07_21" to f07_21.text.toString(),
                "f07_22" to f07_22.text.toString(),
                "f07_23" to f07_23.text.toString(),
                "f07_24" to f07_24.text.toString(),
                "f07_25" to f07_25.text.toString(),
                "f07_26" to f07_26.text.toString(),
                "f07_27" to f07_27.text.toString(),
                "f07_28" to f07_28.text.toString(),
                "f07_29" to f07_29.text.toString(),
                "f07_30" to f07_30.text.toString(),
                "f07_31" to f07_31.text.toString(),
                "f07_32" to f07_32.text.toString(),
                "f07_33" to f07_33.text.toString(),
                "f07_34" to f07_34.text.toString(),
                "f07_35" to f07_35.text.toString(),
                "f07_36" to f07_36.text.toString(),
                "f07_37" to f07_37.text.toString(),
                "f07_38" to f07_38.text.toString(),
                "f07_39" to f07_39.text.toString(),
                "f07_40" to f07_40.text.toString(),
                "f07_41" to f07_41.text.toString(),
                "f07_42" to f07_42.text.toString(),
                "f07_43" to f07_43.text.toString(),
                "f07_44" to f07_44.text.toString(),
                "f07_45" to f07_45.text.toString(),
                "f07_46" to f07_46.text.toString(),
                "f07_47" to f07_47.text.toString(),
                "f07_48" to f07_48.text.toString(),
                "f07_49" to f07_49.text.toString(),
                "f07_50" to f07_50.text.toString(),
                "f07_51" to f07_51.text.toString(),
                "f07_52" to f07_52.text.toString(),
                "f07_53" to f07_53.text.toString(),
                "f07_54" to f07_54.text.toString(),
                "f07_55" to f07_55.text.toString(),
                "f07_56" to f07_56.text.toString(),
                "f07_57" to f07_57.text.toString(),
                "f07_58" to f07_58.text.toString(),
                "f07_59" to f07_59.text.toString(),
                "f07_60" to f07_60.text.toString(),
                "f07_61" to f07_61.text.toString(),
                "f07_62" to f07_62.text.toString(),
                "f07_63" to f07_63.text.toString(),
                "f07_64" to f07_64.text.toString(),
                "f07_65" to f07_65.text.toString(),
                "f07_66" to f07_66.text.toString(),
                "f07_67" to f07_67.text.toString(),
                "completef07" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f07_01.text.toString().equals("")){complete = false;}
        if(f07_02.text.toString().equals("")){complete = false;}
        if(f07_03.text.toString().equals("")){complete = false;}
        if(f07_04.text.toString().equals("")){complete = false;}
        if(f07_05.text.toString().equals("")){complete = false;}
        if(f07_06.text.toString().equals("")){complete = false;}
        if(f07_07.text.toString().equals("")){complete = false;}
        if(f07_08.text.toString().equals("")){complete = false;}
        if(f07_09.text.toString().equals("")){complete = false;}
        if(f07_10.text.toString().equals("")){complete = false;}
        if(f07_11.text.toString().equals("")){complete = false;}
        if(f07_12.text.toString().equals("")){complete = false;}
        if(f07_13.text.toString().equals("")){complete = false;}
        if(f07_14.text.toString().equals("")){complete = false;}
        if(f07_15.text.toString().equals("")){complete = false;}
        if(f07_16.text.toString().equals("")){complete = false;}
        if(f07_17.text.toString().equals("")){complete = false;}
        if(f07_18.text.toString().equals("")){complete = false;}
        if(f07_19.text.toString().equals("")){complete = false;}
        if(f07_20.text.toString().equals("")){complete = false;}
        if(f07_21.text.toString().equals("")){complete = false;}
        if(f07_22.text.toString().equals("")){complete = false;}
        if(f07_23.text.toString().equals("")){complete = false;}
        if(f07_24.text.toString().equals("")){complete = false;}
        if(f07_25.text.toString().equals("")){complete = false;}
        if(f07_26.text.toString().equals("")){complete = false;}
        if(f07_27.text.toString().equals("")){complete = false;}
        if(f07_28.text.toString().equals("")){complete = false;}
        if(f07_29.text.toString().equals("")){complete = false;}
        if(f07_30.text.toString().equals("")){complete = false;}
        if(f07_31.text.toString().equals("")){complete = false;}
        if(f07_32.text.toString().equals("")){complete = false;}
        if(f07_33.text.toString().equals("")){complete = false;}
        if(f07_34.text.toString().equals("")){complete = false;}
        if(f07_35.text.toString().equals("")){complete = false;}
        if(f07_36.text.toString().equals("")){complete = false;}
        if(f07_37.text.toString().equals("")){complete = false;}
        if(f07_38.text.toString().equals("")){complete = false;}
        if(f07_39.text.toString().equals("")){complete = false;}
        if(f07_40.text.toString().equals("")){complete = false;}
        if(f07_41.text.toString().equals("")){complete = false;}
        if(f07_42.text.toString().equals("")){complete = false;}
        if(f07_43.text.toString().equals("")){complete = false;}
        if(f07_44.text.toString().equals("")){complete = false;}
        if(f07_45.text.toString().equals("")){complete = false;}
        if(f07_46.text.toString().equals("")){complete = false;}
        if(f07_47.text.toString().equals("")){complete = false;}
        if(f07_48.text.toString().equals("")){complete = false;}
        if(f07_49.text.toString().equals("")){complete = false;}
        if(f07_50.text.toString().equals("")){complete = false;}
        if(f07_51.text.toString().equals("")){complete = false;}
        if(f07_52.text.toString().equals("")){complete = false;}
        if(f07_53.text.toString().equals("")){complete = false;}
        if(f07_54.text.toString().equals("")){complete = false;}
        if(f07_55.text.toString().equals("")){complete = false;}
        if(f07_56.text.toString().equals("")){complete = false;}
        if(f07_57.text.toString().equals("")){complete = false;}
        if(f07_58.text.toString().equals("")){complete = false;}
        if(f07_59.text.toString().equals("")){complete = false;}
        if(f07_60.text.toString().equals("")){complete = false;}
        if(f07_61.text.toString().equals("")){complete = false;}
        if(f07_62.text.toString().equals("")){complete = false;}
        if(f07_63.text.toString().equals("")){complete = false;}
        if(f07_64.text.toString().equals("")){complete = false;}
        if(f07_65.text.toString().equals("")){complete = false;}
        if(f07_66.text.toString().equals("")){complete = false;}
        if(f07_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f07_01.setText(it.get("f07_01") as String?)
            f07_02.setText(it.get("f07_02") as String?)
            f07_03.setText(it.get("f07_03") as String?)
            f07_04.setText(it.get("f07_04") as String?)
            f07_05.setText(it.get("f07_05") as String?)
            f07_06.setText(it.get("f07_06") as String?)
            f07_07.setText(it.get("f07_07") as String?)
            f07_08.setText(it.get("f07_08") as String?)
            f07_09.setText(it.get("f07_09") as String?)
            f07_10.setText(it.get("f07_10") as String?)
            f07_11.setText(it.get("f07_11") as String?)
            f07_12.setText(it.get("f07_12") as String?)
            f07_13.setText(it.get("f07_13") as String?)
            f07_14.setText(it.get("f07_14") as String?)
            f07_15.setText(it.get("f07_15") as String?)
            f07_16.setText(it.get("f07_16") as String?)
            f07_17.setText(it.get("f07_17") as String?)
            f07_18.setText(it.get("f07_18") as String?)
            f07_19.setText(it.get("f07_19") as String?)
            f07_20.setText(it.get("f07_20") as String?)
            f07_21.setText(it.get("f07_21") as String?)
            f07_22.setText(it.get("f07_22") as String?)
            f07_23.setText(it.get("f07_23") as String?)
            f07_24.setText(it.get("f07_24") as String?)
            f07_25.setText(it.get("f07_25") as String?)
            f07_26.setText(it.get("f07_26") as String?)
            f07_27.setText(it.get("f07_27") as String?)
            f07_28.setText(it.get("f07_28") as String?)
            f07_29.setText(it.get("f07_29") as String?)
            f07_30.setText(it.get("f07_30") as String?)
            f07_31.setText(it.get("f07_31") as String?)
            f07_32.setText(it.get("f07_32") as String?)
            f07_33.setText(it.get("f07_33") as String?)
            f07_34.setText(it.get("f07_34") as String?)
            f07_35.setText(it.get("f07_35") as String?)
            f07_36.setText(it.get("f07_36") as String?)
            f07_37.setText(it.get("f07_37") as String?)
            f07_38.setText(it.get("f07_38") as String?)
            f07_39.setText(it.get("f07_39") as String?)
            f07_40.setText(it.get("f07_40") as String?)
            f07_41.setText(it.get("f07_41") as String?)
            f07_42.setText(it.get("f07_42") as String?)
            f07_43.setText(it.get("f07_43") as String?)
            f07_44.setText(it.get("f07_44") as String?)
            f07_45.setText(it.get("f07_45") as String?)
            f07_46.setText(it.get("f07_46") as String?)
            f07_47.setText(it.get("f07_47") as String?)
            f07_48.setText(it.get("f07_48") as String?)
            f07_49.setText(it.get("f07_49") as String?)
            f07_50.setText(it.get("f07_50") as String?)
            f07_51.setText(it.get("f07_51") as String?)
            f07_52.setText(it.get("f07_52") as String?)
            f07_53.setText(it.get("f07_53") as String?)
            f07_54.setText(it.get("f07_54") as String?)
            f07_55.setText(it.get("f07_55") as String?)
            f07_56.setText(it.get("f07_56") as String?)
            f07_57.setText(it.get("f07_57") as String?)
            f07_58.setText(it.get("f07_58") as String?)
            f07_59.setText(it.get("f07_59") as String?)
            f07_60.setText(it.get("f07_60") as String?)
            f07_61.setText(it.get("f07_61") as String?)
            f07_62.setText(it.get("f07_62") as String?)
            f07_63.setText(it.get("f07_63") as String?)
            f07_64.setText(it.get("f07_64") as String?)
            f07_65.setText(it.get("f07_65") as String?)
            f07_66.setText(it.get("f07_66") as String?)
            f07_67.setText(it.get("f07_67") as String?)
            if (completeFun().equals("true")){
                progressTextf07.setText("Sección Completa")
            }else{
                progressTextf07.setText("Sección Incompleta")
            }


        }
    }

     */
}

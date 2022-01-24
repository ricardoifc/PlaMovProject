package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form03.*


class Form03 : AppCompatActivity() {
    var formulario = "fo03"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form03)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        //refrescar(email, provider)
        siguiente.setOnClickListener{
            //guardarDatos(email, provider)
            val form04Intent: Intent = Intent(this,Form04::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form04Intent)

        }

        atras.setOnClickListener {
            //guardarDatos(email, provider)
            val form02Intent: Intent = Intent(this,Form02::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form02Intent)
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

                "f03_01" to f03_01.text.toString(),
                "f03_02" to f03_02.text.toString(),
                "f03_03" to f03_03.text.toString(),
                "f03_04" to f03_04.text.toString(),
                "f03_05" to f03_05.text.toString(),
                "f03_06" to f03_06.text.toString(),
                "f03_07" to f03_07.text.toString(),
                "f03_08" to f03_08.text.toString(),
                "f03_09" to f03_09.text.toString(),
                "f03_10" to f03_10.text.toString(),
                "f03_11" to f03_11.text.toString(),
                "f03_12" to f03_12.text.toString(),
                "f03_13" to f03_13.text.toString(),
                "f03_14" to f03_14.text.toString(),
                "f03_15" to f03_15.text.toString(),
                "f03_16" to f03_16.text.toString(),
                "f03_17" to f03_17.text.toString(),
                "f03_18" to f03_18.text.toString(),
                "f03_19" to f03_19.text.toString(),
                "f03_20" to f03_20.text.toString(),
                "f03_21" to f03_21.text.toString(),
                "f03_22" to f03_22.text.toString(),
                "f03_23" to f03_23.text.toString(),
                "f03_24" to f03_24.text.toString(),
                "f03_25" to f03_25.text.toString(),
                "f03_26" to f03_26.text.toString(),
                "f03_27" to f03_27.text.toString(),
                "f03_28" to f03_28.text.toString(),
                "f03_29" to f03_29.text.toString(),
                "f03_30" to f03_30.text.toString(),
                "f03_31" to f03_31.text.toString(),
                "f03_32" to f03_32.text.toString(),
                "f03_33" to f03_33.text.toString(),
                "f03_34" to f03_34.text.toString(),
                "f03_35" to f03_35.text.toString(),
                "f03_36" to f03_36.text.toString(),
                "f03_37" to f03_37.text.toString(),
                "f03_38" to f03_38.text.toString(),
                "f03_39" to f03_39.text.toString(),
                "f03_40" to f03_40.text.toString(),
                "f03_41" to f03_41.text.toString(),
                "f03_42" to f03_42.text.toString(),
                "f03_43" to f03_43.text.toString(),
                "f03_44" to f03_44.text.toString(),
                "f03_45" to f03_45.text.toString(),
                "f03_46" to f03_46.text.toString(),
                "f03_47" to f03_47.text.toString(),
                "f03_48" to f03_48.text.toString(),
                "f03_49" to f03_49.text.toString(),
                "f03_50" to f03_50.text.toString(),
                "f03_51" to f03_51.text.toString(),
                "f03_52" to f03_52.text.toString(),
                "f03_53" to f03_53.text.toString(),
                "f03_54" to f03_54.text.toString(),
                "f03_55" to f03_55.text.toString(),
                "f03_56" to f03_56.text.toString(),
                "f03_57" to f03_57.text.toString(),
                "f03_58" to f03_58.text.toString(),
                "f03_59" to f03_59.text.toString(),
                "f03_60" to f03_60.text.toString(),
                "f03_61" to f03_61.text.toString(),
                "f03_62" to f03_62.text.toString(),
                "f03_63" to f03_63.text.toString(),
                "f03_64" to f03_64.text.toString(),
                "f03_65" to f03_65.text.toString(),
                "f03_66" to f03_66.text.toString(),
                "f03_67" to f03_67.text.toString(),
                "completef03" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f03_01.text.toString().equals("")){complete = false;}
        if(f03_02.text.toString().equals("")){complete = false;}
        if(f03_03.text.toString().equals("")){complete = false;}
        if(f03_04.text.toString().equals("")){complete = false;}
        if(f03_05.text.toString().equals("")){complete = false;}
        if(f03_06.text.toString().equals("")){complete = false;}
        if(f03_07.text.toString().equals("")){complete = false;}
        if(f03_08.text.toString().equals("")){complete = false;}
        if(f03_09.text.toString().equals("")){complete = false;}
        if(f03_10.text.toString().equals("")){complete = false;}
        if(f03_11.text.toString().equals("")){complete = false;}
        if(f03_12.text.toString().equals("")){complete = false;}
        if(f03_13.text.toString().equals("")){complete = false;}
        if(f03_14.text.toString().equals("")){complete = false;}
        if(f03_15.text.toString().equals("")){complete = false;}
        if(f03_16.text.toString().equals("")){complete = false;}
        if(f03_17.text.toString().equals("")){complete = false;}
        if(f03_18.text.toString().equals("")){complete = false;}
        if(f03_19.text.toString().equals("")){complete = false;}
        if(f03_20.text.toString().equals("")){complete = false;}
        if(f03_21.text.toString().equals("")){complete = false;}
        if(f03_22.text.toString().equals("")){complete = false;}
        if(f03_23.text.toString().equals("")){complete = false;}
        if(f03_24.text.toString().equals("")){complete = false;}
        if(f03_25.text.toString().equals("")){complete = false;}
        if(f03_26.text.toString().equals("")){complete = false;}
        if(f03_27.text.toString().equals("")){complete = false;}
        if(f03_28.text.toString().equals("")){complete = false;}
        if(f03_29.text.toString().equals("")){complete = false;}
        if(f03_30.text.toString().equals("")){complete = false;}
        if(f03_31.text.toString().equals("")){complete = false;}
        if(f03_32.text.toString().equals("")){complete = false;}
        if(f03_33.text.toString().equals("")){complete = false;}
        if(f03_34.text.toString().equals("")){complete = false;}
        if(f03_35.text.toString().equals("")){complete = false;}
        if(f03_36.text.toString().equals("")){complete = false;}
        if(f03_37.text.toString().equals("")){complete = false;}
        if(f03_38.text.toString().equals("")){complete = false;}
        if(f03_39.text.toString().equals("")){complete = false;}
        if(f03_40.text.toString().equals("")){complete = false;}
        if(f03_41.text.toString().equals("")){complete = false;}
        if(f03_42.text.toString().equals("")){complete = false;}
        if(f03_43.text.toString().equals("")){complete = false;}
        if(f03_44.text.toString().equals("")){complete = false;}
        if(f03_45.text.toString().equals("")){complete = false;}
        if(f03_46.text.toString().equals("")){complete = false;}
        if(f03_47.text.toString().equals("")){complete = false;}
        if(f03_48.text.toString().equals("")){complete = false;}
        if(f03_49.text.toString().equals("")){complete = false;}
        if(f03_50.text.toString().equals("")){complete = false;}
        if(f03_51.text.toString().equals("")){complete = false;}
        if(f03_52.text.toString().equals("")){complete = false;}
        if(f03_53.text.toString().equals("")){complete = false;}
        if(f03_54.text.toString().equals("")){complete = false;}
        if(f03_55.text.toString().equals("")){complete = false;}
        if(f03_56.text.toString().equals("")){complete = false;}
        if(f03_57.text.toString().equals("")){complete = false;}
        if(f03_58.text.toString().equals("")){complete = false;}
        if(f03_59.text.toString().equals("")){complete = false;}
        if(f03_60.text.toString().equals("")){complete = false;}
        if(f03_61.text.toString().equals("")){complete = false;}
        if(f03_62.text.toString().equals("")){complete = false;}
        if(f03_63.text.toString().equals("")){complete = false;}
        if(f03_64.text.toString().equals("")){complete = false;}
        if(f03_65.text.toString().equals("")){complete = false;}
        if(f03_66.text.toString().equals("")){complete = false;}
        if(f03_67.text.toString().equals("")){complete = false;}

        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f03_01.setText(it.get("f03_01") as String?)
            f03_02.setText(it.get("f03_02") as String?)
            f03_03.setText(it.get("f03_03") as String?)
            f03_04.setText(it.get("f03_04") as String?)
            f03_05.setText(it.get("f03_05") as String?)
            f03_06.setText(it.get("f03_06") as String?)
            f03_07.setText(it.get("f03_07") as String?)
            f03_08.setText(it.get("f03_08") as String?)
            f03_09.setText(it.get("f03_09") as String?)
            f03_10.setText(it.get("f03_10") as String?)
            f03_11.setText(it.get("f03_11") as String?)
            f03_12.setText(it.get("f03_12") as String?)
            f03_13.setText(it.get("f03_13") as String?)
            f03_14.setText(it.get("f03_14") as String?)
            f03_15.setText(it.get("f03_15") as String?)
            f03_16.setText(it.get("f03_16") as String?)
            f03_17.setText(it.get("f03_17") as String?)
            f03_18.setText(it.get("f03_18") as String?)
            f03_19.setText(it.get("f03_19") as String?)
            f03_20.setText(it.get("f03_20") as String?)
            f03_21.setText(it.get("f03_21") as String?)
            f03_22.setText(it.get("f03_22") as String?)
            f03_23.setText(it.get("f03_23") as String?)
            f03_24.setText(it.get("f03_24") as String?)
            f03_25.setText(it.get("f03_25") as String?)
            f03_26.setText(it.get("f03_26") as String?)
            f03_27.setText(it.get("f03_27") as String?)
            f03_28.setText(it.get("f03_28") as String?)
            f03_29.setText(it.get("f03_29") as String?)
            f03_30.setText(it.get("f03_30") as String?)
            f03_31.setText(it.get("f03_31") as String?)
            f03_32.setText(it.get("f03_32") as String?)
            f03_33.setText(it.get("f03_33") as String?)
            f03_34.setText(it.get("f03_34") as String?)
            f03_35.setText(it.get("f03_35") as String?)
            f03_36.setText(it.get("f03_36") as String?)
            f03_37.setText(it.get("f03_37") as String?)
            f03_38.setText(it.get("f03_38") as String?)
            f03_39.setText(it.get("f03_39") as String?)
            f03_40.setText(it.get("f03_40") as String?)
            f03_41.setText(it.get("f03_41") as String?)
            f03_42.setText(it.get("f03_42") as String?)
            f03_43.setText(it.get("f03_43") as String?)
            f03_44.setText(it.get("f03_44") as String?)
            f03_45.setText(it.get("f03_45") as String?)
            f03_46.setText(it.get("f03_46") as String?)
            f03_47.setText(it.get("f03_47") as String?)
            f03_48.setText(it.get("f03_48") as String?)
            f03_49.setText(it.get("f03_49") as String?)
            f03_50.setText(it.get("f03_50") as String?)
            f03_51.setText(it.get("f03_51") as String?)
            f03_52.setText(it.get("f03_52") as String?)
            f03_53.setText(it.get("f03_53") as String?)
            f03_54.setText(it.get("f03_54") as String?)
            f03_55.setText(it.get("f03_55") as String?)
            f03_56.setText(it.get("f03_56") as String?)
            f03_57.setText(it.get("f03_57") as String?)
            f03_58.setText(it.get("f03_58") as String?)
            f03_59.setText(it.get("f03_59") as String?)
            f03_60.setText(it.get("f03_60") as String?)
            f03_61.setText(it.get("f03_61") as String?)
            f03_62.setText(it.get("f03_62") as String?)
            f03_63.setText(it.get("f03_63") as String?)
            f03_64.setText(it.get("f03_64") as String?)
            f03_65.setText(it.get("f03_65") as String?)
            f03_66.setText(it.get("f03_66") as String?)
            f03_67.setText(it.get("f03_67") as String?)
            if (completeFun().equals("true")){
                progressTextf03.setText("Sección Completa")
            }else{
                progressTextf03.setText("Sección Incompleta")
            }


        }
    }

     */
}

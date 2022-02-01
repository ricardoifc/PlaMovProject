package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form01.*
import kotlinx.android.synthetic.main.activity_form10.*
import kotlinx.android.synthetic.main.activity_form10.atras
import kotlinx.android.synthetic.main.activity_form10.menu
import kotlinx.android.synthetic.main.activity_form10.siguiente

class Form10 : AppCompatActivity() {
    var formulario = "fo10"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form10)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val form11Intent: Intent = Intent(this,Form11::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form11Intent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form09Intent: Intent = Intent(this,Form09::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form09Intent)
        }

        menu.setOnClickListener{
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(MenuIntent)

        }
    }

    fun guardarDatos(email: String, provider: String){
        db.collection(email).document(formulario).set(

            hashMapOf("provider" to provider,

                "f10_01" to f10_01.text.toString(),
                "f10_02" to f10_02.text.toString(),
                "f10_03" to f10_03.text.toString(),
                "f10_04" to f10_04.text.toString(),
                "f10_05" to f10_05.text.toString(),
                "f10_06" to f10_06.text.toString(),
                "f10_07" to f10_07.text.toString(),
                "f10_08" to f10_08.text.toString(),
                "f10_09" to f10_09.text.toString(),
                "f10_10" to f10_10.text.toString(),
                "f10_11" to f10_11.text.toString(),
                "f10_12" to f10_12.text.toString(),
                "f10_13" to f10_13.text.toString(),
                "f10_14" to f10_14.text.toString(),
                "f10_15" to f10_15.text.toString(),
                "f10_16" to f10_16.text.toString(),
                "f10_17" to f10_17.text.toString(),
                "f10_18" to f10_18.text.toString(),
                "f10_19" to f10_19.text.toString(),
                "f10_20" to f10_20.text.toString(),
                "f10_21" to f10_21.text.toString(),
                "f10_22" to f10_22.text.toString(),
                "f10_23" to f10_23.text.toString(),
                "f10_24" to f10_24.text.toString(),
                "f10_25" to f10_25.text.toString(),
                "f10_26" to f10_26.text.toString(),
                "f10_27" to f10_27.text.toString(),
                "f10_28" to f10_28.text.toString(),
                "f10_29" to f10_29.text.toString(),
                "f10_30" to f10_30.text.toString(),
                "f10_31" to f10_31.text.toString(),
                "f10_32" to f10_32.text.toString(),
                "f10_33" to f10_33.text.toString(),
                "f10_34" to f10_34.text.toString(),
                "f10_35" to f10_35.text.toString(),
                "f10_36" to f10_36.text.toString(),
                "f10_37" to f10_37.text.toString(),
                "f10_38" to f10_38.text.toString(),
                "f10_39" to f10_39.text.toString(),
                "f10_40" to f10_40.text.toString(),
                "f10_41" to f10_41.text.toString(),
                "f10_42" to f10_42.text.toString(),
                "f10_43" to f10_43.text.toString(),
                "f10_44" to f10_44.text.toString(),
                "f10_45" to f10_45.text.toString(),
                "f10_46" to f10_46.text.toString(),
                "f10_47" to f10_47.text.toString(),
                "f10_48" to f10_48.text.toString(),
                "f10_49" to f10_49.text.toString(),
                "f10_50" to f10_50.text.toString(),
                "f10_51" to f10_51.text.toString(),
                "f10_52" to f10_52.text.toString(),
                "f10_53" to f10_53.text.toString(),
                "completef10" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;
        if(f10_01.text.toString().equals("")){complete = false;}
        if(f10_02.text.toString().equals("")){complete = false;}
        if(f10_03.text.toString().equals("")){complete = false;}
        if(f10_04.text.toString().equals("")){complete = false;}
        if(f10_05.text.toString().equals("")){complete = false;}
        if(f10_06.text.toString().equals("")){complete = false;}
        if(f10_07.text.toString().equals("")){complete = false;}
        if(f10_08.text.toString().equals("")){complete = false;}
        if(f10_09.text.toString().equals("")){complete = false;}
        if(f10_10.text.toString().equals("")){complete = false;}
        if(f10_11.text.toString().equals("")){complete = false;}
        if(f10_12.text.toString().equals("")){complete = false;}
        if(f10_13.text.toString().equals("")){complete = false;}
        if(f10_14.text.toString().equals("")){complete = false;}
        if(f10_15.text.toString().equals("")){complete = false;}
        if(f10_16.text.toString().equals("")){complete = false;}
        if(f10_17.text.toString().equals("")){complete = false;}
        if(f10_18.text.toString().equals("")){complete = false;}
        if(f10_19.text.toString().equals("")){complete = false;}
        if(f10_20.text.toString().equals("")){complete = false;}
        if(f10_21.text.toString().equals("")){complete = false;}
        if(f10_22.text.toString().equals("")){complete = false;}
        if(f10_23.text.toString().equals("")){complete = false;}
        if(f10_24.text.toString().equals("")){complete = false;}
        if(f10_25.text.toString().equals("")){complete = false;}
        if(f10_26.text.toString().equals("")){complete = false;}
        if(f10_27.text.toString().equals("")){complete = false;}
        if(f10_28.text.toString().equals("")){complete = false;}
        if(f10_29.text.toString().equals("")){complete = false;}
        if(f10_30.text.toString().equals("")){complete = false;}
        if(f10_31.text.toString().equals("")){complete = false;}
        if(f10_32.text.toString().equals("")){complete = false;}
        if(f10_33.text.toString().equals("")){complete = false;}
        if(f10_34.text.toString().equals("")){complete = false;}
        if(f10_35.text.toString().equals("")){complete = false;}
        if(f10_36.text.toString().equals("")){complete = false;}
        if(f10_37.text.toString().equals("")){complete = false;}
        if(f10_38.text.toString().equals("")){complete = false;}
        if(f10_39.text.toString().equals("")){complete = false;}
        if(f10_40.text.toString().equals("")){complete = false;}
        if(f10_41.text.toString().equals("")){complete = false;}
        if(f10_42.text.toString().equals("")){complete = false;}
        if(f10_43.text.toString().equals("")){complete = false;}
        if(f10_44.text.toString().equals("")){complete = false;}
        if(f10_45.text.toString().equals("")){complete = false;}
        if(f10_46.text.toString().equals("")){complete = false;}
        if(f10_47.text.toString().equals("")){complete = false;}
        if(f10_48.text.toString().equals("")){complete = false;}
        if(f10_49.text.toString().equals("")){complete = false;}
        if(f10_50.text.toString().equals("")){complete = false;}
        if(f10_51.text.toString().equals("")){complete = false;}
        if(f10_52.text.toString().equals("")){complete = false;}
        if(f10_53.text.toString().equals("")){complete = false;}


        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f10_01.setText(it.get("f10_01") as String?)
            f10_02.setText(it.get("f10_02") as String?)
            f10_03.setText(it.get("f10_03") as String?)
            f10_04.setText(it.get("f10_04") as String?)
            f10_05.setText(it.get("f10_05") as String?)
            f10_06.setText(it.get("f10_06") as String?)
            f10_07.setText(it.get("f10_07") as String?)
            f10_08.setText(it.get("f10_08") as String?)
            f10_09.setText(it.get("f10_09") as String?)
            f10_10.setText(it.get("f10_10") as String?)
            f10_11.setText(it.get("f10_11") as String?)
            f10_12.setText(it.get("f10_12") as String?)
            f10_13.setText(it.get("f10_13") as String?)
            f10_14.setText(it.get("f10_14") as String?)
            f10_15.setText(it.get("f10_15") as String?)
            f10_16.setText(it.get("f10_16") as String?)
            f10_17.setText(it.get("f10_17") as String?)
            f10_18.setText(it.get("f10_18") as String?)
            f10_19.setText(it.get("f10_19") as String?)
            f10_20.setText(it.get("f10_20") as String?)
            f10_21.setText(it.get("f10_21") as String?)
            f10_22.setText(it.get("f10_22") as String?)
            f10_23.setText(it.get("f10_23") as String?)
            f10_24.setText(it.get("f10_24") as String?)
            f10_25.setText(it.get("f10_25") as String?)
            f10_26.setText(it.get("f10_26") as String?)
            f10_27.setText(it.get("f10_27") as String?)
            f10_28.setText(it.get("f10_28") as String?)
            f10_29.setText(it.get("f10_29") as String?)
            f10_30.setText(it.get("f10_30") as String?)
            f10_31.setText(it.get("f10_31") as String?)
            f10_32.setText(it.get("f10_32") as String?)
            f10_33.setText(it.get("f10_33") as String?)
            f10_34.setText(it.get("f10_34") as String?)
            f10_35.setText(it.get("f10_35") as String?)
            f10_36.setText(it.get("f10_36") as String?)
            f10_37.setText(it.get("f10_37") as String?)
            f10_38.setText(it.get("f10_38") as String?)
            f10_39.setText(it.get("f10_39") as String?)
            f10_40.setText(it.get("f10_40") as String?)
            f10_41.setText(it.get("f10_41") as String?)
            f10_42.setText(it.get("f10_42") as String?)
            f10_43.setText(it.get("f10_43") as String?)
            f10_44.setText(it.get("f10_44") as String?)
            f10_45.setText(it.get("f10_45") as String?)
            f10_46.setText(it.get("f10_46") as String?)
            f10_47.setText(it.get("f10_47") as String?)
            f10_48.setText(it.get("f10_48") as String?)
            f10_49.setText(it.get("f10_49") as String?)
            f10_50.setText(it.get("f10_50") as String?)
            f10_51.setText(it.get("f10_51") as String?)
            f10_52.setText(it.get("f10_52") as String?)
            f10_53.setText(it.get("f10_53") as String?)
            if (completeFun().equals("true")){
                progressTextF10.setText("Sección Completa")
            }else{
                progressTextF10.setText("Sección Incompleta")
            }


        }
    }


}

package com.utpl.plamovproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form18.*

class Form18 : AppCompatActivity() {
    var formulario = "fo18"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form18)
        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)

            }
            startActivity(MenuIntent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form12Intent: Intent = Intent(this,Form12::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form12Intent)
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
                //f18_01

                "f18_10 " to f18_10.text.toString(),
                "f18_11 " to f18_11.text.toString(),

                "f18_13 " to f18_13.text.toString(),
                "f18_14 " to f18_14.text.toString(),
                "f18_15 " to f18_15.text.toString(),

                "f18_17 " to f18_17.text.toString(),
                "f18_18 " to f18_18.text.toString(),
                "f18_19 " to f18_19.text.toString(),

                "f18_21 " to f18_21.text.toString(),
                "f18_22 " to f18_22.text.toString(),
                "f18_23 " to f18_23.text.toString(),

                "f18_25 " to f18_25.text.toString(),
                "f18_26 " to f18_26.text.toString(),
                "f18_27 " to f18_27.text.toString(),

                "f18_29 " to f18_29.text.toString(),
                "f18_30 " to f18_30.text.toString(),
                "f18_31 " to f18_31.text.toString(),

                "f18_33 " to f18_33.text.toString(),
                "f18_34 " to f18_34.text.toString(),
                "f18_35 " to f18_35.text.toString(),

                "f18_37 " to f18_37.text.toString(),
                "f18_38 " to f18_38.text.toString(),
                "f18_39 " to f18_39.text.toString(),

                "f18_41 " to f18_41.text.toString(),
                "f18_42 " to f18_42.text.toString(),
                "f18_43 " to f18_43.text.toString(),

                "f18_45 " to f18_45.text.toString(),
                "f18_46 " to f18_46.text.toString(),
                "f18_47 " to f18_47.text.toString(),

                "f18_49 " to f18_49.text.toString(),
                "f18_50 " to f18_50.text.toString(),
                "f18_51 " to f18_51.text.toString(),

                "f18_53 " to f18_53.text.toString(),
                "f18_54 " to f18_54.text.toString(),
                "f18_55 " to f18_55.text.toString(),

                "f18_57 " to f18_57.text.toString(),
                "f18_58 " to f18_58.text.toString(),
                "f18_59 " to f18_59.text.toString(),

                "f18_61 " to f18_61.text.toString(),
                "f18_62 " to f18_62.text.toString(),
                "f18_63 " to f18_63.text.toString(),

                "f18_65 " to f18_65.text.toString(),
                "f18_66 " to f18_66.text.toString(),
                "f18_67 " to f18_67.text.toString(),

                "f18_69 " to f18_69.text.toString(),
                "f18_70 " to f18_70.text.toString(),
                "f18_71 " to f18_71.text.toString(),

                "f18_73 " to f18_73.text.toString(),
                "f18_74 " to f18_74.text.toString(),
                "f18_75 " to f18_75.text.toString(),

                "f18_77 " to f18_77.text.toString(),
                "f18_78 " to f18_78.text.toString(),
                "f18_79 " to f18_79.text.toString(),

                "f18_89 " to f18_89.text.toString(),
                "f18_90 " to f18_90.text.toString(),
                "f18_91 " to f18_91.text.toString(),

                "f18_93 " to f18_93.text.toString(),
                "f18_94 " to f18_94.text.toString(),
                "f18_95 " to f18_95.text.toString(),

                "f18_97 " to f18_97.text.toString(),
                "f18_98 " to f18_98.text.toString(),
                "f18_99 " to f18_99.text.toString(),

                "f18_104 " to f18_104.text.toString(),
                "f18_105 " to f18_105.text.toString(),
                "f18_106 " to f18_106.text.toString(),

                "f18_109 " to f18_109.text.toString(),
                "f18_110 " to f18_110.text.toString(),
                "f18_111 " to f18_111.text.toString(),

                "f18_113 " to f18_113.text.toString(),
                "f18_114 " to f18_114.text.toString(),
                "f18_115 " to f18_115.text.toString(),

                "f18_117 " to f18_117.text.toString(),
                "f18_118 " to f18_118.text.toString(),
                "f18_119 " to f18_119.text.toString(),

                "f18_121 " to f18_121.text.toString(),
                "f18_122 " to f18_122.text.toString(),
                "f18_123 " to f18_123.text.toString(),

                "f18_129 " to f18_129.text.toString(),
                "f18_130 " to f18_130.text.toString(),
                "f18_131 " to f18_131.text.toString(),

                "f18_133 " to f18_133.text.toString(),
                "f18_134 " to f18_134.text.toString(),
                "f18_135 " to f18_135.text.toString(),




                "completef18" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;


        if  (f18_10 .text.toString().equals("")){complete = false;}
        if  (f18_11 .text.toString().equals("")){complete = false;}

        if  (f18_13 .text.toString().equals("")){complete = false;}
        if  (f18_14 .text.toString().equals("")){complete = false;}
        if  (f18_15 .text.toString().equals("")){complete = false;}

        if  (f18_17 .text.toString().equals("")){complete = false;}
        if  (f18_18 .text.toString().equals("")){complete = false;}
        if  (f18_19 .text.toString().equals("")){complete = false;}

        if  (f18_21 .text.toString().equals("")){complete = false;}
        if  (f18_22 .text.toString().equals("")){complete = false;}
        if  (f18_23 .text.toString().equals("")){complete = false;}

        if  (f18_25 .text.toString().equals("")){complete = false;}
        if  (f18_26 .text.toString().equals("")){complete = false;}
        if  (f18_27 .text.toString().equals("")){complete = false;}

        if  (f18_29 .text.toString().equals("")){complete = false;}
        if  (f18_30 .text.toString().equals("")){complete = false;}
        if  (f18_31 .text.toString().equals("")){complete = false;}

        if  (f18_33 .text.toString().equals("")){complete = false;}
        if  (f18_34 .text.toString().equals("")){complete = false;}
        if  (f18_35 .text.toString().equals("")){complete = false;}

        if  (f18_37 .text.toString().equals("")){complete = false;}
        if  (f18_38 .text.toString().equals("")){complete = false;}
        if  (f18_39 .text.toString().equals("")){complete = false;}

        if  (f18_41 .text.toString().equals("")){complete = false;}
        if  (f18_42 .text.toString().equals("")){complete = false;}
        if  (f18_43 .text.toString().equals("")){complete = false;}

        if  (f18_45 .text.toString().equals("")){complete = false;}
        if  (f18_46 .text.toString().equals("")){complete = false;}
        if  (f18_47 .text.toString().equals("")){complete = false;}

        if  (f18_49 .text.toString().equals("")){complete = false;}
        if  (f18_50 .text.toString().equals("")){complete = false;}
        if  (f18_51 .text.toString().equals("")){complete = false;}

        if  (f18_53 .text.toString().equals("")){complete = false;}
        if  (f18_54 .text.toString().equals("")){complete = false;}
        if  (f18_55 .text.toString().equals("")){complete = false;}

        if  (f18_57 .text.toString().equals("")){complete = false;}
        if  (f18_58 .text.toString().equals("")){complete = false;}
        if  (f18_59 .text.toString().equals("")){complete = false;}

        if  (f18_61 .text.toString().equals("")){complete = false;}
        if  (f18_62 .text.toString().equals("")){complete = false;}
        if  (f18_63 .text.toString().equals("")){complete = false;}

        if  (f18_65 .text.toString().equals("")){complete = false;}
        if  (f18_66 .text.toString().equals("")){complete = false;}
        if  (f18_67 .text.toString().equals("")){complete = false;}

        if  (f18_69 .text.toString().equals("")){complete = false;}
        if  (f18_70 .text.toString().equals("")){complete = false;}
        if  (f18_71 .text.toString().equals("")){complete = false;}

        if  (f18_73 .text.toString().equals("")){complete = false;}
        if  (f18_74 .text.toString().equals("")){complete = false;}
        if  (f18_75 .text.toString().equals("")){complete = false;}

        if  (f18_77 .text.toString().equals("")){complete = false;}
        if  (f18_78 .text.toString().equals("")){complete = false;}
        if  (f18_79 .text.toString().equals("")){complete = false;}

        if  (f18_89 .text.toString().equals("")){complete = false;}
        if  (f18_90 .text.toString().equals("")){complete = false;}
        if  (f18_91 .text.toString().equals("")){complete = false;}

        if  (f18_93 .text.toString().equals("")){complete = false;}
        if  (f18_94 .text.toString().equals("")){complete = false;}
        if  (f18_95 .text.toString().equals("")){complete = false;}

        if  (f18_97 .text.toString().equals("")){complete = false;}
        if  (f18_98 .text.toString().equals("")){complete = false;}
        if  (f18_99 .text.toString().equals("")){complete = false;}

        if  (f18_104 .text.toString().equals("")){complete = false;}
        if  (f18_105 .text.toString().equals("")){complete = false;}
        if  (f18_106 .text.toString().equals("")){complete = false;}

        if  (f18_109 .text.toString().equals("")){complete = false;}
        if  (f18_110 .text.toString().equals("")){complete = false;}
        if  (f18_111 .text.toString().equals("")){complete = false;}

        if  (f18_113 .text.toString().equals("")){complete = false;}
        if  (f18_114 .text.toString().equals("")){complete = false;}
        if  (f18_115 .text.toString().equals("")){complete = false;}

        if  (f18_117 .text.toString().equals("")){complete = false;}
        if  (f18_118 .text.toString().equals("")){complete = false;}
        if  (f18_119 .text.toString().equals("")){complete = false;}

        if  (f18_121 .text.toString().equals("")){complete = false;}
        if  (f18_122 .text.toString().equals("")){complete = false;}
        if  (f18_123 .text.toString().equals("")){complete = false;}

        if  (f18_129 .text.toString().equals("")){complete = false;}
        if  (f18_130 .text.toString().equals("")){complete = false;}
        if  (f18_131 .text.toString().equals("")){complete = false;}

        if  (f18_133 .text.toString().equals("")){complete = false;}
        if  (f18_134 .text.toString().equals("")){complete = false;}
        if  (f18_135 .text.toString().equals("")){complete = false;}




        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {

            f18_10.setText(it.get("f18_10") as String?)
            f18_11.setText(it.get("f18_11") as String?)

            f18_13.setText(it.get("f18_13") as String?)
            f18_14.setText(it.get("f18_14") as String?)
            f18_15.setText(it.get("f18_15") as String?)

            f18_17.setText(it.get("f18_17") as String?)
            f18_18.setText(it.get("f18_18") as String?)
            f18_19.setText(it.get("f18_19") as String?)

            f18_21.setText(it.get("f18_21") as String?)
            f18_22.setText(it.get("f18_22") as String?)
            f18_23.setText(it.get("f18_23") as String?)

            f18_25.setText(it.get("f18_25") as String?)
            f18_26.setText(it.get("f18_26") as String?)
            f18_27.setText(it.get("f18_27") as String?)

            f18_29.setText(it.get("f18_29") as String?)
            f18_30.setText(it.get("f18_30") as String?)
            f18_31.setText(it.get("f18_31") as String?)

            f18_33.setText(it.get("f18_33") as String?)
            f18_34.setText(it.get("f18_34") as String?)
            f18_35.setText(it.get("f18_35") as String?)

            f18_37.setText(it.get("f18_37") as String?)
            f18_38.setText(it.get("f18_38") as String?)
            f18_39.setText(it.get("f18_39") as String?)

            f18_41.setText(it.get("f18_41") as String?)
            f18_42.setText(it.get("f18_42") as String?)
            f18_43.setText(it.get("f18_43") as String?)

            f18_45.setText(it.get("f18_45") as String?)
            f18_46.setText(it.get("f18_46") as String?)
            f18_47.setText(it.get("f18_47") as String?)

            f18_49.setText(it.get("f18_49") as String?)
            f18_50.setText(it.get("f18_50") as String?)
            f18_51.setText(it.get("f18_51") as String?)

            f18_53.setText(it.get("f18_53") as String?)
            f18_54.setText(it.get("f18_54") as String?)
            f18_55.setText(it.get("f18_55") as String?)

            f18_57.setText(it.get("f18_57") as String?)
            f18_58.setText(it.get("f18_58") as String?)
            f18_59.setText(it.get("f18_59") as String?)

            f18_61.setText(it.get("f18_61") as String?)
            f18_62.setText(it.get("f18_62") as String?)
            f18_63.setText(it.get("f18_63") as String?)

            f18_65.setText(it.get("f18_65") as String?)
            f18_66.setText(it.get("f18_66") as String?)
            f18_67.setText(it.get("f18_67") as String?)

            f18_69.setText(it.get("f18_69") as String?)
            f18_70.setText(it.get("f18_70") as String?)
            f18_71.setText(it.get("f18_71") as String?)

            f18_73.setText(it.get("f18_73") as String?)
            f18_74.setText(it.get("f18_74") as String?)
            f18_75.setText(it.get("f18_75") as String?)

            f18_77.setText(it.get("f18_77") as String?)
            f18_78.setText(it.get("f18_78") as String?)
            f18_79.setText(it.get("f18_79") as String?)

            f18_89.setText(it.get("f18_89") as String?)
            f18_90.setText(it.get("f18_90") as String?)
            f18_91.setText(it.get("f18_91") as String?)

            f18_93.setText(it.get("f18_93") as String?)
            f18_94.setText(it.get("f18_94") as String?)
            f18_95.setText(it.get("f18_95") as String?)

            f18_97.setText(it.get("f18_97") as String?)
            f18_98.setText(it.get("f18_98") as String?)
            f18_99.setText(it.get("f18_99") as String?)

            f18_104.setText(it.get("f18_104") as String?)
            f18_105.setText(it.get("f18_105") as String?)
            f18_106.setText(it.get("f18_106") as String?)

            f18_109.setText(it.get("f18_109") as String?)
            f18_110.setText(it.get("f18_110") as String?)
            f18_111.setText(it.get("f18_111") as String?)

            f18_113.setText(it.get("f18_113") as String?)
            f18_114.setText(it.get("f18_114") as String?)
            f18_115.setText(it.get("f18_115") as String?)

            f18_117.setText(it.get("f18_117") as String?)
            f18_118.setText(it.get("f18_118") as String?)
            f18_119.setText(it.get("f18_119") as String?)

            f18_121.setText(it.get("f18_121") as String?)
            f18_122.setText(it.get("f18_122") as String?)
            f18_123.setText(it.get("f18_123") as String?)

            f18_129.setText(it.get("f18_129") as String?)
            f18_130.setText(it.get("f18_130") as String?)
            f18_131.setText(it.get("f18_131") as String?)

            f18_133.setText(it.get("f18_133") as String?)
            f18_134.setText(it.get("f18_134") as String?)
            f18_135.setText(it.get("f18_135") as String?)



            if (completeFun().equals("true")){
                progressTextf18.setText("Sección Completa")
            }else{
                progressTextf18.setText("Sección Incompleta")
            }


        }
    }
}
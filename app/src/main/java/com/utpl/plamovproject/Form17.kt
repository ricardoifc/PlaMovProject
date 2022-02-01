package com.utpl.plamovproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

import kotlinx.android.synthetic.main.activity_form17.*

class Form17 : AppCompatActivity() {
    var formulario = "fo17"
    private val db = FirebaseFirestore.getInstance()
    var complete : Boolean = false
    var completeS = "true"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form17)
        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }
    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            guardarDatos(email, provider)
            val MenuIntent: Intent = Intent(this,Form18::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)

            }
            finish();
            startActivity(MenuIntent)

        }

        atras.setOnClickListener {
            guardarDatos(email, provider)
            val form12Intent: Intent = Intent(this,Form16::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form12Intent)
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
                //f17_01
                "f17_01" to f17_01.text.toString(),
                "f17_02" to f17_02.text.toString(),
                "f17_03" to f17_03.text.toString(),

                "f17_05" to f17_05.text.toString(),
                "f17_06" to f17_06.text.toString(),
                "f17_07" to f17_07.text.toString(),

                "f17_09" to f17_09.text.toString(),
                "f17_10" to f17_10.text.toString(),
                "f17_11" to f17_11.text.toString(),

                "f17_13" to f17_13.text.toString(),
                "f17_14" to f17_14.text.toString(),
                "f17_15" to f17_15.text.toString(),

                "f17_17" to f17_17.text.toString(),
                "f17_18" to f17_18.text.toString(),
                "f17_19" to f17_19.text.toString(),

                "f17_21" to f17_21.text.toString(),
                "f17_22" to f17_22.text.toString(),
                "f17_23" to f17_23.text.toString(),

                "f17_25" to f17_25.text.toString(),
                "f17_26" to f17_26.text.toString(),
                "f17_27" to f17_27.text.toString(),

                "f17_29" to f17_29.text.toString(),
                "f17_30" to f17_30.text.toString(),
                "f17_31" to f17_31.text.toString(),

                "f17_33" to f17_33.text.toString(),
                "f17_34" to f17_34.text.toString(),
                "f17_35" to f17_35.text.toString(),

                "f17_37" to f17_37.text.toString(),
                "f17_38" to f17_38.text.toString(),
                "f17_39" to f17_39.text.toString(),

                "f17_41" to f17_41.text.toString(),
                "f17_42" to f17_42.text.toString(),
                "f17_43" to f17_43.text.toString(),

                "f17_45" to f17_45.text.toString(),
                "f17_46" to f17_46.text.toString(),
                "f17_47" to f17_47.text.toString(),

                "f17_49" to f17_49.text.toString(),
                "f17_50" to f17_50.text.toString(),
                "f17_51" to f17_51.text.toString(),

                "f17_53" to f17_53.text.toString(),
                "f17_54" to f17_54.text.toString(),
                "f17_55" to f17_55.text.toString(),

                "f17_57" to f17_57.text.toString(),
                "f17_58" to f17_58.text.toString(),
                "f17_59" to f17_59.text.toString(),

                "f17_61" to f17_61.text.toString(),
                "f17_62" to f17_62.text.toString(),
                "f17_63" to f17_63.text.toString(),

                "f17_65" to f17_65.text.toString(),
                "f17_66" to f17_66.text.toString(),
                "f17_67" to f17_67.text.toString(),

                "f17_69" to f17_69.text.toString(),
                "f17_70" to f17_70.text.toString(),
                "f17_71" to f17_71.text.toString(),

                "f17_73" to f17_73.text.toString(),
                "f17_74" to f17_74.text.toString(),
                "f17_75" to f17_75.text.toString(),

                "f17_77" to f17_77.text.toString(),
                "f17_78" to f17_78.text.toString(),
                "f17_79" to f17_79.text.toString(),

                "f17_89" to f17_89.text.toString(),
                "f17_90" to f17_90.text.toString(),
                "f17_91" to f17_91.text.toString(),

                "f17_93" to f17_93.text.toString(),
                "f17_94" to f17_94.text.toString(),
                "f17_95" to f17_95.text.toString(),

                "f17_97" to f17_97.text.toString(),
                "f17_98" to f17_98.text.toString(),
                "f17_99" to f17_99.text.toString(),

                "f17_104" to f17_104.text.toString(),
                "f17_105" to f17_105.text.toString(),
                "f17_106" to f17_106.text.toString(),

                "f17_109" to f17_109.text.toString(),
                "f17_110" to f17_110.text.toString(),
                "f17_111" to f17_111.text.toString(),

                "f17_113" to f17_113.text.toString(),
                "f17_114" to f17_114.text.toString(),
                "f17_115" to f17_115.text.toString(),

                "f17_117" to f17_117.text.toString(),
                "f17_118" to f17_118.text.toString(),
                "f17_119" to f17_119.text.toString(),

                "f17_121" to f17_121.text.toString(),
                "f17_122" to f17_122.text.toString(),
                "f17_123" to f17_123.text.toString(),

                "f17_129" to f17_129.text.toString(),
                "f17_130" to f17_130.text.toString(),
                "f17_131" to f17_131.text.toString(),

                "f17_133" to f17_133.text.toString(),
                "f17_134" to f17_134.text.toString(),
                "f17_135" to f17_135.text.toString(),
                "f17_136" to f17_136.text.toString(),
                "f17_137" to f17_137.text.toString(),
                "f17_138" to f17_138.text.toString(),

                "f17_140" to f17_140.text.toString(),
                "f17_141" to f17_141.text.toString(),
                "f17_142" to f17_142.text.toString(),
                "f17_143" to f17_143.text.toString(),
                "f17_144" to f17_144.text.toString(),
                "f17_145" to f17_145.text.toString(),
                "f17_146" to f17_146.text.toString(),

                "f17_148" to f17_148.text.toString(),
                "f17_149" to f17_149.text.toString(),
                "f17_150" to f17_150.text.toString(),



                "completef17" to completeFun().toString()

            )
        )
    }
    fun completeFun(): String {
        complete = true;

        if  (f17_01 .text.toString().equals("")){complete = false;}
        if  (f17_02 .text.toString().equals("")){complete = false;}
        if  (f17_03 .text.toString().equals("")){complete = false;}

        if  (f17_05 .text.toString().equals("")){complete = false;}
        if  (f17_06 .text.toString().equals("")){complete = false;}
        if  (f17_07 .text.toString().equals("")){complete = false;}



        if (complete == false){
            completeS= "false"
        }
        return completeS
    }
    fun refrescar(email: String, provider: String) {
        db.collection(email).document(formulario).get().addOnSuccessListener {
            f17_01.setText(it.get("f17_01") as String?)
            f17_02.setText(it.get("f17_02") as String?)
            f17_03.setText(it.get("f17_03") as String?)

            f17_05.setText(it.get("f17_05") as String?)
            f17_06.setText(it.get("f17_06") as String?)
            f17_07.setText(it.get("f17_07") as String?)

            f17_09.setText(it.get("f17_09") as String?)
            f17_10.setText(it.get("f17_10") as String?)
            f17_11.setText(it.get("f17_11") as String?)

            f17_13.setText(it.get("f17_13") as String?)
            f17_14.setText(it.get("f17_14") as String?)
            f17_15.setText(it.get("f17_15") as String?)

            f17_17.setText(it.get("f17_17") as String?)
            f17_18.setText(it.get("f17_18") as String?)
            f17_19.setText(it.get("f17_19") as String?)

            f17_21.setText(it.get("f17_21") as String?)
            f17_22.setText(it.get("f17_22") as String?)
            f17_23.setText(it.get("f17_23") as String?)

            f17_25.setText(it.get("f17_25") as String?)
            f17_26.setText(it.get("f17_26") as String?)
            f17_27.setText(it.get("f17_27") as String?)

            f17_29.setText(it.get("f17_29") as String?)
            f17_30.setText(it.get("f17_30") as String?)
            f17_31.setText(it.get("f17_31") as String?)

            f17_33.setText(it.get("f17_33") as String?)
            f17_34.setText(it.get("f17_34") as String?)
            f17_35.setText(it.get("f17_35") as String?)

            f17_37.setText(it.get("f17_37") as String?)
            f17_38.setText(it.get("f17_38") as String?)
            f17_39.setText(it.get("f17_39") as String?)

            f17_41.setText(it.get("f17_41") as String?)
            f17_42.setText(it.get("f17_42") as String?)
            f17_43.setText(it.get("f17_43") as String?)

            f17_45.setText(it.get("f17_45") as String?)
            f17_46.setText(it.get("f17_46") as String?)
            f17_47.setText(it.get("f17_47") as String?)

            f17_49.setText(it.get("f17_49") as String?)
            f17_50.setText(it.get("f17_50") as String?)
            f17_51.setText(it.get("f17_51") as String?)

            f17_53.setText(it.get("f17_53") as String?)
            f17_54.setText(it.get("f17_54") as String?)
            f17_55.setText(it.get("f17_55") as String?)

            f17_57.setText(it.get("f17_57") as String?)
            f17_58.setText(it.get("f17_58") as String?)
            f17_59.setText(it.get("f17_59") as String?)

            f17_61.setText(it.get("f17_61") as String?)
            f17_62.setText(it.get("f17_62") as String?)
            f17_63.setText(it.get("f17_63") as String?)

            f17_65.setText(it.get("f17_65") as String?)
            f17_66.setText(it.get("f17_66") as String?)
            f17_67.setText(it.get("f17_67") as String?)

            f17_69.setText(it.get("f17_69") as String?)
            f17_70.setText(it.get("f17_70") as String?)
            f17_71.setText(it.get("f17_71") as String?)

            f17_73.setText(it.get("f17_73") as String?)
            f17_74.setText(it.get("f17_74") as String?)
            f17_75.setText(it.get("f17_75") as String?)

            f17_77.setText(it.get("f17_77") as String?)
            f17_78.setText(it.get("f17_78") as String?)
            f17_79.setText(it.get("f17_79") as String?)

            f17_89.setText(it.get("f17_89") as String?)
            f17_90.setText(it.get("f17_90") as String?)
            f17_91.setText(it.get("f17_91") as String?)

            f17_93.setText(it.get("f17_93") as String?)
            f17_94.setText(it.get("f17_94") as String?)
            f17_95.setText(it.get("f17_95") as String?)

            f17_97.setText(it.get("f17_97") as String?)
            f17_98.setText(it.get("f17_98") as String?)
            f17_99.setText(it.get("f17_99") as String?)

            f17_104.setText(it.get("f17_104") as String?)
            f17_105.setText(it.get("f17_105") as String?)
            f17_106.setText(it.get("f17_106") as String?)

            f17_109.setText(it.get("f17_109") as String?)
            f17_110.setText(it.get("f17_110") as String?)
            f17_111.setText(it.get("f17_111") as String?)

            f17_113.setText(it.get("f17_113") as String?)
            f17_114.setText(it.get("f17_114") as String?)
            f17_115.setText(it.get("f17_115") as String?)

            f17_117.setText(it.get("f17_117") as String?)
            f17_118.setText(it.get("f17_118") as String?)
            f17_119.setText(it.get("f17_119") as String?)

            f17_121.setText(it.get("f17_121") as String?)
            f17_122.setText(it.get("f17_122") as String?)
            f17_123.setText(it.get("f17_123") as String?)

            f17_129.setText(it.get("f17_129") as String?)
            f17_130.setText(it.get("f17_130") as String?)
            f17_131.setText(it.get("f17_131") as String?)

            f17_133.setText(it.get("f17_133") as String?)
            f17_134.setText(it.get("f17_134") as String?)
            f17_135.setText(it.get("f17_135") as String?)
            f17_136.setText(it.get("f17_136") as String?)
            f17_137.setText(it.get("f17_137") as String?)
            f17_138.setText(it.get("f17_138") as String?)

            f17_140.setText(it.get("f17_140") as String?)
            f17_141.setText(it.get("f17_141") as String?)
            f17_142.setText(it.get("f17_142") as String?)
            f17_143.setText(it.get("f17_143") as String?)
            f17_144.setText(it.get("f17_144") as String?)
            f17_145.setText(it.get("f17_145") as String?)
            f17_146.setText(it.get("f17_146") as String?)

            f17_148.setText(it.get("f17_148") as String?)
            f17_149.setText(it.get("f17_149") as String?)
            f17_150.setText(it.get("f17_150") as String?)


            if (completeFun().equals("true")){
                progressTextf17.setText("Sección Completa")
            }else{
                progressTextf17.setText("Sección Incompleta")
            }


        }
    }
}
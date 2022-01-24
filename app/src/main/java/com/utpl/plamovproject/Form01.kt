package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form01.*
import kotlinx.android.synthetic.main.activity_home.*

enum class ProviderType01{
    BASIC,
    GOOGLE,
    FACEBOOK
}

class Form01 : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form01)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        setup(email?:"", provider?:"")
    }

    private fun setup(email:String, provider:String){

        refrescar(email, provider)
        siguiente.setOnClickListener{
            db.collection("users").document(email).set(
                hashMapOf("provider" to provider,

                    "f01_01" to f01_01.text.toString(),
                    "f01_02" to f01_02.text.toString(),
                    "f01_03" to f01_03.text.toString(),
                    "f01_04" to f01_04.text.toString(),
                    "f01_05" to f01_05.text.toString(),
                    "f01_06" to f01_06.text.toString(),
                    "f01_07" to f01_07.text.toString(),
                    "f01_08" to f01_08.text.toString(),
                    "f01_09" to f01_09.text.toString(),
                    "f01_10" to f01_10.text.toString(),
                    "f01_11" to f01_11.text.toString(),
                    "f01_12" to f01_12.text.toString(),
                    "f01_13" to f01_13.text.toString(),
                    "f01_14" to f01_14.text.toString(),
                    "f01_15" to f01_15.text.toString(),
                    "f01_16" to f01_16.text.toString(),
                    "f01_17" to f01_17.text.toString(),
                    "f01_18" to f01_18.text.toString(),
                    "f01_19" to f01_19.text.toString(),
                    "f01_20" to f01_20.text.toString(),
                    "f01_21" to f01_21.text.toString(),
                    "f01_22" to f01_22.text.toString(),
                    "f01_23" to f01_23.text.toString(),
                    "f01_24" to f01_24.text.toString(),
                    "f01_25" to f01_25.text.toString(),
                    "f01_26" to f01_26.text.toString(),
                    "f01_27" to f01_27.text.toString(),
                    "f01_28" to f01_28.text.toString(),
                    "f01_29" to f01_29.text.toString(),
                    "f01_30" to f01_30.text.toString(),
                    "f01_31" to f01_31.text.toString(),
                    "f01_32" to f01_32.text.toString(),
                    "f01_33" to f01_33.text.toString(),
                    "f01_34" to f01_34.text.toString(),
                    "f01_35" to f01_35.text.toString(),
                    "f01_36" to f01_36.text.toString(),
                    "f01_37" to f01_37.text.toString(),
                    "f01_38" to f01_38.text.toString(),
                    "f01_39" to f01_39.text.toString(),
                    "f01_40" to f01_40.text.toString(),
                    "f01_41" to f01_41.text.toString(),
                    "f01_42" to f01_42.text.toString(),
                    "f01_43" to f01_43.text.toString(),
                    "f01_44" to f01_44.text.toString(),
                    "f01_45" to f01_45.text.toString(),
                    "f01_46" to f01_46.text.toString(),
                    "f01_47" to f01_47.text.toString(),
                    "f01_48" to f01_48.text.toString(),
                    "f01_49" to f01_49.text.toString(),
                    "f01_50" to f01_50.text.toString(),
                    "f01_51" to f01_51.text.toString(),
                    "f01_52" to f01_52.text.toString(),
                    "f01_53" to f01_53.text.toString(),
                    "f01_54" to f01_54.text.toString(),
                    "f01_55" to f01_55.text.toString(),
                    "f01_56" to f01_56.text.toString(),
                    "f01_57" to f01_57.text.toString(),
                    "f01_58" to f01_58.text.toString(),
                    "f01_59" to f01_59.text.toString(),
                    "f01_60" to f01_60.text.toString(),
                    "f01_61" to f01_61.text.toString(),
                    "f01_62" to f01_62.text.toString(),
                    "f01_63" to f01_63.text.toString(),
                    "f01_64" to f01_64.text.toString(),
                    "f01_65" to f01_65.text.toString(),
                    "f01_66" to f01_66.text.toString(),
                    "f01_67" to f01_67.text.toString()

                    )
            )
            val form02Intent: Intent = Intent(this,Form02::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form02Intent)

        }

        atras.setOnClickListener {
            val homeIntent: Intent = Intent(this, HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(homeIntent)
        }
        menu.setOnClickListener{

        }
    }
    fun refrescar(email: String, provider: String) {
        db.collection("users").document(email).get().addOnSuccessListener {
            f01_01.setText(it.get("f01_01") as String?)

        }
    }
}

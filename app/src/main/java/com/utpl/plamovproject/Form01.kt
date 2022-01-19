package com.utpl.plamovproject

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
        guardar.setOnClickListener{
            db.collection("users").document(email).set(
                hashMapOf("provider" to provider,
                    "f01_nombre" to et_01_01.text.toString(),
                    "f01_direccion" to et_01_02.text.toString(),
                    "f01_telefono" to et_01_03.text.toString(),
                    "f01_originario" to et_01_04.text.toString(),
                    "f01_lugar" to et_01_05.text.toString(),
                    "f01_edad" to et_01_06.text.toString(),
                    "f01_ocupacion" to et_01_07.text.toString(),
                    "f01_escolaridad" to et_01_08.text.toString(),
                    "f01_estadoSalud" to et_01_09.text.toString(),
                    "f01_comentarios" to et_01_10.text.toString()

                    )
            )

        }
    }
    fun refrescar(email: String, provider: String) {
        db.collection("users").document(email).get().addOnSuccessListener {
            et_01_01.setText(it.get("f01_nombre") as String?)
            et_01_02.setText(it.get("f01_direccion") as String?)
            et_01_03.setText(it.get("f01_telefono") as String?)
            et_01_04.setText(it.get("f01_originario") as String?)
            et_01_05.setText(it.get("f01_lugar") as String?)
            et_01_06.setText(it.get("f01_edad") as String?)
            et_01_07.setText(it.get("f01_ocupacion") as String?)
            et_01_08.setText(it.get("f01_escolaridad") as String?)
            et_01_09.setText(it.get("f01_estadoSalud") as String?)
            et_01_10.setText(it.get("f01_comentarios") as String?)

        }
    }
}

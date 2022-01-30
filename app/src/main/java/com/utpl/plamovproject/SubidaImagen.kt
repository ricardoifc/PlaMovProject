package com.utpl.plamovproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.activity_form06.*
import kotlinx.android.synthetic.main.activity_subida_imagen.*
import kotlinx.android.synthetic.main.activity_subida_imagen.imagenDown
import kotlinx.android.synthetic.main.activity_subida_imagen.uploadImageView
import java.util.*

class SubidaImagen : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    var formulario = "subidaImagen"
    private val File = 1
    private val database = Firebase.database
    val myRef = database.getReference("user")
    var email = ""
    var provider = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subida_imagen)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        datosAuth(email?:"", provider?:"")
        setup()
        uploadImageView.setOnClickListener {
            fileUpload()
        }


    }


    fun fileUpload() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*"
        startActivityForResult(intent, File)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == File) {
            if (resultCode == RESULT_OK) {
                val FileUri = data!!.data
                val Folder: StorageReference =
                    FirebaseStorage.getInstance().getReference().child(email)
                val file_name: StorageReference = Folder.child("organigrama_" + FileUri!!.lastPathSegment)
                file_name.putFile(FileUri).addOnSuccessListener { taskSnapshot ->
                    file_name.getDownloadUrl().addOnSuccessListener { uri ->
                        val hashMap =
                            HashMap<String, String>()
                        hashMap["link"] = java.lang.String.valueOf(uri)
                        myRef.setValue(hashMap)
                        Log.d("Mensaje", "Se subió correctamente")

                        db.collection(email).document(formulario).set(
                            hashMapOf("provider" to provider,
                                "imgUrlSubida" to uri.toString() // uri.toString es el link que genero
                            )
                        )
                        // poner imagen en un imgview
                        Glide.with(this)
                            .load(uri.toString()) // uri.toString es el link que guardo
                            .fitCenter()
                            .centerCrop()
                            .into(imagenDown)
                    }
                }
            }
        }

    }
    private fun datosAuth(emailS:String, providerS:String){
        email  =  emailS
        provider = providerS
        db.collection(email).document(formulario).get().addOnSuccessListener {
            //cargar img subido
            Glide.with(this)
                    .load(it.get("imgUrlSubida").toString())
                    .fitCenter()
                    .centerCrop()
                    .into(imagenDown)
            }
        }

    private fun setup(){
        menuBTN.setOnClickListener{
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(MenuIntent)

        }

    }

}
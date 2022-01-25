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
import kotlinx.android.synthetic.main.activity_form19.*
import java.util.*

class Form19 : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    var formulario = "fo19"
    private val File = 1
    private val database = Firebase.database
    val myRef = database.getReference("user")
    var email = ""
    var provider = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form19)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        datosAuth(email?:"", provider?:"")
        setup()

        uploadImageView.setOnClickListener {
            fileUpload()
        }
    }
    private fun setup(){
        siguiente.setOnClickListener{

            val form21Intent: Intent = Intent(this,Form21::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form21Intent)

        }

        atras.setOnClickListener {
            val form18Intent: Intent = Intent(this,Form18::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(form18Intent)
        }

        menu.setOnClickListener{
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(MenuIntent)

        }
    }
    private fun datosAuth(emailS:String, providerS:String){
        email  =  emailS
        provider = providerS
        progressTextF19.setText("Sección Incompleta")
        db.collection(email).document(formulario).get().addOnSuccessListener {

            if (it.get("completef19") == "true") {
                progressTextF19.setText("Sección Completa")
                Glide.with(this)
                    .load(it.get("imgUrl19").toString())
                    .fitCenter()
                    .centerCrop()
                    .into(imagenDown)
            }
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
                val file_name: StorageReference = Folder.child("rutaCritica_" + FileUri!!.lastPathSegment)

                file_name.putFile(FileUri).addOnSuccessListener { taskSnapshot ->
                    file_name.getDownloadUrl().addOnSuccessListener { uri ->
                        val hashMap =
                            HashMap<String, String>()
                        hashMap["link"] = java.lang.String.valueOf(uri)
                        myRef.setValue(hashMap)
                        Log.d("Mensaje", "Se subió correctamente")

                        progressTextF19.setText("Sección Completa")
                        db.collection(email).document(formulario).set(
                            hashMapOf("provider" to provider,
                                "completef19" to "true",
                                "imgUrl19" to uri.toString()
                            )
                        )
                        Glide.with(this)
                            .load(uri.toString())
                            .fitCenter()
                            .centerCrop()
                            .into(imagenDown)
                    }
                }
            }
        }

    }

}
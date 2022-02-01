package com.utpl.plamovproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.activity_register.*
import java.util.HashMap
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase


class RegisterActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private val File = 1
    private val database = Firebase.database
    val myRef = database.getReference("user")
    var urlTemp = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setup()

        empresa_image.setOnClickListener {
            fileUpload()
        }
    }

    fun fileUpload() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*"
        startActivityForResult(intent, File)
    }

    private fun setup(){
        title = "Register"
        irAtras.setOnClickListener{
            finish()
        }
        btn_actualizar.setOnClickListener{
            if (et_email.text.isNotEmpty() && et_clave.text.isNotEmpty() && nombreEmpresa.text.isNotEmpty()){

                FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(et_email.text.toString(),
                        et_clave.text.toString()).addOnCompleteListener{
                        if (it.isSuccessful){
                            db.collection(et_email.text.toString()).document("Empresa").set(

                                hashMapOf("provider" to ProviderType.BASIC,
                                    "nombreDeEmpresa" to nombreEmpresa.text.toString(),
                                    "urlImgagenEmpresa" to urlTemp,
                                )
                            )
                            showHome(it.result?.user?.email?:"", ProviderType.BASIC)
                        }else{
                            showAlert()
                            //println(it.result)
                        }
                    }
            }

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == File) {
            if (resultCode == RESULT_OK) {
                val FileUri = data!!.data
                val alphabet = 'a'..'z'
                var formatTemplate = "%s%s%s%s%s%s%s%s"
                val nombreArchivo = formatTemplate.format(alphabet.random(),alphabet.random(),
                    alphabet.random(),alphabet.random(),alphabet.random(),alphabet.random()
                    ,alphabet.random(),alphabet.random(),)
                val Folder: StorageReference =
                    FirebaseStorage.getInstance().getReference().child("FotoEmpresa")
                val file_name: StorageReference = Folder.child(nombreArchivo + FileUri!!.lastPathSegment)
                file_name.putFile(FileUri).addOnSuccessListener { taskSnapshot ->
                    file_name.getDownloadUrl().addOnSuccessListener { uri ->
                        val hashMap =
                            HashMap<String, String>()
                        hashMap["link"] = java.lang.String.valueOf(uri)
                        myRef.setValue(hashMap)
                        Log.d("Mensaje", "Se subió correctamente")

                        urlTemp = uri.toString() // uri.toString es el link que genero
                        // poner imagen en un imgview
                        Glide.with(this)
                            .load(uri.toString()) // uri.toString es el link que guardo
                            .fitCenter()
                            .centerCrop()
                            .into(empresa_image)
                    }
                }
            }
        }

    }

    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error de regsitro ")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog=builder.create()
        dialog.show()


    }
    private fun showHome(email:String, provider: ProviderType){
        val loginIntent: Intent = Intent(this,LoginActivity::class.java).apply {
            putExtra("email", email)
            putExtra("provider", provider)
        }
        finish();
        startActivity(loginIntent)
    }
}
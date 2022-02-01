package com.utpl.plamovproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.util.Log
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.activity_edit_empresa.*
import java.util.HashMap
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_edit_empresa.btn_actualizar
import kotlinx.android.synthetic.main.activity_edit_empresa.empresa_image
import kotlinx.android.synthetic.main.activity_edit_empresa.irAtras
import kotlinx.android.synthetic.main.activity_edit_empresa.nombreEmpresa
import kotlinx.android.synthetic.main.activity_register.*


class EditEmpresaActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private val File = 1
    private val database = Firebase.database
    val myRef = database.getReference("user")
    var urlTemp = ""
    var cambios = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_empresa)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")
        cargarImg(email?:"", provider?:"")
        setup(email?:"", provider?:"")

        empresa_image.setOnClickListener {
            fileUpload()
        }
    }

    fun fileUpload() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*"
        startActivityForResult(intent, File)
    }
    fun cargarImg(email: String, provider: String) {
        db.collection(email).document("Empresa").get().addOnSuccessListener {
            if (it.get("urlImgagenEmpresa") as String? != "" ){
                Glide.with(this)
                    .load(it.get("urlImgagenEmpresa") as String?) // uri.toString es el link que guardo
                    .fitCenter()
                    .centerCrop()
                    .into(empresa_image)
            }
            if (it.get("nombreDeEmpresa") as String? != "" ){
                nombreEmpresa.setText(it.get("nombreDeEmpresa") as String?)
            }
        }
    }
    fun setup(email: String, provider: String) {
            title = "Edit"
        irAtras.setOnClickListener{
            finish()
            val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            startActivity(MenuIntent)
        }
            btn_actualizar.setOnClickListener {
                if (cambios == true){

                    db.collection(email).document("Empresa").set(
                        hashMapOf(
                            "provider" to ProviderType.BASIC,
                            "nombreDeEmpresa" to nombreEmpresa.text.toString(),
                            "urlImgagenEmpresa" to urlTemp,

                            )
                    )
                }else{
                    db.collection(email).document("Empresa").get().addOnSuccessListener {
                        db.collection(email).document("Empresa").set(
                            hashMapOf(
                                "provider" to ProviderType.BASIC,
                                "nombreDeEmpresa" to nombreEmpresa.text.toString(),
                                "urlImgagenEmpresa" to it.get("urlImgagenEmpresa") as String?
                            )
                        )
                        print("xxxxxxxxxxxxx ")
                        print(it.get("urlImgagenEmpresa") as String)
                    }


                }
                finish();
                val MenuIntent: Intent = Intent(this,HomeActivity::class.java).apply {
                    putExtra("email", email)
                    putExtra("provider", provider)
                }
                startActivity(MenuIntent)
            }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            if (requestCode == File) {
                if (resultCode == RESULT_OK) {
                    val FileUri = data!!.data
                    val alphabet = 'a'..'z'
                    var formatTemplate = "%s%s%s%s%s%s%s%s"
                    val nombreArchivo = formatTemplate.format(
                        alphabet.random(), alphabet.random(),
                        alphabet.random(), alphabet.random(), alphabet.random(), alphabet.random(),
                        alphabet.random(), alphabet.random(),
                    )
                    val Folder: StorageReference =
                        FirebaseStorage.getInstance().getReference().child("FotoEmpresa")
                    val file_name: StorageReference =
                        Folder.child(nombreArchivo + FileUri!!.lastPathSegment)
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
                            cambios = true
                        }
                    }
                }
            }
    }
}
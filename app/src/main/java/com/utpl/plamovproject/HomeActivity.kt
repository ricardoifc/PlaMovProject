package com.utpl.plamovproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_home.*

enum class ProviderType {
    BASIC
}


class HomeActivity : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        cargarInfo(email?:"", provider?:"")
        refrescar(email?:"", provider?:"")
        Handler().postDelayed(Runnable {
            //----------------------------
            refrescar(email?:"", provider?:"")
            //----------------------------
        }, 3000)
        setup(email?:"", provider?:"")


    }

    private fun cargarInfo(email:String, provider:String){
        db.collection(email).document("Empresa").get().addOnSuccessListener {
            db.collection(email).document("Empresa").get().addOnSuccessListener {
                if (it.get("urlImgagenEmpresa") as String? != "" ){
                    Glide.with(this)
                        .load(it.get("urlImgagenEmpresa") as String?) // uri.toString es el link que guardo
                        .fitCenter()
                        .centerCrop()
                        .into(empresa_image)
                }
                if (it.get("nombreDeEmpresa") as String? != "" ){
                    nameEmpresa.setText(it.get("nombreDeEmpresa") as String?)
                }
            }


        }


    }

    private fun setup(email:String, provider:String){

        ediIconBtn.setOnClickListener{
            val EditIntent: Intent = Intent(this,EditEmpresaActivity::class.java).apply {

                putExtra("email", email)
                putExtra("provider", provider)

            }
            finish()
            startActivity(EditIntent)
        }

        btn01.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form01Intent: Intent = Intent(this,Form01::class.java).apply {

                putExtra("email", email)
                putExtra("provider", provider)

            }
            finish()
            startActivity(form01Intent)
        }

        btn02.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form02Intent: Intent = Intent(this,Form02::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish()
            startActivity(form02Intent)

        }
        btn03.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form03Intent: Intent = Intent(this,Form03::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form03Intent)
        }
        btn04.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form04Intent: Intent = Intent(this,Form04::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form04Intent)
        }

        btn06.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form06Intent: Intent = Intent(this,Form06::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form06Intent)
        }
        btn07.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form07Intent: Intent = Intent(this,Form07::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form07Intent)
        }
        btn08.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form08Intent: Intent = Intent(this,Form08::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form08Intent)
        }
        btn09.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form09Intent: Intent = Intent(this,Form09::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form09Intent)
        }
        btn10.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form10Intent: Intent = Intent(this,Form10::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form10Intent)
        }
        btn11.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form11Intent: Intent = Intent(this,Form11::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form11Intent)
        }
        btn12.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form12Intent: Intent = Intent(this,Form12::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form12Intent)
        }
        btn13.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form13Intent: Intent = Intent(this,Form13::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form13Intent)
        }
        btn14.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form14Intent: Intent = Intent(this,Form14::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form14Intent)
        }

        btn16.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form16Intent: Intent = Intent(this,Form16::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form16Intent)
        }
        btn17.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form17Intent: Intent = Intent(this,Form17::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form17Intent)
        }
        btn18.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form18Intent: Intent = Intent(this,Form18::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form18Intent)
        }
        btn19.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form19Intent: Intent = Intent(this,Form19::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form19Intent)
        }

        btn21.setOnClickListener{
            refrescar(email?:"", provider?:"")

            val form21Intent: Intent = Intent(this,Form21::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form21Intent)
        }
        btn22.setOnClickListener{
            refrescar(email?:"", provider?:"")
            val form22Intent: Intent = Intent(this,Form22::class.java).apply {
                putExtra("email", email)
                putExtra("provider", provider)
            }
            finish();
            startActivity(form22Intent)
        }

        btn_salir.setOnClickListener{
            finish();
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }


    }
    fun refrescar(email: String, provider: String) {


        db.collection(email).document("fo01").get().addOnSuccessListener {

            if (it.get("completef01") == "true") {
                cb01.setChecked(true)
                cb01.setText("Completo     ")
            }else{
                cb01.setChecked(false)
                cb01.setText("Incompleto")
            }
        }

        db.collection(email).document("fo02").get().addOnSuccessListener {

            if (it.get("completef02") == "true") {
                cb02.setChecked(true)
                cb02.setText("Completo     ")
            }else{
                cb02.setChecked(false)
                cb02.setText("Incompleto")
            }
        }

        db.collection(email).document("fo03").get().addOnSuccessListener {

            if (it.get("completef03") == "true") {
                cb03.setChecked(true)
                cb03.setText("Completo     ")
            }else{
                cb03.setChecked(false)
                cb03.setText("Incompleto")
            }
        }

        db.collection(email).document("fo04").get().addOnSuccessListener {

            if (it.get("completef04") == "true") {
                cb04.setChecked(true)
                cb04.setText("Completo     ")
            }else{
                cb04.setChecked(false)
                cb04.setText("Incompleto")
            }
        }


        db.collection(email).document("fo06").get().addOnSuccessListener {

            if (it.get("completef06") == "true") {
                cb06.setChecked(true)
                cb06.setText("Completo     ")
            }else{
                cb06.setChecked(false)
                cb06.setText("Incompleto")
            }
        }

        db.collection(email).document("fo07").get().addOnSuccessListener {

            if (it.get("completef07") == "true") {
                cb07.setChecked(true)
                cb07.setText("Completo     ")
            }else{
                cb07.setChecked(false)
                cb07.setText("Incompleto")
            }
        }

        db.collection(email).document("fo08").get().addOnSuccessListener {

            if (it.get("completef08") == "true") {
                cb08.setChecked(true)
                cb08.setText("Completo     ")
            }else{
                cb08.setChecked(false)
                cb08.setText("Incompleto")
            }
        }

        db.collection(email).document("fo09").get().addOnSuccessListener {

            if (it.get("completef09") == "true") {
                cb09.setChecked(true)
                cb09.setText("Completo     ")
            }else{
                cb09.setChecked(false)
                cb09.setText("Incompleto")
            }
        }

        db.collection(email).document("fo10").get().addOnSuccessListener {

            if (it.get("completef10") == "true") {
                cb10.setChecked(true)
                cb10.setText("Completo     ")
            }else{
                cb10.setChecked(false)
                cb10.setText("Incompleto")
            }
        }

        db.collection(email).document("fo11").get().addOnSuccessListener {

            if (it.get("completef11") == "true") {
                cb11.setChecked(true)
                cb11.setText("Completo     ")
            }else{
                cb11.setChecked(false)
                cb11.setText("Incompleto")
            }
        }

        db.collection(email).document("fo12").get().addOnSuccessListener {

            if (it.get("completef12") == "true") {
                cb12.setChecked(true)
                cb12.setText("Completo     ")
            }else{
                cb12.setChecked(false)
                cb12.setText("Incompleto")
            }
        }

        db.collection(email).document("fo13").get().addOnSuccessListener {

            if (it.get("completef13") == "true") {
                cb13.setChecked(true)
                cb13.setText("Completo     ")
            }else{
                cb13.setChecked(false)
                cb13.setText("Incompleto")
            }
        }

        db.collection(email).document("fo14").get().addOnSuccessListener {

            if (it.get("completef14") == "true") {
                cb14.setChecked(true)
                cb14.setText("Completo     ")
            }else{
                cb14.setChecked(false)
                cb14.setText("Incompleto")
            }
        }


        db.collection(email).document("fo16").get().addOnSuccessListener {

            if (it.get("completef16") == "true") {
                cb16.setChecked(true)
                cb16.setText("Completo     ")
            }else{
                cb16.setChecked(false)
                cb16.setText("Incompleto")
            }
        }

        db.collection(email).document("fo17").get().addOnSuccessListener {

            if (it.get("completef17") == "true") {
                cb17.setChecked(true)
                cb17.setText("Completo     ")
            }else{
                cb17.setChecked(false)
                cb17.setText("Incompleto")
            }
        }

        db.collection(email).document("fo18").get().addOnSuccessListener {

            if (it.get("completef18") == "true") {
                cb18.setChecked(true)
                cb18.setText("Completo     ")
            }else{
                cb18.setChecked(false)
                cb18.setText("Incompleto")
            }
        }

        db.collection(email).document("fo19").get().addOnSuccessListener {

            if (it.get("completef19") == "true") {
                cb19.setChecked(true)
                cb19.setText("Completo     ")
            }else{
                cb19.setChecked(false)
                cb19.setText("Incompleto")
            }
        }


        db.collection(email).document("fo21").get().addOnSuccessListener {

            if (it.get("completef21") == "true") {
                cb21.setChecked(true)
                cb21.setText("Completo     ")
            }else{
                cb21.setChecked(false)
                cb21.setText("Incompleto")
            }
        }

        db.collection(email).document("fo22").get().addOnSuccessListener {

            if (it.get("completef22") == "true") {
                cb22.setChecked(true)
                cb22.setText("Completo     ")
            }else{
                cb22.setChecked(false)
                cb22.setText("Incompleto")
            }
        }




    }
}
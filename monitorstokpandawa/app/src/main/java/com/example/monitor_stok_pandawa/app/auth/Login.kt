package com.example.monitor_stok_pandawa.auth

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gudang_model.content.toastWarning
import com.example.monitor_stok_pandawa.R
import com.example.monitor_stok_pandawa.databinding.LoginActivityBinding
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    private lateinit var bind : LoginActivityBinding
    private lateinit var auth: FirebaseAuth
    var GPS = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        auth = FirebaseAuth.getInstance()

        //cek profil user
        if (auth.currentUser!=null) {

            if (GPS){

//                startActivity(Intent(this, Home::class.java))
//                finish()

            } else {



            }


        } else {
            if (GPS){

//                startActivity(Intent(this, Home::class.java))
//                finish()

            } else {



            }
        }

        initView()
    }

    private fun initView() {
        bind.daftar.setOnClickListener {


            toastWarning("Silahkan hubungi Lukman Jika ingin mendaftar")
//            if (GPS) {
//
//                val intent = Intent(this, GetLocationRegist::class.java)
//                startActivity(intent)
//
//            } else {
//                toastWarning("Silahkan nyalakan GPS terlebih dahulu.")
//            }
        }

        bind.login.setOnClickListener {

            prosesLogin()

//            locationPermissionRequest.launch(arrayOf(
//                Manifest.permission.ACCESS_FINE_LOCATION,
//                Manifest.permission.ACCESS_COARSE_LOCATION))

//            if (GPS) {
//
//                prosesLogin()
//
//            } else {
//                toastWarning("Silahkan nyalakan GPS terlebih dahulu.")
//            }
        }
    }

    private fun prosesLogin() {



    }
}
package com.example.monitor_stok_pandawa.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monitor_stok_pandawa.R
import com.example.monitor_stok_pandawa.databinding.LoginActivityBinding
import com.example.monitor_stok_pandawa.databinding.RegisterActivityBinding

class Register : AppCompatActivity() {

    private lateinit var bind : RegisterActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
    }
}
package com.example.dota2proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InfActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf2)
    }

    fun next(view: View)
    {
        val intent = Intent( this@InfActivity2, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}
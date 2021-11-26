package com.example.dota2proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AbaddonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abaddon)
    }

    fun Back(view: View)
    {
        val intent = Intent( this@AbaddonActivity, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}
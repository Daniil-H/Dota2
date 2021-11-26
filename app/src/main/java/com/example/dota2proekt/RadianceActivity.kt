package com.example.dota2proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RadianceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radiance)
    }

    fun Back(view: View)
    {
        val intent = Intent( this@RadianceActivity, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}
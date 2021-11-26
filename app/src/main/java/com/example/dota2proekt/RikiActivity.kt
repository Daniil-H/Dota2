package com.example.dota2proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RikiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riki)
    }

    fun Back(view: View)
    {
        val intent = Intent( this@RikiActivity, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}
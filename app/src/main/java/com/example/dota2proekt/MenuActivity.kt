package com.example.dota2proekt

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.dota2proekt.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_menu)

        navView.setupWithNavController(navController)
    }

    fun Abaddon(view: View)
    {
        val intent = Intent( this@MenuActivity, AbaddonActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun Riki(view: View)
    {
        val intent = Intent( this@MenuActivity, RikiActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun Radiance(view: View)
    {
        val intent = Intent( this@MenuActivity, RadianceActivity::class.java)
        startActivity(intent)
        finish()
    }
}
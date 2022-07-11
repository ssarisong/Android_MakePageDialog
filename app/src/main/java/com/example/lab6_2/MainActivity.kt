package com.example.lab6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lab6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var appbarc: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var nhf = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment

        val topDest = setOf(R.id.homeFragment, R.id.page1Fragment, R.id.page2Fragment)
        appbarc = AppBarConfiguration(topDest, binding.drawerLayout)
        setupActionBarWithNavController(nhf.navController, appbarc)
        binding.navigationView.setupWithNavController(nhf.navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.fragment).navigateUp(appbarc) || super.onSupportNavigateUp()
    }
}
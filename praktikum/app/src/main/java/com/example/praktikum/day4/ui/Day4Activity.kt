package com.example.praktikum.day4.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.praktikum.R
import com.example.praktikum.databinding.ActivityDay4Binding

class Day4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityDay4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDay4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val navController = findNavController(R.id.nav_host_fragment)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.navView.isVisible = destination.id != R.id.day4DetailFragment
        }
        binding.navView.setupWithNavController(navController)
    }
}
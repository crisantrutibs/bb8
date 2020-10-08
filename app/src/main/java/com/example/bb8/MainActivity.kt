package com.example.bb8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(this, R.id.myNavHostFragment)
        setSupportActionBar(toolbar)
        val actionbar: ActionBar? = supportActionBar

        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }

        setupDrawerToggle()

        NavigationUI.setupWithNavController(nav_view, navController)
    }

    private fun setupDrawerToggle() {
        val mDrawerToggle = object : ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.open, R.string.close) {}
        drawer_layout.addDrawerListener(mDrawerToggle)
        mDrawerToggle.syncState()
    }
}
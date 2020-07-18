package com.vaishali.careerapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class AnalyticalActivity : AppCompatActivity() {
    lateinit var toolbarAnalytical:Toolbar
    lateinit var btnAnalytical:Button
    lateinit var sharedPref:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analytical)
        toolbarAnalytical=findViewById(R.id.toolbarAnalytical)
        setSupportActionBar(toolbarAnalytical)
        supportActionBar!!.title="Analytical Test"
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        btnAnalytical=findViewById(R.id.btnAnalytical)
        sharedPref=getSharedPreferences(getString(R.string.sharedPreference), Context.MODE_PRIVATE)
        btnAnalytical.setOnClickListener {
             startActivity(Intent(this@AnalyticalActivity,CategroyActivity::class.java))
        }
    }
}
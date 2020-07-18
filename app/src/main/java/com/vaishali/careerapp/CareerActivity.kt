package com.vaishali.careerapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import kotlin.coroutines.Continuation

class CareerActivity : AppCompatActivity() {
    lateinit var toolbarCareer:Toolbar
    lateinit var btnCareer:Button
    lateinit var sharedPref:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)
        toolbarCareer=findViewById(R.id.toolbarCareer)
        setSupportActionBar(toolbarCareer)
        supportActionBar!!.title="Career Personality Test"
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        sharedPref=getSharedPreferences(getString(R.string.sharedPreference), Context.MODE_PRIVATE)
        btnCareer=findViewById(R.id.btnCareer)
        btnCareer.setOnClickListener {
            sharedPref.edit().putString("Done1", "Completed1").apply()
            startActivity(Intent(this@CareerActivity, CategroyActivity::class.java))
        }
    }
}
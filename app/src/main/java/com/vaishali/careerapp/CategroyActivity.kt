package com.vaishali.careerapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast

class CategroyActivity : AppCompatActivity() {
    lateinit var rlayoutCareer:RelativeLayout
    lateinit var rlayoutAnalytical:RelativeLayout
    lateinit var sharedPref:SharedPreferences
    lateinit var btnStart: Button
    var check=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categroy)
        rlayoutAnalytical=findViewById(R.id.rlayoutAnalytical)
        rlayoutCareer=findViewById(R.id.rlayoutCareer)
        btnStart=findViewById(R.id.btnStart)
        sharedPref=getSharedPreferences(getString(R.string.sharedPreference), Context.MODE_PRIVATE)
        rlayoutCareer.setOnClickListener {
            check = "completed"
            startActivity(Intent(this@CategroyActivity, CareerActivity::class.java))
        }

            rlayoutAnalytical.setOnClickListener {
                startActivity(Intent(this@CategroyActivity,AnalyticalActivity::class.java))
            }
        btnStart.setOnClickListener {
            startActivity(Intent(this@CategroyActivity,SplashTwoActivity::class.java))
        }

    }


}
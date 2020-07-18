package com.vaishali.careerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import com.github.ybq.android.spinkit.style.FadingCircle

class SplashTwoActivity : AppCompatActivity() {
    lateinit var progressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_two)
        progressBar=findViewById(R.id.spin_kit)
        val fadingCircle=FadingCircle()
        progressBar.indeterminateDrawable=fadingCircle
        Handler().postDelayed({
            startActivity(Intent(this@SplashTwoActivity,ResultActivity::class.java))
        },3000)
    }
}
package com.vaishali.careerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var imgMail:ImageView
    lateinit var imgPerson:ImageView
    lateinit var imgContact:ImageView
    lateinit var imgCity:ImageView
    lateinit var etMail:TextInputEditText
    lateinit var etName:TextInputEditText
    lateinit var etContact:TextInputEditText
    lateinit var etCity:TextInputEditText
    lateinit var btnGetStarted:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgMail=findViewById(R.id.imgMail)
        imgPerson=findViewById(R.id.imgPerson)
        imgContact=findViewById(R.id.imgCall)
        imgCity=findViewById(R.id.imgAddress)
        etMail=findViewById(R.id.etMail)
        etName=findViewById(R.id.etName)
        etContact=findViewById(R.id.etContact)
        etCity=findViewById(R.id.etCity)
        btnGetStarted=findViewById(R.id.btnGetStarted)
        etMail.setOnFocusChangeListener { v, hasFocus ->  imgMail.setBackgroundResource(R.drawable.highlight)
            imgPerson.setBackgroundResource(0)
            imgContact.setBackgroundResource(0)
            imgCity.setBackgroundResource(0)
        }
        etName.setOnFocusChangeListener { v, hasFocus ->  imgMail.setBackgroundResource(0)
            imgPerson.setBackgroundResource(R.drawable.highlight)
            imgContact.setBackgroundResource(0)
            imgCity.setBackgroundResource(0)
        }
        etContact.setOnFocusChangeListener { v, hasFocus ->  imgMail.setBackgroundResource(0)
            imgPerson.setBackgroundResource(0)
            imgContact.setBackgroundResource(R.drawable.highlight)
            imgCity.setBackgroundResource(0)
        }
        etCity.setOnFocusChangeListener { v, hasFocus ->  imgMail.setBackgroundResource(0)
            imgPerson.setBackgroundResource(0)
            imgContact.setBackgroundResource(0)
            imgCity.setBackgroundResource(R.drawable.highlight)
        }
        btnGetStarted.setOnClickListener {
            val intent= Intent(this@MainActivity,CategroyActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnA: Button = findViewById(R.id.btnA)
        btnA.setOnClickListener()
        {
        //variable name : Data Type , this is to redirect the button A to another page
        val intentA: Intent = Intent(this, AboutActivity::class.java)

                                    //key
            intentA.putExtra("StudentName","John")

            startActivity(intentA)
        }

        val btnB: Button = findViewById(R.id.btnB)
        btnB.setOnClickListener(){

           // val telNo = Uri.parse("tel:999")

            //action dial is to make a phone call
            //val intentB: Intent = Intent(Intent.ACTION_DIAL,telNo)

            val geo = Uri.parse("geo:3.1390,101.6869")
            val intentB: Intent = Intent(Intent.ACTION_VIEW,geo)
            startActivity(intentB)

        }

    }
}
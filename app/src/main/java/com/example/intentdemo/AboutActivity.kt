package com.example.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //pass value from activity to another activity
        val name = intent.getStringExtra("StudentName")

        val tvResult:TextView = findViewById(R.id.tvResult)
        tvResult.text = name

    }
}
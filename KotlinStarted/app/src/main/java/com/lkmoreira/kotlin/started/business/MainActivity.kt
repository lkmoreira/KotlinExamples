package com.lkmoreira.kotlin.started.business

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.lkmoreira.kotlin.started.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openNext = findViewById(R.id.open_next) as Button

        openNext.setOnClickListener {
            Toast.makeText(this, "Next Activity", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}

package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_home)
        val buttonView = findViewById<Button>(R.id.button9)

        buttonView.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent)
        }
    }

}
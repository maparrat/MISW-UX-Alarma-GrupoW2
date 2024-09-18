package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_first_page)
        val buttonView = findViewById<Button>(R.id.button2)

        buttonView.setOnClickListener {
            val intent = Intent(this, SingUp::class.java)
            startActivity(intent)
        }
    }

}
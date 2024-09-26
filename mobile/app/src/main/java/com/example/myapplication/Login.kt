package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_login)
        val buttonView = findViewById<Button>(R.id.button4)

        buttonView.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val buttonView1 = findViewById<Button>(R.id.button2)

        buttonView1.setOnClickListener {
            val intent = Intent(this, FirstPage::class.java)
            startActivity(intent)
        }
    }
}
package com.example.lab_exam_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button2_1 = findViewById<Button>(R.id.button2_1)
        button2_1.setOnClickListener {
            val intent2_1 = Intent(this, Mainmanu1::class.java)
            startActivity(intent2_1)
        }

        var button2_2 = findViewById<Button>(R.id.button2_2)
        button2_2.setOnClickListener {
            val intent2_2 = Intent(this, CreateAcc::class.java)
            startActivity(intent2_2)
        }
    }
}
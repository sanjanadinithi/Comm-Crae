package com.example.lab_exam_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Mainmanu1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainmanu1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button6_1 = findViewById<Button>(R.id.button6_1)
        button6_1.setOnClickListener {
            val intent6_1 = Intent(this, Donation::class.java)
            startActivity(intent6_1)
        }

        var button6_2 = findViewById<Button>(R.id.button6_2)
        button6_2.setOnClickListener {
            val intent6_2 = Intent(this, Categories::class.java)
            startActivity(intent6_2)
        }

        var button6_3 = findViewById<Button>(R.id.button6_3)
        button6_3.setOnClickListener {
            val intent6_3 = Intent(this, Details1::class.java)
            startActivity(intent6_3)
        }

        var button6_6 = findViewById<Button>(R.id.button6_6)
        button6_6.setOnClickListener {
            val intent6_6 = Intent(this, profile::class.java)
            startActivity(intent6_6)
        }

        var button6_4 = findViewById<Button>(R.id.button6_4)
        button6_4.setOnClickListener {
            val button6_4 = Intent(this, Details1::class.java)
            startActivity(button6_4)
        }
    }

}
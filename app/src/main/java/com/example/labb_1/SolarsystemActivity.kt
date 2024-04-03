package com.example.labb_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SolarsystemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solarsystem)

        val nextButton = findViewById<Button>(R.id.homeNextBtn)
        val prevButton = findViewById<Button>(R.id.homePrevBtn)
        val logoutButton = findViewById<Button>(R.id.logoutBtn)

        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        nextButton.setOnClickListener {
            val intent = Intent(this, MoonActivity::class.java)
            startActivity(intent)
            finish()
        }

        prevButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
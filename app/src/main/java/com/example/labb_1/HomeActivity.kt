package com.example.labb_1


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val loggedInUserTextView = findViewById<TextView>(R.id.loggedInUser)
        val username = intent.getStringExtra("username")
        loggedInUserTextView.text = "Welcome, $username"
        val logoutButton = findViewById<Button>(R.id.logoutBtn)

        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val nextButton = findViewById<Button>(R.id.homeNextBtn)
        val prevButton = findViewById<Button>(R.id.homePrevBtn)

        nextButton.setOnClickListener {
            val intent = Intent(this, SolarsystemActivity::class.java)
            startActivity(intent)
            finish()
        }

        prevButton.setOnClickListener {
            val intent = Intent(this, MoonActivity::class.java)
            startActivity(intent)
            finish()
        }
    }



}

package com.example.labb_1


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val validUsernames = arrayOf("ester", "linus", "bruno")

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.username)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val enteredUsername = usernameEditText.text.toString()
            if (validUsernames.contains(enteredUsername)) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("username", enteredUsername)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    this,
                    "Invalid username. Please try again.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}

package com.shopping.e_commerce.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.shopping.e_commerce.R

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onclick(view: View) {
        login(
            findViewById<TextInputEditText>(R.id.edtUserName).text.toString(),
            findViewById<TextInputEditText>(R.id.edtPassword).text.toString()
        )
    }

    fun login(userName: String, password: String) {
        if (userName == "name" && password == "1234") {
            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.koshkarovalaba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent= Intent(this@Activity1, Activity2::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}
package com.example.koshkarovalaba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koshkarovalaba1.databinding.Activity2Binding
import com.example.koshkarovalaba1.databinding.Activity3Binding

private lateinit var binding: Activity3Binding
class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button2.setOnClickListener{
            val intent= Intent (this, Activity4::class.java)
            startActivity(intent)
        }

    }
}
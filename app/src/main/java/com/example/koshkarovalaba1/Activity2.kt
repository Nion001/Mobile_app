package com.example.koshkarovalaba1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.koshkarovalaba1.adapter.FerstAdapter
import com.example.koshkarovalaba1.databinding.Activity2Binding
import com.example.koshkarovalaba1.screens.SecondFragment


class Activity2 : AppCompatActivity() {



    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener{
            val intent= Intent (this, Activity3::class.java)
            startActivity(intent)
        }
        initial()


    }



    private fun initial(){
        binding.viewPager.adapter = FerstAdapter(this)
        binding.tabLayout.tabIconTint = null
    }
}
package com.example.koshkarovalaba1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.FragmentActivity
import com.example.koshkarovalaba1.adapter.FerstAdapter
import com.example.koshkarovalaba1.databinding.Activity2Binding


class Activity2 : FragmentActivity() {


    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent=Intent(this, Activity1::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
    private fun initial(){
        binding.viewPager.adapter = FerstAdapter(this)
        binding.tabLayout.tabIconTint = null
    }
}
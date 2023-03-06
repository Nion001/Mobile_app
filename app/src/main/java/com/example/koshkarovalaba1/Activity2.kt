package com.example.koshkarovalaba1

import android.os.Bundle
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
    }
    private fun initial(){
        binding.viewPager.adapter = FerstAdapter(this)
        binding.tabLayout.tabIconTint = null
    }
}
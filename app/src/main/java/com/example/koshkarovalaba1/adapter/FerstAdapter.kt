package com.example.koshkarovalaba1.adapter


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.koshkarovalaba1.screens.FerstFragment
import com.example.koshkarovalaba1.screens.SecondFragment
import com.example.koshkarovalaba1.screens.ThreeFragment

class FerstAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity)
{
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
        0 -> FerstFragment()
        1 -> SecondFragment()
        else -> ThreeFragment()}
    }

}
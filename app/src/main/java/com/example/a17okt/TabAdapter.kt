package com.example.a17okt

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> RegisterFragment()
            1 -> LoginFragment()

            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
    override fun getCount(): Int {
        return 2 //ganti jadi 2 kalo fragment nya 2
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Register"
            1 -> "Login"
            else -> null
        }
    }
}
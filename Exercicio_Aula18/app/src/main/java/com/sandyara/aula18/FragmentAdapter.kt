package com.sandyara.aula18

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    //viewPager2
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
       return when (position){
           1 -> SecondFragment()
           else -> FirstFragment()
       }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            1 -> "Segundo"
            else -> "Primeiro"
        }
    }

}
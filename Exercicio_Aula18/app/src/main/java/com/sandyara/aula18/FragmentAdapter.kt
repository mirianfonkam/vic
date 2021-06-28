package com.sandyara.aula18

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment = FirstFragment()
        if(position == 0){
            fragment = FirstFragment()
        } else if(position == 1){
            fragment = SecondFragment()
        }

        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var tabPageTitle: String = ""
        if(position == 0){
            tabPageTitle = "Primeiro"
        } else if(position == 1){
            tabPageTitle = "Segundo"
        }

        return tabPageTitle
    }

}
package com.sandyara.aula18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity(R.layout.activity_home) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vpFragment = findViewById<ViewPager>(R.id.vpFragment)
        vpFragment.adapter = FragmentAdapter(supportFragmentManager)
        val tblMenu = findViewById<TabLayout>(R.id.tblMenu)
        tblMenu.setupWithViewPager(vpFragment)
    }
}
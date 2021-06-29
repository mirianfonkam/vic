package com.sandyara.aula18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val vwpFragment = findViewById<ViewPager>(R.id.vwpFragment)
        vwpFragment.adapter = FragmentAdapter(supportFragmentManager)
        val tblMenu = findViewById<TabLayout>(R.id.tblMenu)
        tblMenu.setupWithViewPager(vwpFragment)
    }
}
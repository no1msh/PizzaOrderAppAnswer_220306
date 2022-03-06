package com.example.pizzaorderappanswer_220306

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pizzaorderappanswer_220306.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {

        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

        mainViewPager.offscreenPageLimit = 3
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}
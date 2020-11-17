package com.reo.running.realintention

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val korasyo = supportFragmentManager.beginTransaction()
        korasyo.add(R.id.fragment_box,firstFragment)
        korasyo.commit()
    }
}
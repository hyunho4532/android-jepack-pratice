package com.hyun.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThirdActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val transition = manager.beginTransaction()
        val fragment = TestSecondFragment()

        transition.replace(R.id.frameArea, fragment)
        transition.addToBackStack(null)
        transition.commit()
    }
}
package com.hyun.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val transition = manager.beginTransaction()
        val fragment = TestFirstFragment()

        transition.replace(R.id.frameArea, fragment)
        transition.addToBackStack(null)
        transition.commit()
    }
}
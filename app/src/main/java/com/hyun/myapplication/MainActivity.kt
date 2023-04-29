package com.hyun.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hyun.myapplication.databinding.ActivityMainBinding
import com.hyun.myapplication.fragment.BlankFragment1
import com.hyun.myapplication.fragment.BlankFragment2
import com.hyun.myapplication.viewModel.MainViewModel
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private var mainViewModel = MainViewModel()

    private lateinit var binding : ActivityMainBinding

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btn1.setOnClickListener {
            val transaction1 = manager.beginTransaction()
            val fragment1 = BlankFragment1()
            transaction1.replace(R.id.frameArea, fragment1)
            transaction1.addToBackStack(null)
            transaction1.commit()
        }

        binding.btn2.setOnClickListener {
            val transaction2 = manager.beginTransaction()
            val fragment2 = BlankFragment2()
            transaction2.replace(R.id.frameArea, fragment2)
            transaction2.addToBackStack(null)
            transaction2.commit()
        }

        /*
        findViewById<Button>(R.id.btnArea).setOnClickListener {
            mainViewModel.plusLiveDataValue()
        }

        mainViewModel.testMutableLiveData.observe(this, Observer {
            findViewById<TextView>(R.id.textArea).text = mainViewModel.testMutableLiveData.value.toString()
        })
        */
    }
}
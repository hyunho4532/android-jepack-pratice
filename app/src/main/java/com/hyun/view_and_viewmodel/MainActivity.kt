package com.hyun.view_and_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.translation.TranslationRequest
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import com.hyun.view_and_viewmodel.databinding.ActivityMainBinding
import com.hyun.view_and_viewmodel.factory.MainViewModelFactory
import com.hyun.view_and_viewmodel.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var mainViewModel : MainViewModel
    private lateinit var viewModelFactory : MainViewModelFactory

    private val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModelFactory = MainViewModelFactory(5000)
        mainViewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        binding.resultArea.text = mainViewModel.getCount().toString()

        binding.plus.setOnClickListener {
            mainViewModel.plus()
            binding.resultArea.text = mainViewModel.getCount().toString()
        }

        binding.minus.setOnClickListener {
            mainViewModel.minus()
            binding.resultArea.text = mainViewModel.getCount().toString()
        }

        binding.showFragment.setOnClickListener {
            val transition = manager.beginTransaction()
            val fragment = TestFragment()

            transition.replace(R.id.showFragment, fragment)
            transition.addToBackStack(null)
            transition.commit()
        }
    }
}
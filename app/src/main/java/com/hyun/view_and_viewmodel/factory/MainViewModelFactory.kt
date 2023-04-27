package com.hyun.view_and_viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hyun.view_and_viewmodel.viewModel.MainViewModel

class MainViewModelFactory(private val num : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(num) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
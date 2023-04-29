package com.hyun.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel1 : ViewModel() {
    var _mutableCount = MutableLiveData(0)

    val liveCount : LiveData<Int>
        get() = _mutableCount

    fun plusCountValue() {
        _mutableCount.value = _mutableCount.value!!.plus(1)
    }
}
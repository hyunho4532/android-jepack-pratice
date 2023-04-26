package com.hyun.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.hyun.myapplication.databinding.FragmentTestSecondBinding

class TestSecondFragment : Fragment() {

    private lateinit var binding : FragmentTestSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test_second, container, false)

        binding.fragmentText.text = "변경된 텍스트"

        return binding.root
    }
}
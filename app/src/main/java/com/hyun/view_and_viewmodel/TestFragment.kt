package com.hyun.view_and_viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.hyun.view_and_viewmodel.databinding.FragmentTestBinding
import com.hyun.view_and_viewmodel.viewModel.MainViewModel
import com.hyun.view_and_viewmodel.viewModel.TestFragmentViewModel
import java.text.Bidi

class TestFragment : Fragment() {

    private lateinit var binding : FragmentTestBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)

        binding.fragmentTest.text = viewModel.getCount().toString()

        return binding.root
    }
}
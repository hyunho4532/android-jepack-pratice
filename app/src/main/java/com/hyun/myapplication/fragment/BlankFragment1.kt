package com.hyun.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hyun.myapplication.R
import com.hyun.myapplication.databinding.FragmentBlank1Binding
import com.hyun.myapplication.viewModel.BlankViewModel1

class BlankFragment1 : Fragment() {

    private var _binding : FragmentBlank1Binding? = null

    private val binding get() = _binding!!

    private lateinit var blankViewModel: BlankViewModel1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btn1.setOnClickListener {
            blankViewModel.plusCountValue()
        }

        blankViewModel.liveCount.observe(viewLifecycleOwner, Observer {
            binding.text1.text = it.toString()
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentBlank1Binding.inflate(inflater, container, false)

        blankViewModel = ViewModelProvider(this).get(BlankViewModel1::class.java)

        return binding.root
    }
}
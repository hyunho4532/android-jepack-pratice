package com.hyun.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyun.myapplication.databinding.FragmentTestFirstBinding

class TestFirstFragment : Fragment() {

    private var _binding : FragmentTestFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTestFirstBinding.inflate(inflater, container, false)

        val view = binding.root

        binding.fragmentText.text = "이거는 fragment Test!"

        return view
    }

}
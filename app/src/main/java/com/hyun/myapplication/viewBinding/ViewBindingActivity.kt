package com.hyun.myapplication.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.hyun.myapplication.R
import com.hyun.myapplication.adapter.CustomAdapter
import com.hyun.myapplication.databinding.ActivityViewBindingBinding
import com.hyun.myapplication.databinding.TextRowItemBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val array = ArrayList<String>()

        array.add("a")
        array.add("b")
        array.add("c")
        array.add("a")
        array.add("b")
        array.add("c")
        array.add("a")
        array.add("b")
        array.add("c")
        array.add("a")
        array.add("b")
        array.add("c")

        val customAdapter = CustomAdapter(array)

        val rv = binding.rv
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}
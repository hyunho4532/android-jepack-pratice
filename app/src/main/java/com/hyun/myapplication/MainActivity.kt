package com.hyun.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hyun.myapplication.adapter.CustomAdapter
import com.hyun.myapplication.data.Person
import com.hyun.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

// findViewById
// Kotlin Extensions

// DataBinding? ViewBinding? 차이점
// DataBinding: 이름처럼 데이터를 연결해주는 역할을 한다.
// DataBinding + LiveData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var testCount = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Data Binding */
        // binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*
        binding.dataBindingEx.text = "바뀐 텍스트"

        binding.dataBindingEx.setOnClickListener {
            val secondMoveIntent = Intent(this, ThirdActivity::class.java)
            startActivity(secondMoveIntent)
        }
        */

        // val person = Person("이현호", 20)
        // binding.user = person

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

        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)

        /* View Binding */
        // binding = ActivityMainBinding.inflate(layoutInflater)
        // val view = binding.root
        // setContentView(view)

        // binding.testText.text = "이거는 변경된 텍스트"

        /*
        binding.testText.setOnClickListener {
            val secondMoveIntent = Intent(this, SecondActivity::class.java)
            startActivity(secondMoveIntent)
        }
        */
        /* 여기까지가 View Binding 학습 */

        // val btn1: Button = findViewById(R.id.btn1)
        // btn1.text = "abcd"

        // val btn2: Button = findViewById(R.id.btn2)
        // btn2.text = "abcd"

        // val btn3: Button = findViewById(R.id.btn3)
        // btn3.text = "abcd"

        // Kotlin Extensions
        // btn1.text = "abcd"
        // btn2.text = "abcd"
        // btn3.text = "abcd"
    }

    /*
    fun myClick(view : View) {
        Log.d("MainActivity", "onClick")
        testCount++

        val person = Person("이현호", testCount)
        binding.user = person
    }
    */
}
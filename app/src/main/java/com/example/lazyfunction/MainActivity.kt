package com.example.lazyfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    val lazyDeger: String by lazy {
        println("Hello")
        "World"
    }

    val pi: Float by lazy { 3.14f }





    fun control(view : View) {

        resultText.text = "$lazyDeger"
    }
    fun control2(view : View) {

        resultText.text = "$pi"
    }



}
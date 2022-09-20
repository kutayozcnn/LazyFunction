package com.example.lazyfunction

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.ReadOnlyProperty
import kotlin.random.Random
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val randomInt by RandomNum()

    val lazyDeger: String by lazy {
        println("Hello")
        "World"
    }
    val pi: Float by lazy { 3.14f }

    fun control(view : View) {
        resultText.text = "$lazyDeger"
        resultText2.text = ""
    }

    fun control2(view : View) {
        resultText.text = "$pi"
        resultText2.text = " "
    }
    fun control3(view: View){
        resultText.text= "$randomInt"
        resultText2.text = "$randomInt"
    }
}



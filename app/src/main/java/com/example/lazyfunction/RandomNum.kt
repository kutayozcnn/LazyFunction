package com.example.lazyfunction

import android.view.View
import kotlin.properties.ReadOnlyProperty
import kotlin.random.Random
import kotlin.reflect.KProperty


public class RandomNum : ReadOnlyProperty<Any, Int>  {

    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return Random.nextInt()
    }
}
class Application {
    val randomInt by RandomNum()
}
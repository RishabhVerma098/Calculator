package com.example.verma0987.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val R = commit()
        println("A+B = $R")

    }

    fun commit(): Int {
        println("Hello calulator")
        val a:Int = 10
        val b:Int = 9
        val c = a+b
        return c
    }


}

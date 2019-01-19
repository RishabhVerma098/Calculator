package com.example.verma0987.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        output.text = commit()
    }




    fun add(view: View){
        var a = num1.text.toString().toInt()
        var b = num2.text.toString().toInt()
        result.text = (a+b).toString()
    }





    fun commit(): String {
        println("Hello calulator")
        val a:Int = 10
        val b:Int = 9
        val c = a+b
        return ("For eg .. Sum of $a and $b is = $c")
    }


}

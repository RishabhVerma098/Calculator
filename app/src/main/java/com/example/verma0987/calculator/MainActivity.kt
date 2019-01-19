package com.example.verma0987.calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }




    fun add(view: View){
        var a = num1.text.toString().toInt()
        var b = num2.text.toString().toInt()
        result.text = (a+b).toString()
    }

    fun mul(view: View){
        var a = num1.text.toString().toInt()
        var b = num2.text.toString().toInt()
        result.text = (a*b).toString()

    }
    fun div(view: View){
        var a = num1.text.toString().toFloat()
        var b = num2.text.toString().toFloat()
        val message:String = "yo deno cannot be zero"

        try {
            result.text = (a/b).toString()
        }catch (e:ArithmeticException){
            Toast.makeText(this , message, Toast.LENGTH_SHORT).show()
            num2.text.clear()
        }



    }
    fun sub(view: View){
        var a = num1.text.toString().toInt()
        var b = num2.text.toString().toInt()
        result.text = (a-b).toString()

    }




    fun secondActivity(view: View){

        val intent = Intent(applicationContext,SecondPage::class.java)

        intent.putExtra("input",result.text.toString())
        startActivity(intent)



    }










}

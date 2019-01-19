package com.example.verma0987.calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second_page.*

class SecondPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val intent = intent
        val ans:String = intent.getStringExtra("input")
        TextView.text = "Result: $ans"

    }



    fun goback(view: View){

        val page = Intent(applicationContext,MainActivity::class.java)
        startActivity(page)


    }



}



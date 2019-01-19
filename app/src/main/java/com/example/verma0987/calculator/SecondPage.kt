package com.example.verma0987.calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
    }



    fun goback(view: View){

        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)

    }



}



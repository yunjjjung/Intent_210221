package com.thejoeun.intent_210221

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        moveToFirstActivityBtn.setOnClickListener { 
            
//            firstActivity로 넘어가기

            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent) //비행기 발권할 때 myIntent를 가져가겟다

        }
    }
}
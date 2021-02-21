package com.thejoeun.intent_210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        backToMainBtn.setOnClickListener {

//            이전 화면으로 돌아가기 => 현재 화면 종료
            finish()

        }
    }
}
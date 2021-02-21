package com.thejoeun.intent_210221

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edt_nickname.*

class EdtNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edt_nickname)

        okBtn.setOnClickListener {

//            입력한 닉네임 전달 => 입력한 변수로 저장
            val inputNickname = newNicknameEdt.text.toString()

//            데이터 첨부 전용 Intent 생성
//            복귀용이므로 출발/ 도착지 정보 필요 없다. 빈칸 유지
            val resultIntent = Intent()
            resultIntent.putExtra("nick",inputNickname)

//            확인버튼을 누른게 맞다 명시 + 그때 들고갈 데이터 첨부
//            이 화면에 온 결과를 세팅
            setResult(Activity.RESULT_OK,resultIntent)

//            실제로 이전 화면으로 복귀
            finish()


        }


    }
}
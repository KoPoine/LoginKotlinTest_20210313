package com.example.loginkotlintest_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼 클릭 이벤트



//        그안에서
//        1. 아이디 / 비번에 적힌 값 => 변수2개로 저장

        val inputId = idEdt.text.toString()
        val inputPw = pwEdt.text.toString()

//        2. 두 변수를 갖고 조건문 활용


    }
}
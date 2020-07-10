package com.example.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // https://www.flaticon.com 구글로 들어가면 아이콘 이쁜거마늠 다운받아서
        // 복사한다음 drawable에 붙여넣기해서 design들어가서 srcCompat부분에다 입력

        btn_toast.setOnClickListener {
            //이미지 체인지
            iv_profile.setImageResource(R.drawable.bot) // 이미지 뷰에 새로운 이미지 등록 : 형식 외우기
            Toast.makeText(this@MainActivity, "안녕하세요 토스트예요", Toast.LENGTH_SHORT).show()
            //위의 형식 외우기


        }










    }
}
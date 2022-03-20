package com.example.genshin_impact_dps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      hutao_select.setOnClickListener {

          val intent = Intent(this, hutao_dps_cal::class.java)//다음 화면 이동 위한 인텐트 객체 선언
          startActivity(intent)

      }
    }
}
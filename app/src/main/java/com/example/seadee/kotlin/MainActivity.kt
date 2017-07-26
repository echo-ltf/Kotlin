package com.example.seadee.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "你好！"
        btn.text = "点击按钮"
        btn.setOnClickListener {
            Toast.makeText(this,"这是按钮",Toast.LENGTH_SHORT).show()
        }

    }
}

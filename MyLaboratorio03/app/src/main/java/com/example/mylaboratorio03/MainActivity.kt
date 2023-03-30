package com.example.mylaboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var count = 0.00
    private lateinit var countMoney: TextView
    private lateinit var clickFiveCtv: ImageView
    private lateinit var clickTenCtv: ImageView
    private lateinit var displayFiveCtv: TextView
    private lateinit var displayTenCtv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bin()
        onListener()
    }

    fun bin(){
        clickFiveCtv = findViewById(R.id.five_ctvs_image)
        displayFiveCtv = findViewById(R.id.five_ctvs_text)
        clickTenCtv = findViewById(R.id.ten_ctvs_image)
        displayTenCtv = findViewById(R.id.ten_ctvs_text)
        countMoney = findViewById(R.id.count_text)
    }

    fun onListenerFiveCtv(){
        clickFiveCtv.setOnClickListener{
            count += displayFiveCtv.text.toString().toFloat()
            countMoney.setText("$"+String.format("%.2f", count).toFloat().toString())
        }
    }

    fun onListenerTenCtv(){
        clickTenCtv.setOnClickListener{
            count += displayTenCtv.text.toString().toFloat()
            countMoney.setText("$"+String.format("%.2f", count).toFloat().toString())
        }
    }

    fun onListener(){
        onListenerFiveCtv()
        onListenerTenCtv()
    }
}


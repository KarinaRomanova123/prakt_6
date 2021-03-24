package com.example.prakt6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)


        button.setOnClickListener {
            val random = Random.nextInt(100, 999) + 1
            val random2 = Random.nextInt(100, 999) + 1
            textView.text = random.toString()
            textView2.text = random2.toString()

            val num1 = random
            val num2 = random2

            if(num1<num2){
                //п-первое меньше второго
                textView3.text = "$num1 < $num2"

            }
            if(num1==num2){
                //п-первое равно второго
                textView3.text = "$num1 = $num2"
            }
            if(num1>num2){
                //п-первое больше второго
                textView3.text = "$num1 > $num2"
            }
        }
    }
}


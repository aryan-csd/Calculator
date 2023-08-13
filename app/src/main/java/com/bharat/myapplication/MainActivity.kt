package com.bharat.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.Add).setOnClickListener {
            findViewById<TextView>(R.id.Result).text =
                findViewById<EditText>(R.id.Num1).text.toString().trim().toBigDecimal().add(findViewById<EditText>(
                    R.id.Num2
                ).text.toString().trim().toBigDecimal()).toString()
        }
        findViewById<ImageButton>(R.id.Subtract).setOnClickListener {
            findViewById<TextView>(R.id.Result).text =
                findViewById<EditText>(R.id.Num1).text.toString().trim().toBigDecimal().subtract(findViewById<EditText>(
                    R.id.Num2
                ).text.toString().trim().toBigDecimal()).toString()
        }
        findViewById<ImageButton>(R.id.Multiply).setOnClickListener {
            findViewById<TextView>(R.id.Result).text =
                findViewById<EditText>(R.id.Num1).text.toString().trim().toBigDecimal().multiply(findViewById<EditText>(
                    R.id.Num2
                ).text.toString().trim().toBigDecimal()).toString()
        }
        findViewById<ImageButton>(R.id.Divide).setOnClickListener {
            findViewById<TextView>(R.id.Result).text =
                findViewById<EditText>(R.id.Num1).text.toString().trim().toBigDecimal().divide(findViewById<EditText>(
                    R.id.Num2
                ).text.toString().trim().toBigDecimal()).toString()
        }
    }

}
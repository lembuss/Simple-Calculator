package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
//         receive data from user
            var first_number = edFnum.text.toString()
            var second_number = edSnum.text.toString()

            if (first_number.isEmpty() or second_number.isEmpty()){
                tvAns.text = "Please fill all the inputs";
            }else{
//                now start implementing calculation
                var answer = first_number.toDouble() + second_number.toDouble()
                tvAns.text = answer.toString()
            }
        }

        btnSubtract.setOnClickListener{
//         receive data from user
            var first_number = edFnum.text.toString()
            var second_number = edSnum.text.toString()

            if (first_number.isEmpty() or second_number.isEmpty()){
                tvAns.text = "Please fill all the inputs";
            }else{
//                now start implementing calculation
                var answer = first_number.toDouble() - second_number.toDouble()
                tvAns.text = answer.toString()
            }
        }

        btnDivide.setOnClickListener{
//         receive data from user
            var first_number = edFnum.text.toString()
            var second_number = edSnum.text.toString()

            if (first_number.isEmpty() or second_number.isEmpty()){
                tvAns.text = "Please fill all the inputs";
            }else{
//                now start implementing calculation
                var answer = first_number.toDouble() / second_number.toDouble()
                tvAns.text = answer.toString()
            }
        }

        btnMultiply.setOnClickListener{
//         receive data from user
            var first_number = edFnum.text.toString()
            var second_number = edSnum.text.toString()

            if (first_number.isEmpty() or second_number.isEmpty()){
                tvAns.text = "Please fill all the inputs";
            }else{
//                now start implementing calculation
                var answer = first_number.toDouble() * second_number.toDouble()
                tvAns.text = answer.toString()
            }
        }
    }
}

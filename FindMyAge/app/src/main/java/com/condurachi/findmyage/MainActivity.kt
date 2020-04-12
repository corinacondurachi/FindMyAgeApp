package com.condurachi.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buGetAge.setOnClickListener {
            //Add code when the button click
            ButtonClick()

        }
    }

    fun ButtonClick() {
        val userDOB = Integer.parseInt(etDOB.text.toString())
        val CurrentYear = Calendar.getInstance().get(Calendar.YEAR)
        val UserAgeInYears = CurrentYear - userDOB
        tvShoeAge.text = "Your age is $UserAgeInYears years"
    }
}

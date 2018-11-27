package com.example.toru.second_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.awt.font.TextAttribute
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        val randomInt = random.nextInt(count+1)
        val randomText = findViewById<TextView>(R.id.textView_random)
        randomText.text = Integer.toString(randomInt)

        val labelText = findViewById<TextView>(R.id.textView_label)
        labelText.text = getString(R.string.random_heading, count)

    }
}

package com.sagardhadke.datapass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.Switch
import androidx.lifecycle.ReportFragment.Companion.reportFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val input = findViewById<EditText>(R.id.input_et)
        val btn = findViewById<Button>(R.id.button)
        val rate = findViewById<RatingBar>(R.id.ratingBar)


        btn.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val inputData = input.text.toString()
            val rating =  rate.rating.toFloat()

            val img = R.drawable.cycle
            val i = Intent(this,GetData::class.java)
            i.putExtra("img",img)
            i.putExtra("input",inputData)
            i.putExtra("rate",rating)
            startActivity(i)
        }

    }
}
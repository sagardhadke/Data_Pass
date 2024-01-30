package com.sagardhadke.datapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.core.view.isVisible

class GetData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_data)

        val img = findViewById<ImageView>(R.id.imageView2)
        val text1 = findViewById<TextView>(R.id.textView2)
        val ratebar2 = findViewById<RatingBar>(R.id.ratingBar2)


        val intent = intent
       val getinput = intent.getStringExtra("input")

        text1.text = getinput
        val rate = intent.getFloatExtra("rate", 0F)
        ratebar2.rating = rate

         val getImg = intent.getIntExtra("img",-1)
        img.setImageResource(getImg)


    }
}
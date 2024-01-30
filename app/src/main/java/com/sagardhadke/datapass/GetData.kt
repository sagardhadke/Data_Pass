package com.sagardhadke.datapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class GetData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_data)

        val name = intent.getStringExtra("name")
        val img = intent.getStringExtra("image")


        val nameText = findViewById<TextView>(R.id.textView2)
        nameText.text = name

    }
}
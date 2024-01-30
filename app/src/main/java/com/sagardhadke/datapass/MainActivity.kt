package com.sagardhadke.datapass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)
        val input = findViewById<EditText>(R.id.input_et)
        val btn = findViewById<Button>(R.id.button)


        btn.setOnClickListener {
            val i = Intent(this,GetData::class.java)
            startActivity(i)
            i.putExtra("name",input.text.toString())
            startActivity(Intent(this,GetData::class.java))
        }

    }
}
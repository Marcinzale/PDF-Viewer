package com.marcinzale.pdfviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var read_pdf_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        read_pdf_btn = findViewById(R.id.read_pdf_btn)
        read_pdf_btn.setOnClickListener{
            val intent = Intent(this@MainActivity, ViewPdfActivity)
        }
    }
}
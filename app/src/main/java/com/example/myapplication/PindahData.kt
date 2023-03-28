package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class PindahData : AppCompatActivity() {
    companion object{
        const val EXTRA_TEXT = "extra_text"
    }
    private lateinit var tvpenerima : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        tvpenerima=findViewById(R.id.pindahdata)
        val tvReceived=intent.getStringExtra(EXTRA_TEXT)
        val text = "Data yang dikirim : $tvReceived"

        tvpenerima.text=text
    }
}

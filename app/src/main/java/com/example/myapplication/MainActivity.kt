package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_pindah : Button
    private lateinit var    btn_data : Button
    private lateinit var    btn_objek : Button


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_pindah = findViewById(R.id.btn_pindah)
        btn_data = findViewById(R.id.btn_data)
        btn_objek = findViewById(R.id.btn_objek)

        btn_pindah.setOnClickListener(this)
        btn_data.setOnClickListener(this)
        btn_objek.setOnClickListener(this)

    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btn_pindah -> {
                val PindahIntent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(PindahIntent)
            }
                R.id.btn_data-> run{
                    val intentData = Intent(this@MainActivity, PindahData::class.java)
                    intentData.putExtra(PindahData.EXTRA_TEXT, "Perkenalkan saya rahmad")
                    startActivity(intentData)
                }
                R.id.btn_objek->run{
                    val cars = cars(
                        "Daihatsu",
                        2022,
                        "BM 3223 KAC",
                    )
                    val intentobjek = Intent(this@MainActivity, PindahObjek::class.java)
                    intentobjek.putExtra(PindahObjek.EXTRA_CARS,cars)
                    startActivity(intentobjek)
                }
            }
        }
    }

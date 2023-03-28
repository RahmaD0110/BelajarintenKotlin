package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahObjek : AppCompatActivity() {
    private lateinit var penerimaobjek : TextView

    companion object{
        const val EXTRA_CARS = "extra_cars"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        penerimaobjek=findViewById(R.id.PenerimaObjek)

        val cars: cars = intent.getParcelableExtra<cars>(EXTRA_CARS) as cars
        val text = "Merk: ${cars.merk.toString()} \nTahun: ${cars.tahun.toString()}\nPlat: ${cars.plat.toString()}"
        penerimaobjek.text = text
    }
}

package com.egeperk.kotlincityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.egeperk.kotlincityapp.databinding.ActivityCityDetailBinding
import kotlinx.android.synthetic.main.activity_city_detail.*

class CityDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        val landmark = intent.getSerializableExtra("city") as Cities
        binding.cityTextView.text = landmark.name
        binding.countryTextView.text = landmark.country
        binding.imageView.setImageResource(landmark.imageView)


    }
}
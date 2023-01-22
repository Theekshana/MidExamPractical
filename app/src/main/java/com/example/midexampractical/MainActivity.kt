package com.example.midexampractical

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.midexampractical.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val countries = listOf("argentina",
            "australia",
            "bangladesh",
            "canada",
            "china",
            "finland",
            "france",
            "great_britain",
            "great_britain",
            "india",
            "japan",
            "japan",
            "norway",
            "pakistan",
            "srilanka",
            "united_states")

        val flags = listOf(
            R.drawable.argentina,
            R.drawable.australia,
            R.drawable.bangladesh,
            R.drawable.canada,
            R.drawable.china,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.great_britain,
            R.drawable.india,
            R.drawable.japan,
            R.drawable.norway,
            R.drawable.pakistan,
            R.drawable.srilanka,
            R.drawable.united_states)

        binding.recyclerView.adapter = MyAdapter(countries, flags)

    }
}
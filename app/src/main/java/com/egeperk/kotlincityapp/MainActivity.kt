package com.egeperk.kotlincityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.egeperk.kotlincityapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding

    private lateinit var landmarksArrayList : ArrayList<Cities>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        landmarksArrayList = ArrayList<Cities>()


        val eiffel = Cities("Eiffel Kulesi","Fransa",R.drawable.eiffel)
        val pisa = Cities("Pisa Kulesi", "İtalya",R.drawable.pisa)
        val colessium = Cities("Kolezyum", "İtalya",R.drawable.colessium)
        val liberty = Cities("Özgürlük Anıtı", "ABD",R.drawable.liberty)
        val machu = Cities("Machu Pichu", "Peru",R.drawable.machupichu)
        val tacmahal = Cities("Tac Mahal", "Hindistan",R.drawable.tacmahal)
        val christ = Cities("Kurtarıcı İsa", "Brezilya",R.drawable.christ)


        landmarksArrayList.add(eiffel)
        landmarksArrayList.add(pisa)
        landmarksArrayList.add(colessium)
        landmarksArrayList.add(liberty)
        landmarksArrayList.add(machu)
        landmarksArrayList.add(tacmahal)
        landmarksArrayList.add(christ)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val cityAdapter = CityAdapter(landmarksArrayList)
        binding.recyclerView.adapter = cityAdapter
    }
}
package com.example.coffeshops

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var ratingAdapter: RatingAdapter
    private lateinit var ratings: MutableList<Float>
    private lateinit var images: List<Int>
    private lateinit var shopNames: List<String>
    private lateinit var subtitles: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        ratings = MutableList(7) { 0.0f }  // Inicializa una lista de 7 elementos con 0.0f

        // Lista de imágenes para cada tienda
        images = listOf(
            R.drawable.images, R.drawable.images1, R.drawable.images2,
            R.drawable.images3, R.drawable.images4, R.drawable.images5,
            R.drawable.images6
        )

        // Lista de nombres de las tiendas
        shopNames = listOf(
            "Antonio Caffè Greco", "Coffe Room", "Coffe Ibiza",
            "Pudding Coffe Shop", "L'Express", "Coffe Corner",
            "Sweet Cup"
        )

        // Lista de subtítulos para cada tienda
        subtitles = listOf(
            "St. Italy, Rome", "St. Germany, Berlin", "St. Colon, Madrid",
            "St. Diagonal, Barcelona", "St. Picadilly Circus, London", "St. Àngel Guimerà, Valencia", "St. Kinkerstraat, Amsterdam"
        )

        ratingAdapter = RatingAdapter(ratings, images, shopNames, subtitles)
        recyclerView.adapter = ratingAdapter
    }
}



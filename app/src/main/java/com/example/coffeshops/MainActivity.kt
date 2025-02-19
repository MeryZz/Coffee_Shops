package com.example.coffeshops

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Esta actividad principal es la que se muestra al abrir la aplicación.
 * En ella se muestra una lista de tiendas de café, cada una con una imagen y un nombre,
 * usando un RecyclerView. Los datos de las tiendas son configurados aquí y se pasan a un adaptador.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var ratingAdapter: RatingAdapter
    private lateinit var ratings: MutableList<Float>
    lateinit var images: List<Int>
    lateinit var shopNames: List<String>
    lateinit var subtitles: List<String>

    /**
     * Este método se llama cuando la actividad es creada. Aquí se configura el RecyclerView
     * y se inicializan los datos necesarios (listas de imágenes, nombres de tiendas, etc.).
     * Además, se asigna un adaptador al RecyclerView para mostrar los datos de manera correcta.
     */
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

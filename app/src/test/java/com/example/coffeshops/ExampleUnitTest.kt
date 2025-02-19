package com.example.coffeshops

import android.R
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Arrays


class ExampleUnitTest {

    @Test
    fun testMainActivityDataInitialization() {
        val activity: MainActivity =
            Robolectric.buildActivity(MainActivity::class.java).create().get()

        // Verificar la cantidad de elementos en las listas
        assertEquals(
            "La lista de nombres de tiendas debería contener 7 elementos",
            7,
            activity.shopNames.size
        )
        assertEquals("La lista de imágenes debería contener 7 elementos", 7, activity.images.size)
        assertEquals(
            "La lista de subtítulos debería contener 7 elementos",
            7,
            activity.subtitles.size
        )

        // Verificar los primeros valores en cada lista
        assertEquals(
            "El primer nombre de tienda debería ser 'Antonio Caffè Greco'", "Antonio Caffè Greco",
            activity.shopNames[0]
        )
        assertEquals(
            "El primer subtítulo debería ser 'St. Italy, Rome'", "St. Italy, Rome",
            activity.subtitles[0]
        )
        assertEquals(
            "La primera imagen debería ser 'images'",
            R.drawable.images,
            activity.images[0]
        )
    }

    @Test
    fun testRatingUpdate() {
        // Datos de prueba
        val ratings: List<Float> = ArrayList(mutableListOf(4.0f, 3.5f, 5.0f))
        val shopNames: List<String> = mutableListOf("Coffe Room", "Coffe Corner", "Sweet Cup")
        val images = Arrays.asList<Int>(R.drawable.images, R.drawable.images1, R.drawable.images2)
        val subtitles: List<String> = mutableListOf(
            "St. Italy, Rome",
            "St. Àngel Guimerà, Valencia",
            "St. Kinkerstraat, Amsterdam"
        )

        val adapter = RatingAdapter(ratings, images, shopNames, subtitles)
        val holder = RatingAdapter.ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_rating, null)
        )

        // Configurar la puntuación inicial
        holder.ratingBar.rating = 4.0f

        // Simular el cambio de puntuación
        holder.ratingBar.rating = 5.0f

        // Verificar que el texto de la puntuación ha sido actualizado
        assertEquals(
            "La puntuación debería ser 'Puntuación: 5.0'",
            "Puntuación: 5.0",
            holder.tvRating.text.toString()
        )
    }

    @Test
    fun testButtonsVisibilityInDetailFragment() {
        // Crear una instancia del fragmento
        val fragment = DetailFragment()

        // Configurar la vista
        val view = fragment.onCreateView(LayoutInflater.from(context), null, null)

        // Verificar que los botones sean visibles
        val btnSi = view!!.findViewById<Button>(R.id.btnSi)
        val btnNo = view!!.findViewById<Button>(R.id.btnNo)

        assertEquals("El botón 'Sí' debería ser visible", View.VISIBLE, btnSi.visibility)
        assertEquals("El botón 'No' debería ser visible", View.VISIBLE, btnNo.visibility)
    }


}
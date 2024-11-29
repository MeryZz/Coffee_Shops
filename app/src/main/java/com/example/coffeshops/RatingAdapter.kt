package com.example.coffeshops;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatRatingBar
import androidx.recyclerview.widget.RecyclerView

class RatingAdapter(
    private val ratings: List<Float>,
    private val images: List<Int>,
    private val shopNames: List<String>,  // Lista de nombres de las tiendas
    private val subtitles: List<String>   // Lista de subtítulos para cada tienda
) : RecyclerView.Adapter<RatingAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rating, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rating = ratings[position]
        val imageResId = images[position]  // Obtener el recurso de la imagen
        val shopName = shopNames[position] // Obtener el nombre de la tienda
        val subtitle = subtitles[position] // Obtener el subtítulo correspondiente

        // Establecer la imagen, nombre, subtítulo y calificación
        holder.imageView.setImageResource(imageResId)
        holder.tvNombre.text = shopName
        holder.tvSubtitulo.text = subtitle
        holder.ratingBar.rating = rating
        holder.tvRating.text = "Puntuación: $rating"

        // Actualizar la puntuación al cambiarla en el RatingBar
        holder.ratingBar.setOnRatingBarChangeListener { _, rating1, _ ->
            holder.tvRating.text = "Puntuación: $rating1"
        }
    }

    override fun getItemCount(): Int {
        return ratings.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvSubtitulo: TextView = itemView.findViewById(R.id.tvSubtitulo)  // Subtítulo
        val ratingBar: AppCompatRatingBar = itemView.findViewById(R.id.ratingBar)
        val tvRating: TextView = itemView.findViewById(R.id.tvRating)
    }
}


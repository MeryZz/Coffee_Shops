package com.example.coffeshops;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatRatingBar
import androidx.recyclerview.widget.RecyclerView

/**
 * Este adaptador se encarga de gestionar los datos y vistas para el RecyclerView que muestra
 * una lista de cafeterías, con su imagen, nombre, subtítulo y calificación.
 */
class RatingAdapter(
    private val ratings: List<Float>,
    private val images: List<Int>,
    private val shopNames: List<String>,
    private val subtitles: List<String>
) : RecyclerView.Adapter<RatingAdapter.ViewHolder>() {

    /**
     * Crea un nuevo ViewHolder para cada item del RecyclerView.
     * Se infla el layout del item y se pasa a la clase ViewHolder.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rating, parent, false)
        return ViewHolder(itemView)
    }

    /**
     * Asocia los datos a las vistas del ViewHolder en función de la posición del item.
     * Establece la imagen, nombre, subtítulo y calificación de la tienda.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rating = ratings[position]
        val imageResId = images[position]
        val shopName = shopNames[position]
        val subtitle = subtitles[position]

        // Establecer la imagen, nombre, subtítulo y calificación
        holder.imageView.setImageResource(imageResId)
        holder.tvNombre.text = shopName
        holder.tvSubtitulo.text = subtitle
        holder.ratingBar.rating = rating
        holder.tvRating.text = "Puntuación: $rating"

        // Manejar el clic en el nombre de la cafetería
        holder.tvNombre.setOnClickListener {
            // Crear una nueva instancia del fragmento de detalles
            val detailFragment = DetailFragment.newInstance(shopName, imageResId)

            // Realizar la transacción con animaciones
            val transaction = (holder.itemView.context as AppCompatActivity).supportFragmentManager.beginTransaction()

            // Animación de transición
            transaction.setCustomAnimations(
                R.anim.enter_from_right,  // Animación de entrada
                R.anim.exit_to_left,      // Animación de salida
            )

            // Reemplazar el fragmento actual con el nuevo fragmento
            transaction.replace(R.id.fragment_container, detailFragment)

            // Agregar la transacción a la pila de retroceso
            transaction.addToBackStack(null)

            // Ejecutar la transacción
            transaction.commit()
        }

        // Actualizar la puntuación al cambiarla en el RatingBar
        holder.ratingBar.setOnRatingBarChangeListener { _, rating1, _ ->
            holder.tvRating.text = "Puntuación: $rating1"
        }
    }

    /**
     * @return el número total de elementos en la lista de calificaciones.
     * Este valor es usado para determinar cuántos items deben mostrarse en el RecyclerView.
     */
    override fun getItemCount(): Int {
        return ratings.size
    }

    /**
     * Esta clase ViewHolder representa cada ítem en el RecyclerView. Se utiliza para almacenar
     * las vistas que componen cada item (imagen, nombre, subtítulo, RatingBar y la puntuación).
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvSubtitulo: TextView = itemView.findViewById(R.id.tvSubtitulo)  // Subtítulo
        val ratingBar: AppCompatRatingBar = itemView.findViewById(R.id.ratingBar)
        val tvRating: TextView = itemView.findViewById(R.id.tvRating)
    }
}

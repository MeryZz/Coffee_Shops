package com.example.coffeshops

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater

class DetailFragment : Fragment(R.layout.fragment_detail) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Cargar la vista del fragmento
        val view = super.onCreateView(inflater, container, savedInstanceState)

        // Recibir el nombre de la cafetería y la imagen desde el Bundle (si es necesario)
        val shopName = arguments?.getString("shop_name") ?: "Café Example"
        val shopImage = arguments?.getInt("shop_image") ?: R.drawable.images

        // Acceder a los elementos de la vista
        val shopNameTextView = view?.findViewById<TextView>(R.id.tvNombre)
        val imageView = view?.findViewById<ImageView>(R.id.imageView)

        // Configurar los elementos de la UI
        shopNameTextView?.text = shopName
        imageView?.setImageResource(shopImage)

        // Establecer la animación compartida (si es necesario)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            sharedElementEnterTransition = TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)
        }

        return view
    }

    companion object {
        // Función para crear una nueva instancia de este fragmento
        fun newInstance(shopName: String, shopImage: Int): DetailFragment {
            val fragment = DetailFragment()
            val bundle = Bundle()
            bundle.putString("shop_name", shopName)
            bundle.putInt("shop_image", shopImage)
            fragment.arguments = bundle
            return fragment
        }
    }
}
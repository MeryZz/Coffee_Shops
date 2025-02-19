package com.example.coffeshops

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater

/**
 * Este fragmento se encarga de mostrar los detalles de la tienda de café seleccionada,
 * incluyendo su nombre y una imagen representativa. Además, maneja la animación compartida
 * entre actividades y la visibilidad de ciertos elementos de la UI.
 */
class DetailFragment : Fragment(R.layout.fragment_detail) {

    /**
     * Este método se ejecuta cuando se crea la vista del fragmento.
     * Se infla el layout y se recuperan los datos (nombre y imagen) que se pasan a través de un Bundle.
     * Además, configura los elementos de la interfaz con esos datos.
     * @return La vista.
     */
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
        val shopNameTextView = view?.findViewById<TextView>(R.id.shopNameTextView)
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

    /**
     * Este método se llama después de que la vista haya sido completamente creada.
     * Aquí se configuran ciertos elementos adicionales, como la visibilidad de los botones de la interfaz.
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnSi)?.apply {
            visibility = View.VISIBLE
        }

        view.findViewById<Button>(R.id.btnNo)?.apply {
            visibility = View.VISIBLE
        }
    }

    /**
     * Este método estático se utiliza para crear una nueva instancia de DetailFragment.
     * A través de un Bundle, se pasan el nombre de la tienda y la imagen a mostrar en el fragmento.
     * @return El fragmento.
     */
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

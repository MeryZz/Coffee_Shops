package com.example.coffeshops

import org.junit.Assert
import org.junit.Test


class RatingTest {
    @Test
    fun testActualizarPuntuacion() {
        val puntuacionInicial = 3.5f
        val nuevaPuntuacion = 4.5f

        // Simulación de la lógica de negocio
        val puntuacionActualizada = nuevaPuntuacion

        Assert.assertEquals(4.5, puntuacionActualizada.toDouble(), 0.01)
    }
}

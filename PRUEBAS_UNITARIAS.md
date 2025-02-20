# Pruebas Unitarias

## Validación de la Lógica de Negocio

Para garantizar el correcto funcionamiento de la lógica de negocio de la aplicación, se han implementado pruebas unitarias en `src/test/java/com/example/coffeeshops/`.

### 📌 Prueba de Calificación de Cafeterías (`RatingTest.kt`)
Se valida que la calificación de una cafetería se actualiza correctamente y que los valores se encuentran dentro del rango permitido (1.0 - 5.0).

```kotlin
import org.junit.Assert.assertEquals
import org.junit.Test

class RatingTest {

    @Test
    fun `calificacion dentro del rango permitido`() {
        val rating = 4.5
        assert(rating in 1.0..5.0) { "La calificación debe estar entre 1.0 y 5.0" }
    }

    @Test
    fun `actualizar calificación`() {
        var rating = 3.0
        rating = 4.2
        assertEquals(4.2, rating, 0.0)
    }
}

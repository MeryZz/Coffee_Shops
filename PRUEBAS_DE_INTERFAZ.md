# Pruebas de Interfaz con Espresso para Comprobar la Usabilidad

## Validación de la Usabilidad de la Interfaz

Para garantizar que la interfaz de usuario de la aplicación sea funcional y fácil de usar, se han implementado pruebas de interfaz utilizando **Espresso**. Estas pruebas aseguran que los elementos de la UI (como botones, campos de texto, etc.) se comporten correctamente, se muestren como se espera y permitan una navegación fluida.

Las pruebas se encuentran en `src/androidTest/java/com/example/coffeeshops/` y cubren aspectos como la interacción con los botones, la visualización de los elementos, y la navegación entre pantallas.

### Prueba de Interacción con el Botón de Calificación (`RatingButtonTest.kt`)

En esta prueba, verificamos que cuando el usuario hace clic en el botón de calificación, se muestra un mensaje de confirmación y la calificación se actualiza correctamente.

```kotlin
import android.widget.Button
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.junit.Before
import org.junit.Test
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RatingButtonTest {

    @Before
    fun setUp() {
        // Inicialización de los recursos necesarios antes de cada prueba
    }

    // Test para verificar que el botón de calificación realiza la acción correctamente
    @Test
    fun `verificar que el botón de calificación muestra un mensaje de confirmación`() {
        // Hacer clic en el botón con el ID 'rate_button'
        onView(withId(R.id.rate_button))
            .perform(click())

        // Verificar que el mensaje de confirmación se muestra en pantalla
        onView(withText("Calificación actualizada"))
            .check(matches(isDisplayed()))
    }
}

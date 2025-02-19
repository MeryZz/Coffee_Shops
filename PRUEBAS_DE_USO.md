# Pruebas de Uso - CoffeeShops

## Descripción

Las pruebas de uso están diseñadas para evaluar cómo los usuarios interactúan con la aplicación, garantizando que sea fácil de usar, intuitiva y que todas las funcionalidades operen correctamente. Estas pruebas se centran en la experiencia del usuario (UX), la navegación, la interacción con la interfaz, y la ejecución de las principales características de la aplicación.

## Escenarios de Prueba

### 1. **Prueba de navegación entre pantallas**

#### Objetivo
Verificar que los usuarios puedan navegar de manera fluida entre las distintas pantallas y fragmentos de la aplicación.

#### Pasos
1. Iniciar la aplicación.
2. Navegar entre las pantallas principales como la lista de cafeterías, detalles de una cafetería, etc.
3. Verificar que las transiciones entre pantallas sean rápidas y fluidas.
4. Asegurarse de que el menú lateral funcione correctamente y que los usuarios puedan regresar a la pantalla principal sin problemas.

#### Resultado Esperado
- Las pantallas deben cargarse de manera fluida sin retrasos significativos.
- La navegación debe ser intuitiva, y los usuarios deben poder volver a las pantallas anteriores sin dificultad.

---

### 2. **Prueba de interacción con el RecyclerView**

#### Objetivo
Comprobar que el `RecyclerView` en la pantalla principal muestra correctamente los elementos y que las interacciones con los elementos son funcionales.

#### Pasos
1. Verificar que el `RecyclerView` muestra correctamente las cafeterías con sus imágenes, nombres, subtítulos y calificaciones.
2. Hacer clic en el nombre de una cafetería y verificar que se abra la pantalla de detalles correspondiente.
3. Interactuar con el RatingBar y verificar que la puntuación cambie correctamente.

#### Resultado Esperado
- El `RecyclerView` debe mostrar todos los elementos correctamente.
- Al hacer clic en el nombre de la cafetería, debe llevar al usuario a la pantalla de detalles de la tienda correspondiente.
- La calificación debe actualizarse cuando el usuario interactúa con el `RatingBar`.

---

### 3. **Prueba de uso de botones y acciones**

#### Objetivo
Comprobar que los botones (como los botones "Sí" y "No" en la pantalla de detalles) funcionan correctamente.

#### Pasos
1. En la pantalla de detalles, hacer clic en el botón "Sí".
2. Verificar que la acción correspondiente se realiza, como realizar una confirmación de acción o cerrar el fragmento.
3. Repetir el mismo proceso con el botón "No", asegurándose de que la acción sea adecuada.

#### Resultado Esperado
- Los botones deben realizar la acción correspondiente al ser clickeados.
- Las acciones deben ser coherentes con el contexto y fáciles de entender para el usuario.

---

## Herramientas Utilizadas

- **Android Studio Emulator**: Para probar la aplicación en diferentes dispositivos y tamaños de pantalla.
- **Figma / Adobe XD**: Para revisar y comparar los diseños y flujos de interacción de la aplicación.
- **Accessibility Scanner**: Para verificar la accesibilidad de la aplicación.

---

## Conclusión

Las pruebas de uso son cruciales para garantizar que la aplicación CoffeeShops ofrezca una experiencia de usuario fluida, intuitiva y accesible. Estas pruebas aseguran que todas las funcionalidades de la aplicación se ejecuten correctamente y que los usuarios puedan interactuar con la aplicación sin dificultad, proporcionando un entorno agradable y fácil de usar.

Se debe continuar evaluando la experiencia de usuario para detectar áreas de mejora y asegurarse de que la aplicación sea atractiva y funcional para todos los usuarios.

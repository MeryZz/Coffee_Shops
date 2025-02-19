# Prueba de Regresión - CoffeeShops

## Descripción

Las pruebas de regresión se centran en asegurar que las nuevas funcionalidades, mejoras o correcciones en el código no afecten negativamente a las funcionalidades existentes. En este archivo se describen los escenarios de prueba que deben ejecutarse cada vez que se introduzca un cambio en el sistema para validar que todo sigue funcionando como se espera.

## Escenarios de Prueba

### 1. **Comprobación de la funcionalidad del `RecyclerView` después de cambios en el adaptador**

#### Objetivo
Verificar que, después de agregar nuevas características al `RatingAdapter`, como nuevas funcionalidades o mejoras en la lógica, el `RecyclerView` sigue mostrando correctamente la lista de cafeterías con sus imágenes, nombres, subtítulos y calificaciones.

#### Pasos
1. Iniciar la aplicación y cargar la `MainActivity`.
2. Verificar que el `RecyclerView` muestra correctamente la lista de cafeterías.
3. Confirmar que cada ítem tiene una imagen, un nombre, un subtítulo y una calificación correcta.
4. Asegurarse de que la calificación se muestra correctamente en el `TextView` correspondiente.

#### Resultado Esperado
- El `RecyclerView` debe seguir funcionando sin errores, mostrando todas las cafeterías con sus datos correctamente.

---

### 2. **Comprobación de la transición entre `MainActivity` y `DetailFragment` después de actualizaciones**

#### Objetivo
Verificar que las transiciones entre `MainActivity` y `DetailFragment` sigan funcionando después de realizar cambios en la lógica de las transiciones o en la manera en que se pasan los datos entre actividades y fragmentos.

#### Pasos
1. Iniciar la aplicación y acceder a la `MainActivity`.
2. Hacer clic en el nombre de cualquier cafetería.
3. Verificar que la transición se realiza correctamente y que el `DetailFragment` se carga con los datos correctos (nombre e imagen de la cafetería).

#### Resultado Esperado
- La animación de transición debe ejecutarse correctamente y el `DetailFragment` debe mostrar los datos correctos de la cafetería seleccionada.

---

### 3. **Comprobación de la persistencia de datos en el `RatingBar` después de cambios en la persistencia**

#### Objetivo
Verificar que las calificaciones del `RatingBar` siguen siendo guardadas correctamente después de realizar cambios en la lógica de persistencia de datos (por ejemplo, cambios en cómo se guardan las calificaciones).

#### Pasos
1. Iniciar la aplicación y calificar varias cafeterías en el `RatingBar`.
2. Cerrar la aplicación.
3. Volver a abrir la aplicación y verificar que las calificaciones persisten correctamente.

#### Resultado Esperado
- Las calificaciones deben mantenerse consistentes después de cerrar y volver a abrir la aplicación.

---

## Herramientas Utilizadas

- **Android Studio**: Para el desarrollo y la ejecución de las pruebas en el emulador o dispositivo físico.
- **JUnit**: Para realizar las pruebas unitarias que ayudan a validar el comportamiento de cada módulo o componente.
- **Espresso**: Para las pruebas de interfaz de usuario, verificando que la interacción con los elementos de la UI funciona correctamente.
- **Mockito**: Para simular el comportamiento de los componentes o servicios que interactúan con el sistema (si se implementa).

---

## Conclusión

Las pruebas de regresión aseguran que los cambios realizados en la aplicación no rompen las funcionalidades existentes. Estos escenarios de prueba deben ejecutarse cada vez que se realice un cambio significativo en el código para garantizar que la aplicación sigue funcionando correctamente. Es fundamental realizar estas pruebas de manera frecuente durante el desarrollo para evitar la introducción de errores y mantener la estabilidad del sistema.

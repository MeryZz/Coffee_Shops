# Pruebas de Integración - CoffeeShops

## Descripción

Las pruebas de integración se encargan de verificar que los distintos módulos del proyecto interactúan correctamente entre sí. En este proyecto, las pruebas de integración incluyen la verificación de la interacción entre las actividades, fragmentos, adaptadores y la correcta transmisión de datos entre las vistas y la lógica de la aplicación.

## Escenarios de Prueba

### 1. **Prueba de la interacción entre MainActivity y RatingAdapter**

#### Objetivo
Verificar que el `RecyclerView` en `MainActivity` muestra correctamente los datos proporcionados por `RatingAdapter`.

#### Pasos
1. Iniciar la aplicación y cargar la `MainActivity`.
2. Verificar que se muestra un `RecyclerView` con el listado de cafeterías.
3. Confirmar que cada ítem del `RecyclerView` tiene una imagen, nombre, subtítulo y una calificación.
4. Asegurarse de que las calificaciones se muestran correctamente en los `TextView` correspondientes.

#### Resultado Esperado
- El `RecyclerView` debe mostrar 7 cafeterías con sus imágenes, nombres, subtítulos y calificaciones.
- La calificación debe ser correcta y visible junto al nombre de la cafetería.

---

### 2. **Prueba de la transición entre fragmentos (MainActivity -> DetailFragment)**

#### Objetivo
Verificar que al hacer clic en el nombre de una cafetería en `MainActivity`, se realiza la transición correcta hacia `DetailFragment` con la información correspondiente.

#### Pasos
1. Desde la `MainActivity`, hacer clic en el nombre de cualquier cafetería en la lista.
2. Verificar que la animación de transición se activa correctamente.
3. Comprobar que el `DetailFragment` muestra la imagen y el nombre correctos de la cafetería seleccionada.

#### Resultado Esperado
- Al hacer clic en un nombre, debe iniciarse la animación de transición y el `DetailFragment` debe mostrar la imagen y el nombre correctos de la cafetería seleccionada.
- El `DetailFragment` debe estar completamente cargado con la información del `Bundle` que fue pasado desde `MainActivity`.

---

### 3. **Prueba de visibilidad de botones en DetailFragment**

#### Objetivo
Verificar que los botones `Sí` y `No` en el `DetailFragment` se muestran correctamente.

#### Pasos
1. Acceder al `DetailFragment` desde la `MainActivity`.
2. Verificar que los botones `Sí` y `No` son visibles en la interfaz.
3. Confirmar que se pueden interactuar con ellos si se implementan funcionalidades específicas (aunque no se detalla el comportamiento de estos botones en el código actual).

#### Resultado Esperado
- Los botones `Sí` y `No` deben ser visibles y accesibles para el usuario.

---

## Herramientas Utilizadas

- **Android Studio**: Para el desarrollo y la ejecución de las pruebas en el emulador o dispositivo físico.
- **JUnit**: Para las pruebas unitarias de componentes y funcionalidades individuales (si se implementan).
- **Espresso**: Para las pruebas de interfaz de usuario y pruebas de integración en Android.

---

## Conclusión

Estas pruebas de integración aseguran que los módulos principales de la aplicación interactúan correctamente y que los datos se presentan de forma adecuada al usuario. Las pruebas abarcan desde la carga y visualización de los datos hasta la interacción con las vistas y la persistencia de datos. Se recomienda continuar con pruebas adicionales según se vayan implementando nuevas funcionalidades y mejoras.

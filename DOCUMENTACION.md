# Documentación del Proyecto - CoffeeShops

## Descripción

El proyecto **CoffeeShops** es una aplicación para mostrar una lista de cafeterías con detalles específicos sobre cada una, como su nombre, imagen, subtítulo, y calificación. Los usuarios pueden interactuar con la lista, ver detalles de cada cafetería y calificar su experiencia. Además, se implementan animaciones para transiciones entre las pantallas.

## Funcionalidades

- **Lista de cafeterías**: La pantalla principal muestra una lista de cafeterías con su imagen, nombre, subtítulo y calificación.
- **Detalle de cafetería**: Al hacer clic en el nombre de una cafetería, el usuario puede ver una pantalla de detalles con más información, incluida la imagen de la cafetería.
- **Calificación de cafeterías**: Los usuarios pueden calificar las cafeterías mediante un `RatingBar` y ver su puntuación actualizada en tiempo real.
- **Transiciones entre fragmentos**: Se utiliza una animación de transición personalizada entre los fragmentos al hacer clic en el nombre de una cafetería.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases y fragmentos principales:

### MainActivity

- **Función**: Es la actividad principal que contiene un `RecyclerView` con la lista de cafeterías.
- **Responsabilidades**:
    - Configura y muestra el `RecyclerView`.
    - Proporciona los datos necesarios para el adaptador (`RatingAdapter`).
    - Establece la animación entre fragmentos al seleccionar una cafetería.

### RatingAdapter

- **Función**: Es el adaptador del `RecyclerView` que se encarga de vincular los datos de cada cafetería con las vistas del `RecyclerView`.
- **Responsabilidades**:
    - Crea y enlaza las vistas de cada item (imagen, nombre, subtítulo y calificación).
    - Configura la animación de transición cuando se selecciona una cafetería.
    - Permite que los usuarios cambien la calificación de las cafeterías mediante el `RatingBar`.

### DetailFragment

- **Función**: Muestra los detalles de una cafetería seleccionada.
- **Responsabilidades**:
    - Recibe el nombre y la imagen de la cafetería seleccionada a través de un `Bundle`.
    - Muestra la información detallada, incluida la imagen y el nombre de la cafetería.
    - Permite la interacción con los botones `Sí` y `No` para realizar acciones adicionales.

## Requisitos

- **Android Studio**: Se debe utilizar Android Studio para compilar y ejecutar el proyecto.
- **Versión mínima de SDK**: El proyecto está configurado para funcionar en dispositivos con Android 5.0 (API nivel 21) o superior.

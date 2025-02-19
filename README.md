# CoffeeShops App

## Descripción del Proyecto

La aplicación **CoffeeShops** permite a los usuarios explorar diversas cafeterías, ver detalles sobre ellas, calificar su experiencia y consultar información relevante como la ubicación, el nombre y la calificación. La app utiliza un `RecyclerView` para mostrar las cafeterías y permite la navegación a través de detalles de cada cafetería con transiciones animadas. Además, incluye funcionalidades de clasificación de cafeterías con puntuaciones y permite a los usuarios ver información adicional sobre las cafeterías.


## Funcionalidades

- **RecyclerView con cafeterías**: Muestra una lista de cafeterías con imágenes, nombres, subtítulos y puntuaciones.
- **Detalles de cafeterías**: Los usuarios pueden ver detalles de una cafetería al hacer clic en ella, incluyendo la imagen de la cafetería y su nombre.
- **Transiciones animadas**: Cuando se navega entre fragmentos, se realizan transiciones animadas.
- **Calificación de cafeterías**: Los usuarios pueden calificar cafeterías utilizando un `RatingBar`.
- **Interfaz limpia y fácil de usar**: Diseño optimizado para una experiencia de usuario intuitiva y fluida.


## Estructura del Proyecto

- **MainActivity**: Actividad principal que contiene un `RecyclerView` para mostrar la lista de cafeterías.
- **DetailFragment**: Fragmento que muestra los detalles de una cafetería cuando el usuario hace clic en una de ellas.
- **RatingAdapter**: Adaptador para manejar los datos del `RecyclerView` y enlazar las vistas con las cafeterías.


## Tecnologías Utilizadas

- **Android SDK**
- **Kotlin**
- **RecyclerView**
- **Fragments**
- **Transiciones Animadas**
- **RatingBar**


## 📂 Documentación

- [Documentación](./DOCUMENTACION.md) 📖: Documentación del proyecto CoffeShops.


## 🏗️ Estrategias de Pruebas

Hay un plan de pruebas para garantizar la calidad y el rendimiento de la aplicación en los diferentes escenarios posibles que puedan haber:

- [Pruebas de Integración](./PRUEBAS_DE_INTEGRACION.md)
- [Pruebas de Regresión](./PRUEBAS_DE_REGRESION.md)
- [Pruebas de Volumen y Estrés](./PRUEBAS_DE_VOLUMEN_Y_ESTRES.md)
- [Pruebas de Seguridad](./PRUEBAS_DE_SEGURIDAD.md)
- [Pruebas de Uso](./PRUEBAS_DE_USO.md)


## 📱 Cómo Ejecutar el Proyecto

1. Clona el repositorio del proyecto.
2. Abre el proyecto en Android Studio.
3. Compila y ejecuta la aplicación en el emulador o en un dispositivo Android físico.
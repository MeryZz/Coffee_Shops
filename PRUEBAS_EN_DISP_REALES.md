# Pruebas en Dispositivos Reales - CoffeeShops

## Descripción

Las **pruebas en dispositivos reales** tienen como objetivo asegurar que la aplicación **CoffeeShops** funcione correctamente en una amplia gama de dispositivos con diferentes características de hardware, versiones de Android, tamaños de pantalla y resoluciones. Estas pruebas se centran en evaluar la **compatibilidad** de la aplicación, asegurándose de que la experiencia de usuario sea coherente y fluida, independientemente del dispositivo utilizado.

## Objetivos

- Verificar que la aplicación sea funcional en diferentes versiones de Android.
- Asegurar que la interfaz de usuario se adapte correctamente a diferentes tamaños de pantalla y resoluciones.
- Comprobar la estabilidad de la aplicación en dispositivos con características de hardware variadas.
- Detectar posibles problemas específicos de dispositivos, como el consumo de batería, problemas de rendimiento, o fallos en funciones específicas.


## Escenarios de Prueba

### 1. **Prueba de compatibilidad con diferentes versiones de Android**

#### Objetivo
Comprobar que la aplicación funcione correctamente en diferentes versiones de Android, asegurándose de que todas las funcionalidades sean compatibles con las versiones mínimas soportadas.

#### Pasos
1. Ejecutar la aplicación en dispositivos con distintas versiones de Android (por ejemplo, Android 8.0, 9.0, 10.0, 11.0, 12.0, etc.).
2. Verificar que todas las funcionalidades de la aplicación estén disponibles y operativas en cada versión.
3. Asegurarse de que no haya caídas inesperadas ni fallos de compatibilidad con las versiones más antiguas de Android.
4. Probar la navegación, las interacciones y las características clave de la aplicación.

#### Resultado Esperado
- La aplicación debe funcionar correctamente en todas las versiones de Android soportadas.
- No debe haber problemas de compatibilidad en versiones anteriores de Android, y la interfaz debe ser coherente.


### 2. **Prueba de adaptabilidad a diferentes tamaños de pantalla y resoluciones**

#### Objetivo
Verificar que la interfaz de usuario de la aplicación se adapte correctamente a diferentes tamaños de pantalla y resoluciones, garantizando que los elementos de la UI se muestren de manera adecuada.

#### Pasos
1. Probar la aplicación en dispositivos con diferentes tamaños de pantalla, como teléfonos pequeños (5.5”), medianos (6.0”) y grandes (6.5” o más).
2. Probar la aplicación en dispositivos con diferentes resoluciones de pantalla, incluyendo HD, Full HD y Quad HD.
3. Verificar que los elementos de la interfaz de usuario (botones, imágenes, textos) se ajusten correctamente en todas las pantallas sin que haya sobreposición o desplazamiento no deseado.
4. Comprobar que el diseño sea consistente y funcional en diferentes orientaciones (retrato y paisaje).

#### Resultado Esperado
- La interfaz de usuario debe adaptarse automáticamente a diferentes tamaños de pantalla y resoluciones.
- No deben existir problemas de escalabilidad o de diseño en pantallas grandes o pequeñas.


### 3. **Prueba de rendimiento en dispositivos con diferentes características de hardware**

#### Objetivo
Evaluar cómo la aplicación maneja diferentes capacidades de hardware, como la velocidad de CPU, la memoria disponible y la potencia de la GPU.

#### Pasos
1. Ejecutar la aplicación en dispositivos con diferentes configuraciones de hardware (por ejemplo, dispositivos de gama baja, media y alta).
2. Verificar el rendimiento de la aplicación en dispositivos con recursos limitados (poca memoria RAM, CPU más lenta, etc.).
3. Monitorear el consumo de CPU y memoria en dispositivos de gama baja para verificar que la aplicación sea eficiente.
4. Comprobar si la aplicación se mantiene fluida y sin retrasos en dispositivos con menos recursos, como teléfonos de gama baja.

#### Resultado Esperado
- La aplicación debe ser funcional en dispositivos de diferentes gamas, aunque en los dispositivos de gama baja, es posible que se observen ligeros retrasos.
- El rendimiento debe ser aceptable incluso en dispositivos con características de hardware limitadas.


### 4. **Prueba de funcionalidad de componentes clave en dispositivos reales**

#### Objetivo
Verificar que los componentes clave de la aplicación funcionen correctamente en dispositivos reales, incluyendo la carga de datos, la interacción con el usuario y las actualizaciones en tiempo real.

#### Pasos
1. Comprobar la carga de la lista de cafeterías en dispositivos con conexiones de red lentas y rápidas.
2. Realizar interacciones con elementos como los `RecyclerView`, botones de interacción, `RatingBar`, y otros componentes clave.
3. Verificar la estabilidad de la aplicación durante el uso continuo.
4. Comprobar la funcionalidad de las notificaciones push y su comportamiento en diferentes dispositivos.

#### Resultado Esperado
- Todos los componentes de la aplicación deben funcionar correctamente.
- Las interacciones deben ser fluidas y las actualizaciones de la interfaz de usuario deben ser rápidas.


## Herramientas Utilizadas

- **Dispositivos reales**: Utilizar una variedad de dispositivos Android (gama baja, media y alta) para las pruebas.
- **Android Studio Emulator**: Para probar dispositivos con configuraciones específicas, tamaños de pantalla y versiones de Android.
- **Android Profiler**: Para monitorear el rendimiento, el uso de CPU y memoria en dispositivos reales.
- **Firebase Test Lab**: Para ejecutar pruebas automáticas en una variedad de dispositivos reales a través de la infraestructura de Google.


## Conclusión

Las **pruebas en dispositivos reales** son esenciales para garantizar que la aplicación **CoffeeShops** funcione de manera fluida y sin errores en una variedad de configuraciones de hardware y versiones de Android. Estas pruebas ayudan a identificar problemas de compatibilidad y a asegurar que la experiencia del usuario sea consistente y sin fallos, independientemente del dispositivo utilizado.

Es recomendable realizar pruebas en una **amplia variedad de dispositivos**, especialmente aquellos que representen las configuraciones más comunes entre los usuarios, para asegurar la compatibilidad de la aplicación y mejorar la **calidad general** del software. Las pruebas deben repetirse regularmente con cada nueva versión de la aplicación para detectar posibles problemas que puedan surgir con nuevas actualizaciones del sistema operativo Android o con nuevos modelos de dispositivos.

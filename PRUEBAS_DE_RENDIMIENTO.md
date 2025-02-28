# Pruebas de Rendimiento - CoffeeShops

## Descripción

Las pruebas de rendimiento tienen como objetivo asegurar que la aplicación funcione de manera eficiente, sin causar un consumo excesivo de recursos como memoria y CPU, lo que podría afectar negativamente la experiencia del usuario. Estas pruebas se centran en evaluar cómo la aplicación maneja diferentes cargas de trabajo, identificando posibles cuellos de botella y problemas de eficiencia en la gestión de memoria y uso de la CPU.

A continuación se describen algunas de las pruebas de rendimiento que se realizarán para analizar el **consumo de memoria** y el **uso de la CPU**.


## Escenarios de Prueba

### 1. **Prueba de Consumo de Memoria**

#### Objetivo
Verificar que la aplicación maneja adecuadamente la memoria y que no consume más memoria de la necesaria en condiciones normales de uso.

#### Pasos
1. Iniciar la aplicación.
2. Navegar por varias pantallas, interactuar con elementos (por ejemplo, abrir detalles de cafeterías, cargar imágenes, calificar, etc.).
3. Utilizar varias funciones simultáneamente, como desplazarse por listas y actualizar la calificación de cafeterías.
4. Monitorear el uso de memoria de la aplicación utilizando herramientas como **Android Profiler** de Android Studio.
5. Comprobar si hay picos de memoria inusuales o fugas de memoria.

#### Resultado Esperado
- La aplicación debe liberar memoria correctamente cuando ya no se necesiten recursos.
- No debe haber un uso excesivo de memoria durante las interacciones normales.
- No deben ocurrir **fugas de memoria** (memory leaks), lo que podría causar que la aplicación se vuelva lenta o que se cierre inesperadamente.

#### Herramientas
- **Android Profiler**: Para monitorear el consumo de memoria.
- **LeakCanary**: Herramienta de código abierto para detectar fugas de memoria.


### 2. **Prueba de Uso de CPU**

#### Objetivo
Evaluar cómo la aplicación utiliza la CPU y asegurarse de que no haya un uso excesivo de la misma, lo que podría generar un consumo de batería elevado o que la aplicación funcione lentamente.

#### Pasos
1. Iniciar la aplicación en un dispositivo real o emulador.
2. Navegar entre pantallas, realizar varias acciones como cargar la lista de cafeterías, ver detalles de una cafetería y actualizar calificaciones.
3. Monitorear el uso de la CPU con Android Profiler o herramientas similares.
4. Repetir las interacciones para verificar que no haya picos repentinos en el uso de la CPU que afecten el rendimiento.
5. Realizar pruebas en varios dispositivos para ver cómo el uso de la CPU varía según las características del hardware.

#### Resultado Esperado
- El uso de la CPU debe ser moderado durante la interacción con la aplicación.
- No deben haber picos de uso de la CPU durante el uso normal de la aplicación.
- El rendimiento de la aplicación debe ser consistente y sin caídas de rendimiento a medida que se navega entre pantallas o se realizan acciones.

#### Herramientas
- **Android Profiler**: Para monitorear el uso de la CPU.
- **Android Debug Bridge (ADB)**: Para capturar logs relacionados con el uso de la CPU.


### 3. **Prueba de Rendimiento en Listas Grandes**

#### Objetivo
Evaluar cómo la aplicación maneja grandes cantidades de datos en componentes como `RecyclerView`, asegurándose de que no haya pérdidas de rendimiento al manejar listas grandes.

#### Pasos
1. Iniciar la aplicación con una lista grande de cafeterías (por ejemplo, cargar una lista con más de 100 elementos).
2. Desplazarse por la lista rápidamente para verificar si la aplicación se mantiene fluida.
3. Realizar pruebas de desplazamiento continuo y repetido a través de la lista.
4. Monitorear el uso de memoria y la CPU mientras se realiza este desplazamiento.

#### Resultado Esperado
- La aplicación debe seguir siendo fluida y rápida durante el desplazamiento de la lista, sin congelarse o causar un aumento inesperado en el uso de la CPU o la memoria.
- El `RecyclerView` debe manejar eficientemente el reciclaje de las vistas y no debe consumir más recursos de los necesarios.

#### Herramientas
- **Android Profiler**: Para monitorear el consumo de recursos mientras se desplaza por listas grandes.


## Herramientas Utilizadas

- **Android Profiler**: Herramienta integrada en Android Studio que permite monitorear el uso de memoria, CPU y red en tiempo real.
- **LeakCanary**: Herramienta para detectar fugas de memoria.
- **ADB (Android Debug Bridge)**: Para acceder a las métricas de la aplicación y generar logs de uso de CPU.
- **Systrace**: Herramienta para capturar y analizar el rendimiento a nivel de sistema, permitiendo analizar el uso de la CPU en tiempo real.


## Conclusión

Las **pruebas de rendimiento** son fundamentales para garantizar que la aplicación **CoffeeShops** sea eficiente en términos de consumo de recursos como memoria y CPU. Estas pruebas ayudan a identificar problemas de **rendimiento** como el consumo excesivo de recursos, **fugas de memoria**, y caídas en el rendimiento cuando se interactúa con la aplicación.

Al realizar estas pruebas, se puede asegurar que la aplicación proporcione una **experiencia de usuario fluida**, incluso en dispositivos con características de hardware más limitadas, mejorando la **estabilidad** y la **eficiencia** de la aplicación. Es recomendable repetir las pruebas de rendimiento periódicamente a medida que la aplicación evoluciona, para identificar y corregir cualquier regresión en el rendimiento.

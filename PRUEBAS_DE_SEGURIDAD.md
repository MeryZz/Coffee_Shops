# Pruebas de Seguridad - CoffeeShops

## Descripción

Las pruebas de seguridad son fundamentales para asegurar que la aplicación esté protegida contra posibles vulnerabilidades y ataques. Estas pruebas verifican que la aplicación maneje adecuadamente los datos sensibles, implemente medidas de autenticación y autorización, y que sea resistente a ataques comunes como inyecciones o fugas de información. En este archivo se describen los escenarios de prueba que deben ejecutarse para verificar la seguridad de la aplicación.

## Escenarios de Prueba

### 1. **Prueba de protección de datos sensibles**

#### Objetivo
Verificar que los datos sensibles (como contraseñas, información personal, etc.) estén protegidos adecuadamente en la aplicación, tanto en tránsito como en reposo.

#### Pasos
1. Asegurarse de que todas las comunicaciones entre la aplicación y el servidor estén cifradas mediante HTTPS.
2. Verificar que las contraseñas se almacenan de manera segura en el servidor (por ejemplo, utilizando hash con sal).
3. Comprobar que no se almacenan datos sensibles (como contraseñas o información financiera) en preferencias o bases de datos locales sin cifrado.

#### Resultado Esperado
- Los datos sensibles deben estar protegidos mediante cifrado y no deben ser almacenados en texto claro.

---

### 2. **Prueba de inyecciones SQL**

#### Objetivo
Verificar que la aplicación es resistente a ataques de inyección SQL, evitando que los atacantes puedan manipular las consultas a la base de datos.

#### Pasos
1. Intentar realizar inyecciones SQL en los puntos de entrada de la aplicación (como formularios de inicio de sesión, búsqueda de tiendas, etc.).
2. Ingresar datos maliciosos en los campos de entrada, como `1' OR '1'='1`, para intentar alterar la consulta SQL.
3. Asegurarse de que la aplicación maneja adecuadamente estas entradas y no permite que se ejecuten consultas SQL no autorizadas.

#### Resultado Esperado
- La aplicación debe ser resistente a inyecciones SQL, y no debe permitir la ejecución de consultas maliciosas.

---

## Herramientas Utilizadas

- **OWASP ZAP**: Para realizar pruebas de seguridad automatizadas y análisis de vulnerabilidades en la aplicación.
- **Burp Suite**: Para probar la seguridad de las comunicaciones entre la aplicación y los servidores.
- **Postman**: Para realizar pruebas de API y comprobar si existen vulnerabilidades en los puntos de acceso de la aplicación.
- **Android Studio**: Para implementar y verificar las medidas de seguridad en la app.

---

## Conclusión

Las pruebas de seguridad son esenciales para garantizar que la aplicación CoffeeShops sea resistente a vulnerabilidades y ataque

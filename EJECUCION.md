# Ejecución de la APP

## Requisitos Previos

Antes de instalar y probar la aplicación, asegúrate de tener:

- Un dispositivo Android con **versión 6.0 (Marshmallow)** o superior, o un emulador configurado en Android Studio.
- **Android Studio** instalado en tu PC con el SDK adecuado.
- Habilitada la **Depuración USB** si deseas probar en un dispositivo físico.

## Pasos para Ejecutar la Aplicación en Android Studio

1. Abre *Android Studio* y carga el proyecto CoffeeShops_Fragments.
2. Conecta un dispositivo físico mediante USB o inicia un *emulador Android* desde el AVD Manager.
3. Haz clic en *Run 'app'* o presiona *Shift + F10* para compilar e instalar la aplicación.
4. Una vez instalada, la aplicación se abrirá automáticamente en el dispositivo/emulador.

## Creación del Archivo Keystore en Android Studio

Para firmar tu aplicación y poder distribuirla, es necesario generar un archivo keystore. Sigue estos pasos para crearlo desde Android Studio:

### Pasos para Crear un Keystore

1. **Abrir el Generador de Keystore**
- En Android Studio, ve a Build > Generate Signed Bundle/APK.
- Selecciona APK y haz clic en Next.

2. **Configurar el Keystore**
- En la sección Key store path, haz clic en Create new.
- Elige la ubicación donde deseas guardar el archivo .jks (ejemplo: C:\Users\TuUsuario\keystore.jks).
- Ingresa una contraseña segura.

3. **Configurar la Clave (Key Alias)**
- En Key alias, haz clic en Create new.
- Ingresa un nombre para la clave (ejemplo: miClave).
- Define otra contraseña segura.
- Completa los campos obligatorios: nombre y apellido, organización y ubicación.
- Configura la validez en años (ejemplo: 25 años).

4. **Guardar y Finalizar**
- Guarda el archivo .jks en un lugar seguro.
- Completa el proceso y genera el APK firmado.

## Configuración de la Firma en Gradle

Para firmar tu aplicación Android con un archivo Keystore, sigue estos pasos en Android Studio:

### Ubicación del Archivo Keystore

Asegúrate de tener un archivo Keystore (`.jks` o `.keystore`). Si aún no lo has generado, consulta la guía de creación de Keystore.

Guárdalo en una ubicación segura dentro de tu proyecto, por ejemplo: /app/keystore/my-release-key.jks

### Configurar la Firma en el `build.gradle`

Edita el archivo `build.gradle` de tu módulo `app` y añade la siguiente configuración dentro de `android`:

android {
    ...
    signingConfigs {
        release {
            storeFile file("keystore/my-release-key.jks")
            storePassword "tu_contraseña"
            keyAlias "tu_alias"
            keyPassword "tu_contraseña_del_alias"
        }
    }

    buildTypes {
        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
            signingConfig signingConfigs.release
        }
    }
}

### Usar Variables de Entorno para Mayor Seguridad

En lugar de escribir las credenciales en build.gradle, puedes guardarlas en **gradle.properties**:

1. Abre el archivo gradle.properties en el nivel raíz del proyecto y añade:

storeFile=keystore/my-release-key.jks
storePassword=tu_contraseña
keyAlias=tu_alias
keyPassword=tu_contraseña_del_alias

2. Modifica build.gradle para usar estas variables:

signingConfigs {
    release {
        storeFile file(rootProject.file(storeFile))
        storePassword storePassword
        keyAlias keyAlias
        keyPassword keyPassword
    }
}

## Generación del APK firmado

1. En Android Studio, ve a Build > Build Bundle(s) / APK(s) > Build APK(s).
2. Configura lo siguiente:
   - **Module**: Selecciona el módulo principal de tu aplicación.
   - **Key store path**: Selecciona el archivo Keystore que creaste.
   - **Passwords**: Ingresa las contraseñas del Keystore y la clave.
3. El APK firmado se generará en la carpeta **app/release/**.

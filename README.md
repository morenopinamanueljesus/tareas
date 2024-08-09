# Documentación Técnica: Configuración y Ejecución de la Aplicación

## Índice
1. [Requisitos Previos](#requisitos-previos)
2. [Configuración del Entorno](#configuración-del-entorno)
3. [Ejecución de la Aplicación](#ejecución-de-la-aplicación)
    - [Ejecutar con Docker](#ejecutar-con-docker)
    - [Ejecutar con Java](#ejecutar-con-java)

### Documentación Técnica: Configuración y Ejecución de la Aplicación

#### Índice

1.  [Requisitos Previos](#requisitos-previos)
2.  [Configuración del Entorno](#configuracion-del-entorno)
3.  [Ejecución de la Aplicación](#ejecucion-de-la-aplicacion)
    *   [Ejecutar con Docker](#ejecutar-con-docker)
    *   [Ejecutar con Java](#ejecutar-con-java)

* * *

### 1\. Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes en tu sistema:

*   **Java Development Kit (JDK)**: Versión 17 o superior.
*   **Maven**: Apache Maven 3.9.8.
*   **Docker**: Asegúrate de que Docker esté correctamente instalado y configurado.
*   **Archivo JAR**: `tareas-0.0.1-SNAPSHOT.jar` ubicado en `C:\Users\Administrador\Desktop\tareas\target`.

### 2\. Configuración del Entorno
#### Configuración de Maven
1.  **Verificar la instalación de Maven**: Abre una terminal o símbolo del sistema y ejecuta:

    `mvn -version`
2.  **Establecer variables de entorno (Opcional)**: Si es necesario, agrega la ruta de Maven al `PATH` en las variables de entorno del sistema.
   
3.  **Ejecuta el comando para construir el JAR**: Usa Maven para construir el archivo JAR ejecutando:

    `cd tareas`
    
    `mvn clean package`
    Esto compilará el proyecto y empaquetará el código en un archivo JAR. El archivo JAR se encontrará en el directorio target.

#### Configuración de Java

1.  **Verificar la instalación de Java**: Abre una terminal o símbolo del sistema y ejecuta:

    `java -version`

2.  **Establecer variables de entorno (Opcional)**: Si es necesario, agrega la ruta de Java al `PATH` en las variables de entorno del sistema.


#### Configuración de Docker

1.  **Instalar Docker**: Si aún no tienes Docker instalado, puedes descargarlo desde el sitio oficial de Docker.

2.  **Verificar la instalación de Docker**: Abre una terminal y ejecuta: ( asegúrate de que Docker esté correctamente instalado y funcionando.)

    `docker --version`


### 3\. Ejecución de la Aplicación

#### Ejecutar con Docker

1.  **Construir la imagen de Docker**:

    Si no tienes una imagen preconstruida, deberás crear una. Colócate en el directorio donde se encuentra tu archivo `Dockerfile` (si lo tienes) y ejecuta el siguiente comando:
    `cd \tareas`
    `docker build -t tareas .`

    Nota: Si ya tienes una imagen disponible, puedes omitir este paso.

2.  **Ejecutar la aplicación con Docker**:

    Una vez que tienes la imagen, puedes ejecutar el contenedor con el siguiente comando:
    `docker run -d -p 8080:8080 tareas`

    Esto ejecutará la aplicación en segundo plano (`-d`) y la expondrá en el puerto `8080`.

3.  **Verificar la ejecución**:

    Abre Postman y crea un request, tipo `GET` con la dirección `localhost:8080/tareas/obtener` para verificar que obtienes tareas.
    También puede crear una nueva tarea, creando una nueva petición `POST` conla direccion  `localhost:8080/tareas/crear`, con body tipo raw y JSON:
    {
    "titulo": "Tarea Prueba Tecnica Fintonic",
    "descripcion": "Tarea Prueba Tecnica Fintonic - Manuel Jesús Moreno Piña",
    "fechaVencimiento": "2024-08-09",
    "etiquetas": ["etiqueta1"],
    "estado": "COMPLETED"
    }

4.  **Detener y eliminar el contenedor**:

    Si necesitas detener el contenedor, puedes usar el siguiente comando:

    `docker stop tareas`

    Para eliminar el contenedor:

    `docker rm tareas`


#### Ejecutar con Java

1.  **Navegar al directorio del JAR**:

    Abre una terminal o símbolo del sistema y navega al directorio donde se encuentra el archivo `tareas-0.0.1-SNAPSHOT.jar`:

    `cd tareas\target`

2.  **Ejecutar la aplicación**:

    Ejecuta el siguiente comando para iniciar la aplicación:

    `java -jar tareas-0.0.1-SNAPSHOT.jar`

    Este comando iniciará la aplicación, y se podrá acceder a través del puerto especificado en la configuración del JAR (por defecto, suele ser el puerto `8080`).

3.  **Verificar la ejecución**:

    Abre Postman y crea un request, tipo `GET` con la dirección `localhost:8080/tareas/obtener` para verificar que obtienes tareas.
    También puede crear una nueva tarea, creando una nueva petición `POST` conla direccion  `localhost:8080/tareas/crear`, con body tipo raw y JSON:
    {
    "titulo": "Tarea Prueba Tecnica Fintonic",
    "descripcion": "Tarea Prueba Tecnica Fintonic - Manuel Jesús Moreno Piña",
    "fechaVencimiento": "2024-08-09",
    "etiquetas": ["etiqueta1"],
    "estado": "COMPLETED"
    }


### Conclusión

Siguiendo estos pasos, podrás configurar y ejecutar la aplicación tanto utilizando Docker como directamente con Java. Asegúrate de que todos los componentes estén correctamente instalados y configurados para evitar problemas durante la ejecución.


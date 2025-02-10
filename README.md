# Hoja de Trabajo 3

Este proyecto está diseñado para probar la velocidad de diferentes algoritmos de ordenamiento en Java. Los algoritmos implementados incluyen Heap Sort, Radix Sort, Bucket Sort, entre otros. El proyecto utiliza Maven como herramienta de gestión de dependencias y está configurado para trabajar en IntelliJ IDEA. Para las pruebas de rendimiento, se usa el profiler integrado de IntelliJ IDEA.

## Requisitos

- **Java 17 o superior**: Este proyecto fue desarrollado y probado con Java 17.
- **IntelliJ IDEA**: Se recomienda usar IntelliJ IDEA para ejecutar el proyecto y las pruebas unitarias.
- **Maven**: El proyecto usa Maven para gestionar dependencias y la construcción del proyecto.

## Instrucciones para usar el proyecto

### 1. Clonar el repositorio

Primero, clona este repositorio en tu máquina local:

```bash
git clone https://github.com/EsthebanHeredia/aedht3
```

### 2. Importar el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Selecciona **File > Open...** y navega hasta el directorio donde clonaste el repositorio.
3. IntelliJ IDEA detectará automáticamente el proyecto como un proyecto Maven y lo importará.

### 3. Configurar el directorio de pruebas

Para ejecutar las pruebas unitarias, es necesario marcar la carpeta `tests` como el directorio de pruebas:

1. Haz clic derecho en la carpeta `tests` en el panel del proyecto.
2. Selecciona **Mark Directory as > Test Sources Root**.

### 4. Modificar los conjuntos de números

Si deseas probar distintos conjuntos de números, puedes modificar la clase `GeneradorDeNumeros` para generar números ordenados o desordenados según lo especificado en los comentarios de la clase.

### 5. Ejecutar el proyecto

Para ejecutar el proyecto y las pruebas de rendimiento:

1. Abre la clase principal o la clase de prueba que deseas ejecutar.
2. Haz clic en el botón de ejecución (play) en la esquina superior derecha de IntelliJ IDEA.
3. Utiliza el profiler integrado de IntelliJ IDEA para analizar el rendimiento de los algoritmos de ordenamiento.


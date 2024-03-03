# Aproximación Recursiva del Número Pi

Este proyecto contiene la implementación en Java de una aproximación recursiva del número pi utilizando el método de Montecarlo.

## Descripción

El método de Montecarlo es una técnica de simulación estadística que permite calcular una aproximación de pi. Esta implementación utiliza una función recursiva que simula el lanzamiento de puntos aleatorios dentro de un cuadrado que inscribe un círculo. La proporción de puntos que caen dentro del círculo respecto al total de puntos lanzados se utiliza para calcular la aproximación de pi.

## Estructura del Proyecto

El proyecto se divide en dos paquetes principales:

- `mates`: Contiene la clase `Matematicas` con el método `generarNumeroPiRecursivo` que realiza el cálculo recursivo de pi.
- `aplicacion`: Contiene la clase `Principal` que es el punto de entrada del programa, donde se ejecuta la aproximación de pi y se muestra el resultado.

## Cómo ejecutar

Para ejecutar este programa, necesitarás tener Java instalado en tu sistema. Puedes compilar y ejecutar el proyecto de la siguiente manera:

1. Compila las clases:

```bash
javac mates/Matematicas.java aplicacion/Principal.java

Ejecuta la clase Principal pasando el número de pasos como argumento. Por ejemplo, para 100000 pasos:
java aplicacion.Principal 100000

Contribuciones
Las contribuciones a este proyecto son bienvenidas. Si tienes sugerencias o mejoras, siéntete libre de abrir un issue o enviar un pull request.

Licencia
Este proyecto está bajo la licencia MIT. Puedes encontrar la licencia completa en el archivo LICENSE incluido en el proyecto.
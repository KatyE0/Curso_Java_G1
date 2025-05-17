# Reto 01: Registro de parámetros de simulación

## 🤍 Descripción
Este reto simula un programa que captura y registra  parámetros para simulaciones. El usuario ingresa los parámetros clave de entrada antes de ejecutar cualquier modelo. El sistema registra dichos datos y genera un archivo de configuración con información como tiempo de ciclo, velocidad de línea y número de estaciones. Además, debe verificar que el archivo haya sido creado correctamente y luego leer su contenido para su validación. Se emplean clases del paquete java.nio.file para garantizar una gestión moderna y eficiente de archivos en Java.

## 🤍 Objetivos
- Aplicar las clases Path y Files de la API java.nio.file (NIO.2) para crear un archivo de configuración de simulación, verificar su existencia y leer su contenido. Este ejercicio simula una tarea real del rol de Process Simulation Engineer, donde se documentan los parámetros antes de ejecutar una corrida de simulación.

## 🤍 Salida esperada 
```bash
java RegistroSimulacion     

°°°° Actualización de parametros :3 °°°°° 

Ingrese el tiempo de ciclo (segundos): 10
Ingrese la velocidad de línea (m/s): 6.5
Ingrese el número de estaciones: 7

Los parametros se registraron correctamente :D 

Tiempo de ciclo: 10 segundos 
Velocidad de línea:6.5 m/s 
Número de estaciones: 7

```
#### 🤍 Haz click para volver al [Indice](https://github.com/KatyE0/Curso_Java_G1/blob/main/README.md#-primer-m%C3%B3dulo-)

---
Hecho con 🤍 por Karina Escalante
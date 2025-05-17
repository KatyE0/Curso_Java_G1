# Reto 01: Registro de parámetros de simulación

## 🤍 Descripción
Este reto simula una herramienta de análisis de registros para un sistema de pruebas automáticas. El usuario es responsable de revisar el archivo errores.log, el cual contiene miles de registros generados durante la ejecución nocturna de pruebas. El programa debe procesar este archivo de forma eficiente para contar la frecuencia de mensajes de error y advertencia, y generar un resumen claro con estadísticas relevantes. Además, debe manejar posibles fallos en la lectura del archivo y registrar cualquier excepción en un archivo llamado registro_fallos.txt. Para ello, se emplean estructuras como try-with-resources y control de excepciones que aseguran un análisis confiable y automatizado.

## 🤍 Objetivos
- Aplicar el uso de BufferedReader, try-with-resources y manejo de excepciones para analizar grandes archivos de logs generados por pruebas automatizadas. Este reto simula una tarea del rol de Automated Testing Engineer (QA), enfocada en el procesamiento eficiente de información y la trazabilidad de errores.

## 🤍 Salida esperada
Cuando NO existe el archivo "errores.log"
```bash
java AnalizadorDeLogs 

Upps!!!, algo salio mal :( 
Error:  errores.log


```

Cuando  existe el archivo "errores.log"
```bash
java AnalizadorDeLogs   

Total de líneas: 10
Errores encontrados: 3
Warnings encontrados: 3
Porcentaje de líneas con errores: 30.00%
Porcentaje de líneas con advertencias: 30.00%

```
#### 🤍 Haz click para volver al [Indice](https://github.com/KatyE0/Curso_Java_G1/blob/main/README.md#-primer-m%C3%B3dulo-)

---
Hecho con 🤍 por Karina Escalante
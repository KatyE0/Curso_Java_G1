# Reto 02: Monitoreo de consumo de recursos en servidores

## 🤍 Descripción
Este reto simula una herramienta de monitoreo para servidores en una empresa financiera. El sistema registra el consumo de CPU ingresado por el usuario, validando que los valores sean numéricos, únicos y estén entre 0% y 100%. Si un valor supera el 95%, lanza una excepción personalizada (ConsumoCriticoException). Se utilizan estructuras como HashSet para evitar duplicados, manejo de excepciones para controlar errores, y bloques finally para asegurar el cierre de recursos.

## 🤍 Objetivos
- Desarrollar una herramienta en Java que permita leer registros de consumo de CPU por servidor, identifique duplicados, valide entradas numéricas y lance una excepción personalizada si se supera un umbral crítico. Se deben aplicar las buenas prácticas de rendimiento, manejo de errores y excepciones personalizadas.

## 🤍 Salida esperada
```bash
java MonitorCPU 

°°°°°° Sistema de registro consumo de CPU:3°°°°°°

Ingresa en número de registros por ingresar: 6

Ingresa consumos de CPU en porcentaje (enteros): 5
Registro aceptado: 5%
Ingresa consumos de CPU en porcentaje (enteros): 10
Registro aceptado: 10%
```
Cuando el usuario ingresa un dato duplicado:
```bash
Ingresa consumos de CPU en porcentaje (enteros): 5
Valor duplicado, ingresa uno valido. 
Ingresa consumos de CPU en porcentaje (enteros): 7
Registro aceptado: 7%
```
Cuando el usuario ingresa un valor no valido:
```bash
Ingresa consumos de CPU en porcentaje (enteros): -8
Valor fuera de rango. Debe estar entre 0 y 100.
Ingresa consumos de CPU en porcentaje (enteros): 95
Registro aceptado: 95%
```
Cuando el usuario un valor critico:
```bash
Ingresa consumos de CPU en porcentaje (enteros): 99
Error inesperado: ALERTA: Consumo crítico detectado (99%)

```

#### 🤍 Haz click para volver al [Indice](https://github.com/KatyE0/Curso_Java_G1/blob/main/README.md#-primer-m%C3%B3dulo-)

---
Hecho con 🤍 por Karina Escalante

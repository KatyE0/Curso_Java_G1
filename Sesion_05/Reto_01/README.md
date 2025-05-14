# Reto 01: Sistema de emergencia

## 🤍 Descripción
Este reto simula un sistema que permite registrar y activar diferentes unidades de respuesta a emergencias(Ambulancias, Partullas y Caminones de bomberos), todas comparten ciertas funciones (como responder a una emergencia) pero cada una puede tener un comportamiento específico.

Además, todas las unidades están equipadas con tecnología como sistemas GPS, sirenas, y son operadas por personal capacitado. Estos componentes serán modelados mediante composición.

## 🤍 Objetivos
- Construir un sistema que modele diferentes tipos de unidades de emergencia, aplicando los principios de herencia y composición en Java. Reforzarás el uso de extends, super, y el diseño modular usando clases auxiliares.

## 🤍 Salida esperada 
```bash
java CentralEmergencias     

°°°°° Reporte de estado °°°°°
Activando unidad:Ambulancia
GPS: Ubicación actual detectada.
Sirena: Activada.
Operador Mason reportándose.
Ambulancia en camino al hospital más cercano.

°°°°° Reporte de estado °°°°°
Activando unidad:Patrulla
GPS: Ubicación actual detectada.
Sirena: Activada.
Operador Daniel reportándose.
Patrulla atendiendo situación de seguridad ciudadana.

°°°°° Reporte de estado °°°°°
Activando unidad:UnidadBomberos
GPS: Ubicación actual detectada.
Sirena: Activada.
Operador Erika reportándose.
Unidad de bomberos respondiendo a incendio estructural.

```
---
Hecho con 🤍 por Karina Escalante
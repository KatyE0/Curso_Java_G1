# Reto 01: Motor de lógica narrativa

## 🤍 Descripción
Este reto simula el proceso de refactorización de un motor narrativo dentro de un videojuego interactivo. En el escenario inicial, una única clase concentra toda la lógica relacionada con las decisiones del jugador, las transiciones de historia y los diálogos, lo que dificulta su mantenimiento y escalabilidad. El objetivo es aplicar principios de diseño orientado a objetos para dividir responsabilidades en componentes más manejables y reutilizables. Para ello, se definen interfaces específicas para manejar transiciones, diálogos y lógica de decisiones, e implementaciones concretas para cada una. Además, se utiliza inyección de dependencias para cumplir con el Principio de Inversión de Dependencias (DIP) y se aplica el Principio de Abierto/Cerrado (OCP), permitiendo extender funcionalidades sin modificar el código existente. El programa simula una escena narrativa simple donde se refleja el nuevo diseño modular y flexible.

## 🤍 Objetivos
- Aplicar refactorización y los principios SOLID en un caso práctico relacionado con videojuegos narrativos, separando responsabilidades y utilizando interfaces para lograr un sistema escalable y mantenible

## 🤍 Salida esperada
Al tomar el camino A
```bash
java MainNarrativa 

Narrador: 
°°°°Bienvenido a Jumanji °°°°°

Te encuentras en medio de la jungla, que quieres hacer??
Eligue la opcion que decidas (A) o (B)
Adentrarse a la jungla (A)
Ir en dirección al rio (B) 
Eligue tu destino jugador: A

Narrador: Decides avanzar a la jungla.
Transición a la siguiente escena...

```
Al tomar el camino B
```bash
java MainNarrativa

Narrador: 
°°°°Bienvenido a Jumanji °°°°° 

Te encuentras en medio de la jungla, que quieres hacer??
Eligue la opcion que decidas (A) o (B)
Adentrarse a la jungla (A)
Ir en dirección al rio (B) 
Eligue tu destino jugador: B

Narrador: Decides seguir el rio.
Transición a la siguiente escena...

```
#### 🤍 Haz click para volver al [Indice](https://github.com/KatyE0/Curso_Java_G1/blob/main/README.md#-primer-m%C3%B3dulo-)

---
Hecho con 🤍 por Karina Escalante

# Reto 02: Planeación de temas y recursos educativos colaborativos

## 🤍 Descripción
Este reto simula un sistema de organización de temarios para docentes. El usuario debe de coordinar el temario mensual de clases y gestionar los materiales digitales compartidos por el equipo. Cada tema tiene un nivel de prioridad (urgente, importante u opcional) y recursos asociados. El sistema debe permitir administrar los temas de forma segura en entornos concurrentes, ordenarlos alfabéticamente o por prioridad, y mantener un repositorio accesible para todos los colaboradores. Se utilizarán estructuras concurrentes de Java para garantizar la integridad de los datos en todo momento.

## 🤍 Objetivos
Practicar el uso de:
- Comparable y Comparator para ordenar temas de clase.
- CopyOnWriteArrayList para gestionar de forma segura una lista de temas activos.
- ConcurrentHashMap para mantener un repositorio de recursos compartidos por tema, accesible de forma segura desde distintos usuarios.

## 🤍 Salida esperada 
```bash
java Main  

°°°°°°° Registro de temario °°°°°°° 

¿Cuántos temas quieres registrar? 3

Nombre del tema: Comprension lectora
Prioridad (1 = urgente, 2 = importante, 3 = opcional): 1

Nombre del tema: Tipos de enunciados
Prioridad (1 = urgente, 2 = importante, 3 = opcional): 3

Nombre del tema: Adjetivos    
Prioridad (1 = urgente, 2 = importante, 3 = opcional): 2

Temas ordenados alfabeticamente:

Tema: Adjetivos | Prioridad: 2
Tema: Comprension lectora | Prioridad: 1
Tema: Tipos de enunciados | Prioridad: 3

Temas ordenados por prioridad (1 = urgente, 2 = importante, 3 = opcional):

Tema: Comprension lectora | Prioridad: 1
Tema: Adjetivos | Prioridad: 2
Tema: Tipos de enunciados | Prioridad: 3

URL del recurso para el tema "Comprension lectora": https://Recusos.com/Compresonsion/lectora
URL del recurso para el tema "Adjetivos": https://Recursos.com/Adjetivos
URL del recurso para el tema "Tipos de enunciados": https://Recursos/Tipos/enunciados

Repositorio de recursos por tema:

Adjetivos -> https://Recursos.com/Adjetivos
Comprension lectora -> https://Recusos.com/Compresonsion/lectora
Tipos de enunciados -> https://Recursos/Tipos/enunciados

```
#### 🤍 Haz click para volver al [Indice](https://github.com/KatyE0/Curso_Java_G1/blob/main/README.md#-primer-m%C3%B3dulo-)

---
Hecho con 🤍 por Karina Escalante
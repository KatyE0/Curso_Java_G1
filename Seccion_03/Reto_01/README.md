# Reto 02: Factura con RFC opcional

## 🤍 Descripción
El reto consiste en modelar una factura sencilla, que contenga los datos básicos de una compra y, opcionalmente, el RFC del cliente. Se deberá proteger el acceso a los atributos y permitir el uso seguro de null a través de Optional.

## 🤍 Objetivos
- Diseñar una clase Factura aplicando los principios de encapsulación con modificadores de acceso y utilizando la clase Optional para manejar valores que pueden ser nulos, como el RFC del cliente.

## 🤍 Salida esperada 
```bash
javac Main.java
java Main

°°°°° Factura °°°°°°

Monto: $1500.0
Descripción: Compra de equipo
RFC: ABC123456789

°°°°° Factura °°°°°°

Monto: $2000.0
Descripción: Servicio de limpieza
RFC: [No proporcionado]
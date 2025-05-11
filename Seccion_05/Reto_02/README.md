# Reto 02: Sistema de pago con múltiples métodos

## 🤍 Descripción
Este reto simula un módulo para una tienda en línea. El sistema debe permitir procesar pagos mediante diferentes medios: efectivo, tarjeta bancaria o transferencia. Cada tipo de pago debe implementar su lógica de validación y confirmación, pero todos siguen un contrato general. Además, se debe permitir que en el futuro puedan agregarse nuevos métodos sin modificar los ya existentes (principio de extensión).

## 🤍 Objetivos
- Diseñar un sistema de pagos en el que distintos métodos de pago (efectivo, tarjeta, transferencia) compartan una estructura común pero tengan comportamientos específicos. Aplicarás el uso de interfaces, clases abstractas, y polimorfismo para modelar un flujo flexible y extensible.

## 🤍 Salida esperada 
```bash
java CajaRegistradora

 °°°°°° Nuevo Pago °°°°°°
Autenticación exitosa
Procesando pago en efectivo
Tipo de pago: PagoEfectivo
Monto: $150.0

 °°°°°° Nuevo Pago °°°°°°
Autenticación exitosa
Procesando pago con tarjeta
Tipo de pago: PagoTarjeta
Monto: $300.0

 °°°°°° Nuevo Pago °°°°°°
Upp, Algo salio mal aqui :(
Fallo de autenticación.

 °°°°°° Nuevo Pago °°°°°°
Autenticación exitosa
Procesando pago por tranferencia
Tipo de pago: PagoTransferencia
Monto: $250.0

 °°°°°° Nuevo Pago °°°°°°
Upp, Algo salio mal aqui :(
Fallo de autenticación.

```
---
Hecho con 🤍 por Karina Escalante

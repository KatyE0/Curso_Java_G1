public class CajaRegistradora {
    public static void main(String[] args) {

        // Crear un arreglo de pagos con diferentes métodos
        MetodoPago[] pagos = {
                new PagoEfectivo(150.0), //Pago en efectivo
                new PagoTarjeta(300.0, 500.0),  //Pago con tarjeta
                new PagoTarjeta(700.0, 400.0),  //Pago con tarjeta con saldo insuficientes
                new PagoTransferencia(250.0, true), //Pago con transferencia valido
                new PagoTransferencia(6900, false) //Pago con tranferencia NO valido
        };
        // Recorrer el arreglo y procesar cada pago
        for (MetodoPago pago : pagos) {
            System.out.println("\n °°°°°° Nuevo Pago °°°°°°");

            // Verificamos si el método implementa Autenticable
            if (pago.autenticar()) {
               // Autenticable metodo = (Autenticable) pago;
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Upp, Algo salio mal aqui :( \nFallo de autenticación. ");
            }
        }
    }
}
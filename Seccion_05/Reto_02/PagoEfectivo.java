public class PagoEfectivo extends MetodoPago implements Autenticable{
    // Constructor que llama al constructor de la clase padre
    public PagoEfectivo(double monto) {
        super(monto);  // Uso super para acceder al atributo de la clase padre
    }

    //Metodo para validar la operacion
    @Override
    public boolean autenticar() {
        //Para pago en efectivo siempre retorna true (no requiere validación)
        return true;
    }

    // Metodo para procesar el pago
    @Override
    public void procesarPago() {
        System.out.println(autenticar() ? "Autenticación exitosa" : "Error de autenticación");
        System.out.println("Procesando pago en efectivo");

    }
}


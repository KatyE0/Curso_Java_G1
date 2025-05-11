public class PagoTransferencia extends MetodoPago implements Autenticable{
    // Constructor que llama al constructor de la clase padre
    private boolean validacion;
    public PagoTransferencia(double monto, boolean validacion) {
        super(monto);  // Uso super para acceder al atributo de la clase padre
        this.validacion = validacion;
    }

    //Metodo para validar la operacion
    @Override
    public boolean autenticar() {
        // Simula una validación bancaria externa
        return validacion;
    }

    // Metodo para procesar el pago
    @Override
    public void procesarPago() {
        System.out.println(autenticar() ? "Autenticación exitosa" : "Error de autenticación");
        System.out.println("Procesando pago por tranferencia");
    }
}

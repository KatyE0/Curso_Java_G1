public class PagoTarjeta extends MetodoPago implements Autenticable {

    //Declaro el atributo como final, ya que no se modificara una vez asignado
    private final double fondosDisponibles;

    // Constructor
    public PagoTarjeta(double monto, double fondosDisponibles) {
        super(monto);  // Uso super para acceder al atributo de la clase padre
        this.fondosDisponibles = fondosDisponibles;
    }

    //Metodo para validar la operacion
    @Override
    public boolean autenticar() {
        //Valida si hay fondos suficientes
        return fondosDisponibles >= monto;
    }

    // Metodo para procesar el pago
    @Override
    public void procesarPago() {
        System.out.println(autenticar() ? "Autenticación exitosa" : "Error de autenticación");
        System.out.println("Procesando pago con tarjeta");

    }
}

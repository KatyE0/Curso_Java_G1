public abstract class MetodoPago implements Autenticable{
    //Atributo y contructor del monto a pagar
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    //Método abstracto para porcesar el pago
    public abstract void procesarPago();

    //Método que imprime el tipo de pago y el monto
    public void mostrarResumen() {
        //nota: Usa getClass().getSimpleName() para poder ontner el nombre de la clase que indica el tipo de pago
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName());
        System.out.println("Monto: $" + monto);
    }

}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Se crean 2 facturas con el mismo folio pero diferentes clientes y totales.
        Factura fact1 = new Factura("12345", "Kary", 235.50);
        Factura fact2 = new Factura("12345", "Dani", 589.90);

        // Muestra ambas facturas con toString().
        System.out.println("\n°°°°° Facturas creadas °°°°°°°\n");
        System.out.println(fact1);
        System.out.println(fact2);

        //Compara si son iguales con equals().
        System.out.println("¿Las facturas son iguales? " + fact1.equals(fact2));  // true

    }
}
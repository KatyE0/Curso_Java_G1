public class Main {
    public static void main(String[] args) {
        // Crear la Factura con RFC :)
        Factura facturaConRFC = new Factura(1500.00, "Compra de equipo", "ABC123456789");

        // Crear la Factura sin RFC :)
        Factura facturaSinRFC = new Factura(2000.00, "Servicio de limpieza", null);

        // Imprimir el resumen de ambas facturas :)
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}

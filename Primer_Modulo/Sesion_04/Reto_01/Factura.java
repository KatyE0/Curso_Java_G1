public class Factura {
    // Atributos
    private String folio;
    private String cliente;
    private double total;

    // Constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Métodos

    //Metodo equals() para verificar si dos facturas son iguales si tienen el mismo folio
    @Override  // Sobrescribimos equals() para comparar contenido
    public boolean equals(Object obj) {
        if (this == obj) return true; // Esto revisa si es el mismo objeto solo en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura factura = (Factura) obj;
        return this.folio.equals(factura.folio); // Comparamos contenido
    }

    //Metodo que genera un hashCode() basado en el folio
    @Override
    public int hashCode() {
        return folio.hashCode();
    }

    // Metodo  toString() par mostrar info de la factura
    @Override
    public String toString() {
        return "Factura [" +
                "Folio='" + folio + '\'' +
                ", Cliente=' " + cliente + '\'' +
                ", Total=' $ " + total + "]";
    }
}

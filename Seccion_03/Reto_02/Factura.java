import java.util.Optional;

public class Factura {
    // Atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc; 

    // Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc); // Guardo el RFC como Optional
    }

    public String getResumen() {
        // Devuelvo el resumen de la factura
        return "\n°°°°° Factura °°°°°°\n" +
                "\nMonto: $" + monto +
                "\nDescripción: " + descripcion + 
                "\n RFC: " + (rfc.isPresent() ? rfc.get() : "[No proporcionado]");
    }
}
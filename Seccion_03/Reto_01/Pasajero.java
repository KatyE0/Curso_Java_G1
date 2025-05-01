public class Pasajero { 
    // Atributos
    private String nombre;
    private String pasaporte;
    
    // Constructor
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }
    
    // Métodos get para obtener los atributos
    public String getNombre() {
        return nombre;
    }
    public String getPasaporte() {
        return pasaporte;
    }
    
}
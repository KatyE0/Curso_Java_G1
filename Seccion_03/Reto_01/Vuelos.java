public class Vuelos {
    // Atributos
    public static final String codigoVuelo = "Kary123-Vuelos";  // Esto es static y final para que sea único y constante
    private String destino;
    private String horaSalida;
    private String asientoReservado; 

    // Constructor
    public Vuelos(String destino, String horaSalida) {
        this.destino = destino;
        this.horaSalida = horaSalida;
    }   
    // Métodos
    
    // Método para reservar asiento
    public boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null) {
            asientoReservado = nombre;
            return true;
        } else {
            return false;
        }
    }
   
    // Este es el método sobrecargado para reservar asiento
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p.getNombre();
            return true;
        } else {
            return false;
        }
    }
    
    // Método para cancelar reserva
    public void cancelarReserva() {
        asientoReservado = null;
        System.out.println("RESERVA CANCELADA :(");
    } 
    
    // Método para obtener itinerario
    public String obtenerItinerario() {
        return "\n°°°° Itinerario del vuelo °°°° \n\nVuelo: " + codigoVuelo + "\nDestino: " + destino + "\nSalida: " + horaSalida +
               "\nPasajero: " + (asientoReservado != null ? asientoReservado : "No hay reserva") + "\n";
    }

    // Método para obtener el código del vuelo ya que es final y no se puede modificar
    public String getCodigoVuelo() {
        return codigoVuelo;
    }   
}
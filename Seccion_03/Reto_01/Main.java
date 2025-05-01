public class Main {
    public static void main(String[] args) {
        // Creando el primer vuelo :)
        Vuelos vuelo1 = new Vuelos("Nueva York", "15:30");
        
        // Creando a un pasajero
        Pasajero pasajero1 = new Pasajero("Daniela Gonzalez", "12345678A");
        
        // Reservar asiento para el pasajero
        boolean reservaExitosa = vuelo1.reservarAsiento(pasajero1);
        System.out.println(reservaExitosa ? "Reserva realizada :) " : "Error: Asiento ya reservado :(");

        // Mostrar el itinerario del vuelo
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelar reserva
        vuelo1.cancelarReserva();
        System.out.println(vuelo1.obtenerItinerario());

        //Reservar un asiento para otro pasajero
        boolean reservaExitosa2 = vuelo1.reservarAsiento("Diana Olmos", "87654321");
        System.out.println(reservaExitosa2 ? "Reserva realizada :) " : "Error: Asiento ya reservado :(");

        System.out.println(vuelo1.obtenerItinerario());
    }
}
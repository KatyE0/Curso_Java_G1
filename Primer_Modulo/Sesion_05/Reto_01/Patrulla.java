public class Patrulla extends UnidadEmergencia {
    //Atributos
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //Constructor
    public Patrulla(String nombre, Operador operador) {
        super(nombre);
        this.gps = new SistemaGPS(); // Aplicamos la composicion
        this.sirena = new Sirena();
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana.");
    }
    public void iniciarOperacion() {
        System.out.println("\n°°°°° Reporte de estado °°°°°");
        activarUnidad();
        gps.localizar(); // Estos 3 metodos usados con composicoon, se implimen directamente aqui en el metodo iniciarOperacion()
        sirena.activarSirena();
        operador.reportarse();
        responder();

    }

}

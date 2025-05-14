public class Ambulancia extends UnidadEmergencia{
    //Atributos
        // Los atributos son llamados de las clases auxiliares para hacer composición
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //Constructor
    public Ambulancia(String nombre, Operador operador) {
        super(nombre);
        this.gps = new SistemaGPS(); // Aplicamos la composicion
        this.sirena = new Sirena();
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("Ambulancia en camino al hospital más cercano.");
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


public class CentralEmergencias {
    public static void main(String[] args) {
        //Crea una instancia de cada tipo de unidad y su metodo iniciar opracion
            // Ambulancia
        Ambulancia ambulancia = new Ambulancia("Ambulancia", new Operador("Mason"));
        ambulancia.iniciarOperacion();

            // Patrulla
        Patrulla patrulla = new Patrulla("Patrulla", new Operador("Daniel"));
        patrulla.iniciarOperacion();

            // UnidadBomberos
        UnidadBomberos unibomberos = new UnidadBomberos("UnidadBomberos", new Operador("Erika"));
        unibomberos.iniciarOperacion();





    }
}
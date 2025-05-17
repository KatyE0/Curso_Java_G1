import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Abro el Scanner
        AdministrarTemas admid_temas = new AdministrarTemas(scanner);
        AdministrarRecursos admid_recursos = new AdministrarRecursos(scanner);

        //Mando a llamar mis metodos
        admid_temas.registrarTemas(); //Esto le pide al usuario los temas
        admid_temas.OrdenarTemas(); //Esto ordena los temas Alfabeticamente
        admid_temas.prioridadTemas(); //Esto ordena los temas por prioridad

        List<Tema> listaTemas = admid_temas.obtenerTemas(); //Esto recupera los temas para usarlos en el registro de recursos

        admid_recursos.registrarRecursos(listaTemas); //Esto pide al usuario los recursos para cada tema
        admid_recursos.mostrarRecursos(); // Esto solo imprime :)

        scanner.close(); //Cierro el Scanner

    }
}
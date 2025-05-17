import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class AdministrarTemas {
    // Utilizo CopyOnWriteArrayList para crear la lista donde se van a guardar los temas
    private List<Tema> temas = new CopyOnWriteArrayList<>();
    private Scanner scanner; //Abro un Scanner para pedir datos al usuario

    //Constructor
    public AdministrarTemas(Scanner scanner) {
        this.scanner = scanner;
    }

    public void registrarTemas() {
        System.out.print("¿Cuántos temas quieres registrar? "); //Pedimos al usuario que indique el numero de temas que va a consultar
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        // Utilizo un ciclo para tomar y resgistrar los datos
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Nombre del tema: ");
            String nombre = scanner.nextLine();

            System.out.print("Prioridad (1 = urgente, 2 = importante, 3 = opcional): ");
            int prioridad = scanner.nextInt();
            scanner.nextLine();

            // Agregamos los temas y su priopridad en el CopyOnWriteArrayList
            temas.add(new Tema(nombre, prioridad));
        }
    }

    public void OrdenarTemas(){
        // Ordenando los datos alfabeticamente
        Collections.sort(temas); //Uso Collectons.short para ordenar por el orden natural (alfabeticamente ya que son datos String)
        System.out.println("Temas ordenados alfabeticamente:");
        //Utilizo un ciclo para imprimir los datos ordenados
        for (Tema t : temas) { //Utilizo Tema para que imprima el formato que declare en la clase Tema.java
            System.out.println(t);
        }

    }

    public void prioridadTemas(){
        // Commo los temas se ordenan por prioridad (orden personalizado) uso Comparator
        temas.sort(new Comparator<Tema>() { //Llama al metodo sort de CopyOnWriteArrayList para decirle como ordenar los datos
            @Override
            public int compare(Tema a, Tema b) { //Uso el método compare(), para indicar como ordenar
                return Integer.compare(a.prioridad, b.prioridad); // Indicamos que se ordena de menor a mayor prioridad
            }
        });

        //Imprimiendo.... :3
        System.out.println("\nTemas ordenados por prioridad (1 = urgente, 2 = importante, 3 = opcional):");
        for (Tema t : temas) {
            System.out.println(t);
        }

    }

    public List<Tema> obtenerTemas() {
        return temas;
    }

}

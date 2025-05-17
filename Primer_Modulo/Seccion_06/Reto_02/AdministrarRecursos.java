import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class AdministrarRecursos {
    //Uso ConcurrentHashMap para asignar a cada tema su recurso (clave-valor: tema, recurso)
    private ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
    private Scanner scanner;

    //Constructor
    public AdministrarRecursos(Scanner scanner) {
        this.scanner = scanner;
    }

    public void registrarRecursos(List<Tema> temas) {

        // Pido los recursos y relaciono el tema(clave) con su recurso (valor)
        for (Tema tema : temas) {
            System.out.print("URL del recurso para el tema \"" + tema.getTitulo() + "\": "); //mando a llamar el titilo del tema
            String recurso = scanner.nextLine();
            recursos.put(tema.getTitulo(), recurso); // Creo la relacion clave-valor (titulo, recurso)
        }

    }

    public void mostrarRecursos() {
        System.out.println("\nRepositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }
}

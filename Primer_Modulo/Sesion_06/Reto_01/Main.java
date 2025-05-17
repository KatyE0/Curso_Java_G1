import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array list que almacenara las muestras
        ArrayList<String> muestras = new ArrayList<>();
        //Uso Scanner para pedir los datos al usuario
        Scanner scanner = new Scanner(System.in);
        int control_registros = 0;

        //Pedimos al usuario que indique cuantas muestras va a ingresar al sistema :)
        System.out.print(" °°°°°° Sistema de registro de muestras :3°°°°°° \n Ingresa en número de registros por ingresar: ");
        control_registros = scanner.nextInt();
        scanner.nextLine();

        // Usamos un ciclo for para obtener los datos de las muestras
        for (int i=1; i<= control_registros ; i++){
            System.out.print("Ingresa el nombre de la especie #" + i + ": ");
            String muestra = scanner.nextLine();
            muestras.add(muestra);
        }

        // Imprimimos las muestras dadas, igualmete usando un ciclo for
        System.out.println("\n Muestras registradas:");
        for (String muestra : muestras) {
            System.out.println("- " + muestra);
        }


        // Se usa un HashSet para filtrar
        HashSet<String> filtrado= new HashSet<>(muestras); // Aqui se organizan los tatos de "muestras" para quitar duplicados y se guardan en "filtrados"

        //Imprimimos los datos sin duplicados
        System.out.println("\n Especies únicas procesadas:");
        for (String especie : filtrado) {
            System.out.println("- " + especie);
        }

        // HashMaps para asignar ID y encargado
        //Uso dos HasMap para formar dos parejas clave valor
        HashMap<Integer, String> especiesConID = new HashMap<>(); // Se relaciona identificador "id" con la especie (id, especie)
        HashMap<String, String> especieEncargado = new HashMap<>(); // Se relaciona la especie con el encargado (especie, encargado)

        int id = 1; //Inicializo una variable id, para poder asignarla a cada par Clave-Valor
        for (String especie : filtrado) {
            especiesConID.put(id, especie); // Asigno cada especi con su respectiva id con apoyo de la ejecucion del ciclo

            // Obtengo los nombres de cada encargado y lo relaciono con su especie correspondiente
            System.out.print("Ingresa el nombre del encargado para la especie \"" + especie + "\": ");
            String encargado = scanner.nextLine();
            especieEncargado.put(especie, encargado);

            id++; // Actializo mi id
        }

        // Mostrar resultados
        System.out.println("\n Lista de especies con ID y encargado:");
        // Uso un for-each para recorrer todo el conjunto Hashmap (id, especie)
        for (Map.Entry<Integer, String> entry : especiesConID.entrySet()) {
            String especie = entry.getValue(); //Obtengo el nombre de la especie (Valor) con el getValue()
            String encargado = especieEncargado.get(especie); //Obtengo el nombre del encargado correpondiente del HashMap (especie, encargado)
            //Uso get.key para obtener el ID (Clave)
            System.out.println("ID: " + entry.getKey() + " | Especie: " + especie + " | Encargado: " + encargado); //Imprimiendo... :D
        }

        //Codigo para buscar por identificador ID
        System.out.println(" °°°°°° Busqueda °°°°°° \n Ingresa el ID: "); //Pedimos al usuario ingresar el id
        int idBuscar = scanner.nextInt();
        scanner.nextLine();

        String especieBuscada = especiesConID.get(idBuscar); // Buscamos la especie con ese ID
        String encargado = especieEncargado.get(especieBuscada); // Ya que sabemos que especie es, buscamos el encargado de la especie

        System.out.println("\n Investigador responsable de la muestra " + idBuscar + ": " + encargado); //Imprimimos :)

        scanner.close();


    }
}
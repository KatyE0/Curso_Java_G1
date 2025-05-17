import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {

    //Esto crea la cadena de texto de los parametros
    public static String Parametros(String tiempo, String velocidad, String estaciones){
        return "Tiempo de ciclo: " + tiempo + " segundos \n" +  "Velocidad de línea:" + velocidad + " m/s \n" + "Número de estaciones: " + estaciones;
    }

    public static void main(String[] args) {

        //Definir la ruta del archivo parametros.txt dentro de la carpeta config/
        Path rutaCarpeta = Paths.get("config"); //Se usa una ruta carpeta para poder evaluar si dicha carpeta existe
        Path rutaArchivo = Paths.get("config/parametros.txt"); // Ruta Completa del archivo

        try {
            // Crear la carpeta "config" si NO existe
            if (!Files.exists(rutaCarpeta)) { //Busca la retu de la carpeta para ver si existe
                Files.createDirectory(rutaCarpeta); // En caso de que no esxita, crea la carpeta
                System.out.println("Haz creado la carpeta 'config' :) " );
            }

            // Escribir el contenido en el archivo
            Files.write(rutaArchivo,Parametros("55.8", "1.2","8").getBytes()); //Aqui se ingresan los parametros deseados
            //Como se usa Files.write, esto sobreescribe el archivo y si no existe lo crea

            // Validar si el archivo fue creado
            if (Files.exists(rutaArchivo)) { // Files.exists para ver si el archivo parametros.txt existe
                System.out.println("Los parametros se registraron correctamente :D " );

                // Leer el contenido y mostrarlo
                String leerContenido = Files.readString(rutaArchivo); //Uso readString para leer el archivo como una cadena
                System.out.println(leerContenido); //Imprimo el contenido del archivo
            } else {
                System.out.println("Error: El archivo no pudo ser creado D: ");
            }

        } catch (IOException e) {
            System.out.println("Upps!!, algo salio mal \nMensaje de error: " + e.getMessage());
        }

    }
}
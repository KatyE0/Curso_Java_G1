import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AnalizadorDeLogs {
    private int totalLineas=0;
    private int errores = 0;
    private int warnings =0;
    private double porcentajeErrores;
    private double porcentajeWarnings;

    public AnalizadorDeLogs(){
    }

    public static void main(String[] args) {

        Path rutalog = Paths.get("errores.log"); //Introduzco la ruta donde se encuentra el archivo errores.log
        Path rutaErrores = Paths.get("registro_fallos.txt"); //Introduzco la ruta donde se encuentra el archivo registro_fallos.txt

        //Llamo para analizar logs
        AnalizadorDeLogs analizador = new AnalizadorDeLogs();

        //Uso try-with-resources para abrir el archivo y BufferedReader para leerlo
        try (BufferedReader leer_archivo = Files.newBufferedReader(rutalog)) {
            String linea; //Uso esta variable para leer cada linea del archivo
            //Uso un While para controlar que se lea linea x linea hasta terminar el archivo
            while ((linea = leer_archivo.readLine()) != null) {
                analizador.totalLineas++;
                if (linea.contains("ERROR")) { //ESto cuenta la cantidad de errores
                    analizador.errores++;
                }
                if (linea.contains("WARNING")) { //Esto cuenta la cantidad de advertencias
                    analizador.warnings++;
                }
            }

            // Imprimiendo.... :D
            System.out.println("Total de líneas: " + analizador.totalLineas);
            System.out.println("Errores encontrados: " + analizador.errores);
            System.out.println("Warnings encontrados: " + analizador.warnings);

            //Calulo el procentaje de errrores y advertencias
            analizador.porcentajeErrores = (analizador.totalLineas > 0) ? ((double) analizador.errores / analizador.totalLineas) * 100 : 0;
            analizador.porcentajeWarnings = (analizador.totalLineas > 0) ? ((double) analizador.warnings / analizador.totalLineas) * 100 : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", analizador.porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", analizador.porcentajeWarnings);

        }catch (IOException e) { //Captura los errores al leer el archivo y los muestra
            System.err.println("Upps!!!, algo salio mal :( \nError:  " + e.getMessage()); //Muestra el mensaje de error

            // Registra si hay errores al crear el archivo errores.txt
            try (BufferedWriter escribir_errores = Files.newBufferedWriter(rutaErrores, StandardOpenOption.CREATE)) { // Uso StandardOpenOption para crear el archivo si no existe
                escribir_errores.write("Upps!!!. Se produjo un error al leer el archivo 'errores.log' \nError:" + e.getMessage() + "\n");
            } catch (IOException ex) {
                System.err.println("Upps!!!, no se pudo escribir en el archivo de registro de fallos :( \nError: " + ex.getMessage());
            }
        }
    }
}
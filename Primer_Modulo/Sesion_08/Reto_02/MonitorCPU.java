// Importación de clases necesarias
import java.util.HashSet;                  // Para almacenar registros únicos de CPU
import java.util.InputMismatchException;   // Para manejar errores de entrada no numérica
import java.util.Scanner;                  // Para leer datos desde la consola
import java.util.Set;                      // Interfaz para el conjunto de registros

// Clase principal que simula el monitoreo de consumos de CPU introducidos por el usuario
public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Este HashSet simula datos ya registrados anteriormente por el usuario para ver si hay duplicadod
        Set<Integer> registrosCPU = new HashSet<>();

        System.out.println( "°°°°°° Sistema de registro consumo de CPU:3°°°°°°");

        try {
            //Pedimos al usuario que indique cuantas muestras va a ingresar al sistema :)
            System.out.print("Ingresa en número de registros por ingresar: ");
            int control_registros = scanner.nextInt();
            scanner.nextLine();

            // Usamos un ciclo for para obtener los datos
            for (int i = 1; i <= control_registros; i++) {
                System.out.print("Ingresa consumos de CPU en porcentaje (enteros): ");
                int valor = scanner.nextInt();  // Lee el valor ingresado por el usuario

                // Verifica que el valor esté dentro del rango permitido (0-100)
                if (valor < 0 || valor > 100) {
                    System.out.println("Valor fuera de rango. Debe estar entre 0 y 100.");
                    i--;
                    continue;
                }

                // Verifica si el valor ya fue ingresado anteriormente (duplicado)
                if (!registrosCPU.add(valor)) {
                    System.out.println("Valor duplicado, ingresa uno valido. ");
                    i--;
                    continue;
                }

                // Si el valor supera el 95%, se considera crítico y lanza una excepción personalizada
                if (valor > 95) {
                    throw new ConsumoCriticoException("ALERTA: Consumo crítico detectado (" + valor + "%)");
                }
                // Si todo es válido, se acepta el registro
                System.out.println("Registro aceptado: " + valor + "%");

            }

        } catch (InputMismatchException e) {
            // Se activa si el usuario ingresa algo que no es un número entero
            System.out.println("Error: Debes ingresar un número entero válido.");

        } catch (Exception e) {
            // Captura cualquier otro error no esperado
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            // Esta parte siempre se ejecuta, ocurra o no una excepción
            scanner.close();
        }
    }
}

import java.util.Scanner;

public class  Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pacientes paciente_1 = new Pacientes();

        // Datos por teclado
        System.out.println("Nombre: ");
        paciente_1.nombre = entrada.nextLine();
        System.out.println("Edad: ");
        paciente_1.edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Numero de expediente: ");
        paciente_1.num_exp = entrada.nextLine();

        entrada.close();
        paciente_1.mostrarInformacion();
    }
}

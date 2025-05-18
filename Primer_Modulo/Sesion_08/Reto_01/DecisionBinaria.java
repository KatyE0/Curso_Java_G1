//Esta clase se implementa con TransicionHistoria

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public boolean tomarDecision() {
        //Aqui el jugador va a poder tomar una desicion sobre como quiere continuar en el juego
        System.out.println("Eligue la opcion que decidas (A) o (B)");
        System.out.println("Adentrarse a la jungla (A)");
        System.out.print("Ir en dirección al rio (B) \nEligue tu destino jugador: ");
        String entrada = scanner.nextLine();
        return entrada.equalsIgnoreCase("A");
    }
}
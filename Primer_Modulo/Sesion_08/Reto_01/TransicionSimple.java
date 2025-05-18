//Esta clase se implementa con TransicionHistoria

public class TransicionSimple implements TransicionHistoria {
    @Override
    //Aqui el Metodo va indicando como son las escenas
    public void siguienteEscena(LogicaDecision decision, GestorDialogo dialogo) {
        //Aqui se va descibiendo las escenas :3
        if (decision.tomarDecision()) { //Si el jugador decidio A
            dialogo.mostrarDialogo("Decides avanzar a la jungla.");
            System.out.println("Transición a la siguiente escena...");
        } else { //Si el jugador decidio B
            dialogo.mostrarDialogo("Decides seguir el rio.");
            System.out.println("Transición a la siguiente escena...");
        }
    }
}


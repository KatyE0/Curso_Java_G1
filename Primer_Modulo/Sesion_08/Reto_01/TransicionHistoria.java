//Esta intefaz va a controlar el avance en la historia
public interface TransicionHistoria {
    // Metodo para avanzar las escenas dependiendo de la desicion del jugador
    void siguienteEscena(LogicaDecision decision, GestorDialogo dialogo);

}

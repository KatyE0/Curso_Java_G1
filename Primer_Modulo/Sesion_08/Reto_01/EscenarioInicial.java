public class EscenarioInicial {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public EscenarioInicial(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }
    public void iniciarHistoria() {
        dialogo.mostrarDialogo("\n°°°°Bienvenido a Jumanji °°°°° \nTe encuentras en medio de la jungla, que quieres hacer??");
        transicion.siguienteEscena(decision, dialogo);
    }

}
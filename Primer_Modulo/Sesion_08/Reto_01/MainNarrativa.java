//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainNarrativa {

    public static void main(String[] args) {
        //Lamanos los metodos necesarios
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        //Iniciamos la escena inicial del juego
        EscenarioInicial escena = new EscenarioInicial(transicion, dialogo, decision);
        escena.iniciarHistoria();

    }
}
//Esta clase se implementa con TransicionHistoria

public class DialogoTexto implements GestorDialogo {
    @Override
    // Aqui es donde se pueden definir que personajes dicen que cosa :3
    public void mostrarDialogo(String texto) {
        System.out.println("Narrador: " + texto);
    }
}

public class Operador {
    private String nombre; //Atributo

    public Operador(String nombre) { //Constructor
        this.nombre = nombre;
    }

    public void reportarse() {
        System.out.println("Operador " + nombre + " reportándose.");
    }
}
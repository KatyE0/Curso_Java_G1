
//Con esta clase se implementa la intefaz de comparable
public class Tema implements Comparable<Tema> {
    //Atributos
    private String titulo;
    protected int prioridad;

    //Constructor
    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }
    // Metodo get para obtener el titulo de los temas
    public String getTitulo() {
        return titulo;
    }

    //Uso el método de complarable (compareTo()) para poder ordenar los temas por titulos
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // Orden natural: alfabético
    }

    //Creo un método pra poder imprimir los temas junto a su prioridad
    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public abstract class UnidadEmergencia {
    //Tengo que usar protected para poder acceder a el despues desde
    private String nombre;

    //Constructor
    public UnidadEmergencia(String nombre){
        this.nombre=nombre;
    }
    //Metodos

        // Un método responder() → abstracto
    public abstract void responder();
        // Método que imprima un mensaje de activación
    public void activarUnidad(){
        System.out.println("Activando unidad:" + nombre);
    }
}

//Sub clases
//Ambulancia
//Patrulla
//UnidadBomberos

//Clases auxiliares
//SistemaGPS → método localizar()
//Sirena → método activarSirena()
//Operador → atributo nombre, método reportarse()
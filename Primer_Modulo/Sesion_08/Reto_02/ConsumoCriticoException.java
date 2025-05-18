//Esto es una excepcion personalizada
public class ConsumoCriticoException extends Exception {
    // Recibe un mensaje de error
    public ConsumoCriticoException(String mensaje) {
        //Llama al constructor de la clase base (Exception) con el mensaje recibido
        super(mensaje);
    }
}

public record DeclaracionImpuestos(String rfcContribuyente, double montoDeclarado) {
    @Override
    public String toString() {
        return "\n°°°°Declaracion de Impuestos°°°° \n RFC: " + rfcContribuyente +
                "\n Monto Declarado: $" + montoDeclarado;
    }

}

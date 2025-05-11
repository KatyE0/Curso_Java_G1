//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crea una declaración de impuestos.
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("AEBTS026598HYTR", 2500.97);

        //Crea una cuenta fiscal.
        CuentaFiscal cuentaFiscal = new CuentaFiscal("AEBTS026598HYTR", 6900.50);

        //Muestra la información de ambas.
        System.out.println(declaracion);    //Mostrando informacion con un toString desde la clase record
        cuentaFiscal.mostrarInfo();  //Muestra informacion llamando a un metodo en la clase CuentaFiscal

        //Valida si el RFC coincide y muestra el resultado.
        System.out.println("\n¿RFC válido(Es el mismo en ambos casos)?" + cuentaFiscal.validarRFC(declaracion));
        //cuentaFiscal.validarRFC(declaracion);

    }
}
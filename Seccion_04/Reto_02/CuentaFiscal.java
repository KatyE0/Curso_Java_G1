import java.util.Objects;

public class CuentaFiscal {
    //Atributos
    private final String rfc;
    private double saldoDisponible;

    //Constructor con validación para que el saldo no sea negativo
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible >= 0 ? saldoDisponible : 0;
    }
    //Getters para ambos atributos.
    public String getRfc() {
        return rfc;
    }
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    //Metodo que usa el record DeclaracionImpuestos
    public boolean validarRFC(DeclaracionImpuestos d) {
        // Compara el RFC de la cuenta con el de la declaración usando Objects.equals()
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    //Metodo para mostrar informacion de la cuenta
    public void mostrarInfo() {
        System.out.println("\n°°°°Cuenta fiscal°°°° \n RFC: " + rfc +
                "\nSaldo disponible: $" + saldoDisponible);
    }

}

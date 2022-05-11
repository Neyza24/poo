package poo.playground.cuenta;

public class Cuenta {
    private String numero;
    protected double saldo;

    public Cuenta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

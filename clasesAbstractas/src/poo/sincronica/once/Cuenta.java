package poo.sincronica.once;

public abstract class Cuenta {
    private Double saldo;


    public Cuenta(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositarEfectivo (Double montoD);

    public abstract void extraerEfectivo (Double montoE);

    public void informarSaldo () {
        System.out.println("El saldo de tu cuenta es: " + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


}

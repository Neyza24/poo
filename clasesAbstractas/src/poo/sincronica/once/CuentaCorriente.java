package poo.sincronica.once;

public class CuentaCorriente extends Cuenta{
    private Double montoSobregiro;

    public CuentaCorriente(Double saldo, Double montoSobregiro) {
        super(saldo);
        this.montoSobregiro = montoSobregiro;
    }

    @Override
    public void depositarEfectivo(Double montoD) {
        return;

    }

    @Override
    public void extraerEfectivo(Double monto) {

    }
}

package poo.sincronica.once;

public class CajaAhorro extends Cuenta {
    private Double tasaInteres = 0.04;

    public CajaAhorro(Double saldo) {
        super(saldo);
    }


    @Override
    public void depositarEfectivo(Double montoD) {
        System.out.println("Depositaste $ " + montoD);
    }


    @Override
    public void extraerEfectivo(Double montoE) {
        if(montoE <= getSaldo()) {
            setSaldo(getSaldo() - montoE);
                System.out.println("Transacción exitosa");
        } else {
            System.out.println("Saldo insuficiente" );
        }
    }

    public void cobrarInteres() {
        setSaldo((this.tasaInteres) * getSaldo());
        System.out.println("Ingresos por intereses es " + getSaldo());
    }



}

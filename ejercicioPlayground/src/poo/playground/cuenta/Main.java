package poo.playground.cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("345432", 2345);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("32", 0);

        cuenta.saldo = 32;
        cuenta.setNumero("43");



        System.out.println("El numero es: " + cuenta.getNumero());
        System.out.println("Número " + cuentaCorriente.getNumero() + ", saldo " + cuentaCorriente.saldo + ", descubierto "+ cuentaCorriente.getDescubierto());
    }
}

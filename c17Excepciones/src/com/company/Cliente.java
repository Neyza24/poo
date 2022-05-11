package com.company;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private Double saldoEnCuenta;
    private Double deuda;
    private Double limiteCompra;

    public Cliente(String nombre, String apellido, String dni, Double limiteCompra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limiteCompra = limiteCompra;
        deuda = 0.0;
        saldoEnCuenta = 0.0;
    }

    //Constructor con todos los atributos


    public Cliente(String nombre, String apellido, String dni, Double saldoEnCuenta, Double deuda, Double limiteCompra) throws ClienteException {
        if(deuda < 0) {
            throw new ClienteException("Ingresaste una deuda negativa");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldoEnCuenta = saldoEnCuenta;
        this.deuda = deuda;
        this.limiteCompra = limiteCompra;
    }

    public void comprar(Double importe) throws ClienteException {
        //Validamos primero la posible excepción//
        if(importe > limiteCompra) {
            throw new ClienteException("\nTu límite de compra es de " + limiteCompra + " e intentaste comprar algo de valor " +importe);
        }
        //Si todo esta bien se ejecuta este código//
        deuda += importe;
    }

    public void saldarDeuda(Double importe) throws ClienteException{
        if(importe > deuda) {
            throw new ClienteException("\nTu deuda es de " + deuda + " y estas intentando pagar demás " + importe);
        }
        deuda -= importe;
        System.out.println("Se dedujo el importe que realizaste, tu deuda actual es: " + deuda);
    }

}

package com.company;

public class Reserva {
    private String codigo;
    private Integer cantidadPersonas;
    private String estacionDePartida;
    private String estacionDeDestino;

    public Reserva(String codigo, Integer cantidadPersonas, String estacionDePartida, String estacionDeDestino) {
        this.codigo = codigo;
        this.cantidadPersonas = cantidadPersonas;
        this.estacionDePartida = estacionDePartida;
        this.estacionDeDestino = estacionDeDestino;
    }

    public Double calcularPrecio() {
        Double precioBoleto = 50.0;
        Double precioReserva = cantidadPersonas*precioBoleto;

        if((estacionDePartida == "Buenos Aires" && estacionDeDestino == "Bagrado") || (estacionDeDestino == "Buenos Aires" && estacionDePartida == "Bagrado")) {
            precioReserva = (cantidadPersonas*precioBoleto)*0.80;
        }
        return precioReserva;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public String getEstacionDePartida() {
        return estacionDePartida;
    }

    public String getEstacionDeDestino() {
        return estacionDeDestino;
    }
}

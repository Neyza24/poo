package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empresa {
    private List<Reserva> reservas;


    //Constructor
    public Empresa() {
        reservas = new ArrayList<>();
    }

    //Método para agregar reservas
    public void agregarReservas(Reserva reserva) {
        reservas.add(reserva);
    }

    //Cantidad de reservas...

    //Recaudación total
    public Double recaudacionTotal() {
        Double totalPrecioReservas = 0.0;
        for (Reserva reserva : reservas) {
            totalPrecioReservas += reserva.calcularPrecio();
        }
        return totalPrecioReservas;
    }


    public Integer cantVecesRecorridas(String estacion) throws EmpresaException {
        if(!getEstacionesValidas().contains(estacion)) {
            throw new EmpresaException(estacion + " No se encuentra dentro d ela lista de reservas de esta empresa");
        }

        Integer cantidadPersonas = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getEstacionDePartida().equals(estacion) || reserva.getEstacionDeDestino().equals(estacion)) {
                cantidadPersonas += reserva.getCantidadPersonas();
            }
        }
        return cantidadPersonas;
    }



    private List<String> getEstacionesValidas() {
        List<String> estacionesValidas = new ArrayList<>();
        estacionesValidas.add("Buenos Aires");
        estacionesValidas.add("Luján");
        estacionesValidas.add("Mercedes");
        estacionesValidas.add("Suipacha");
        estacionesValidas.add("Chivilcoy");
        estacionesValidas.add("Alberti");
        estacionesValidas.add("Bagrado");
        return estacionesValidas;
    }
}

package com.company;

import java.util.ArrayList;

public class Vuelo implements Observador{
    private String origen;
    private String destino;
    private String horaMinuto;

    public Vuelo(String origen, String destino, String horaMinuto) {
        this.origen = origen;
        this.destino = destino;
        this.horaMinuto = horaMinuto;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println(notificacion + getOrigen() + " - " + getDestino() + " , " + getHoraMinuto());

    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraMinuto() {
        return horaMinuto;
    }

    public void setHoraMinuto(String horaMinuto) {
        this.horaMinuto = horaMinuto;
    }


}

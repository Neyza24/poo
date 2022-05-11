package com.company;

import java.util.ArrayList;

public class CentralItinerarios implements Observable{
    private ArrayList <Observador> observadores = new ArrayList<>();



    @Override
    public void agregar(Observador o) {
        this.observadores.add(o);
    }

    @Override
    public void quitar(Observador o) {
        this.observadores.remove(o);
    }

    @Override
    public void notificar(String detalleVuelo) {
        for (Observador o : observadores) {
            o.actualizar(detalleVuelo);
        }
    }

    public void disponibilidadProxima() {
        notificar("Próximo vuelo disponible: " );
    }



}

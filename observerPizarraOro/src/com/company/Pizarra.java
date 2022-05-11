package com.company;

import java.util.ArrayList;

public class Pizarra implements PizarraObservable{
    private float precioActual;
    private ArrayList<Observador> observadores = new ArrayList<>();

    public void cambiarPrecio(float price) {
        this.precioActual = price;
        notificar(" precio actualizado a " + obtenerPrecio());
    }

    public float obtenerPrecio() {
        return precioActual;
    }


    @Override
    public void agregar(Observador o) {
        this.observadores.add(o);
    }

    @Override
    public void quitar(Observador o) {
        this.observadores.remove(o);
    }

    @Override
    public void notificar(String cambio) {
        for (Observador o : observadores) {
            System.out.println(o.actualizar() + cambio);

        }

    }
}

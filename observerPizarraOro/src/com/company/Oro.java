package com.company;

public class Oro implements Observador{

    @Override
    public String actualizar() {
        return this + "> Cambio de estado: ";
    }
}

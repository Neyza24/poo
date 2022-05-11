package com.company;

public class Caja extends Producto{
    private Double longitus;
    private Double ancho;
    private Double altura;

    public Caja(Double peso, Double longitus, Double ancho, Double altura) {
        super(peso);
        this.longitus = longitus;
        this.ancho = ancho;
        this.altura = altura;
    }


    @Override
    public Double calcularEspacio() {
        return null;
    }
}

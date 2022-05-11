package com.arcade.game;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public void girar(char direccion) {
        super.direccion = direccion;
    }

    public void restaVidas(int valor) {
        this.vida = vida - valor;
    }

}

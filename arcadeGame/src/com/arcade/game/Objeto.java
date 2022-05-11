package com.arcade.game;

public class Objeto {
    private int posx;
    private int posy;
    char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion) {
        System.out.println("Vas en la posición: ("+ x +", "+ y +")" + " con dirección: " + direccion);
    }

}

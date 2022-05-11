package com.company;

public abstract class Arma {
    private Policia policia;
    private Integer cantidadMuniciones;
    private Double alcanceAprox;
    private String marca;
    private Integer calibre;
    private String estado;

    public Arma(Policia policia, Integer cantidadMuniciones, Double alcanceAprox, String marca, Integer calibre, String estado) {
        this.policia = policia;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceAprox = alcanceAprox;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Boolean estaEnCondicionDeUso() {
        if((this.estado == "EN USO") && (this.calibre >= 9)) {
            System.out.println("Esta en condiciones de uso");
            return true;
        } else {
            System.out.println("No esta en condiciones de uso");
            return false;
        }
    }

    public Double getAlcanceAprox() {
        return this.alcanceAprox;
    }
}

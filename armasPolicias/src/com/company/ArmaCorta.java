package com.company;

public class ArmaCorta extends Arma{
    private Boolean esAutomatica;

    public ArmaCorta(Policia policia, Integer cantidadMuniciones, Double alcanceAprox, String marca, Integer calibre, String estado) {
        super(policia, cantidadMuniciones, alcanceAprox, marca, calibre, estado);
        this.esAutomatica = true;
    }

    public Boolean disparaAMasDe200() {
        if(super.getAlcanceAprox() > 200) {
            return true;
        } else{
            return false;

        }
    }

    public String esAutomatica() {
        if(this.esAutomatica) {
            return "Es automática";
        } else {
            return "No es automática";
        }
    }
}

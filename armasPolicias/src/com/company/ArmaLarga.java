package com.company;

public class ArmaLarga extends Arma implements Comparable{
    private Boolean tieneSelloRenar;
    private String descripcionDeUso;
    private Integer nivelDelArma;

    public ArmaLarga(Policia policia, Integer cantidadMuniciones, Double alcanceAprox, String marca, Integer calibre, String estado, Boolean tieneSelloRenar, String descripcionDeUso, Integer nivelDelArma) {
        super(policia, cantidadMuniciones, alcanceAprox, marca, calibre, estado);
        this.tieneSelloRenar = tieneSelloRenar;
        this.descripcionDeUso = descripcionDeUso;
        this.nivelDelArma = nivelDelArma;
    }


    @Override
    public int compareTo(Object o) {
        ArmaLarga otraArma = (ArmaLarga) o;
        if(this.nivelDelArma > otraArma.nivelDelArma) {
            return 1;
        }
        if(this.nivelDelArma < otraArma.nivelDelArma) {
            return -1;
        }
        return 0;
    }

}

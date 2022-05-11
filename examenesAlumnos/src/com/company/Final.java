package com.company;

public class Final extends Examen implements Comparable{
    private Double notaOral;
    private String descripcionOral;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    @Override
    public Boolean estaAprobado() {
        if(super.getNota() >= 4 && this.notaOral >= 4) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        //Casteamos para poder comparar//
        Final otroExamenFinal = (Final) o;

        if(this.promedioNota() > otroExamenFinal.promedioNota()) {
            return 1;
        }
        if(this.promedioNota() < otroExamenFinal.promedioNota()) {
            return -1;
        }
        return 0;
    }

    public Double promedioNota() {

        return (super.getNota() + this.notaOral)/2;
    }
}

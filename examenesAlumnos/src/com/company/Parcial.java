package com.company;

public class Parcial extends Examen{
    private Integer numeroDeUnidad;
    private Integer numeroDeReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer numeroDeUnidad) {
        super(alumno, titulo, enunciado, nota);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeReintentos = 0;
    }

    public Boolean esPosibleRecuperar() {
        if(!super.estaAprobado()) {
            numeroReintentos();
            System.out.println("Tienes: " + this.numeroDeReintentos + " intentos");
            return true;
        } else {
            System.out.println("Aprobaste el examen!!!, no necesitas recuperarlo.");
            return false;
        }
    }

    public void numeroReintentos(){
            if(this.numeroDeUnidad <= 3) {
                this.numeroDeReintentos = 3;
            } else {
                this.numeroDeReintentos = 2;
            }
    }


}

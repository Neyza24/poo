package com.sincronica.seiss;

public class Perro {
    private String nombrePila;
    private String raza;
    private Integer anioNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean estaEnAdopcion;
    private Boolean estaLastimado;


    public Perro(Integer anioNacimiento, Boolean tieneChip, boolean estaLastimado, Double peso) {
        this.anioNacimiento = anioNacimiento;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.peso = peso;
    }

    public Perro(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Integer edadPerro () {
        Integer edad = 2022 - this.anioNacimiento;
        return edad;
    }


    public void enAdopcion(){
        //return !this.estaLastimado && this.peso > 0;
            if((!this.estaLastimado) && (this.peso > 5.0)) {
                System.out.println(this.nombrePila + " se puede adoptar");
            } else{
                System.out.println(this.nombrePila + " no se puede adoptar");
            }
    }

    public void factibleDePerderse() {
        if(this.tieneChip) {
            System.out.println("No hay probabilidad de que se pierda");
        }else{
            System.out.println("Si hay probabilidad de que se pierda");
        }
    }
//--------------------------Getters and Setters----------------------//



}

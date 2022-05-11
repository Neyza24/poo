package com.company;

public class Particular extends Paciente{
    private Double precioConsulta;
    private Integer dni;


    public Particular(Consulta consulta, String fechaNacimiento, String nombre, String apellido, String primeraConsulta, Double precioConsulta, Integer dni) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraConsulta);
        this.precioConsulta = precioConsulta;
        this.dni = dni;
    }


}

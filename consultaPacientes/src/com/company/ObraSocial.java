package com.company;

public class ObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private Integer numeroAsociado;


    public ObraSocial(Consulta consulta, String fechaNacimiento, String nombre, String apellido, String primeraConsulta, String nombreObraSocial, Integer numeroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }


    @Override
    public int compareTo(Object o) {
        //Casteo para poder comparar
        ObraSocial otroPaciente = (ObraSocial) o;
        if(this.numeroAsociado > otroPaciente.numeroAsociado) {
            return 1;
        }
        if(this.numeroAsociado < otroPaciente.numeroAsociado) {
            return -1;
        }
        return 0;
    }
}

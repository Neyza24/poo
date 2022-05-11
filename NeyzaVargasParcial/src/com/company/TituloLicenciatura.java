package com.company;

public class TituloLicenciatura extends Titulo implements Comparable{
    private String temaDeTesis;
    private String fechaEntregaTesis;
    private Integer cantidadTrabajosDeInvestigacion;

    public TituloLicenciatura(Persona persona, Integer cantidadDeMaterias, String fechaInicioEstudios, String fechaFinalizaciónEstudios, String tieneSelloMinisterio, String tieneSelloInstituto, String temaDeTesis, String fechaEntregaTesis, Integer cantidadTrabajosDeInvestigacion) {
        super(persona, cantidadDeMaterias, fechaInicioEstudios, fechaFinalizaciónEstudios, tieneSelloMinisterio, tieneSelloInstituto);
        this.temaDeTesis = temaDeTesis;
        this.fechaEntregaTesis = fechaEntregaTesis;
        this.cantidadTrabajosDeInvestigacion = cantidadTrabajosDeInvestigacion;
    }


    @Override
    public int compareTo(Object o) {
        TituloLicenciatura otroTituloLicenciatura = (TituloLicenciatura) o;

        if(this.cantidadTrabajosDeInvestigacion > otroTituloLicenciatura.cantidadTrabajosDeInvestigacion) {
            return 1;
        }
        if (this.cantidadTrabajosDeInvestigacion < otroTituloLicenciatura.cantidadTrabajosDeInvestigacion) {
            return -1;
        }
        return 0;
    }
}

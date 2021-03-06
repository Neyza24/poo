package com.company;

public abstract class Titulo {
    private Persona persona;
    private Integer cantidadDeMaterias;
    private String fechaInicioEstudios;
    private String fechaFinalizaci√≥nEstudios;
    private String tieneSelloMinisterio;
    private String tieneSelloInstituto;

    public Titulo(Persona persona, Integer cantidadDeMaterias, String fechaInicioEstudios, String fechaFinalizaci√≥nEstudios, String tieneSelloMinisterio, String tieneSelloInstituto) {
        this.persona = persona;
        this.cantidadDeMaterias = cantidadDeMaterias;
        this.fechaInicioEstudios = fechaInicioEstudios;
        this.fechaFinalizaci√≥nEstudios = fechaFinalizaci√≥nEstudios;
        this.tieneSelloMinisterio = tieneSelloMinisterio;
        this.tieneSelloInstituto = tieneSelloInstituto;
    }

    public Boolean sePuedeEjercer() {
        if(this.tieneSelloMinisterio == "SI" && this.tieneSelloInstituto == "SI") {
            return true;
        } else {
            return false;
        }
    }


}

package com.company;

public class TitutloTerciario extends Titulo{
    private String validacion;


    public TitutloTerciario(Persona persona, Integer cantidadDeMaterias, String fechaInicioEstudios, String fechaFinalizaci√≥nEstudios, String tieneSelloMinisterio, String tieneSelloInstituto, String validacion) {
        super(persona, cantidadDeMaterias, fechaInicioEstudios, fechaFinalizaci√≥nEstudios, tieneSelloMinisterio, tieneSelloInstituto);
        this.validacion = validacion;
    }

    public Boolean esValidoANivelNacional() {
        if(this.validacion == "NACIONAL") {
            return true;
        } else {
            return false;
        }
    }
}

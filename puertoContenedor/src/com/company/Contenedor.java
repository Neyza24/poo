package com.company;

import java.util.Objects;

public class Contenedor implements Comparable <Contenedor>{
    private Integer numIdentificacion;
    private String paisProcedencia;
    private Boolean contieneMaterialPeligroso;

    public Contenedor(Integer numIdentificacion, String paisProcedencia, Boolean contieneMaterialPeligroso) {
        this.numIdentificacion = numIdentificacion;
        this.paisProcedencia = paisProcedencia;
        this.contieneMaterialPeligroso= contieneMaterialPeligroso;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if(this.numIdentificacion > contenedor.numIdentificacion) {
            return 1;
        }
        if(this.numIdentificacion < contenedor.numIdentificacion) {
            return -1;
        }
        return 0;
    }

    public Integer getNumIdentificacion() {
        return this.numIdentificacion;
    }

    public Boolean getcontieneMaterialPeligroso() {
        return this.contieneMaterialPeligroso;
    }

    public String getPaisProcedencia() {
        return this.paisProcedencia;
    }

    @Override
    public String toString() {
        return "Número de identificación: " + numIdentificacion + " Pais de procedencia: " + paisProcedencia + " Marca: " + contieneMaterialPeligroso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paisProcedencia);
    }


}

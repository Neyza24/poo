package com.sincronica.seis;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaDeFabricacion;
    private Integer hojasDisponibles;


    public Impresora(String modelo, String tipoConexion, String fechaDeFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.hojasDisponibles = 0;
    }

    public Impresora(String modelo, String tipoConexion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaDeFabricacion = "";
        this.hojasDisponibles = 0;
    }


    private Boolean tienePapel() {
        /*
        if(this.hojasDisponibles > 0) {
            return true;
        } else {
            return false
        }

         */
        return this.hojasDisponibles > 0;
    }


    public void imprimir(String texto){
        if(tienePapel()){
            System.out.println(texto);
            hojasDisponibles--;
        }else{
            System.out.println("No hay hojas disponibles");
        }
    }


    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public String getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setHojasDisponibles(Integer hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }
}

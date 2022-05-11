package poo.asincronica.navetur;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private String eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, String eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }



    public Double calcularMontoAlquiler() {
        if(anioFabricacion < 2020) {
            return precioBase + valorAdicional;
        } else {
            return precioBase;
        }
    };


    public Capitan getCapitan() {
        return capitan;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }


}

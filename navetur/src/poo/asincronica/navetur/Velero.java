package poo.asincronica.navetur;

public class Velero extends Embarcacion {
    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, String eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }


    public Boolean evaluarTamanio() {
        return cantidadMastiles > 4;
    }

}

package poo.asincronica.navetur;

public class Yate extends Embarcacion implements Comparable {
    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, String eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }


    @Override
    public int compareTo(Object object) {
        //tengo que indicarle que el objeto que recibí por parametro es un yate casteamos//
        Yate otroYate = (Yate) object;

        if(this.cantidadCamarotes > otroYate.cantidadCamarotes) {
            return 1;
        } if (this.cantidadCamarotes > otroYate.cantidadCamarotes) {
            return -1;
        }
        return 0;
    }
}

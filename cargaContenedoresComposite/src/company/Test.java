package company;

import com.sun.tools.javac.Main;

public class Test {
    public static void main(String[] args) {

        Barco titanic  = new Barco();
        CargaPesableFactory fabrica = CargaPesableFactory.getInstance();


        titanic.agregarCarga(fabrica.generarCarga("ELECTRODOMESTICOS"));
        titanic.agregarCarga(fabrica.generarCarga("MEDICAMENTOS"));

        titanic.agregarCarga(fabrica.generarCarga("CONTENEDOR"));
        titanic.generarDetalleDeCargas();

    }
}

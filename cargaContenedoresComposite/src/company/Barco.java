package company;

import java.util.ArrayList;
import java.util.List;

public class Barco {
    private List<CargaPesable> cargasPesables;

    public Barco() {
        cargasPesables = new ArrayList<>();
    }


    public void agregarCarga(CargaPesable cargaPesable) {
        cargasPesables.add(cargaPesable);
    }

    public void generarDetalleDeCargas() {
        for (CargaPesable cargaPesable : cargasPesables) {
            System.out.println(cargaPesable);
        }

    }


}

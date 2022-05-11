package company;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends CargaPesable{
    private Double pesoDelContenedor;
    private List<CargaPesable> cargasPesables;

    public Contenedor(String nombre, String descripcion, Double pesoDelContenedor) {
        super(nombre, descripcion);
        this.pesoDelContenedor = pesoDelContenedor;
        cargasPesables = new ArrayList<>();
    }

    public void agregarCarga(CargaPesable cargaPesable) {
        cargasPesables.add(cargaPesable);
    }

    @Override
    public Double calcularPeso() {
        Double pesoTotalContenedor = 0.0;
        for (CargaPesable carga : cargasPesables) {
            pesoTotalContenedor += carga.calcularPeso();
        }
        return pesoTotalContenedor + this.pesoDelContenedor;
    }


}

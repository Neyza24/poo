package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores;

    public Puerto() {
        contenedores = new ArrayList<>();
    }

    public void addContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        contenedores.sort(null);
        for(Contenedor contenedor: contenedores) {
            System.out.println(contenedor);
        }
    }

    public Integer cantidadContendoresDesconocidos() {
        Integer contador = 0;
        for( Contenedor contenedor: contenedores) {
            if(contenedor.getPaisProcedencia() == "DESCONOCIDO" && contenedor.getcontieneMaterialPeligroso()) {
                contador++;
            }
        }
        return contador;
    }

    public List<Contenedor> getContenedores() {
        return this.contenedores;
    }


}

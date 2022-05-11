package com.company;

public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory() {

    }

    public static ProductoFactory getInstance() {
        if(instance == null) {
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto generarProducto(String codigo) {
        switch (codigo) {
            case "CAJA10X10":
                return new Caja(20.0, 10.0, 10.0, 10.0);
            case "PELOTAFULTBOL":
                return new Pelota(20.0, 11.0);
            case "PELOTATENIS":
                return new Pelota(20.0, 0.32);
        }
        return null;
    }
}

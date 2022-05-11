package com.pizza;

public class ProductoComprableFactory {

    private static ProductoComprableFactory instance;

    private ProductoComprableFactory() {

    }

    public static ProductoComprableFactory getInstance() {
        if(instance == null){
            instance = new ProductoComprableFactory();
        }
        return instance;
    }

    public ProductoComprable generarProducto(String codigo) {
        switch (codigo){
            case "MUZZARELLA" :
                return new Pizza("muzzarella","rica rica",700.0,"chica");
            case "ESPECIAL" :
                return new Pizza("Especial","rica rica",850.0,"chica");
            case "ANANA" :
                return new Pizza("Anana","rica rica",950.0,"chica");
            case "LOCA" :
                Combinada loca = new Combinada("LOCAL","algo");
                loca.agregarProducto(generarProducto("ESPECIAL"));
                loca.agregarProducto(generarProducto("ANANA"));
                return loca;
        }
        return null;
    }


}

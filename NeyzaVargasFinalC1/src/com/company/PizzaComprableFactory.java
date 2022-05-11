package com.company;

public class PizzaComprableFactory {
    private static PizzaComprableFactory instance;

    private PizzaComprableFactory() {

    }

    public static PizzaComprableFactory getInstance() {
        if(instance == null) {
            instance = new PizzaComprableFactory();
        }
        return instance;
    }

    public  PizzaComprable generarProducto(String codigo) {
        switch (codigo) {
            case "MUZZARELLA":
                return new Simple("Muzzarella", "Delicioso queso cremoso ", 700.0, "Grande");
            case "ESPECIAL":
                return new Simple("Especial", "Delicioso combinación de ingredientes", 850.0, "Chica");
            case "ANANA":
                return new Simple("Ananá", "Delicioso pizza con un toque dulce", 950.0, "Chica");
            case "COMBINADA":
                Combinada loca = new Combinada("Combinada loca", "Exquisita pizza, con una explosión de sabores");
                loca.agregarProducto(generarProducto("ESPECIAL"));
                loca.agregarProducto(generarProducto("ANANA"));
                return loca;
        }
        return null;
    }
}

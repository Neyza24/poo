package com.company;

public class Main {
    public static void main(String[] args) {
        Pizza muzzarella = new Pizza("Muzzarella", "Pequeña", 700.0);
        Pizza especial = new Pizza("Especial", "Pequeña", 850.0);
        Pizza ananá = new Pizza("Ananá", "Pequeña", 950.0);
        System.out.println("\n------------------------------------------------Pizzas Graandes------------------------------------------");
        Pizza mozzarellaGrande = new Pizza("Mozzarella", "Grande", 700.0);
        mozzarellaGrande.descripcionProducto();
        Pizza especialGrande = new Pizza("Especial", "Grande", 850.0);

        System.out.println("\n------------------------------------------------Pizzas Graandes------------------------------------------");


        System.out.println("\n------------------------------------------------Combinada------------------------------------------");

        Combinada combinada1 = new Combinada("Combinada loca");
        combinada1.agregarPizza(especial);
        combinada1.agregarPizza(ananá);
        combinada1.mostrarDetalle();

        SistemPizzeria pizzeria = new SistemPizzeria();
        pizzeria.agregarPizzas(combinada1);


        System.out.println(pizzeria.calcularPrecioProductos());




    }
}

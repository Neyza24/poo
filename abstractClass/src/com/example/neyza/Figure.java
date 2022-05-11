package com.example.neyza;
//No podemos usar clases abstractas para instanciar objetos; debemoscrear sub clases para instanciar de  esta clase
//Para que una clase se identifique como abstracta agrego la palabra reservda abstract
public abstract class Figure {
    public void display () {
        System.out.println("Hola");
    }

    public abstract double calcularArea();
}

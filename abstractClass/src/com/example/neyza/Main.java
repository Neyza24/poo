package com.example.neyza;

public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        Circle c = new Circle();
        s.setSide(3);
        c.setRadius(3);
        System.out.println("Square area: " + s.calcularArea());
        System.out.println("Circle area: " + c.calcularArea());

    }
}

//¿Pará qué nos sirve crear utilizar clases abstractas si además debemos crear sub clases para poder instanciar y utilizar los objetos?
// Definimos lo que queremos que haga un objeto Ejemplo: calcular el área de una figura geométrica, pero pueden haber muchas figuras y no podemos aplicar el mismo método para calcular
// Al utilizar una sub clase voy a estar definiendo un método abstracto específico de cada figura
//El como van a ser los métodos se delegan a las sub clases
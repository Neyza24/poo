package com.example.neyza;

public class Square extends Figure {
    private double side;

    public void setSide (double side) {
        this.side = side;

    }
    @Override
    public double calcularArea() {
        return side * side;
    }
}

package com.example.neyza;

public class Circle extends Figure {
    private double radius;

    public void setRadius( double radius) {
        this.radius = radius;
    }

    @Override
    public double calcularArea() {
        return 3.14*radius*radius;
    }
}

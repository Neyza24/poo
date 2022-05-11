package com.example.neyza;

public class Dog extends Animal{
    //Anotación
    @Override
    //Para aplicar polimorfismo, hacemos es sobrescribir su implementación
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleep");
    }

}

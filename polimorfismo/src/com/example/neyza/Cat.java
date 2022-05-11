package com.example.neyza;

public class Cat extends Animal{
    //Anotación
    @Override
    //Para aplicar polimorfismo, hacemos es sobrescribir su implementación
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleep");
    }
}

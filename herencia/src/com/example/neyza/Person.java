package com.example.neyza;

public class Person {
    private String name;
    private int age;
//Creamos el constructor
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
//Generamos los getter (get) para name y age

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

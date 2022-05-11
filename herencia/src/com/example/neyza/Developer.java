package com.example.neyza;

//La forma en que se indica herencia es con la palabra reservada extends y seguido de la clase de la que s eva heredar
public class Developer extends Person {
    //Definimos los atributos de debeloper:
    private double salary;
    private String company;

    //Constructor:
    public Developer (String name, int age, double salary, String company) {
        super (name, age); //Mandamos a llamar al constructor de person con la palabra super
        this.salary = salary;
        this.company = company;
    }

    //Según el diagrama debemos implementar un método show info
    public void showInfo () {
        System.out.println("Name: " + getName() + " \nAge: " + getAge() + " \nSalary: " + salary + " \nCompany is: " + company);
    }
}

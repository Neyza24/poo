package com.example.neyza;

public class Student extends Person {
    private double score;
    private String school;

    public Student (String name, int age, double score, String school) {
        super (name, age); //Mandamos a llamar al constructor de person con la palabra super
        this.score = score;
        this.school = school;
    }
    //Según el diagrama debemos implementar un método show info
    public void showInfo () {
        System.out.println("Name: " + getName() + " \nAge: " + getAge() + " \nScore: " + score + " \nSchool is: " + school);
    }

}

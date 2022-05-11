package com.example.neyza;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Peter", 25, 25000, "Google");
        dev.showInfo();

        System.out.println("-------------------------subclase student-------------");


        Student student = new Student("Andres", 21, 7.5, "Harvard");
        student.showInfo();
    }
}

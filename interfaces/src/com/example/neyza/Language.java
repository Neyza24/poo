package com.example.neyza;

public interface Language {
    void sayHi();

    default void sayBye() {
        System.out.println("Bye interface");

    }
}

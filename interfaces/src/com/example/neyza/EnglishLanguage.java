package com.example.neyza;

public class EnglishLanguage implements Language{
    @Override
    public void sayHi() {
        System.out.println("Learning english");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye, friends");
    }


}

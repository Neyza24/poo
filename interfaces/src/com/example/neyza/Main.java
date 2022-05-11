package com.example.neyza;

public class Main {
    public static void main(String[] args) {
        EnglishLanguage english = new EnglishLanguage();
        ProgrammingLanguage pg = new ProgrammingLanguage();
        english.sayHi();
        pg.sayHi();

        System.out.println("-------------------------------😁------------------------");
        english.sayBye();
        pg.sayBye();
    }
}


//Métodos por default en las interfaces, ya en lo real podemos tener decenas de clases implementando la misma interface y es ahí entran los métodos default
//Las clases en las que use la interface deben darle una funcionalidad a los métodos que vaya a crear en la interface
//Para convertir a un métooo por default este no puede ser abstracto debe haber algo en el cuerpo podemos la palabra reservada default
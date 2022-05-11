package com.example.neyza;

public class Main {

    public static void main(String[] args) {
        //Level level = Level.EASY;
        //System.out.println(level);
        /*
        Level [] allLevels = Level.values();
        for (Level level : allLevels) {
            System.out.println(level);
        }
         */

        //Enums con switch case:
        Level level = Level.HARD;
        switch (level) {
            case EASY:
                System.out.println("El nivel es fácil");
                break;
            case NORMAL:
                System.out.println("El nivel es normal");
                break;
            case HARD:
                System.out.println("El nivel es difícil");
                break;
        }

    }
}


//Un enum es la contracción para enumeración es un tipo de dato por referencia, que nos permite representar un conjunto de constantes
//Es decir valores que no van a poder ser modificados durante el transcurso del programa
//Una buena práctica es crear las enums en un archivo propio; se crea similar a una clase, se va al paquete y dar enum
//En switch no ponemos un default ya que no puede tomar otro valor que no este definido en el enum

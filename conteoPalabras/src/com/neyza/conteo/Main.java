package com.neyza.conteo;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ConteoPalabras conteo = new ConteoPalabras(); //Creando un objeto dela clase conteo palabras
        File file = new File("input.txt"); //Le pasamos la ruta del archivo
        String[] lines = conteo.readFile(file); //
        //System.out.println(lines[1]);
        int words = lines.length; //creando una variable int para almacenar el total de palabras que están en el archivo
        //System.out.println(words);
        boolean result = conteo.showResult(words, lines);
        if (result) {
            System.out.println("Todo salió bien :)");
        } else {
            System.out.println("Hubo un error");
        }
    }
}

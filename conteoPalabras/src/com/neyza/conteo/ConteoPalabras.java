package com.neyza.conteo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConteoPalabras {
    //Creamos dos métodos uno para leer y otro para contar
    public String[] readFile(File file) {
        String lines = "";
        try {
            Scanner sc = new Scanner(file); //Scanner para leer el archivo
            while (sc.hasNextLine()) { //Para leer todas las líneas que tenga
                lines += sc.nextLine(); //Almancenamos en nuestra variable lines, se va ir sobrescribiendo en cada iteración, se va concatenando
            }
        } catch (FileNotFoundException e) {
            System.out.println("Excepción al leer el archivo: " + e);
        }
        return lines.split(" "); //split nos permite separar un string en multiples partes y la almacena en un arreglo de strings
    }
    //Creando un segundo método que retorna booleano
    public boolean showResult(int words, String[] lines) {
        boolean result = false;
        File file = new File("result.txt");
        try{
            FileWriter fw = new FileWriter(file);
            String aux = "";
            for (String line : lines) {
                aux += line;
                aux += " ";
            }
            //System.out.println(aux);
            fw.write("El archivo tiene: " +  words + " palabras" + "\n" + aux);
            fw.close();
            result = true;

        } catch (IOException e) {
            System.out.println("Excepción al crear el archivo: " + e);
        }
        return result;

    }

}

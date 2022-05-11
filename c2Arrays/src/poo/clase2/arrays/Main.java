package poo.clase2.arrays;

public class Main {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        nombres[0] = "Juan";
        nombres[1] = "Juana";
        nombres[2] = "Juanita";
        nombres[3] = "Maria";
        nombres[4] = "Percimon";

        /*Para saber la longitud del array*/
        System.out.println(nombres.length);

        /*acceder a un elemento por su indice*/
        System.out.println(nombres[3]);

        /*descomentar y ver que sucede accediendo a una posicion fuera de rango*/
        //System.out.println(nombres[7]);

        /*recorrer un array con un ciclo for*/
        for(int i = 0; i<nombres.length; i++)
            System.out.println(nombres[i]);

        /*recorrer un array con un ciclo while*/
        int i = 0;
        while(i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }

        /*recorrer un array con un ciclo for each*/
        for(String nombre : nombres)
            System.out.println(nombre);

    }
}

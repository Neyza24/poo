package com.neyza.strings;

//Métodos de indexación, modificación e inspección
//Método de indexación --> Podemos hacer una equivalencia de un String con lo que conocemos como un arreglo(array) de caracteres


import java.util.Locale;

public class ManipulacionStrings {
    public static void main(String[] args) {
        /*Métodos de indexación
        String s1 = "Hola mundo";
        //Método length--->Retorna la longitud del string
        int longitud = s1.length();
        System.out.println(longitud);
        //Método char--->Retorna el caracter que se encuentre en la posición que solicitamos
        char c = s1.charAt(0); //Le pasamos la posición
        System.out.println(c);
        //Método indexOf--->Retorna el índice del caracter que le pasemos como parámetro y si hubieran varios caracteres iguales, retorna el índice del primero que encuentra
        int index = s1.indexOf("l");
        System.out.println(index);
        //Sustrings---> Nos retorna una sub cadena de la cadena que le pasemos; le pasamos 2 parámetros: el índice en el que va empezar y el índice donde va terminar
        String s2 = s1.substring(0, 3); //el primer parámetro es inclusivo(si lo toma en cuenta) y el segundo parámetro no es inclusivo(no lo toma en cuenta)
        System.out.println(s2);
        //Este método esta sobrecargado en la clase String
        //Cuando le pasamos solo un parámetro, va tomar en cuenta desde donde le pase el índice hasta que termine la cadena:
        String s3 = s1.substring(5);
        System.out.println(s3);
         */

        /*Métodos de modificación
        //Método concat ---> Permite concatenar una cadena con otra que le pasemos
        //Retorna una nueva cadena ya concatenada
        String s1 = "Hola mundo";
        String s2 = s1.concat(" .Bienvenidos a catlanndia");
        System.out.println(s2);

        //toLowerCase ---> Cambiar una cadena de string a minúscula
        String s3 = s1.toLowerCase();
        System.out.println(s3);

        //toUpperCase ----> Cambia una cadena de string a Mayúscula
        String s4 = s1.toUpperCase();
        System.out.println(s4);

        //replace ---> Nos permite cambiar un carácter o cadena por otra: recibe dos parámetros, el caracter o cadena que se va reemplazar y el segundo parámetro el nuevo carácter o cadena
        //Si queremos cambiar el tipo de espacio entre cada palabra sería:
        String s5 = s2.replace(" ", "_");
        System.out.println(s5);

        //Otra forma más prolija de aplicar métodos sin tener que crear muchas variables sería:
        String cadena = "Buenos días";
        String cadenaModificada = cadena.concat(", en que te puedo ayudar?")
                .toUpperCase()
                .replace(" ", "_");
        System.out.println(cadenaModificada);
         */

        //Métodos de inspección ---> Retornan true o false

        //Método isEmpty---> Nos retorna true si la cadena esta vacía y false si la la cadena noe sta vacía
        String s1 = "Hola mundo";
        String s2 = "";
        System.out.println(s1.isEmpty()); // False, ya que no esta vacía
        System.out.println(s2.isEmpty()); //True, por que la cadena esta vacía

        //Método contains---> Nos permite inspeccionar si existe una secuencia de caracteres dentro de una cadena. Retorna true si esa secuencia de caracteres se encuentra dentro del string y false si no no encuentra
        //Este método toma en cuenta mayúsculas y minúsculas (sensitive case)
        System.out.println(s1.contains("Hola")); //True

        //Método equals --->Nos ayuda a comparar el contenido de la string sobre la cual apliquemos el método. Retorna true o false
        System.out.println(s1.equals("Hola mundo")); //True
        System.out.println(s1.equals("Hola")); //False

        //Método equals ignore case---> similar a equals solo que ignora mayúsculas o minúsculas
        System.out.println(s1.equalsIgnoreCase("hola munDo")); //True

    }
}

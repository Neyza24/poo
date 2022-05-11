public class Operadores {
    //main es un método y es el punto donde empiezan a ejecutarse nuestros programas en JAVA
    public static void main(String[] args) {
        /* operadores aritméticos
        int num1 = 10;
        int num2 = 12;
        int resp = num1 + num2;
        System.out. println(resp);

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.print(!false);
        */

        /* Primera forma de crear arreglos
        int [] numeros = new int[10];
        numeros[0] = 54;
        numeros[1] = 64;
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        */

        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numeros[2]);
        //Para saber la longitud del arreglo,
        System.out.println(numeros.length);
        //Podemos clonar el arreglo, utilizamos el método clone(), lo que hace internamente es obtener todos los elementos en el arreglo números y alamacenarlos dentro del arreglo cpoia
        int [] copia;
        copia = numeros.clone();
        System.out.println(copia[2]);

    }
}

//Operadores arítméticos -----> Se utilizan para ejecutar operaciones matemáticas a todos los datos de tipo primitivo, exceptuando a los booleanos:
//+ suma, - resta, * multiplicación, / división, % modulo
//Operadores relacionales------>
// < menor que, > mayor que, <= menor o igual que, >= mayor o igual que, == igualdad, != diferente de
//Operadores lógicos-------> Se utilizan para formar epresiones booleanas
//&& AND, || OR, ! NEGACION

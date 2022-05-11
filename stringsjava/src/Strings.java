public class Strings {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = new String("hello");
        String s3 = "hello";
//Si comparamos las variables con un operador relacional podemos analizar lo que esta pasando internamente en la memoria
        //Comparamos s1 con s3: ambos se ubican en el string pool al ser creados por asignacion, pero la secuencia de caracteres es diferente, por lo tanto nos devuelve false
        System.out.println(s1 == s3);
        //Comparamos s2 con s3: Nos devuelve false, ya que son dos refercnias que se encuentras en dos puntos diferentes,  a pesar de que los caracteres son los mismos, esto es por que s2 lo creamos con un constructor y la palabra reservada new lo cual hace que este apuntando  al Heap y s3 al ser creado por asiganción directa apunta a la referencia  en el string pool
        //Para comparar el contenido(secuencia de caracteres sin importar la referencia) podemos hacer uso de equals()
        System.out.println(s2.equals(s3)); //true ya que compara el contenido más no la referencia (Heap o String pool)
        //Si queremos comparar con == pero que se enfoque en la secuencia de caracteres podemos utilizar el método intern(). Con esto le estaríamos diciendo a JAVA que vaya a buscar la variable s2 del string pool y la compare con la variable que le pasemos
        System.out.println(s2.intern() == s3);//true


        //Cambiar secuencia de caracteres de minúscula a mayúscula utilizando el método toUpperCase(), esta nos regresa una secuencia de caracteres en mayúscula
        System.out.println(s1.toLowerCase());
    }
}

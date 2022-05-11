public class Variables {
    public static void main(String[] args) {
        //Al declarar la variable tenemos que indicar que tipo de dato va almacenar: en este caso es un int
        /*int miVariable;
        //La vamos a inicializar:
        miVariable = 10;
        //Imprimir nuestra variable por consola:
        System.out.println(miVariable);
        //Le asignamos otro valor a la variable:
        miVariable = 20;
        //Imprimir nuestra variable por consola:
        System.out.println(miVariable);*/
        //Datos primitivos en JAVA:
        /*byte variableByte = 10;
        char variableChar = 'A';
        short variableShort = 15;
        int variableInt = 20;
        long variableLong = 25;
        //Cuando queremos asignar una variable float debemos poner un f al final, lo cual no es necesario cuando declaramos un double
        float variableFloat = 1.8f;
        double variableDouble = 1.8;
        boolean variableBoolean = true;

        System.out.println(variableByte);
        System.out.println(variableChar);
        System.out.println(variableShort);
        System.out.println(variableInt);
        System.out.println(variableLong);
        System.out.println(variableFloat);
        System.out.println(variableDouble);
        System.out.println(variableBoolean);*/

        //Tipos de datos por refererencia: son de referencia por que el tipo de dato en este caso String es propiamente una clase, viene incluida dentro del JDK de JAVA
        //Eso quiere decir que nuestra variable tipo eString es una instancia de la clase String, e sun objeto que representa las propiedades y los métodos establecidos en la clase String
        /*String instrumento;
        //Cuando se asigne una cadena de texgto a una variable String, este debe ir escrito entre comillas dobles "":
        instrumento = "guitarra";
        System.out.println(instrumento);*/

        //Tipo de dato var.-
        //Es una caracteristica que se agrego en la versión de java 10
        //Al hacer uso de var le damos permiso a nuestro compilador de inferir el tipo de dato ue queremos almacenar sin importar si es un dato primitivo o por referencia
        //No delaramos el tipo de variable, al asignarle el valor con var puede inferir el tipo de dato e internamente se convierte en el tipo de dato que se supone


        //var edad = 20;
        //var canal = "Cof academy";
        //Una vez que el compilador infiere el tipo de dato, no se puede cambiar, se amarra al tipo de dato que se infirio primero. EN este ejemplo, de primero infirio que puede ser un int y cuando queremos asignar otro valor diferente, esta esperandoe se mismo tipo de dato
        //edad = 20.1;


    }
}


//main es un método
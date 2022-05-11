package com.neyza.example;
//Si queremos hacer uso de la clase persona dentro de la clase principal debemos importarla:
import com.neyza.example.model.Persona;
//Si la clase persona estuviera en el mismo paquete de la  clase principal no sería necesario utilizar el import

public class Principal {
    public static void main(String[] args) {
        String s1;
        //Para crear un nuevo objeto se debe utilizar la palabra reservada new
        //Persona p1 = new Persona(); //Persona() viene a ser el constructor (En este caso es un constructor vacio ya que no le estamos apsando parámetros). Un constructor es la forma de inicializar un objeto cuando se crea

        //Utilizando el constructor que recibe parámetros o argumeentos:
        Persona p1 = new Persona("Eduardo", 28, "Calle 1");
        Persona p2 = new Persona("Sofía", 25, "Calle 25");

        System.out.println(p1.nombre); //Para acceder a un atributo(característica) del objeto necesitamos utilizar un punto, ejemplo:
        System.out.println(p1.edad);
        System.out.println(p1.direccion);

        System.out.println(p2.nombre);
        System.out.println(p2.edad);
        System.out.println(p2.direccion);
    }
}

//Apredimos a es estructurar nuestros programas en paquetes (packages) para tener un código más ordenado
//Aprendimos que una calse nos da una plantilla o molde para crear objetos a través de los constructores
//Los atributos nos permiten describir los objetos para diferenciarlos entre ellos
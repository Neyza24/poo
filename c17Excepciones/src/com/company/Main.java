package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Fred","Anne", "1001", 2000.0);

        try{
            cliente.comprar(2000.0);
        }catch (ClienteException e) {
            e.printStackTrace();
        }

        //Generamos un nuevo cliente utilizando el 2do constructor
        try {
            Cliente cliente1 = new Cliente("Mario", "Perez", "1002", 2000.0, 400.0, 2500.0);
            cliente1.saldarDeuda(200.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        //Creamos otro cliente para comprobar el método saldar deuda
        try {
            Cliente cliente3 = new Cliente("Marie", "Little", "1003", 2000.0, 4000.0, 2500.0);
            cliente3.saldarDeuda(6000.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }



        //Clase date para la consigna de la consigna de mesa//


    }
}

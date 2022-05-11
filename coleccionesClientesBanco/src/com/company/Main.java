package com.company;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Creamos instancias correspondientes a la clasecliente:
        Cliente cl1 = new Cliente("Antony", "00001", 200.0);
        Cliente cl2 = new Cliente("Franco", "00002", 400.0);
        Cliente cl3 = new Cliente("Melisa", "00003", 800.0);
        Cliente cl4 = new Cliente("Luisa", "00004", 2100.0);

        //En este contexto el cliente no se puede repetir
        //Debemos ver si vamoas agregar y borrar...y así elegimos la colección que corresponde:

        //Interfaz de tipo HashSet no permite duplicados, se puede agregar add, asegura elementos no duplicados, poca eficiencia al ordenar
        Set<Cliente> clientesBanco = new HashSet<Cliente>();

        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);

        //Recorremos la colección con un for o forEach:
        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNombre() + " " + cliente.getNumeroCuenta() + " " + cliente.getSaldo());

        }


    }
}

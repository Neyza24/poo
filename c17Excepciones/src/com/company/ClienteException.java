package com.company;

public class ClienteException extends Exception{
    //Creamos el constructor que recibe un mensaje (hay otros tipso de mensajes que tiene Exception) y el mensaje en string lo escribimos en el método que tiene la ClienteException
    public ClienteException(String message) {
        super(message);
    }
}

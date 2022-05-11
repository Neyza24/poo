package com.example.neyza;

public class Book {
    //Definiendo atributos para nuestra clase book y para aplicar el concepto de encapsulamiento de forma correcta, nuestros atributos tendrán acceso private
    //De esta forma nos se peude acceder directamente desde Main a estos atributos; para que se pueda acceder se debe aplicar unos métodos que son convenciones
    //Set and Get--->Si queremos acceder a atributos privados desde otras clases, necesitariamos métodos geters, estos deben ser públicos

    private String title;
    private String author;
    private boolean disponible;
//Este método get tener un tipo de retorno igual que el atributo que va retornar, en este caso sería String, seguido de getNombreatributo
    public String getTitle() {
        return title;
    }
//Método para modificar sería set,no retorna nada, por eso ponemos void
    public void setTitle(String title) {
        //Seteamos
        this.title = title;
    }
//Set and Get para atributo author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//Get and Set para atributos tipo boolean
    //El get cambia para un boolean get por isNombredelatributo

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

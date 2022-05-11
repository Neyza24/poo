package com.example.neyza;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Learning JAVA");
        System.out.println("El título es: " + book.getTitle());

        book.setAuthor(("Deitel & Deitel"));
        System.out.println("El autor es: " +  book.getAuthor());

        book.setDisponible(true);
        if(book.isDisponible()) {
            System.out.println("Esta disponible");
        } else {
            System.out.println("No esta disponible");
        }
    }
}

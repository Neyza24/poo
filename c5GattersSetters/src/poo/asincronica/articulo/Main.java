package poo.asincronica.articulo;

public class Main {
    public static void main(String[] args) {

        //Llamando al constructor
        Cliente cliente = new Cliente(1, "Simon");
        System.out.println(cliente.getDeuda());
        System.out.println(cliente.getNombre());

        cliente.incrementarDeuda(400.4);
        cliente.incrementarDeuda(400.4);
        cliente.incrementarDeuda(400.4);
        cliente.incrementarDeuda(-400.4);
        System.out.println(cliente.getDeuda());
    }
}

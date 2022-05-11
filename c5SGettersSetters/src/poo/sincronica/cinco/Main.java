package poo.sincronica.cinco;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario1 = new UsuarioJuego("Pablo", "123456");

        usuario1.aumentarPuntaje();
        usuario1.bonus(20);
        usuario1.aumentarPuntaje();
        usuario1.bonus(20);


        usuario1.setNombre("Maria");
        System.out.println("El nombre del usuario es: " + usuario1.getNombre());

    }

}

package poo.sincronica.cinco;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;

    // constructor

    public UsuarioJuego (String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    // metodos

    public void aumentarPuntaje(){
        this.puntaje ++;
        System.out.println("tu puntaje es de " + puntaje);
    }

    public void subirNivel() {
        this.nivel ++;
        System.out.println("tu nivel es: " + nivel);
    }

    public void bonus (Integer valor) {
        if (valor > 0) {
            this.puntaje += valor;
        } else {
            System.out.println("ingrese datos validos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}

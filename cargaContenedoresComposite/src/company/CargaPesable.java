package company;

public abstract class CargaPesable {
    private String nombre;
    private String descripcion;

    public CargaPesable(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPeso();


    @Override
    public String toString() {
        return "Carga " + nombre + " peso: " + calcularPeso();
    }

    public String getNombre() {
        return nombre;
    }
}

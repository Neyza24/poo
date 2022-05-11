package poo.sincronica.once;

public class Cliente {
    private Integer numeroCliente;
    private String apellido;
    private String dni;
    private Integer cuit;

    public Cliente(Integer numeroCliente, String apellido, String dni, Integer cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
}

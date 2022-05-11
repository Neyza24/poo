package poo.asincronica.articulo;

public class Cliente {
    //Atributos:
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;


    //Constructor--->
    /*
    public Cliente(Integer numeroCliente, String nombre, Double deuda) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }
     */
    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = 0.0;
    }


    //Métodos
    public void pagarDeuda() {
        System.out.println("Tu deuda fue saldada");
        this.deuda = 0.0;
    }

    public void incrementarDeuda(Double valor) {
        if(valor > 0) {
            System.out.println("Incremento mi deuda por " + valor);
            this.deuda += valor;
            System.out.println("mi nueva deuda es de " + deuda);
        } else {
            System.out.println("No puedes incrementar tu deuda por valores negativos");
        }
    }

    //Getters y Setters--->
    public Double getDeuda() {
        //return deuda o
        return this.deuda;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }


}

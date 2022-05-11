package company;

public class Simple extends CargaPesable{
    private Double pesoCargaSimple;
    private String necesitaRefrigeracion;

    public Simple(String nombre, String descripcion, Double pesoCargaSimple, String necesitaRefrigeracion) {
        super(nombre, descripcion);
        this.pesoCargaSimple = pesoCargaSimple;
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }


    @Override
    public Double calcularPeso() {
        if(necesitaRefrigeracion.equals("SI")) {
            pesoCargaSimple += pesoCargaSimple*0.10;
        }
        return pesoCargaSimple;
    }



    @Override
    public String toString() {
        return "Carga simple: " + getNombre() + " que tiene un peso de " + calcularPeso() + " kg y " + necesitaRefrigeracion + " necesita refrigeración";
    }
}

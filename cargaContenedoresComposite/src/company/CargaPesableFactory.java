package company;

public class CargaPesableFactory {
    private static CargaPesableFactory instance;

    private CargaPesableFactory() {

    }

    public static CargaPesableFactory getInstance() {
        if(instance == null) {
            instance = new CargaPesableFactory();
        }
        return instance;
    }

    public CargaPesable generarCarga(String codigo) {
        switch (codigo) {
            case "ELECTRODOMESTICOS":
                return new Simple("TV 32´ LCD","Color negro", 3.0, "NO");
            case "MEDICAMENTOS":
                return new Simple("Caja de medicamentos","Frágil", 2.0, "SI");
            case "CONTENEDOR":
                Contenedor docker = new Contenedor("Docker", "Docker es lo mejor", 100.0);
                docker.agregarCarga(generarCarga("ELECTRODOMESTICOS"));
                docker.agregarCarga(generarCarga("MEDICAMENTOS"));
                return docker;
        }
        return null;
    }
}

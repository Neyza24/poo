package poo.asincronica.navetur;

public class Main {
    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("Mau", "Jordan", "AB2SD");

        Velero velero1 = new Velero(capitan1, 2000.0, 200.0, 2018, "4 mts", 3);

        System.out.println(velero1.calcularMontoAlquiler());
        System.out.println(velero1.evaluarTamanio());

        Yate yate1 = new Yate(capitan1, 2000.0, 190.0, 2018, "3", 2);
        Yate yate2 = new Yate(capitan1, 2000.0, 190.0, 2018, "3", 5);
        yate1.calcularMontoAlquiler();



    }
}

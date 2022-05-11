package com.company;

public class Main {
    public static void main(String[] args) {
        CentralItinerarios central1 = new CentralItinerarios();
        CentralItinerarios central2 = new CentralItinerarios();

        Vuelo vuelo1 = new Vuelo("MEDELLIN", "LIMA", "23:02");
        Vuelo vuelo2 = new Vuelo("MEDELLIN", "SANTIAGO", "23:12");

        central1.agregar(vuelo1);
        central1.agregar(vuelo2);
        central2.agregar(vuelo1);
        central2.agregar(vuelo2);

        central1.disponibilidadProxima();
        central2.disponibilidadProxima();


    }
}

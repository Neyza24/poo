package com.company;

public interface PizarraObservable {
    void agregar(Observador o);
    void quitar(Observador o);
    void notificar(String cambio);

}

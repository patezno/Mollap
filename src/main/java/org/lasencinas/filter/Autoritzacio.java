package org.lasencinas.filter;

public class Autoritzacio implements Filtre {

    public Autoritzacio() {
    }

    @Override
    public void execucio(String message) {
        System.out.println("Autorización OK para " + message);
    }
}

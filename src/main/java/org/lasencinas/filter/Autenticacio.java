package org.lasencinas.filter;

public class Autenticacio implements Filtre {

    public Autenticacio() {

    }

    @Override
    public void execucio(String message) {
        System.out.println("Autenticación OK para " + message);
    }
}

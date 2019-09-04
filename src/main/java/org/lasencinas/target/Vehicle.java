package org.lasencinas.target;

public class Vehicle implements Target {

    public Vehicle() {

    }

    @Override
    public void execucio(String message) {
        System.out.println("Puerta abierta " + message + "!");
    }
}

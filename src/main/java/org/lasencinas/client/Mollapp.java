package org.lasencinas.client;

import org.lasencinas.tasks.ProgramadorTasques;

public class Mollapp implements Client {

    // Atributo

    private ProgramadorTasques programadorTasques = null;

    // Constructor

    public Mollapp() {

    }

    // Getter y Setter

    public ProgramadorTasques getProgramadorTasques() {
        return programadorTasques;
    }

    @Override
    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programadorTasques = programadorTasques;
    }

    // Método

    @Override
    public void enviarPeticio(String message) {
        getProgramadorTasques().executarTasques(message);
    }
}

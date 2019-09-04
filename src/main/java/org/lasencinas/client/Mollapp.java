package org.lasencinas.client;

import org.lasencinas.tasks.ProgramadorTasques;

public class Mollapp implements Client {

    private ProgramadorTasques programadorTasques = null;

    public Mollapp() {

    }

    public ProgramadorTasques getProgramadorTasques() {
        return programadorTasques;
    }

    @Override
    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programadorTasques = programadorTasques;
    }

    @Override
    public void enviarPeticio(String message) {
        getProgramadorTasques().executarTasques(message);
    }
}

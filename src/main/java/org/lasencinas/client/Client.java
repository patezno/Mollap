package org.lasencinas.client;

import org.lasencinas.tasks.ProgramadorTasques;

public interface Client {

    void setProgramadorTasques(ProgramadorTasques programadorTasques);

    void enviarPeticio(String message);
}

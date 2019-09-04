package org.lasencinas.tasks;

import org.lasencinas.filter.Autenticacio;
import org.lasencinas.filter.Filtre;
import org.lasencinas.target.Target;

import java.util.ArrayList;
import java.util.List;

public class ProgramadorTasques extends Tasques {

    // Constructores

    public ProgramadorTasques() {

    }

    public ProgramadorTasques(Target target) {
        super(target);
    }

    // Métodos

    public void setTasca(Filtre filtre) {
        afegirTasca(filtre);
    }

    public void executarTasques(String message) {
    }
}

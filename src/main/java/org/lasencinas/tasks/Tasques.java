package org.lasencinas.tasks;

import org.lasencinas.filter.Filtre;
import org.lasencinas.target.Target;

import java.util.ArrayList;
import java.util.List;

public class Tasques {

    // Atributos

    private List<Filtre> tasques = new ArrayList<>();
    private Target target = null;

    // Constructores

    public Tasques() {

    }

    public Tasques(Target target) {
        this.target = target;
    }

    // Getters y Setters

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public List<Filtre> getTasques() {
        return tasques;
    }

    // Métodos

    public void afegirTasca(Filtre tasca) {
        getTasques().add(tasca);
    }

    public void execucio(String message) {
        for (Filtre filtre : tasques) {
            filtre.execucio(message);
        }
        getTarget().execucio(message);
    }
}

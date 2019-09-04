package org.lasencinas.tasks;

import org.lasencinas.filter.Filtre;
import org.lasencinas.target.Target;

import java.util.ArrayList;
import java.util.List;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();
    private Target target = null;

    public Tasques() {

    }

    public Tasques(Target target) {
        this.target = target;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public List<Filtre> getTasques() {
        return tasques;
    }

    public void afegirTasca(Filtre tasca) {
        getTasques().add(tasca);
    }

    public void execucio(String message) {
    }
}

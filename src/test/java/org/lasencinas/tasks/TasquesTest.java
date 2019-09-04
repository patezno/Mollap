package org.lasencinas.tasks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.filter.Autenticacio;
import org.lasencinas.filter.Filtre;
import org.lasencinas.target.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TasquesTest {

    private ProgramadorTasques programadorTasques = null;
    private ProgramadorTasques programadorTasquesVeh = null;
    private List<Filtre> tasques = new ArrayList<>();

    @Before
    public void init() {
        programadorTasques = new ProgramadorTasques();
        programadorTasquesVeh = new ProgramadorTasques(new Vehicle());
    }

    @Test
    public void setTascaTest() {
        programadorTasques.setTasca(new Autenticacio());
        tasques.add(new Autenticacio());
        assertEquals(tasques.size(), programadorTasques.getTasques().size());
    }

    @Test
    public void getTargetTest() {
        assertNotNull(programadorTasquesVeh.getTarget());
    }

}

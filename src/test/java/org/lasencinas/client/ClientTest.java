package org.lasencinas.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.tasks.ProgramadorTasques;

public class ClientTest {

    private Mollapp mollapp = null;
    private ProgramadorTasques programadorTasques = null;

    @Before
    public void init() {
        mollapp = new Mollapp();
        programadorTasques = new ProgramadorTasques();
    }

    @Test
    public void setProgramadorTasquesTest() {
        mollapp.setProgramadorTasques(programadorTasques);
        assertNotNull(mollapp.getProgramadorTasques());
    }
}

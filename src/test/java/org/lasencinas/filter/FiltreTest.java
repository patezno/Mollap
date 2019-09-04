package org.lasencinas.filter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FiltreTest {

    private Autenticacio autenticacio = null;
    private Autoritzacio autoritzacio = null;

    @Before
    public void init() {
        autenticacio = new Autenticacio();
        autoritzacio = new Autoritzacio();
    }

    @Test
    public void checkTypeTest() {
        assertTrue(autenticacio instanceof Filtre);
        assertTrue(autoritzacio instanceof Filtre);
    }
}

package org.lasencinas.target;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TargetTest {

    private Target vehicle = null;

    @Before
    public void init() {
        vehicle = new Vehicle();
    }

    @Test
    public void checkTypeTest() {
        assertTrue(vehicle instanceof Target);
    }

}

package com.javafortesters4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ardian Hosen on 02/09/2016.
 */
public class IntegerExamplesTest {

    @Test
    public void integerExploration()
    {
        Integer four = new Integer("4");
        assertEquals("intValue return 4", 4, four.intValue());
    }

    @Test
    public void integerObjectNotSame()
    {
        Integer five1 = new Integer(5);
        Integer five2 = new Integer(5);

        assertEquals(five1,five2);
        assertTrue(5 == 5);
    }
}

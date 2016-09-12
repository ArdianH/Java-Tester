package com.javafortesters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ardian Hosen on 02/09/2016.
 */
public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo()
    {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canSubstractTwoWithTwo()
    {
        int answer = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canDivideFourWithTwo() throws Exception
    {
        int answer = 4 / 2;
        assertEquals("4/2=2", 2, answer);
    }


}

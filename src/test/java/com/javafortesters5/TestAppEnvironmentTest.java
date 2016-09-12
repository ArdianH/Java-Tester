package com.javafortesters5;

import domainobject5.TestAppEnv;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Ardian Hosen on 02/09/2016.
 */
public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatiscally()
    {
        assertEquals("Return hard coded url",
                "http://192.118.24.10:81",
                TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically()
    {
        assertEquals("Return domain only",
                "192.118.24.10",
                TestAppEnv.DOMAIN);

        assertEquals("Return port only",
                "81",
                TestAppEnv.PORT);
    }

}

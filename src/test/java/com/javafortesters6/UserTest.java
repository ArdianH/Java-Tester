package com.javafortesters6;

import domainobject6.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ardian Hosen on 02/09/2016.
 */
public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword()
    {
        User user = new User();

        assertEquals("default username expected",
                "username",
                user.getUsername());

        assertEquals("default password expected",
                "password",
                user.getPassword());
    }


    @Test
    public void canConstructWithUsernameAndPassword()
    {
        User user = new User("admin", "passwords");

        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "passwords",
                user.getPassword());

    }


    @Test
    public void canSetPasswordAfterConstructed()
    {
        User user = new User();

        user.setPassword("passwor6");
        assertEquals("setter password expected", "passwor6", user.getPassword());
    }
}

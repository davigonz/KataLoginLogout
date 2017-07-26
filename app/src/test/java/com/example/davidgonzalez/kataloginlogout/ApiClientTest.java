package com.example.davidgonzalez.kataloginlogout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class ApiClientTest {

    @Test
    public void shouldReturnTrueWhenEmailAndPasswordAreCorrect() throws Exception {

        boolean login = ApiClient.login("pedro@karumi.com", "123456");

        assertEquals(true, login);
    }

    @Test
    public void shouldReturnFalseWhenEmailIsWrong() throws Exception {

        boolean login = ApiClient.login("pedro@karumi.es", "123456");

        assertEquals(false, login);
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsWrong() throws Exception {

        boolean login = ApiClient.login("pedro@karumi.com", "1234");

        assertEquals(false, login);
    }

    @Test
    public void shouldReturnFalseWhenPasswordAndEmailAreWrong() throws Exception {

        boolean login = ApiClient.login("pedro@karumi.es", "1234");

        assertEquals(false, login);
    }

    @Test
    public void shouldReturnTrueWhenSecondsAreEven() throws Exception {

        boolean logout = ApiClient.logout();

        assertEquals(true, logout);
    }
}

package com.example.davidgonzalez.kataloginlogout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class ApiClientTest {

    @Test
    public void shouldLogInWhenEmailAndPasswordAreCorrect() throws Exception {

        ApiClient apiClient = new ApiClient(new MockClock(2000));

        boolean login = apiClient.login("pedro@karumi.com", "123456");

        assertEquals(true, login);
    }

    @Test
    public void shouldNotLoginWhenEmailIsWrong() throws Exception {

        ApiClient apiClient = new ApiClient(new MockClock(2000));

        boolean login = apiClient.login("pedro@karumi.es", "123456");

        assertEquals(false, login);
    }

    @Test
    public void shouldNotLoginWhenPasswordIsWrong() throws Exception {

        ApiClient apiClient = new ApiClient(new MockClock(2000));

        boolean login = apiClient.login("pedro@karumi.com", "1234");

        assertEquals(false, login);
    }

    @Test
    public void shouldNotLoginWhenPasswordAndEmailAreWrong() throws Exception {

        ApiClient apiClient = new ApiClient(new MockClock(2000));

        boolean login = apiClient.login("pedro@karumi.es", "1234");

        assertEquals(false, login);
    }

    @Test
    public void shouldLogOutWhenSecondsAreEven() throws Exception {

        ApiClient apiClient = new ApiClient(new MockClock(2000));

        boolean logout = apiClient.logout();

        assertEquals(true, logout);
    }

    @Test
    public void shouldNotLogOutWhenSecondsAreOdd() throws Exception {

        ApiClient apiClient = new ApiClient(new MockClock(3000));

        boolean logout = apiClient.logout();

        assertEquals(false, logout);
    }
}

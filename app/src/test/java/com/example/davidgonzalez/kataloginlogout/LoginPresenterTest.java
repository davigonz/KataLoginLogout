package com.example.davidgonzalez.kataloginlogout;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class LoginPresenterTest {

    private MockApiClient apiClient = new MockApiClient(new Clock());
    private MockLogInView mockView = new MockLogInView();

    @Test
    public void shouldShowErrorIfThereIsSomethingWrongWhileLogIn() {
        apiClient.setFailOnLogIn(true);

        LoginPresenter presenter = new LoginPresenter(apiClient, mockView);

        presenter.login("pedro@karumi.es", "123");

        assertTrue(mockView.getSomeoneInvokedShowErrorMessage());
    }
}

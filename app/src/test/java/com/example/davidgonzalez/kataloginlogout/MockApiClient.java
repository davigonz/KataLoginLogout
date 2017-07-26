package com.example.davidgonzalez.kataloginlogout;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class MockApiClient extends ApiClient {

    private boolean failOnLogIn = false;

    public MockApiClient(Clock clock) {
        super(clock);
    }

    public void setFailOnLogIn(boolean failOnLogIn) {
        this.failOnLogIn = failOnLogIn;
    }
}

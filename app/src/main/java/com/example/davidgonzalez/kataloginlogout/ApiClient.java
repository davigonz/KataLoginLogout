package com.example.davidgonzalez.kataloginlogout;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class ApiClient {

    private Clock clock;

    public ApiClient(Clock clock) {
        this.clock = clock;
    }

    public boolean login (String email, String password) {

        return email.equals("pedro@karumi.com") && password.equals("123456");
    }

    public boolean logout () {

        long now = clock.getCurrentTime();

        return now / 1000 % 2 == 0;
    }
}

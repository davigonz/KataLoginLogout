package com.example.davidgonzalez.kataloginlogout;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class ApiClient {

    public static boolean login (String email, String password) {

        if (email.equals("pedro@karumi.com") && password.equals("123456")) {

            return true;
        }

        return false;
    }

    public static boolean logout () {

        if (System.currentTimeMillis() / 1000 % 2 == 0) {

            return true;
        }

        return false;
    }
}

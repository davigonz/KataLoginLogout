package com.example.davidgonzalez.kataloginlogout;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class Clock {

    public int getCurrentTime () {
        Long now = System.currentTimeMillis();
        return (int) (now / 1000);
    }
}

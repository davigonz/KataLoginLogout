package com.example.davidgonzalez.kataloginlogout;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class MockClock extends Clock{

    private int fixedTime;

    public MockClock(int fixedTime) {
        this.fixedTime = fixedTime;
    }

    @Override
    public int getCurrentTime() {
        return fixedTime;
    }
}

package com.example.davidgonzalez.kataloginlogout;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class MockLogInView implements LoginView {

    private boolean someoneInvokedShowErrorMessage = false;

    public void showErrorMessage() {
        someoneInvokedShowErrorMessage = true;
    }

    public boolean getSomeoneInvokedShowErrorMessage() {
        return someoneInvokedShowErrorMessage;
    }

    public void showLogOutActivity() {

    }
}

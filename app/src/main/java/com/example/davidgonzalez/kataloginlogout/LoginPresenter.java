package com.example.davidgonzalez.kataloginlogout;

import android.content.Intent;

/**
 * Created by davidgonzalez on 26/07/17.
 */

public class LoginPresenter {

    private final ApiClient apiClient;
    private final LoginView loginView;

    public LoginPresenter(ApiClient apiClient, LoginView loginView) {
        this.apiClient = apiClient;
        this.loginView = loginView;
    }

    public void login (String email, String pass) {
        if (apiClient.login(email, pass)) {
            loginView.showLogOutActivity();
        } else {
            loginView.showErrorMessage();
        }
    }
}

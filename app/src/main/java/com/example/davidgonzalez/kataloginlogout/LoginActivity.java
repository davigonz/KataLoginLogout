package com.example.davidgonzalez.kataloginlogout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ApiClient apiClient = new ApiClient(new Clock());

        loginPresenter = new LoginPresenter(apiClient, this);

        final EditText email = (EditText) findViewById(R.id.email);
        final EditText password = (EditText) findViewById(R.id.password);
        final Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loginPresenter.login(email.getText().toString(), password.getText().toString());
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateLoginButtonVisibility();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateLoginButtonVisibility();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private void updateLoginButtonVisibility() {
        EditText email = (EditText) findViewById(R.id.email);
        EditText password = (EditText) findViewById(R.id.password);

        Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setEnabled(email.getText().toString().length() > 0 && password.getText().toString().length() > 0);
    }

    @Override
    public void onBackPressed()
    {

        // super.onBackPressed(); // Comment this super call to avoid calling finish() or fragmentmanager's backstack pop operation.
    }

    @Override
    public void showLogOutActivity() {

        Intent intent = new Intent(getApplicationContext(), LogoutActivity.class);
        startActivity(intent);
    }

    @Override
    public void showErrorMessage() {

        final TextView loginError = (TextView) findViewById(R.id.loginError);
        loginError.setText("Ups, wrong credentials");
        loginError.setVisibility(View.VISIBLE);
    }
}

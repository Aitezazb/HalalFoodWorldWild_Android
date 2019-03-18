package com.example.a.halalfoodworldwide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    private EditText email, password;

    private Button loginBtn, signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getAllUIReferences();
    }

    private void getAllUIReferences(){
        email = (EditText) findViewById(R.id.loginEmail);
        password = (EditText) findViewById(R.id.loginPassword);

        loginBtn = (Button) findViewById(R.id.login_btn);
        signUpBtn = (Button) findViewById(R.id.loginSignUp_btn);

        loginBtn.setOnClickListener(loginBtn_Listener);
        signUpBtn.setOnClickListener(signUpBtn_Listener);
    }

    //login click listener
    private View.OnClickListener loginBtn_Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(email.getText() != null && password.getText() != null){
            }

        }
    };

    //sign up click listener
    private View.OnClickListener signUpBtn_Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent signUpIntent = new Intent(LoginActivity.this,SignUpActivity.class);
            startActivity(signUpIntent);
            finish();
        }
    };
}

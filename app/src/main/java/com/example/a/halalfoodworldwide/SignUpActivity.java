package com.example.a.halalfoodworldwide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    EditText email, password, comfirmPassowrd;

    Button login,SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getAllUIReferences();
    }

    private void getAllUIReferences() {
        email = (EditText) findViewById(R.id.signUpEmail);
        password = (EditText) findViewById(R.id.signUpPassword);
        comfirmPassowrd = (EditText) findViewById(R.id.signUpConfirmPassword) ;

        login = (Button) findViewById(R.id.signUpLogin_btn);
        SignUp = (Button) findViewById(R.id.signUp_btn);

        login.setOnClickListener(loginBtn_listener);
        SignUp.setOnClickListener(SignUpBtn_Listener);
    }

    //login button event handler
    private View.OnClickListener loginBtn_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent loginIntent = new Intent(SignUpActivity.this,LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }
    };

    //Sign up button event handler
    private View.OnClickListener SignUpBtn_Listener  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}

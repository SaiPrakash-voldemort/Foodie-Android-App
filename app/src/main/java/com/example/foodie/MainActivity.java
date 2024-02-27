package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button SigninWithEmail,SignInWithPhone,Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SigninWithEmail=findViewById(R.id.signInWithEmailButton);
        SignInWithPhone=findViewById(R.id.signInWithPhoneButton);
        Signup=findViewById(R.id.signUpButton);
        Signup.setOnClickListener(view -> openSignup());


    }
    public void openSignup(){
        Intent intent = new Intent(this, Connect.class);
        startActivity(intent);
        finish();
    }
}
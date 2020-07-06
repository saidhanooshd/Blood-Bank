package com.example.bloodbank.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bloodbank.R;

public class LoginActivity extends AppCompatActivity {

    EditText numberEt, passwordEt;
    Button submit_button;
    TextView signupText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        numberEt = findViewById(R.id.number);
        passwordEt = findViewById(R.id.password);
        submit_button = findViewById(R.id.submit_button);
        signupText = findViewById(R.id.sign_up_text);
        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEt.setError(null);
                passwordEt.setError(null);
                String number = numberEt.getText().toString();
                String password = passwordEt.getText().toString();
                if (isValid(number , password));
                login(number , password);
            }
        });
    }
    private void login(String number , String password) {

    }
    private boolean isValid(String number, String password){

        if(number.isEmpty()) {
            showMessage ( "Empty Mobile Number");
            numberEt.setError("Empty Mobile Number");
            return false;
        }else if (password.isEmpty()){
            showMessage ( "Empty  Password");
            passwordEt.setError("Empty  Password");
            return false;
        }
        return true;
    }
    private void showMessage(String msg){
        Toast.makeText(this, msg , Toast.LENGTH_SHORT).show();
    }
}
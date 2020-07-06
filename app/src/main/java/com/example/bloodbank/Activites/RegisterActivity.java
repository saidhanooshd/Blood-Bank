package com.example.bloodbank.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bloodbank.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText nameEt, cityEt, bloodGroupEt,passwordEt, numberEt;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        nameEt = findViewById(R.id.name);
        cityEt = findViewById(R.id.city);
        bloodGroupEt = findViewById(R.id.bloodgroup);
        passwordEt  = findViewById(R.id.password);
        numberEt = findViewById(R.id.number);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, city, bloodGroup , password, number;
                name = nameEt.getText().toString();
                city = cityEt.getText().toString();
                bloodGroup = bloodGroupEt.getText().toString();
                password = passwordEt.getText().toString();
                number = numberEt.getText().toString();
                showMessage(name+"\n"+city+"\n"+bloodGroup+"\n"+password+"\n"+number);

            }
        });
    }
    private void showMessage(String msg){
        Toast.makeText(this,msg,  Toast.LENGTH_SHORT).show();
    }
}

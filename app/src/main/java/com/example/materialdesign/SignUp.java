package com.example.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;

import com.rilixtech.CountryCodePicker;

public class SignUp extends AppCompatActivity {
    CountryCodePicker ccp;

    Button myButton;
    private EditText firstName, lastName, mail, phoneNumber,
            password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        CountryCodePicker ccp;
        AppCompatEditText edtPhoneNumber;
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        edtPhoneNumber = (AppCompatEditText) findViewById(R.id.phone_number_edt);
        ccp.registerPhoneNumberTextView(edtPhoneNumber);

        myButton = findViewById(R.id.Register);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(SignUp.this, Login.class);
                startActivity(move);
            }
        });


    }

    private void setViews() {
        firstName = (EditText) findViewById(R.id.FirstName);
        lastName = (EditText) findViewById(R.id.LastName);
        mail = (EditText) findViewById(R.id.Mail);
        phoneNumber = (EditText) findViewById(R.id.phone_number_edt);
        password = (EditText) findViewById(R.id.Password);
    }


    private void signUp(View v) {
        //This set of code validates the email address.
        String fName = firstName.getText().toString();
        String lName = lastName.getText().toString();
        String emailAddress = mail.getText().toString();
        String phone = phoneNumber.getText().toString();
        String passkey = password.getText().toString();


        if (fName.isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter first name", Toast.LENGTH_SHORT).show();
        } else if (lName.isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter last name", Toast.LENGTH_SHORT).show();
        } else if (!isValidMail(emailAddress)) {
            Toast.makeText(getApplicationContext(), "Email is not valid", Toast.LENGTH_SHORT).show();
        } else if (!isValidMobile(phone)) {
            Toast.makeText(getApplicationContext(), "Invalid phone number", Toast.LENGTH_SHORT).show();
        } else if (password.length() < 8) {
            Toast.makeText(getApplicationContext(), "Password too short ", Toast.LENGTH_SHORT).show();
        } else {
            Intent move = new Intent(SignUp.this, Login.class);
            startActivity(move);


        }
    }

    private boolean isValidMail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();


    }

    private boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }
}
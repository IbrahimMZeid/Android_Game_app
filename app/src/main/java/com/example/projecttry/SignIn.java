package com.example.projecttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import controller.DatabaseHandller;
import model.Users;

public class SignIn extends AppCompatActivity {
    String name, pass;
    TextInputEditText nameET, passET;
    Button loginBtn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor prefEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nameET = findViewById(R.id.idNameField);
        passET = findViewById(R.id.idPassField);
        loginBtn = findViewById(R.id.idBtnLogin);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            nameET.setText(bundle.getString("email"));
            passET.setText(bundle.getString("password"));
        }
        nameET.requestFocus();
    }

    public void loginClicked(View view) {
        if (CheckAllFields()) {
            name = nameET.getText().toString();
            pass = passET.getText().toString();
            DatabaseHandller dbH = new DatabaseHandller(this);
            Users msg = dbH.getUser(name, pass);
            if (msg == null) {
                message("Not Found");
                return;
            }
            sharedPreferences = getSharedPreferences("com.example.projecttry", MODE_PRIVATE);
            prefEditor = sharedPreferences.edit();
            prefEditor.putString("email", nameET.getText().toString());
            prefEditor.putString("pass", passET.getText().toString());
            prefEditor.commit();
            message("Login Successful");
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

    public void forwordToSignUpbtnClick(View view) {
        startActivity(new Intent(this, SignUp.class));
        finish();
    }

    private void message(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    private boolean CheckAllFields() {
        if (nameET.length() == 0) {
            nameET.setError("This field is required");
            return false;
        } else if (!nameET.getText().toString().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            nameET.setError("This email is not valid");
            return false;
        }

        if (passET.length() < 8) {
            passET.setError("Password must be at least 8");
            return false;
        }
        // after all validation return true.
        return true;
    }
}
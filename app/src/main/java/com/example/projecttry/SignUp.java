package com.example.projecttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import controller.DatabaseHandller;
import model.Users;

public class SignUp extends AppCompatActivity {
    private EditText idEmail;
    private EditText idUsername;
    private EditText idPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        idEmail = findViewById(R.id.idEmailField);
        idUsername = findViewById(R.id.idNameField);
        idPassword = findViewById(R.id.idPassField);
        idEmail.requestFocus();
    }

    public void SignUpClicked(View view) {
        if (CheckAllFields()) {
            DatabaseHandller dbH = new DatabaseHandller(this);
            Users user = new Users(idEmail.getText().toString(), idUsername.getText().toString(), idPassword.getText().toString());
            String msg = dbH.addUser(user);
            if(msg.equals("Add")){
            Intent intent = new Intent(this, SignIn.class);
            Bundle bundle = new Bundle();
            bundle.putString("email", idEmail.getText().toString());
            bundle.putString("password", idPassword.getText().toString());
            intent.putExtras(bundle);
            startActivity(intent);
            MainActivity.message(msg,this);
            finish();}
            else
            MainActivity.message(msg,this);

        }
    }

    public void forwordToSignInbtnClick(View view) {
        startActivity(new Intent(this, SignIn.class));
        finish();
    }


    private void clear() {
        idPassword.setText("");
        idEmail.setText("");
        idUsername.setText("");
    }

    private boolean CheckAllFields() {
        if (idEmail.length() == 0) {
            idEmail.setError("This field is required");
            return false;
        } else if (!idEmail.getText().toString().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            idEmail.setError("This email is not valid");
            return false;
        }
        if (idUsername.length() == 0) {
            idUsername.setError("This field is required");
            return false;
        }
        if (idPassword.length() < 8) {
            idPassword.setError("Password must be at least 8");
            return false;
        }
        // after all validation return true.
        return true;
    }
}
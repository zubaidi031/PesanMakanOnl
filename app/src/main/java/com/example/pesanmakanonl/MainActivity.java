package com.example.pesanmakanonl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText emailInput, passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // linked to activity_main.xml

        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);

        findViewById(R.id.loginBtn).setOnClickListener(view -> login());

        findViewById(R.id.registerLink).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        });
    }

    private void login() {
        String email = emailInput.getText().toString();
        String pass = passwordInput.getText().toString();

        if (email.equals("user@example.com") && pass.equals("123456")) {
            Toast.makeText(this, "Login sukses!", Toast.LENGTH_SHORT).show();
            // Pindah ke dashboard (implementasikan nanti)

        } else {
            Toast.makeText(this, "Email atau password salah", Toast.LENGTH_SHORT).show();
        }
    }
}

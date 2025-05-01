package com.example.pesanmakanonl;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText emailReg, passReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        emailReg = findViewById(R.id.emailReg);
        passReg = findViewById(R.id.passReg);

        findViewById(R.id.registerBtn).setOnClickListener(view -> {
            String email = emailReg.getText().toString();
            String pass = passReg.getText().toString();

            Toast.makeText(this, "Register berhasil\nEmail: " + email, Toast.LENGTH_SHORT).show();
            finish(); // Kembali ke login
        });
    }
}

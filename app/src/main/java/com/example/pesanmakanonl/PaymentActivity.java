package com.example.pesanmakanonl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    private TextView totalTagihan;
    private RadioGroup paymentMethods;
    private Button btnBayar;
    private String total = "19000"; // bisa diambil dari intent sebelumnya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        totalTagihan = findViewById(R.id.totalTagihan);
        paymentMethods = findViewById(R.id.paymentMethods);
        btnBayar = findViewById(R.id.btnBayar);

        totalTagihan.setText("Total: Rp " + total);

        btnBayar.setOnClickListener(v -> {
            int selectedId = paymentMethods.getCheckedRadioButtonId();
            if (selectedId == -1) {
                Toast.makeText(this, "Pilih metode pembayaran!", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton selectedPayment = findViewById(selectedId);
            String metode = selectedPayment.getText().toString();

            // Kirim ke halaman struk
            Intent intent = new Intent(this, RecieptActivity.class);
            intent.putExtra("total", total);
            intent.putExtra("metode", metode);
            intent.putExtra("items", "Nasi Goreng, Es Teh");
            startActivity(intent);
        });
    }
}
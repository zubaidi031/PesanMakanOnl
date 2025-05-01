package com.example.pesanmakanonl;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecieptActivity extends AppCompatActivity {

    private TextView txtStruk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciept);

        txtStruk = findViewById(R.id.txtStruk);

        String total = getIntent().getStringExtra("total");
        String metode = getIntent().getStringExtra("metode");
        String items = getIntent().getStringExtra("items");

        String struk = "=== STRUK PEMBAYARAN ===\n"
                + "Pesanan : " + items + "\n"
                + "Metode  : " + metode + "\n"
                + "Total   : Rp " + total + "\n"
                + "Terima kasih telah memesan :)";

        txtStruk.setText(struk);
    }
}
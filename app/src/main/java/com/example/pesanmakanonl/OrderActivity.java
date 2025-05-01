package com.example.pesanmakanonl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private OrderAdapter orderAdapter;
    private ArrayList<MenuModel> orderList;
    private TextView totalPriceText;
    private Button btnOrderNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        recyclerView = findViewById(R.id.recyclerViewOrder);
        totalPriceText = findViewById(R.id.totalPrice);
        btnOrderNow = findViewById(R.id.btnOrderNow);

        // Dummy order list
//        orderList = new ArrayList<>();
//        orderList.add(new MenuModel("Nasi Goreng", "Makanan", "15000", R.drawable.nasi_goreng));
//        orderList.add(new MenuModel("Es Teh", "Minuman", "4000", R.drawable.es_teh));
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        orderAdapter = new OrderAdapter(orderList);
//        recyclerView.setAdapter(orderAdapter);

        updateTotalPrice();

        btnOrderNow.setOnClickListener(v -> {
            Toast.makeText(this, "Pesanan dikirim!", Toast.LENGTH_SHORT).show();
            // Clear cart if needed
            // orderList.clear(); orderAdapter.notifyDataSetChanged();
        });
    }

    private void updateTotalPrice() {
        int total = 0;
        for (MenuModel item : orderList) {
            total += Integer.parseInt(item.getPrice().replaceAll("[^0-9]", ""));
        }
        totalPriceText.setText("Total: Rp " + total);
    }
}

package com.example.pesanmakanonl;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HistoryAdapter historyAdapter;
    private List<HistoryModel> historyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        recyclerView = findViewById(R.id.recyclerViewHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dummy data
        historyList = new ArrayList<>();
        historyList.add(new HistoryModel("Nasi Goreng & Es Teh", "2025-04-28", "Rp 19.000"));
        historyList.add(new HistoryModel("Ayam Bakar & Jus Jeruk", "2025-04-25", "Rp 27.000"));

        historyAdapter = new HistoryAdapter(historyList);
        recyclerView.setAdapter(historyAdapter);
    }
}

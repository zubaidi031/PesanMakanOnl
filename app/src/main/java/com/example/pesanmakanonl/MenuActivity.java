package com.example.pesanmakanonl;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuAdapter menuAdapter;
    private List<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = findViewById(R.id.recyclerViewMenu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        menuList = new ArrayList<>();
//        // Dummy data
//        menuList.add(new MenuModel("Nasi Goreng", "Makanan", "Rp 15.000", R.drawable.nasi_goreng));
//        menuList.add(new MenuModel("Ayam Goreng", "Makanan", "Rp 18.000", R.drawable.no_image));
//        menuList.add(new MenuModel("Es Teh", "Minuman", "Rp 4.000", R.drawable.es_teh));
//
//        menuAdapter = new MenuAdapter(menuList);
//        recyclerView.setAdapter(menuAdapter);
    }
}

package com.example.pesanmakanonl;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {

    private List<HistoryModel> historyList;

    public HistoryAdapter(List<HistoryModel> historyList) {
        this.historyList = historyList;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, parent, false);
        return new HistoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {
        HistoryModel item = historyList.get(position);
        holder.menu.setText(item.getMenuOrdered());
        holder.date.setText(item.getDate());
        holder.total.setText(item.getTotalPrice());

        holder.itemView.setOnClickListener(view -> {

        });

        holder.keranjang.setOnClickListener(view -> {

        });
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    public static class HistoryViewHolder extends RecyclerView.ViewHolder {
        TextView menu, date, total, keranjang;

        public HistoryViewHolder(View itemView) {
            super(itemView);
            menu = itemView.findViewById(R.id.historyMenu);
            date = itemView.findViewById(R.id.historyDate);
            total = itemView.findViewById(R.id.historyTotal);
            keranjang = itemView.findViewById(R.id.masuk_ke_keranjang);
        }
    }
}

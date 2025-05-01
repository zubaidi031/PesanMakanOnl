package com.example.pesanmakanonl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private List<MenuModel> orderList;

    public OrderAdapter(List<MenuModel> orderList) {
        this.orderList = orderList;
    }

    @Override
    public OrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OrderViewHolder holder, int position) {
        MenuModel item = orderList.get(position);
        holder.name.setText(item.getName());
        holder.price.setText("Rp " + item.getPrice());
        holder.image.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    static class OrderViewHolder extends RecyclerView.ViewHolder {
        TextView name, price;
        ImageView image;

        public OrderViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.orderItemName);
            price = itemView.findViewById(R.id.orderItemPrice);
            image = itemView.findViewById(R.id.orderItemImage);
        }
    }
}


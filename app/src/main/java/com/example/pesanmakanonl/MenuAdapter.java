package com.example.pesanmakanonl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<MenuModel> menuList;

    public MenuAdapter(List<MenuModel> menuList) {
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        MenuModel menu = menuList.get(position);
        holder.name.setText(menu.getName());
        holder.category.setText(menu.getCategory());
        holder.price.setText(menu.getPrice());
        holder.image.setImageResource(menu.getImageResId());
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        TextView name, category, price;
        ImageView image;

        public MenuViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.menuName);
            category = itemView.findViewById(R.id.menuCategory);
            price = itemView.findViewById(R.id.menuPrice);
            image = itemView.findViewById(R.id.menuImage);
        }
    }
}


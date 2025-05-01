package com.example.pesanmakanonl;

public class MenuModel {
        private String name;
        private String category;
        private String price;
        private int imageResId;

        public MenuModel(String name, String category, String price, int imageResId) {
            this.name = name;
            this.category = category;
            this.price = price;
            this.imageResId = imageResId;
        }

        // Getters
        public String getName() { return name; }
        public String getCategory() { return category; }
        public String getPrice() { return price; }
        public int getImageResId() { return imageResId; }


}

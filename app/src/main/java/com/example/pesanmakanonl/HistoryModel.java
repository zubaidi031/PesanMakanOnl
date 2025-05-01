package com.example.pesanmakanonl;

public class HistoryModel {
    private String menuOrdered;
    private String date;
    private String totalPrice;

    public HistoryModel(String menuOrdered, String date, String totalPrice) {
        this.menuOrdered = menuOrdered;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public String getMenuOrdered() { return menuOrdered; }
    public String getDate() { return date; }
    public String getTotalPrice() { return totalPrice; }
}


package com.nefu.order_system.entity;

public class Foods {
    public int id;
    public String name;
    public String detail;
    public String price;

    public Foods(int id, String name, String detail, String price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }
}

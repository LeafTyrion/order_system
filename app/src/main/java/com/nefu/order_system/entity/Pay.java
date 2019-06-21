package com.nefu.order_system.entity;

public class Pay {
    public String name;
    public String num;
    public String price;
    public String status;

    public Pay(String name, String num, String price,String status) {
        this.name = name;
        this.num = num;
        this.price = price;
        this.status=status;
    }
}

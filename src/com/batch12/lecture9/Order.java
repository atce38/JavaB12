package com.batch12.lecture9;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id,total;
    private ArrayList<OrderItem> orderItems=new ArrayList<>();

    public Order(OrderItem orderItem) {
        orderItems.add(orderItem);
        addTotal();
    }

    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);
        addTotal();
    }

    public void addTotal(){
        int total=0;
        for (OrderItem item:getOrderItems()) {
            total+=item.getQty()*item.getProduct().getPrice();

        }
        setTotal(total);
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public int getTotal() {
        return total;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", total=" + total +
                ", orderItems=" + orderItems +
                '}';
    }
}

package com.batch12.lecture9;

public class OrderItem {
    private int qty;
    private Product product;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "qty=" + qty +
                ", product=" + product +
                '}';
    }
}

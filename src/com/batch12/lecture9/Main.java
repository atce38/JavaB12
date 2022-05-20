package com.batch12.lecture9;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product=new Product();
        product.setId(11);
        product.setName("BMW");
        product.setPrice(1200);
        product.setStock(10000);

        OrderItem item=new OrderItem();
        item.setQty(30);
        item.setProduct(product);

        Product product1=new Product();
        product1.setId(10);
        product1.setName("Honda");
        product1.setPrice(200);
        product1.setStock(11000);

        OrderItem item1=new OrderItem();
        item1.setQty(30);
        item1.setProduct(product1);

        Order order=new Order(item);
        order.setId(34);
        order.addItem(item1);



        System.out.println(order);
    }


}

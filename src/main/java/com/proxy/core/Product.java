package com.proxy.core;

/**
 * @author wuyue
 * @data 2016/6/11
 */
public class Product implements Sell {

    private String consumer;

    Product(String consumer){
        this.consumer = consumer;
    }
    public boolean sellProduct() {
        System.out.print("sell the product to"+consumer);
        System.out.print(this.getClass().getName());
        return false;
    }
}

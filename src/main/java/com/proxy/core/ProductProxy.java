package com.proxy.core;

/**
 * @author wuyue
 * @data 2016/6/11
 */
public class ProductProxy implements Sell{

    Product product;
    ProductProxy(String consumer){
        product = new Product(consumer);
    }
    public boolean sellProduct() {
       product.sellProduct();
        return false;
    }
}

package com.proxy.core;

/**
 * @author wuyue
 * @data 2016/6/11
 */
public class Action {
    public static void main(String[] args){
        ProductProxy productProxy = new ProductProxy("Cherry");
        productProxy.sellProduct();
    }
}

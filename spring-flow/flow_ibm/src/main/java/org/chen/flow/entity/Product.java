package org.chen.flow.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by chen on 16-11-9.
 */
public class Product implements Serializable {

    public Product(){
        System.out.println("create the product");
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

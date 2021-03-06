package com.marioaliaga.apringapp.domain;

import java.io.Serializable;

/**
 * Created by mario on 15-07-14.
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private Double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

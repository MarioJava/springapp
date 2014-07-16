package com.marioaliaga.apringapp.service;

import com.marioaliaga.apringapp.domain.Product;

import java.util.List;

/**
 * Created by mario on 15-07-14.
 */
public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID = 1L;

    @Override
    public void increasePrice(int percentage) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Product> getProducts() {
        throw new UnsupportedOperationException();
    }

    public void setProducts(List<Product> products) {
        throw new UnsupportedOperationException();
    }
}

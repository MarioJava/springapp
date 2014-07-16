package com.marioaliaga.apringapp.service;

import com.marioaliaga.apringapp.domain.Product;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mario on 15-07-14.
 */
public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    public List<Product> getProducts();
}

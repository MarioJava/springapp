package com.marioaliaga.apringapp.domain;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by mario on 15-07-14.
 */
public class ProductTest {

    private Product product;

    @Before
    public void setUp(){
        product = new Product();
    }

    @Test
    public void testSetAndGetDesciption(){
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }

    @Test
    public void testSetAndGetPrice(){
        double testPrice = 100.00;
        assertEquals(0, 0, 0);
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(),0);

    }
}

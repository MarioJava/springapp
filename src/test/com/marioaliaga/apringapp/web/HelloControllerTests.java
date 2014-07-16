package com.marioaliaga.apringapp.web;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class HelloControllerTests {

    @Test
    public void testHandleRequestView() throws Exception {
        InventoryController controller = new InventoryController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("ahora");
        assertNotNull(nowValue);
    }

}
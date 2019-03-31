package com.sample;

import com.sample.model.menu;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ordersTest {

    @org.junit.jupiter.api.Test
    void getOrder() {
        orders a = new orders();
        List l = a.orderlist;
        menu b = new menu(1,"vesuvio","tomat",57);

        int c = 1;
        assertTrue(57==b.price);

    }

    @org.junit.jupiter.api.Test
    void createOrder() {
    }

    @org.junit.jupiter.api.Test
    void displayOrders() {
    }

    @org.junit.jupiter.api.Test
    void addProduct() {
    }

    @org.junit.jupiter.api.Test
    void subtractProduct() {
    }
}
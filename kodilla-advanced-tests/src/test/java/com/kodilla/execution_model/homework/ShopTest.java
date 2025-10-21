package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addOrder(new Order(100.0, LocalDate.of(2024, 5, 1), "user1"));
        shop.addOrder(new Order(200.0, LocalDate.of(2024, 6, 10), "user2"));
        shop.addOrder(new Order(150.0, LocalDate.of(2024, 7, 20), "user3"));
        shop.addOrder(new Order(300.0, LocalDate.of(2024, 8, 15), "user4"));
    }

    @Test
    public void testAddOrderAndCount() {
        assertEquals(4, shop.getOrderCount());
        shop.addOrder(new Order(400.0, LocalDate.of(2024, 9, 1), "user5"));
        assertEquals(5, shop.getOrderCount());
    }

    @Test
    public void testGetOrdersBetweenDates() {
        List<Order> orders = shop.getOrdersBetweenDates(
                LocalDate.of(2024, 6, 1),
                LocalDate.of(2024, 8, 1));
        assertEquals(2, orders.size());
    }

    @Test
    public void testGetOrdersByValueRange() {
        List<Order> orders = shop.getOrdersByValueRange(120.0, 250.0);
        assertEquals(2, orders.size());
    }

    @Test
    public void testGetTotalOrderValue() {
        assertEquals(750.0, shop.getTotalOrderValue(), 0.01);
    }

    @Test
    public void testUniqueOrders() {
        shop.addOrder(new Order(100.0, LocalDate.of(2024, 5, 1), "user1")); // duplicate
        assertEquals(4, shop.getOrderCount());
    }
}

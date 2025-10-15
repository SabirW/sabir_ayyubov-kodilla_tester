package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarehouseTestSuite {

    @Test
    public void testGetOrder_existingOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("A1"));
        warehouse.addOrder(new Order("B2"));

        Order order = warehouse.getOrder("A1");

        assertEquals("A1", order.getNumber());
    }

    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("A1"));
        warehouse.addOrder(new Order("B2"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Z9"));
    }
}

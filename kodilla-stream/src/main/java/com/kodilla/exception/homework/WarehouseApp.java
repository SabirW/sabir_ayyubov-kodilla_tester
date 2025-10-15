package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("A1"));
        warehouse.addOrder(new Order("B2"));
        warehouse.addOrder(new Order("C3"));

        try {
            Order order = warehouse.getOrder("X9");
            System.out.println("Found order: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

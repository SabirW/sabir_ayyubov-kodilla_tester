package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    /** Adds a new order (if unique) */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /** Returns list of orders between two dates (inclusive) */
    public List<Order> getOrdersBetweenDates(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> !o.getDate().isBefore(from) && !o.getDate().isAfter(to))
                .collect(Collectors.toList());
    }

    /** Returns list of orders between two values (inclusive) */
    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(o -> o.getValue() >= minValue && o.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    /** Returns total number of orders */
    public int getOrderCount() {
        return orders.size();
    }

    /** Returns total sum of all order values */
    public double getTotalOrderValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}

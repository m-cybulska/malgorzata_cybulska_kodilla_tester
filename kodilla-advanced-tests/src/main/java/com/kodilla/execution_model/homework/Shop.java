package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders;

    public Shop() {
        this.orders = new HashSet<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public int getOrderCount() {
        return orders.size();
    }

    public List<Order> getOrdersByDateRange(LocalDate fromDate, LocalDate toDate) {
        return orders.stream()
                .filter(order -> !order.getOrderDate().isBefore(fromDate) && !order.getOrderDate().isAfter(toDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByWorthRange (double minWorth, double maxWorth) {
        return orders.stream()
                .filter(order -> order.getOrderWorth() >= minWorth && order.getOrderWorth() <= maxWorth)
                .collect(Collectors.toList());
    }

    public double getTotalOrderWorth() {
        return orders.stream()
                .mapToDouble(Order::getOrderWorth)
                .sum();
    }
}

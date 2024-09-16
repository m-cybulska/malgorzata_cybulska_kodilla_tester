package com.kodilla.exception.homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> foundOrder = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst();

        if (foundOrder.isPresent()) {
            return foundOrder.get();
        }
        else {
            throw new OrderDoesntExistException();
        }
    }
}
package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double orderWorth;
    private String buyerLogin;
    private LocalDate orderDate;

    public Order(double orderWorth, String buyerLogin, LocalDate orderDate) {
        this.orderWorth = orderWorth;
        this.buyerLogin = buyerLogin;
        this.orderDate = orderDate;
    }

    public double getOrderWorth() {
        return orderWorth;
    }

    public String getBuyerLogin() {
        return buyerLogin;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(orderWorth, order.orderWorth) == 0 && Objects.equals(buyerLogin, order.buyerLogin) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderWorth, buyerLogin, orderDate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "worth =" + orderWorth +
                ", date =" + orderDate +
                ", login ='" + buyerLogin + '\'' +
                '}';
    }
}

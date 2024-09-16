package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("35460BC"));
        warehouse.addOrder(new Order("53645AB"));
        warehouse.addOrder(new Order("762873BB"));
        warehouse.addOrder(new Order("326543ND"));

        try {
            Order order = warehouse.getOrder("35460B");
            System.out.println("Order found: " + order.getNumber());
        }
        catch (OrderDoesntExistException e) {
            System.out.println("Error: given order does not exist");
        }
    }
}
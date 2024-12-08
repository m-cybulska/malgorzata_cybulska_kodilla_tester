package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void shouldThrowExceptionIfOrderDoesNotExist() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("12345C"));
    }

    @Test
    public void shouldReturnOrderIfItExists() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Order order = new Order("12345A");
        warehouse.addOrder(order);
        Order result = warehouse.getOrder("12345A");
        assertEquals(order, result);
    }

    @Test
    public void shouldThrowExceptionForNonExistingOrderAfterAddingOthers() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("12345A"));
        warehouse.addOrder(new Order("12345B"));
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("12345C"));
    }

    @Test
    public void shouldHandleMultipleOrdersCorrectly() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("12345A");
        Order order2 = new Order("12345B");
        Order order3 = new Order("12345C");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        Order result1 = warehouse.getOrder("12345A");
        Order result2 = warehouse.getOrder("12345B");
        Order result3 = warehouse.getOrder("12345C");
        assertEquals(order1, result1);
        assertEquals(order2, result2);
        assertEquals(order3, result3);
    }

    @Test
    public void shouldNotThrowExceptionForCaseSensitiveOrderNumbers() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Order order = new Order("ABC123");
        warehouse.addOrder(order);
        Order result = warehouse.getOrder("ABC123");
        assertEquals(order, result);
    }
}

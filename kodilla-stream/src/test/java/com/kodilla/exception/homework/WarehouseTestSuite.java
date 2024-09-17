package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void shouldThrowExceptionIfOrderDoesNotExist() {
        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("12345C"));
    }
}
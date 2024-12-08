package com.kodilla.execution_model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();

    @Test
    public void shouldAddItemsToInvoice() {

        invoice.addItem(new Item("Book", 35.50));
        invoice.addItem(new Item("Pen", 12.23));
        invoice.addItem(new Item("Mug", 32.99));

        int numberOfItems = invoice.getSize();

        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {

        invoice.addItem(new Item("Book", 35.50));
        invoice.addItem(new Item("Pen", 12.23));
        invoice.addItem(new Item("Mug", 32.99));

        Item result = invoice.getItem(1);

        assertEquals("Pen", result.getName());
        assertEquals(12.23, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {

        invoice.addItem(new Item("Book", 35.50));
        invoice.addItem(new Item("Pen", 12.23));
        invoice.addItem(new Item("Mug", 32.99));

        Item result = invoice.getItem(-3);

        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {

        invoice.addItem(new Item("Book", 35.50));
        invoice.addItem(new Item("Pen", 12.23));
        invoice.addItem(new Item("Mug", 32.99));

        Item result = invoice.getItem(5);

        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {

        invoice.addItem(new Item("Book", 35.50));
        invoice.addItem(new Item("Pen", 12.23));
        invoice.addItem(new Item("Mug", 32.99));

        int invoiceSizeBeforeClearing = invoice.getSize();

        invoice.clear();

        assertEquals(0, invoice.getSize());
        assertEquals(3, invoiceSizeBeforeClearing);
    }

    @Test
    public void shouldAddNullItem() {
        invoice.addItem(null);

        assertEquals(1, invoice.getSize());
        assertNull(invoice.getItem(0));
    }

    @Test
    public void shouldClearInvoiceMultipleTimes() {
        invoice.addItem(new Item("Book", 35.50));
        invoice.addItem(new Item("Pen", 12.23));

        invoice.clear();
        invoice.clear();

        assertEquals(0, invoice.getSize());
    }

    @Test
    public void shouldReturnNullWhenGettingItemFromEmptyInvoice() {
        Item result = invoice.getItem(0);

        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenIndexEqualsListSize() {
        invoice.addItem(new Item("Book", 35.50));
        invoice.addItem(new Item("Pen", 12.23));

        Item result = invoice.getItem(2);

        assertNull(result);
    }
}
package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ResultCheckerTestSuite {

    @Test
    public void shouldReturnTrueForEqualIntegers() {
        boolean result = ResultChecker.assertEquals(10, 10);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForNonEqualIntegers() {
        boolean result = ResultChecker.assertEquals(10, 5);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForEqualDoublesWithinDelta() {
        boolean result = ResultChecker.assertEquals(10.5, 10.7, 0.2);
        assertTrue(result);
    }


    @Test
    public void shouldReturnTrueForDoublesWithZeroDelta() {
        boolean result = ResultChecker.assertEquals(10.0, 10.0, 0.0);
        assertTrue(result);
    }


    @Test
    public void shouldHandleNegativeDoublesWithinDelta() {
        boolean result = ResultChecker.assertEquals(-10.5, -10.7, 0.3);
        assertTrue(result);
    }

    @Test
    public void shouldHandleNegativeDoublesOutsideDelta() {
        boolean result = ResultChecker.assertEquals(-10.5, -10.7, 0.1);
        assertFalse(result);
    }
}

package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gambling_machine_test_data.csv", numLinesToSkip = 1)
    void testHowManyWins(String userNumbersStr, boolean expectedException) {
        Set<Integer> userNumbers = Arrays
                .stream(userNumbersStr.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        if (expectedException) {
            assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
        }
    }
}
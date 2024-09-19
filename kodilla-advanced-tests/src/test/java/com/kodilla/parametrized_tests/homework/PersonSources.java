package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePersonsForTestingGetBMI() {

        return Stream.of(
                Arguments.of(new Person(1.85, 100), "Overweight"),
                Arguments.of(new Person(1.52, 41), "Underweight"),
                Arguments.of(new Person(1.90, 87), "Normal (healthy weight)"),
                Arguments.of(new Person(2.05, 130), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.98, 43), "Very severely underweight"),
                Arguments.of(new Person(1.78, 50), "Severely underweight"),
                Arguments.of(new Person(1.50, 125), "Obese Class V (Super Obese)")
        );
    }
}

package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Hannah_312", "peter.pan3", "jAmie.24", "bored-max09"})
    public void shouldReturnTrueIfNameMatchesRegex(String name) {
        boolean result = userValidator.validateUsername(name);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hannah@312", "peter!pan3", "jAmie#24", "bored*max09"})
    public void shouldReturnFalseIfNameDoesNotMatchRegex(String name) {
        boolean result = userValidator.validateUsername(name);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"jupiter.hope@gmail.com", "blackmamba22@yahoo.com", "robin_flynn@gmail.com", "black-forest354@yahoo.com"})
    public void shouldReturnTrueIfEmailMatchesRegex(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"jupiter#hope@gmail.com", "black!mamba22@yahoo.com", "robin^flynn@gmail.com", "black forest354@yahoo.com"})
    public void shouldReturnFalseIfEmailDoesNotMatchRegex(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}
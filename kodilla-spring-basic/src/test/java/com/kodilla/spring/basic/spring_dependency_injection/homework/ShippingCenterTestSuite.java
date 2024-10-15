package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldReturnFailIfPackageIsTooHeavy() {
        String result = shippingCenter.sendPackage("Tampa" , 45);
        Assertions.assertEquals("Package not delivered to: Tampa", result);
    }

    @Test
    public void shouldReturnSuccessIfPackageIsWithinWeightLimit() {
        String result = shippingCenter.sendPackage("Miami", 25);
        Assertions.assertEquals("Package delivered to: Miami", result);
    }
}

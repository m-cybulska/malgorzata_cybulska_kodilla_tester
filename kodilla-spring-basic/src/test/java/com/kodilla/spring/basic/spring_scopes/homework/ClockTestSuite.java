package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldShowDifferentTime () throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Thread.sleep(50);
        Clock secondBean = context.getBean(Clock.class);
        Thread.sleep(50);
        Clock thirdBean = context.getBean(Clock.class);

        Assertions.assertNotEquals(firstBean.getTime(), secondBean.getTime(), "First and second bean have the same time");
        Assertions.assertNotEquals(secondBean.getTime(), thirdBean.getTime(), "Second and third bean have the same time");
        Assertions.assertNotEquals(firstBean.getTime(), thirdBean.getTime(), "First and third bean have the same time");
    }
}
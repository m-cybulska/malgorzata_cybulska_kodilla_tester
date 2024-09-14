package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {

    public static double avgPostNumber1() {
        double avgPostNumber1 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        return avgPostNumber1;
    }

    public static double avgPostNumber2() {
        double avgPostNumber2 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        return avgPostNumber2;
    }

    public static void main(String[] args) {
        System.out.println(avgPostNumber1());
        System.out.println(avgPostNumber2());
    }
}

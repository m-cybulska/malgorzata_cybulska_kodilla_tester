package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal smith = new Principal("James", "Smith");
        Principal jones = new Principal("Martha", "Jones");
        Principal thorn = new Principal("Dorothy", "Thorn");
        Principal cole = new Principal("Harry", "Cole");

        School spring = new School("Spring Hill High", Arrays.asList(20, 26, 34, 36, 28, 30, 43,44));
        School willow = new School("Willow School", Arrays.asList(22, 35, 44, 23, 24, 33, 46, 39));
        School bayshore = new School("Bayshore High", Arrays.asList(33, 36, 45, 31, 30, 29, 19, 41));
        School winterville = new School("Winterville High", Arrays.asList(33, 45, 42, 39, 34, 23, 47,36));

        school.put(smith, winterville);
        school.put(jones, willow);
        school.put(thorn, bayshore);
        school.put(cole, spring);

        for (Map.Entry<Principal, School> principalEntry : school.entrySet()) {
            System.out.println("\n" + "Principal: " + principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + ", school: " + principalEntry.getValue().getName() + ", number of students: " + principalEntry.getValue().getTotalNumberOfStudents());
        }
    }
}

package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(String name, List<Integer> numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getTotalNumberOfStudents() {
        int totalStudents = 0;
        for (int count : numberOfStudents) {
            totalStudents += count;
        }
        return totalStudents;
    }
}

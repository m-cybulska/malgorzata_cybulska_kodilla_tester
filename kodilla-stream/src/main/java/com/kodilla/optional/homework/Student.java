package com.kodilla.optional.homework;

public class Student {
    private String name;

    Teacher teacher = new Teacher("");

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}

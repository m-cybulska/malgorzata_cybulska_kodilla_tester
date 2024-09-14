package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Luke Newman", new Teacher("Peter Goodman")));
        students.add(new Student("Blake Moon", new Teacher("Hannah Walker")));
        students.add(new Student("Mary Hill", null));
        students.add(new Student("Jane Black", null));

        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            String teacherName = "<undefined>";
            
            if (teacher.isPresent())
                teacherName = teacher.get().getName();

             System.out.println("Student: " + student.getName() + ", teacher: " + teacherName);
        }
    }
}
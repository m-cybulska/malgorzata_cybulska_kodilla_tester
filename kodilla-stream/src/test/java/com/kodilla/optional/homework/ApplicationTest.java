package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldDisplayStudentAndTeacherNameIfTeacherIsPresent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Luke Newman", new Teacher("Peter Goodman")));

        String expectedResult = "Student: Luke Newman, teacher: Peter Goodman";

        String result = "";
        for (Student student : students) {
            result += "Student: " + student.getName() + ", teacher: " + student.getTeacher().getName();
        }

        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldDisplayStudentNameAndUndefinedIfTeacherIsAbsent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mary Hill", null));

        String expectedResult = "Student: Mary Hill, teacher: <undefined>";

        String result = "";
        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            String teacherName = "<undefined>";

            if (teacher.isPresent())
                teacherName = teacher.get().getName();

            result += "Student: " + student.getName() + ", teacher: " + teacherName;
        }

        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldHandleMultipleStudentsWithMixedTeacherPresence() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Luke Newman", new Teacher("Peter Goodman")));
        students.add(new Student("Mary Hill", null));
        students.add(new Student("Blake Moon", new Teacher("Hannah Walker")));
        students.add(new Student("Jane Black", null));

        String expectedResult = "Student: Luke Newman, teacher: Peter Goodman\n" +
                "Student: Mary Hill, teacher: <undefined>\n" +
                "Student: Blake Moon, teacher: Hannah Walker\n" +
                "Student: Jane Black, teacher: <undefined>";

        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            String teacherName = teacher.map(Teacher::getName).orElse("<undefined>");
            result.append("Student: ").append(student.getName()).append(", teacher: ").append(teacherName).append("\n");
        }

        assertEquals(expectedResult, result.toString().trim());
    }

    @Test
    public void shouldReturnEmptyOutputForEmptyStudentList() {
        List<Student> students = new ArrayList<>();

        String expectedResult = "";

        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            String teacherName = teacher.map(Teacher::getName).orElse("<undefined>");
            result.append("Student: ").append(student.getName()).append(", teacher: ").append(teacherName).append("\n");
        }

        assertEquals(expectedResult, result.toString().trim());
    }
}

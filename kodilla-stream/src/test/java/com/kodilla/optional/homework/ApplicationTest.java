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
}
package com.sachee.student;

import java.util.Comparator;
import java.util.Optional;

public class MinMax {

    public static void main(String[] args) {

        Optional<Student> students = Student.getAllStudents().stream().max(Comparator.comparing(Student::getMarks));
        System.out.println(students.get());

        Optional<Student> students1 = Student.getAllStudents().stream().min(Comparator.comparing(Student::getMarks));
        System.out.println(students1.get());


    }
}

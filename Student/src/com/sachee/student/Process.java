package com.sachee.student;

import java.util.List;
import java.util.stream.Collectors;

public class Process {

    public static void main(String[] args) {

        Student.getAllStudents().stream().forEach(System.out::println);

        //Student.getAllStudents().stream().forEach(s ->s.getName().toUpperCase());




  List <Student> student = Student.getAllStudents().stream().map(s-> new Student("Eng:" + s.getName(),s.getMarks())).collect(Collectors.toList());

      long count = Student.getAllStudents().stream().map(s-> new Student("Eng:" + s.getName(),s.getMarks())).count();
   System.out.println(count);

    }
}

package com.sachee.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) {
        withoutStream();
        stream();
        nameFilter();

    }
     public static void withoutStream(){

        List<Student> students = Student.getAllStudents();

        List<Student> newStudents = new ArrayList<>();
        for(Student student: students){

            if(student.getMarks()>50){
                newStudents.add(student);
            }


        }

        System.out.println(students.size());
        System.out.println(newStudents.size());

  }

  public static void stream(){

        List<Student> students1 = Student.getAllStudents().stream().filter(s -> s.getMarks()>50 ).collect(Collectors.toList());
        System.out.println(students1.size());

  }
  public static void nameFilter(){

      List<Student> students2 = Student.getAllStudents().stream().filter(s -> s.getName().contains("i")).collect(Collectors.toList());
      System.out.println(students2.size());

      for (Student details : students2) {

       System.out.println(details.getName());
   }

  }
    }

//    for (Student details : list) {
//
//        System.out.println(details.getName() + "\t\t" + details.getMarks());
//    }
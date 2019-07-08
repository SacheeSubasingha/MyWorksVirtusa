package com.sachee.student;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.Map.Entry.comparingByValue;

public class StudentMap {

    public static void main(String[] args) {

        Map<String,Integer> s1 = Student.getAllStudents().stream().collect(Collectors.toMap(Student::getName,Student::getMarks));
        System.out.println(s1);

        sortUsingKey();
        sortUsingValue1();
    }

    public static void sortUsingKey(){

        Map<String,Integer> unsortMap  = Student.getAllStudents().stream().collect(Collectors.toMap(Student::getName,Student::getMarks));

        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Sorted by key...");
        System.out.println(result);


    }

    public static void sortUsingValue1(){

        Map<String,Integer> unsortMap  = Student.getAllStudents().stream().collect(Collectors.toMap(Student::getName,Student::getMarks));

        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Sorted by value...");
        System.out.println(result);


    }
}

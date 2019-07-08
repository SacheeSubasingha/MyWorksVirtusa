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

        sortUsingValue();
    }

    public static void sortUsingValue(){

        Map<String,Integer> unsortMap  = Student.getAllStudents().stream().collect(Collectors.toMap(Student::getName,Student::getMarks));

        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        System.out.println("Sorted...");
        System.out.println(result);



    }
}

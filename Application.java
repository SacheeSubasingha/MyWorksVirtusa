package com.sachee.student;

import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();

        list.add(new Student("sachee",90));
        list.add(new Student("hghjfg",80));
        list.add(new Student("sachee",70));
        list.add(new Student("sachee",60));
        list.add(new Student("sachee",50));
        list.add(new Student("sachee",40));
        list.add(new Student("sachee",60));
        list.add(new Student("sachee",60));
        list.add(new Student("sachee",60));
        list.add(new Student("sachee",60));

        for(Student details:list){

            System.out.println(details.getName()+"\t"+details.getMarks());
        }

    }
}

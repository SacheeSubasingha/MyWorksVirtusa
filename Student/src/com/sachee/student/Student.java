package com.sachee.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    int marks;

    public Student(String name, int marks){
        this.name=name;
        this.marks=marks;


    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static List<Student> getAllStudents() {
    List<Student> list = new ArrayList<>();

    list.add(new Student("sachee", 90));
    list.add(new Student("sanjeewa", 80));
    list.add(new Student("anushi", 70));
    list.add(new Student("kanchu", 60));
    list.add(new Student("pilip", 43));
    list.add(new Student("imashi", 40));
    list.add(new Student("rose", 71));
    list.add(new Student("bendasaman", 60));
    list.add(new Student("ayarn", 90));
    list.add(new Student("janee", 99));

    return list;


}
}

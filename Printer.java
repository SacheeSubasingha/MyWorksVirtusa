package com.sachee.student.thread;

public class Printer extends Thread{

    @Override
    public void run(){

        for(int j=0;j<100;j++){
            System.out.println("Copy"+j);
        }

    }
}

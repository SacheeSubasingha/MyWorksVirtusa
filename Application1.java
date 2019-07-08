package com.sachee.student.thread;

public class Application1 {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setDaemon(true);
        printer.start();

        for(int i=0;i<100;i++){
            System.out.println("main" +i);
        }

    }
}

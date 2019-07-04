package com.sachee;

public class MultipleTableNew {

    public static void main(String[] args) {

        int n= 9;

        System.out.print("\t\t");
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 0; i < n+2 ; i++) {
            System.out.print("----");
        }

        System.out.println();
        for (int i = 1; i <=n ; i++) {

            System.out.print(i+"\t|");
            for (int j = 1; j <=n ; j++) {
                System.out.print("\t"+j*i);
            }
            System.out.println();
        }
    }
}

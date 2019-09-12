package com.assignment1;

public class Client{
    public static void main(String [] args){
        int a = 10;
        double b=2.5;
        long c = 450;
        float f = 0.1f;


        AddNumbers newAdd = new AddNumbers();

        System.out.println("========================");
        System.out.println("Test printing");
        System.out.println("Adding an Int and a Double");
        System.out.println("========================");
        System.out.println("10 + 2.5 = " + newAdd.addNumbers(a,b) + "(Test)" );


        System.out.println("========================");
        System.out.println("Test printing");
        System.out.println("Adding a long and a float");
        System.out.println("========================");
        System.out.println("450 + 0.1 (float) = " + newAdd.addNumbers(c,f) + "(Test)" );


    }
}

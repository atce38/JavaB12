package com.batch12;

import com.batch12.lecutre3.Functions;

public class Main {

//    Main Method which will execute firstly
    public static void main(String[] args) {
	// write your code here

        String studentName="Ali Ahmad";
        System.out.println(studentName);
        add(16,15);
        add(40,15);
        Main main=new Main();
        main.minus(11,12);
        mul(12,13);
        div(7,2);
        mod(18,9);


    }
    protected static void add(int a,int b){

        int result=a+b;
        System.out.println(result);
    }
    public void minus(int a,int b){

        int result=a-b;
        System.out.println(result);
    }
    public static void mul(int a,int b){

        int result=a*b;
        System.out.println(result);
    }
    public static void div(int a,int b){

        int result=a/b;
        System.out.println(result);
    }
    public static void mod(int a,int b){

        int result=a%b;
        System.out.println(result);
    }


}

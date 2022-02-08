package com.batch12;

public class Main {

//    Main Method which will execute firstly
    public static void main(String[] args) {
	// write your code here

        String studentName="Ali Ahmad";
        System.out.println(studentName);
        add(16,15);
        minus(11,12);
        mul(12,13);
        div(7,2);
        mod(18,9);

    }
    public static void add(int a,int b){

        int result=a+b;
        System.out.println(result);
    }
    public static void minus(int a,int b){

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

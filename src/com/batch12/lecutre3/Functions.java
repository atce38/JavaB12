package com.batch12.lecutre3;

import com.batch12.Main;

public class Functions  {

    public static final String PLUS="PLUS";
    public static final String MINUS="MINUS";

    public static void main(String[] args) {
        System.out.println("I m second Main");
        operation(10,15,PLUS);
        operation(30,15,MINUS);

        add();
        add(40,50);
        add(40,50,10);
        add(40,50,10,50);
        add(40,50,10,50,50);
        add(40,50,10,50,50,50,90,10);
    }
    public static void operation(int a,int b,String operationType){
        int result=0;
        if (operationType.equals(PLUS)){
            result=a+b;

        }
        if (operationType.equals(MINUS)){
            result=a-b;
        }

        System.out.println(operationType+" Result ="+result);
    }

    static void add(int ...a){
        int result=0;
        for (int b:a) {
            result+=b;
        }
        System.out.println(result);

    }

}

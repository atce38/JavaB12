package com.batch12.lecture4;

import java.util.ArrayList;

public class ArrayTopic {
    public static void main(String[] args) {
//        int [] arr=new int[10];
//        arr[1]=45;
        ArrayList<String> students=new ArrayList<>();
        students.add("Usama");
        students.add("Zaigham");
        students.add("Umair");
        students.add("Gulsher");
//        students.remove(3);

        for (int i=0;i< students.size();i++)
            System.out.println(students.get(i));
        System.out.println("=========================");
        for (String a:students)
            System.out.println(a);
    }
}

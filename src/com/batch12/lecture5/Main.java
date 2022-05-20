package com.batch12.lecture5;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50];

        arr[1]=15;
        int index=5;
        changeValue(arr,10,index);

        System.out.println("index:"+index+"=>"+arr[index]);
        for (int a:
             arr) {
            System.out.println(a);
        }
    }

    private static void changeValue(int[] arr, int newValue, int index) {
        arr[index]=21;

    }
}

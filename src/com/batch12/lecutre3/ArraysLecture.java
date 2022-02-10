package com.batch12.lecutre3;

public class ArraysLecture {

    public static void main(String[] args) {
//        Functions.add(15,15);
        int[] arr={40,50,60,80};
        int[][] arr1={
                {1,15,16},
                {45,60,20,100},
                {45,60,20,101}
        };
        int [][][] arr2={
                {
                {1,15,16},
                {45,60,20,100},
                {45,60,20,101}
        },
                {
                        {1,15,16},
                        {45,60,20,100},
                        {45,60,20,101},
                        {45,60,20,101}
                }
        };

        System.out.println("2D = "+arr1[2][3]);
        System.out.println("3D = "+arr2[0][1][3]);

        int[] carr=new int[100];
        carr[10]=10;
        System.out.println(carr[10]);

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        System.out.println("======================");
        for (int i:arr) {
            System.out.println(i);
        }
        System.out.println("======================");
        int a=0;
        while (a<arr.length){
            System.out.println(arr[a]);
            a++;
        }
        System.out.println("======================");
        int b=0;
        do {
            System.out.println(arr[b]);
            b++;
        }while (b<arr.length);
    }
}

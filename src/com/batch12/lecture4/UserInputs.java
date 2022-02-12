package com.batch12.lecture4;


import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number1 = scanner.nextInt();
            System.out.println(number1);
        }
       else
           System.out.println("You have Entered Wrong Number");
    }
}

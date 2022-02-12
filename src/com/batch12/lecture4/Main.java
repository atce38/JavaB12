package com.batch12.lecture4;

public class Main {
    static String nonConstant="Usama";
    static final String constantVariable="Zaigham";
    public static void main(String[] args) {

        System.out.println(nonConstant);
        nonConstant="Gul Sher";
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(nonConstant);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(constantVariable);

        String[] names={"Usama","Zaigham","Gulsher","Umair","Khawar","Talha"};
        System.out.println("========================================");
        for (String name:names){
            System.out.println(name);
            System.out.println("========================================");
        }

    }
}

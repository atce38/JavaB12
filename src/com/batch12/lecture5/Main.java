package com.batch12.lecture5;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Zaigham",23,1,50000);
        student.display();
        student=new Student();
        student.name="Zaigham";
        student.age=23;
        student.rollNumber=001;
        student.display();
        student=new Student("Usama",23,1,5000);
        student.name="Talha";
        student.display();
//        student1.name="Usama";
//        student1.age=23;
//        student1.rollNumber=002;
//
//        Zaigham.display();
//        student1.display();

//        char a='a';
//        int v=a;
//        System.out.println(v);

    }
}

package com.batch12.lecture5;

public class Student {
    String name;
    int age,rollNumber;
    double fee;

    public Student() {
    }

    public Student(String name1, int age1, int rollNumber1, double fee1) {
//        this.name=name;
        name = name1;
        age = age1;
        rollNumber = rollNumber1;
        fee = fee1;
    }

    public  void display(){
//        name="Some Thing";
        System.out.println("Name:"+name+", Age:"+age
                +", Roll No."+rollNumber+", Fees:"+fee);
    }
}

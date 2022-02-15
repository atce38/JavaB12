package com.batch12.lecture5;

import java.util.ArrayList;

public class ObjectList {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList=new ArrayList<>();

        Student student=new Student("Umair",23,1,50000);
        studentArrayList.add(student);
        student=new Student();
        student.name="Zaigham";
        student.age=23;
        student.rollNumber=001;
        studentArrayList.add(student);
        studentArrayList.add(new Student("Usama",23,1,5000));
        studentArrayList.add(new Student("Talha",21,1,4000));

        for (Student abc:studentArrayList)
            abc.display();
    }
}

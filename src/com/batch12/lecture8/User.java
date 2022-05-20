package com.batch12.lecture8;

public class User {
   private int id,age=18;
   private String name;


    public User(String name) {
        this.name = name;
    }

    //   Constructor
   public User(int age){
       this.age=age;
   }

    public void setName(String name) {
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

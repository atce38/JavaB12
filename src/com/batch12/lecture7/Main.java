package com.batch12.lecture7;

import com.batch12.lecture6.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Vehicle> vehicleList=new ArrayList<>();
//
//        for (int i=0;i<20;i++){
//            Vehicle car=new Vehicle();
//            car.carName="BMW"+i;
//            car.wheels=5+i;
//            vehicleList.add(car);
//        }
//
//        for (Vehicle v:vehicleList){
//            System.out.println(v);
//        }

        Car car=new Car();
//        car.addName("BMW");
        car.color="RED";
        car.name="BMW";

        System.out.println(car);

    }
}

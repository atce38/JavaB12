package com.batch12.lecture11.guns;

public class M14 implements Gun,Gun1 {
    @Override
    public void fire() {
        System.out.println("First unlock");
        System.out.println("Second Pull the Liver");
        System.out.println("Second Pull the Trigger");
    }

    @Override
    public void reload() {
        System.out.println("Second Pull the Liver");
    }
}

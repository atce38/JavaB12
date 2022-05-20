package com.batch12.lecture11.guns;

public class Main {

    public static void main(String[] args) {
        Player player=new Player();
        player.setGun(new M14());
        player.setGun1(new M14());
        player.getGun().fire();
        player.getGun1().reload();


        System.out.println("===============================");
        player.setGun(new Pistol());
        player.setGun1(new Pistol());
        player.getGun().fire();
        player.getGun1().reload();
    }
}

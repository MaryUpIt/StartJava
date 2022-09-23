package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger();
        gipsyAvenger.setName("Gipsy Avenger");
        gipsyAvenger.setMark(6);
        gipsyAvenger.setWeight(2.5);
        gipsyAvenger.setHeight(81.7);
        gipsyAvenger.setStrenght();
        gipsyAvenger.setArmor();
        gipsyAvenger.descriptions();
        gipsyAvenger.destination();
        gipsyAvenger.move();
        
        Jaeger saberAthena = new Jaeger("Saber Athena", 7, 76.9, 1.6, 5, 10);
        saberAthena.setCanFly(true);
        saberAthena.descriptions();
        saberAthena.move();
        saberAthena.destination();
    }
}
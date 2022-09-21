package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Гоша");
        wolf.setMale(true);
        wolf.setAge(7);
        wolf.setWeight(47.5);
        wolf.setColor("серый");
        if (wolf.getAge() != 0) {
            if (!wolf.getMale()) {
                System.out.println(wolf.getName() + " " + wolf.getColor() + " самка");
            } else {
                System.out.println(wolf.getName() + " " + wolf.getColor() + " самец");
            }
            System.out.println("возраст: " + wolf.getAge() + " вес: " + wolf.getWeight());
            wolf.walk();
            wolf.sit();
            wolf.wail();
            wolf.run();
            wolf.hunt();
        } else {
            System.out.println("Волк уже мертв, или еще не родился");
        }
    }
}

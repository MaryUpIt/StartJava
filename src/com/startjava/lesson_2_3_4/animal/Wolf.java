package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private String name;
    private boolean male;
    private int age;
    private double weight;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст.");
        } else {
            this.age = age;
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public boolean getMale() {
        return male;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("Волк гуляет.");
    }

    public void sit() {
        System.out.println("Волк сидит.");
    }

    public void wail() {
        System.out.println("Волк воет.");
    }

    public void run() {
        System.out.println("Волк бежит.");
    }

    public void hunt() {
        System.out.println("Волк охотится.");
    }
}

package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int attempt = 0;
    private int[] numbers = new int[10];

    Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
                this.number = number;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void addNumber () {
        numbers[attempt] = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public  int getAttempt() {
        return attempt;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void initPlayer() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
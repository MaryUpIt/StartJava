package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[GuessNumber.ATTEMPTS];
    private int attempt;
    private int amountWins;


    Player(String name) {
        this.name = name;
    }

    public void addNumber(String stringNumber) {
        try {
            int number = Integer.parseInt(stringNumber);
            if (number > 0 && number <= 100) {
                numbers[attempt++] = number;
            } else {
                attempt++;
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Вводите только целые числа!!");
            attempt++;
        }

    }

    public void setAmountWin() {
        amountWins = 0;
    }

    public void addAmountWin() {
        amountWins++;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        int[] copyNumbers = Arrays.copyOf(numbers, attempt);
        return copyNumbers;
    }

    public int getAttempt() {
        return attempt;
    }

    public void resetPlayer() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public boolean hasAttempt() {
        return this.attempt < GuessNumber.ATTEMPTS;
    }

    public int getAmountWins() {
        return amountWins;
    }

}

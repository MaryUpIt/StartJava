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

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        numbers[attempt++] = number;
        if (number <= 0 || number > 100) {
            throw new NumberFormatException();
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAmountWin() {
        amountWins = 0;
    }

    public int getAmountWins() {
        return amountWins;
    }

    public void inkAmountWin() {
        amountWins++;
    }

    public void resetPlayer() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public boolean hasAttempt() {
        return this.attempt < GuessNumber.ATTEMPTS;
    }
}

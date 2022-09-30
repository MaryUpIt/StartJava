package com.startjava.lesson_2_3_4.guess;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;
    final private int ATTEMPTS = 10;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        setSecretNumber();
        System.out.println("У каждого игрока по 10 попыток.");
        int countAttempts = 1;
        while (countAttempts <= ATTEMPTS) {
            if (isWin(player1, countAttempts)) {
                break;
            }
            if (isWin(player2, countAttempts)) {
                break;
            }
            countAttempts++;
        }
        printNumbers(player1);
        printNumbers(player2);
    }

    private void setSecretNumber() {
        System.out.printf("Игроки %s и %s готовы!\n", player1.getName(), player2.getName());
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число. Игра началась.");
        player1.initPlayer();
        player2.initPlayer();
    }

    private boolean isWin(Player player, int countAttempts) {
        inputNumber(player);
        player.addNumber();
        player.setAttempt(countAttempts);
        boolean isWin = compareNumbers(player);
        if (!isWin && countAttempts == ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return isWin;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber() + " с " + player.getAttempt() + " попытки");
            return true;
        } else if (player.getNumber() > secretNumber) {
            System.out.println("Число больше того, что загадал компьютер");
        } else {
            System.out.println("Число меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printNumbers(Player player) {
        int[] numbersCopy = Arrays.copyOf(player.getNumbers(), player.getAttempt());
        System.out.println("Игрок " + player.getName() + " называл числа: ");
        for (int number : numbersCopy) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
package com.startjava.lesson_2_3_4.guess;

import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        setSecretNumber();
        System.out.println("У каждого игрока по 10 попыток.");
        play(player1, player2);
        player1.printNumbers();
        player2.printNumbers();
    }
    private void setSecretNumber() {
        System.out.printf("Игроки %s и %s готовы!\n", player1.getName(), player2.getName());
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число. Игра началась.");
        player1.restartPlayer();
        player2.restartPlayer();
    }
    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
    }
    private boolean compareNumbers(Player player) {
        if (player.getNumber() == secretNumber) {
            return true;
        } else if (player.getNumber() > secretNumber) {
            System.out.println("Число больше того, что загадал компьютер");
        } else {
            System.out.println("Число меньше того, что загадал компьютер");
        }
        return false;
    }
    private void play(Player player1, Player player2) {
        int countRate = 1;
        while (countRate <= 10) {
            inputNumber(player1);
            player1.addNumbers();
            player1.setAttempt(countRate);
            if (compareNumbers(player1)) {
                System.out.println("Игрок " + player1.getName() + " угадал число " +
                        player1.getNumber() + " с " + player1.getAttempt() + " попытки");
                break;
            }
            inputNumber(player2);
            player2.addNumbers();
            player2.setAttempt(countRate);

            if (compareNumbers(player2)) {
                System.out.println("Игрок " + player2.getName() + " угадал число " +
                        player2.getNumber() + " с " + player2.getAttempt() + " попытки");
                break;
            }
            if (player1.getAttempt() == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            if (player2.getAttempt() == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
            countRate++;
        }
    }
}
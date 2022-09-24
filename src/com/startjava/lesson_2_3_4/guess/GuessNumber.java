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

    public void game() {
        setSecretNumber();
        System.out.println("У каждого игрока по 10 попыток.");
        int countRate = 1;
        while (countRate <= 10) {
            if (play(player1, countRate)) {
                break;
            }
            if (play(player2, countRate)) {
                break;
            }
            countRate++;
        }
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
    private boolean play (Player player, int countRate) {
        inputNumber(player);
        player.addNumbers();
        player.setAttempt(countRate);
        boolean isWin = compareNumbers(player);
        if (isWin) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber() + " с " + player.getAttempt() + " попытки");
        }
        if (countRate == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return isWin;
    }
}
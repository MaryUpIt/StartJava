package com.startjava.lesson_2_3.guess;

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
        while (true) {
            inputNumber(player1);
            if (compareNumbers(player1)) {
                return;
            }
            inputNumber(player2);
            if (compareNumbers(player2)){
                return;
            }
        }
    }

    private void setSecretNumber() {
        System.out.printf("Игроки %s и %s готовы!\n", player1.getName(), player2.getName());
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число. Игра началась.");
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.printf("%s победил!\n", player.getName());
            return true;
        } else if (player.getNumber() > secretNumber) {
            System.out.println("Число больше того, что загадал компьютер");
        } else {
            System.out.println("Число меньше того, что загадал компьютер");
        }
        return false;
    }
}
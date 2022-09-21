package com.startjava.lesson_2_3.guess;

import com.startjava.lesson_2_3.guess.Player;
import java.lang.Math;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;
    private int startRange;
    private int endRange;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    } 

    void startGame() {
        System.out.printf("Игроки %s и %s готовы!\n", player1.getName(), player2.getName());
        secretNumber = (int) (Math.random()*100) + 1;
        System.out.println("Компьютер загадал число. Игра началась.");
        startRange = 1;
        endRange = 100;
    }

    void checkPlayerNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.printf("%s победил! Победное число %d\n", player.getName(), player.getNumber());
        } else {
            if (player.getNumber() > secretNumber) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", player.getNumber());
            } else {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", player.getNumber());
            }
        }
    }

    int chooseNumber(int playerNumber) {
        if (playerNumber == 0) {
            playerNumber = endRange / 2;
        } else if (playerNumber > secretNumber) {
            endRange = playerNumber;
            if ((endRange - startRange) > 3) {
                playerNumber -= (endRange - startRange) / 2;
            } else {
                playerNumber--;
            }
        } else {
            startRange = playerNumber;
            if ((endRange - startRange) > 3) {
                playerNumber += (endRange - startRange) / 2;
            } else {
                playerNumber++;
            }
        }
        return playerNumber;
    }

    public void gamePlay() {
        startGame();
        while(player1.getNumber() != secretNumber && player2.getNumber() != secretNumber) {
            player1.setNumber(chooseNumber(player2.getNumber()));
            player1.play();
            checkPlayerNumber(player1);
            if (player1.getNumber() == secretNumber) {
                return;
            }
            player2.setNumber(chooseNumber(player1.getNumber()));
            player2.play();
            checkPlayerNumber(player2);
        }
    }
}
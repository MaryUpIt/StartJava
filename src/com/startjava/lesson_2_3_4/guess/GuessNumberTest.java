package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на игру \"Угадай число\" ");
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(initPlayers(GuessNumber.AMOUNT_PLAYERS));
        String answer = "yes";
        while (!answer.equals("no")) {
            game.start();
            do {
                System.out.print("Перезапустить игру? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
    private static Player[] initPlayers(int countPlayers) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[countPlayers];
        for (int i = 0; i < players.length; i++) {
            System.out.printf("Введите имя %d-го игрока: ", i + 1);
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}

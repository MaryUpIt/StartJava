package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на игру \"Угадай число\" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guess = new GuessNumber(player1, player2);
        String answer = "yes";
        while (!answer.equals("no")) {
            guess.start();
            do {
                System.out.print("Перезапустить игру? [yes/no]: ");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
    }
}

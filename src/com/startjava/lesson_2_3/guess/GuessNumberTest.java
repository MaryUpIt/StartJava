package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        

        System.out.println("Добро пожаловать на игру \"Угадай число\" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            answer = "ok";
            game.gamePlay();
            while (!answer.equals("yes") && !answer.equals("no")){
                System.out.print("Перезапустить игру? [yes/no]: ");
                answer = scanner.next();
            }
        } while (!answer.equals("no"));
    }
}

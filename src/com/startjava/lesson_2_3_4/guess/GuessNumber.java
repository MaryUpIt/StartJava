package com.startjava.lesson_2_3_4.guess;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    public final static int AMOUNT_PLAYERS = 3;
    private final static int AMOUNT_ROUNDS = 3;
    public final static int ATTEMPTS = 10;
    private int secretNumber;
    private Player[] players;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        castLots();
        for (Player player : players) {
            player.setAmountWin();
        }
        int round = 1;
        while (round <= AMOUNT_ROUNDS) {
            System.out.println(round + "-й РАУНД");
            generateSecretNumber();
            for (Player player : players) {
                player.resetPlayer();
            }
            System.out.printf("У каждого игрока по %d попыток.\n", ATTEMPTS);
            boolean isWin = false;
            boolean hasAttempt = true;
            while (!isWin && hasAttempt) {
                for (Player player : players) {
                    if (!(hasAttempt = player.hasAttempt())) {
                        System.out.println("У " + player.getName() + " закончились попытки");
                        continue;
                    }
                    if (isWin = isGuessed(player)) {
                        player.inkAmountWin();
                        System.out.println(player.getAmountWins()); //
                        break;
                    }
                }
            }
            for (Player player : players) {
                printNumbers(player);
            }
            round++;
        }
        findWinner();
    }

    private void castLots() {
        System.out.println("Игроки бросают жребий");
        for (int i = players.length - 1; i > 0; i--) {
            int lot = (int) (Math.random() * i);
            Player tmp = players[i];
            players[i] = players[lot];
            players[lot] = tmp;
        }
        int i = 1;
        for (Player player : players) {
            System.out.println(i++ + "-й игрок " + player.getName() + " готов к игре.");
        }
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число.");
    }

    private boolean isGuessed(Player player) {
        inputNumber(player);
        return compareNumbers(player);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        try {
            player.addNumber(scanner.nextInt());
        } catch (NumberFormatException exp) {
            System.out.println("Введите число в интервале от 1 до 100!");
        }
    }

    private boolean compareNumbers(Player player) {
        int number = player.getNumbers()[player.getNumbers().length - 1];
        if (number > 100 || number <= 0) {
            return false;
        }
        if (number == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число  " +
                    number + " с " + player.getAttempt() + " попытки");
            return true;
        }
        System.out.printf("Число %s того, что загадал компьютер\n",
                number > secretNumber ? "больше" : "меньше");
        return false;
    }

    private void printNumbers(Player player) {
        System.out.println("Игрок " + player.getName() + " называл числа: ");
        for (int number : player.getNumbers()) {
                System.out.print(number + " ");
        }
        System.out.println();
    }

    private void findWinner() {
        Player[] sortWinners = Arrays.copyOf(players, players.length);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < sortWinners.length; i++) {
                if (sortWinners[i].getAmountWins() > sortWinners[i - 1].getAmountWins()) {
                    isSorted = false;
                    Player tmp = sortWinners[i];
                    sortWinners[i] = sortWinners[i - 1];
                    sortWinners[i - 1] = tmp;
                }
            }
        }
        int maxWin = sortWinners[0].getAmountWins();
        if (maxWin == 0) {
            System.out.println("Победил компьютер!! Игроки не смогли угадать число))");
        } else if (maxWin > 0 && maxWin > sortWinners[1].getAmountWins()) {
            System.out.println(sortWinners[0].getName() + " победил, количество побед: " + maxWin);
        } else {
            for (Player player : players) {
                if (player.getAmountWins() == maxWin) {
                    System.out.print(player.getName() + " ");
                }
            }
            System.out.println("- сыграли в ничью, количество побед: " + maxWin);
        }
    }
}


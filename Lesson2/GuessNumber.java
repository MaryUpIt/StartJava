import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;
    private boolean isWin;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    } 

    public void play() {
        startGame();
        while (!isWin) {
            inputPlayerNumber(player1);
            compareNumbers(player1);
            if (isWin) {
                return;
            }
            inputPlayerNumber(player2);
            compareNumbers(player2);
        }
    }

    private void startGame() {
        System.out.printf("Игроки %s и %s готовы!\n", player1.getName(), player2.getName());
        secretNumber = (int) (Math.random()*100) + 1;
        System.out.println("Компьютер загадал число. Игра началась.");
        isWin = false;
    }

    private void inputPlayerNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
    }


    private void compareNumbers(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.printf("%s победил!\n", player.getName());
            isWin = true;
        } else if (player.getNumber() > secretNumber) {
            System.out.println("Число больше того, что загадал компьютер");
        } else {
            System.out.println("Число меньше того, что загадал компьютер");
        }
    }
}
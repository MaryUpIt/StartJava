import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на игру \"Угадай число\" ");
        GuessNumber game = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        String answer;
        do {
            answer = "ok";
            System.out.printf("Игроки %s и %s готовы!\n", player1.getName(), player2.getName());
            game.start();
            game(player1, player2, game);
            while (!answer.equals("yes") && !answer.equals("no")){
                System.out.print("Перезапустить игру? [yes/no]: ");
                answer = scanner.next();
            }
        } while (!answer.equals("no"));
    }

    static int endRange;
    static int startRange;
    static int playerNumber;

    static void restartGame () {
        endRange = 100;
        startRange = 1;
        playerNumber = 0;
    }

    static void chooseNumber(int secretNumber) {
        if (playerNumber > secretNumber) {
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
    }

    static void game (Player player1, Player player2, GuessNumber game) {
        restartGame();
        int secretNumber = game.getRandom();
        
        while(player1.getNumber() != secretNumber && player2.getNumber() != secretNumber) {
            chooseNumber(secretNumber);
            player1.setNumber(playerNumber);
            player1.play();
            game.check(player1);
            if (player1.getNumber() == secretNumber) {
                return;
            }
            chooseNumber(secretNumber);
            player2.setNumber(playerNumber);
            player2.play();
            game.check(player2);
        }
    }
}


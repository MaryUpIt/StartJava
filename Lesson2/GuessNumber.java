import java.lang.Math;

public class GuessNumber {
    private int secretNumber;

    public void start() {
        System.out.println("Компьютер загадал число. Игра началась.");
        secretNumber = (int) (Math.random()*100) + 1;
    }

    public int getRandom() {
        return secretNumber;
    }


    void check(Player player) {
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
}
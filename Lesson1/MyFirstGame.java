public class MyFirstGame {
    public static void main(String[] args) {
        int random = 3;
        int min = 1;
        int max = 100;
        int gamer = max / 2;
        while (gamer != random) {
            if (gamer > random) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", gamer);
                max = gamer;
                if ((max - min) > 10) {
                    gamer -= 10;
                } else {
                    gamer--;
                }
            } else {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", gamer);
                min = gamer;
                if ((max - min) > 10) {
                    gamer += 10;
                } else {
                    gamer++;
                }
            }
        }
        System.out.printf("Вы победили! число %d\n", gamer);
    }
}
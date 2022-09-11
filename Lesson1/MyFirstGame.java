public class MyFirstGame {
    public static void main(String[] args) {
        int random = 9;
        int gamer = 50;
        while (gamer != random) {
            if (gamer > random) {
                while (gamer > random ) {
                    System.out.printf("Число %d больше того, что загадал компьютер\n", gamer);
                    gamer -= 10;
                    if (gamer == 0) {
                        while(gamer != random) {
                            gamer++;
                            System.out.printf("Число %d меньше того, что загадал компьютер\n", gamer);
                        }
                    }
                }
                while (gamer < random ) {
                    System.out.printf("Число %d меньше того, что загадал компьютер\n", gamer);
                    gamer++;
                }
            } else {
                while (gamer < random) {
                    System.out.printf("Число %d меньше того, что загадал компьютер\n", gamer);
                    gamer += 10;
                }
                while (gamer < random) {
                    System.out.printf("Число %d больше того, что загадал компьютер\n", gamer);
                    gamer--;
                }
            }
        } 
        System.out.printf("Вы победили! число %d\n", gamer);
    }
}
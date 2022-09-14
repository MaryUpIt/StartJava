public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 3;
        int startRange = 1;
        int endRange = 100;
        int playerNum = endRange / 2;
        while (playerNum != secretNum) {
            if (playerNum > secretNum) {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
                endRange = playerNum;
                if ((endRange - startRange) > 10) {
                    playerNum -= 10;
                } else {
                    playerNum--;
                }
            } else {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNum);
                startRange = playerNum;
                if ((endRange - startRange) > 10) {
                    playerNum += 10;
                } else {
                    playerNum++;
                }
            }
        }
        System.out.printf("Вы победили! число %d\n", playerNum);
    }
}
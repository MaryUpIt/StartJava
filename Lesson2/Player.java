import java.lang.Math;

public class Player {
    private String playerName;
    private int playerNumber;

    Player (String playerName) {
        this.playerName = playerName;
    }

    public void setNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return playerName;
    }

    public int getNumber() {
        return playerNumber;
    }

    public void play() {
        System.out.printf("%s называет число: %d\n", playerName, playerNumber);
    }
}
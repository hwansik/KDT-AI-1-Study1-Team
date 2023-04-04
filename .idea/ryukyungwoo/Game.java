package practice.dice3;
class GameManager {
    final private Player playerNumber;
    final private Dice diceNumber;
    public GameManager () {
        Player player = new Player();
        PlayerList playerList = new PlayerList();
        this.playerNumber = playerList.getPlayerListNumber(0);
        this.diceNumber = player.getDiceListNumber(0);
    }

    @Override
    public String toString() {
        return "Game{" +
                "playerNumber=" + playerNumber +
                ", diceNumber=" + diceNumber +
                '}';
    }
}

public class Game {
}

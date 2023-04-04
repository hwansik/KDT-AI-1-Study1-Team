package practice.dice3;

import java.util.ArrayList;
import java.util.List;
class PlayerList{
    final private int HOW_MANY_PLAYERS = 2;
    private Player playerListNumber;
    List<Player> playerList = new ArrayList<>();
    public PlayerList () {
        for (int i = 0; i < HOW_MANY_PLAYERS; i++) {
            Player player = new Player();
            playerList.add(player);
            this.playerListNumber = playerList.get(i);
        }
    }
    public Player getPlayerListNumber(int index) {
        return playerListNumber;
    }

    @Override
    public String toString() {
        return "PlayerList{" +
                "playerList=" + playerList +
                '}';
    }
}
public class Player {
    private Dice diceListNumber;
    List<Dice> diceList = new ArrayList<>();
    final private int HOW_MANY_DICES = 3;
    public Player () {
        for (int i = 0; i < HOW_MANY_DICES; i++) {
            Dice dice = new Dice();
            diceList.add(dice);
            this.diceListNumber = diceList.get(i);
        }
    }

    public Dice getDiceListNumber(int index) {
        return diceListNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "diceList=" + diceList +
                '}' + '\n';
    }
}

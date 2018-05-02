import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
    }

    public Deck getDeck(){
        return this.deck;
    }

    public int playerCount(){
        return this.players.size();
    }

    public void addPlayer(Player newPlayer){
        this.players.add(newPlayer);
    }
}

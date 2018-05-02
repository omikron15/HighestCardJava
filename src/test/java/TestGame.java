import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestGame {

    Game game1;
    Deck deck1;
    Player player1;
    Player player2;

    @Before
    public void before(){
        deck1 = new Deck();
        game1 = new Game(deck1);
        player1 = new Player("Connor");
        player2 = new Player("Andrew");
    }

    @Test
    public void hasDeck(){
        assertNotNull(game1.getDeck());
    }

    @Test
    public void noPlayers(){
        assertEquals(0, game1.playerCount());
    }

    @Test
    public void hasPlayers(){
        game1.addPlayer(player1);
        game1.addPlayer(player2);
        assertEquals(2, game1.playerCount());
    }


}

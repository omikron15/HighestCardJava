import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Player player1;

    @Before
    public void before(){
        player1 = new Player("Connor");
    }

    @Test
    public void getName(){
        assertEquals("Connor", player1.getName());
    }

    @Test
    public void noHand(){
          assertEquals(0, player1.cardsInHand());
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GameTest {

    @Test
    void getName() {
        Game game = new Game("gamey");
        assertEquals("gamey", game.getName());
    }

    @Test
    void getBoard() {
        Game game = new Game("gamey");
        assertArrayEquals(new char[] {'-','-','-'}, game.getBoard());

    }
}




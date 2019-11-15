import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GameTest {

    @Test
    void getBoard() {
        Game game = new Game();
        assertArrayEquals(new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}}, game.getBoard());
    }

    @Test
    void move() {
        Game game = new Game();
        game.move(0,0);
        assertArrayEquals(new char[][] {{'x','-','-'}, {'-','-','-'}, {'-','-','-'}}, game.getBoard());
    }
}




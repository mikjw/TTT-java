import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GameTest {

    @Test
    void getBoard() {
        Game game = new Game();
        assertArrayEquals(new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}}, game.getBoard());
    }

    @Test
    void moveTopLeft() {
        Game game = new Game();
        game.move(0,0);
        assertArrayEquals(new char[][] {{'x','-','-'}, {'-','-','-'}, {'-','-','-'}}, game.getBoard());
    }

    @Test
    void moveBottomRight() {
        Game game = new Game();
        game.move(2,2);
        assertArrayEquals(new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','x'}}, game.getBoard());
    }

    @Test
    void storingTurn() {
        Game game = new Game();
        assertTrue(game.isplayerOneTurn());
    }

    @Test
    void changingTurn() {
        Game game = new Game();
        assertTrue(game.isplayerOneTurn());
        game.move(0, 0);
        assertFalse(game.isplayerOneTurn());
    }

    @Test
    void alternatingTurn() {
        Game game = new Game();
        assertTrue(game.isplayerOneTurn());
        game.move(0, 0);
        assertFalse(game.isplayerOneTurn());
        game.move(2, 2);
        assertTrue(game.isplayerOneTurn());
    }

    @Test
    void markingNaughts() {
        Game game = new Game();
        game.move(0, 0);
        game.move(2, 2);
        assertArrayEquals(new char[][] {{'x','-','-'}, {'-','-','-'}, {'-','-','o'}}, game.getBoard());
    }
}




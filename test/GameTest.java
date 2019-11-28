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
        assertTrue(game.isPlayerOneTurn());
    }

    @Test
    void changingTurn() {
        Game game = new Game();
        assertTrue(game.isPlayerOneTurn());
        game.move(0, 0);
        assertFalse(game.isPlayerOneTurn());
    }

    @Test
    void alternatingTurn() {
        Game game = new Game();
        assertTrue(game.isPlayerOneTurn());
        game.move(0, 0);
        assertFalse(game.isPlayerOneTurn());
        game.move(2, 2);
        assertTrue(game.isPlayerOneTurn());
    }

    @Test
    void markingNaughts() {
        Game game = new Game();
        game.move(0, 0);
        game.move(2, 2);
        assertArrayEquals(new char[][] {{'x','-','-'}, {'-','-','-'}, {'-','-','o'}}, game.getBoard());
    }

    @Test
    void alreadyFilledCells() {
        Game game = new Game();
        game.move(0, 0);
        assertEquals("invalid move", game.move(0,0));
    }

    @Test
    void checkBoardFull() {
        Game game = new Game();
        game.move(1, 1);
        game.move(2, 1);
        game.move(2, 2);
        game.move(1, 2);
        game.move(0, 2);
        game.move(2, 0);
        game.move(0, 0);
        game.move(0, 1);
        game.move(1, 0);
        assertArrayEquals(new char[][] {{'x','o','x'}, {'x','x','o'}, {'o','o','x'}}, game.getBoard());
        assertTrue(game.isBoardFull());
    }

    @Test
    void checkBoardNotFull() {
        Game game = new Game();
        game.move(1, 1);
        game.move(2, 1);
        game.move(2, 2);
        game.move(1, 2);
        game.move(0, 2);
        game.move(2, 0);
        game.move(0, 0);
        game.move(0, 1);
        assertArrayEquals(new char[][] {{'x','o','x'}, {'-','x','o'}, {'o','o','x'}}, game.getBoard());
        assertFalse(game.isBoardFull());
    }

    @Test
    void xWinsHorizontally() {
        Game game = new Game();
        game.move(0, 0);
        game.move(1, 0);
        game.move(0, 1);
        game.move(1, 1);
        assertEquals("GAME OVER", game.move(0, 2));
    }

    @Test
    void noWin() {
        Game game = new Game();
        assertNull(game.move(0, 2));
    }

    @Test
    void xWinsHorizontallyAgain() {
        Game game = new Game();
        game.move(1, 0);
        game.move(0, 0);
        game.move(1, 1);
        game.move(0, 1);
        assertEquals("GAME OVER", game.move(1, 2));
    }

    @Test
    void oWinsHorizontally() {
        Game game = new Game();
        game.move(1, 0);
        game.move(0, 0);
        game.move(2, 1);
        game.move(0, 1);
        game.move(2, 2);
        assertEquals("GAME OVER", game.move(0, 2));
    }

    @Test
    void xWinsVertically() {
        Game game = new Game();
        game.move(0, 0);
        game.move(0, 1);
        game.move(1, 0);
        game.move(0, 2);
        assertEquals("GAME OVER", game.move(2, 0));
    }

    @Test
    void oWinsVertically() {
        Game game = new Game();
        game.move(0, 0);
        game.move(0, 1);
        game.move(1, 0);
        game.move(1, 1);
        game.move(2, 0);
        assertEquals("GAME OVER", game.move(2, 1));
    }

    @Test
    void xWinsDiagonallyLeft() {
        Game game = new Game();
        game.move(0, 0);
        game.move(0, 2);
        game.move(1, 1);
        game.move(1, 2);
        assertEquals("GAME OVER", game.move(2, 2));
    }

    @Test
    void xWinsDiagonallyRight() {
        Game game = new Game();
        game.move(0, 2);
        game.move(1, 2);
        game.move(1, 1);
        game.move(2, 2);
        assertEquals("GAME OVER", game.move(2, 0));
    }
}




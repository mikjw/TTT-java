import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterfaceTest {
    @Test
    void drawsBoard() {
        Game game = new Game();
        Interface UI = new Interface();
        assertEquals(" A B C\n|-|-|-| 1\n|-|-|-| 2\n|-|-|-| 3\n", UI.drawBoard(game.getBoard()));
    }
}
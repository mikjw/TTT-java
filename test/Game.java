public class Game {

    private char[][] board;

    public boolean isPlayer_one_turn() {
        return player_one_turn;
    }

    private boolean player_one_turn = true;

    public Game() {
        this.board = new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    }

    public char[][] getBoard() {
        return board;
    }

    public void move(int row, int col) {

        this.board[row][col] = 'x';
    }
}





public class Game {

    private char[][] board = new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    private boolean player_one_turn = true;

    public char[][] getBoard() {
        return board;
    }

    public boolean isPlayer_one_turn() {
        return player_one_turn;
    }

    public void move(int row, int col) {
        this.board[row][col] = 'x';
        this.player_one_turn = false;
    }
}





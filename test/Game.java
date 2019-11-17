public class Game {

    private char[][] board;

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





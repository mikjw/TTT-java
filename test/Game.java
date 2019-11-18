public class Game {

    private char[][] board = new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    private boolean playerOneTurn = true;

    public char[][] getBoard() {
        return board;
    }

    public boolean isplayerOneTurn() {
        return playerOneTurn;
    }

    public void move(int row, int col) {
        this.board[row][col] = 'x';
        if (this.playerOneTurn == true) {
            this.playerOneTurn = false;
        } else {
            this.playerOneTurn = true;
        };
    }
}





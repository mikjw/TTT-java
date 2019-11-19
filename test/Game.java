public class Game {

    private char[][] board = new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    private boolean playerOneTurn = true;

    public char[][] getBoard() {
        System.out.print(board[0]);
        System.out.print(board[1]);
        System.out.print(board[2]);
        return board;
    }

    public boolean isplayerOneTurn() {
        return playerOneTurn;
    }

    public boolean isBoardFull() {
        boolean full = true;
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                if (board[i][j] == '-')
                    full = false;
        return full;
    }

    public void move(int row, int col) {
        if (this.playerOneTurn) this.board[row][col] = 'x';
        else this.board[row][col] = 'o';
        this.playerOneTurn = !this.playerOneTurn;
    }
}





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
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                if (board[i][j] == '-')
                    return false;
        return true;
    }

    public String move(int row, int col) {
        char currentPlayer = playerOneTurn ? 'x' : 'o';
        if (board[row][col] != '-') return "invalid move";
        this.board[row][col] = currentPlayer;
        this.playerOneTurn = !this.playerOneTurn;
        if (checkRowsForWin(currentPlayer) || checkColsForWin(currentPlayer)) {
            return "GAME OVER";
        }
        return null;
    }

    private Boolean checkRowsForWin(char player) {
        for (int i=0; i<3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        return false;
    }

    private Boolean checkColsForWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        return false;
    }
}





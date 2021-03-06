public class Game {

    private char[][] board = new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    private boolean playerOneTurn = true;

    public char[][] getBoard() {
        return board;
    }

    public boolean isPlayerOneTurn() {
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
        board[row][col] = currentPlayer;
        playerOneTurn = !playerOneTurn;
        return checkForEnd(currentPlayer);
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

    private Boolean checkDiagsForWin(char player) {
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        } else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private String checkForEnd(char player) {
         if (checkRowsForWin(player) || checkColsForWin(player) || checkDiagsForWin(player) || isBoardFull()) {
             return "GAME OVER";
         } else {
             return null;
         }
    }
}





import java.lang.reflect.Array;
import java.util.Scanner;

public class Interface {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Interface UI = new Interface();
        Game game = new Game();
        System.out.println(UI.drawBoard(game.getBoard()));
        while (true) {
            System.out.println("Enter row:");
            int row = scanner.nextInt();
            System.out.println("Enter col:");
            int col = scanner.nextInt();
            game.move(row, col);
            System.out.println(UI.drawBoard(game.getBoard()));
        }
    }

    public String drawBoard(char[][] board) {
        String output = "";
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                output += "|" + board[i][j];
            }
            output += "|\n";
        }
        return output;
    }
}

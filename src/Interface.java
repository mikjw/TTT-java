import java.lang.reflect.Array;
import java.util.Scanner;

public class Interface {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Interface UI = new Interface();
        InputConverter converter = new InputConverter();
        Game game = new Game();
        System.out.println(UI.drawBoard(game.getBoard()));
        while (true) {
            System.out.println("Enter move:");
            String userMove = scanner.nextLine();
            int[] convertedMove = converter.convert(userMove);
            game.move(convertedMove[1], convertedMove[0]);
            System.out.println(UI.drawBoard(game.getBoard()));
        }
    }

    public String drawBoard(char[][] board) {
        String output = " A B C\n";
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                output += "|" + board[i][j];
            }
            output += "| " + (i+1) + "\n";
        }
        return output;
    }
}

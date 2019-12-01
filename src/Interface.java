import java.util.Scanner;

public class Interface {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        while (true) {
            System.out.println("Enter row:");
            int row = scanner.nextInt();
            System.out.println("Enter col:");
            int col = scanner.nextInt();
            game.move(row, col);
            System.out.println(game.getBoard());
        }
    }
}

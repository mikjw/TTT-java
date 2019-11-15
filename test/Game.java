public class Game {

    private String name;
    private char[] board;

    private Game(String name) {
        this.name = name;
        this.board = new char[] {'-','-','-'};

    }

    public String getName() {
        return name;
    }

    public char[] getBoard() {
        return board;
    }
}

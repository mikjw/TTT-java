public class Game {

    private String name;

    private char[] board = {'-','-','-'};

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char[] getBoard() {
        return board;
    }
}

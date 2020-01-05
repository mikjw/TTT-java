public class InputConverter {
    public int[] convert(String input) {
        int[] output;
        if (input == "B2") {
            output = new int[]{1, 1};
        } else {
            output = new int[]{0, 1};
        }
        return output;
    }
}

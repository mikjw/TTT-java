import java.util.Hashtable;

public class InputConverter {
    public int[] convert(String input) {
        String[] arr = input.split("");
        Hashtable<String, Integer> conversion = new Hashtable<>();
        conversion.put("A", 0);
        conversion.put("B", 1);
        conversion.put("C", 2);
        int[] output = new int[2];
        output[0] = conversion.get(arr[0]);
        output[1] = Integer.parseInt(arr[1]) - 1;
        return output;
    }
}

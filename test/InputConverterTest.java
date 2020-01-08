import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputConverterTest {
    @Test
    void returnsCorrectArrayForB2() {
        InputConverter conv = new InputConverter();
        assertArrayEquals(new int[]{1,1}, conv.convert("B2"));
    }

    @Test
    void returnsCorrectArrayForA2() {
        InputConverter conv = new InputConverter();
        assertArrayEquals(new int[]{0,1}, conv.convert("A2"));
    }

    @Test
    void returnsCorrectArrayForC3() {
        InputConverter conv = new InputConverter();
        assertArrayEquals(new int[]{2,2}, conv.convert("C3"));
    }
}
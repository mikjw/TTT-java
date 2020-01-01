import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputConverterTest {
    @Test
    void returnsArray() {
        InputConverter conv = new InputConverter();
        assertArrayEquals(new int[]{1,1}, conv.convert());
    }
}
import home.work18.Options;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhiTableTest {
    private Options option;
    private int[] expected;

    @BeforeEach
    void init() {
        option = new Options("src\\test\\resources\\journal_ru.json");
        expected = new int[]{76, 9, 4, 1};
    }

    @Test
    void testPhi() {
        double res = option.phi(expected);
        assertEquals(0.068, res, 1e-3);
    }

    @Test
    void testTable() {
        String event = "делал зарядку";
        int[] res = option.tableFor(event);
        boolean isTab = Arrays.equals(expected, res);
        assertTrue(isTab);
    }
}

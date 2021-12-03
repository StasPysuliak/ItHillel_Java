import home.work18.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class OptionsTest {
    @Test
    void dayJournal () {
        String path = "src\\test\\resources\\journal_ru.json";
        Options options = new Options(path);
        List<String> events = options.journalEvents();
        boolean isDist = events.size() == events.stream().distinct().count();
        assertFalse(events.contains(null));
        assertFalse(events.isEmpty());
        assertTrue(isDist);
    }

    @Test
    void testPhi() {
        Options option = new Options("src\\test\\resources\\journal_ru.json");
        int[] expected = {76, 9, 4, 1};
        double res = option.phi(expected);
        assertEquals(0.068, res, 1e-3);
    }

    @Test
    void testTable() {
        Options option = new Options("src\\test\\resources\\journal_ru.json");
        String event = "делал зарядку";
        int[] expected = {76, 9, 4, 1};
        int[] res = option.tableFor(event);
        boolean isTab = Arrays.equals(expected, res);
        assertTrue(isTab);
    }
}

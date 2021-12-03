import home.work18.DayJournal;
import home.work18.Options;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OptionsTest {
    private Options options;

    @BeforeEach
    void init() {
        options = new Options("src\\test\\resources\\journal_ru.json");
    }

    @Test
    void dayJournal() {
        List<String> events = options.journalEvents();
        boolean isDist = events.size() == events.stream().distinct().count();
        assertFalse(events.contains(null));
        assertFalse(events.isEmpty());
        assertTrue(isDist);
    }

    @Test
    void newEvent() {
        List<DayJournal> event = options.newEvent();
        List<DayJournal> journal = options.getJournal();

        boolean isSizeEquals = event.size() == journal.size();

        assertTrue(isSizeEquals);
        assertFalse(event.contains("ел арахис-чистил зубы"));
        assertFalse(event.isEmpty());
        assertFalse(event.contains(null));
    }
}

import home.work18.DayJournal;
import home.work18.JsonToJava;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class OptionsTest {
    @Test
    void dayJournal () {
        JsonToJava jsonToJava = new JsonToJava();
        List<DayJournal> journal = jsonToJava.getJournal("src\\test\\resources\\journal_ru.json");

        DayJournal dayJournal = new DayJournal();
        List<String> events = dayJournal.getEvents();
        boolean isDist = events.size() == events.stream().distinct().count();

        assertFalse(events.contains(null));
        assertFalse(events.isEmpty());
        assertFalse(isDist);
    }
}

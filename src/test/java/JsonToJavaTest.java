import home.work18.DayJournal;
import home.work18.JsonToJava;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class JsonToJavaTest {
    @Test
    void jsonTest() {
        JsonToJava jsonToJava = new JsonToJava();
        List<DayJournal> journal = jsonToJava.getJournal("src\\test\\resources\\journal_ru.json");
        boolean isContainsNull = journal.contains(null);
        assertFalse(journal.isEmpty());
        assertFalse(isContainsNull);
    }
}


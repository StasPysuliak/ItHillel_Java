package home.work18;

import java.util.List;

public class DayJournal {
    private List<String> events;
    private boolean squirrel;

    List<String> getEvents() {
        return events;
    }

    boolean isSquirrel() {
        return squirrel;
    }

    @Override
    public String toString() {
        return "events = " + events + ", squirrel = " + squirrel;
    }
}

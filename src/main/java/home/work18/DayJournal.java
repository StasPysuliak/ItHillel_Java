package home.work18;

import java.util.List;

public class DayJournal {
    private List<String> events;
    private boolean squirrel;

    public DayJournal() {
    }

    public DayJournal(String event) {
        this.events.add(event);
        this.squirrel = true;
    }

    public List<String> getEvents() {
        return events;
    }

    public boolean isSquirrel() {
        return squirrel;
    }

    @Override
    public String toString() {
        return "events = " + events + ", squirrel = " + squirrel;
    }
}

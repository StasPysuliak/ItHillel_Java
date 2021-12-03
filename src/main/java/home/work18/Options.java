package home.work18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Options {
    private String path;
    private ArrayList<DayJournal> journal;
    public Options(String path) {
        this.journal = new JsonToJava().getJournal(path);
    }

    void show() {
        System.out.println("Для корреляции > 0.1 или < -0.1");
        for (String event : journalEvents()) {
            double correlation = phi(tableFor(event));
            if (correlation > 0.1 || correlation < -0.1) System.out.println(event + ":\t" + correlation);
        }
    }

    private double phi(int[] table) {
        return (table[3] * table[0] - table[2] * table[1]) /
                Math.sqrt((table[2] + table[3]) * (table[0] + table[1]) * (table[1] + table[3]) * (table[0] + table[2]));
    }

    private int[] tableFor(String event) {
        int[] table = {0, 0, 0, 0};
        for (int i = 0; i < journal.size(); i++) {
            DayJournal entry = journal.get(i);
            int index = 0;
            if (entry.getEvents().contains(event)) index += 1;
            if (entry.isSquirrel()) index += 2;
            table[index] += 1;
        }
        return table;
    }

    private ArrayList<String> journalEvents() {
        ArrayList<String> events = new ArrayList<>();
        for (DayJournal entry : journal) {
            for (String event : entry.getEvents()) {
                if (!events.contains(event)) events.add(event);
            }
        }
        return events;
    }

    public List<DayJournal> newEvent() {
        return journal.stream()
                .peek(x -> {
                    if (x.getEvents().contains("ел арахис") && !x.getEvents().contains("чистил зубы")) {
                        x.getEvents().add("ел арахис" + "-" + "чистил зубы");
                    }
                })
                .collect(Collectors.toList());
    }

}
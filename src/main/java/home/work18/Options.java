package home.work18;

import java.util.ArrayList;
import java.util.HashMap;

public class Options {
    private ArrayList<DayJournal> journal;

    private void init(String path) {
        journal = new JsonToJava().getJournal(path);
    }

    private static double phi(int[] table) {
        return (table[3] * table[0] - table[2] * table[1]) /
                Math.sqrt((table[2] + table[3]) * (table[0] + table[1]) * (table[1] + table[3]) * (table[0] + table[2]));
    }

    private void tableFor() {

    }

}
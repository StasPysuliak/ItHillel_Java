package home.work7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToArrays {
    public static void main(String[] args) {
        String path = "G:\\Java\\JavaHomeWork\\src\\home\\work7\\journalEvents_ru.csv";
        int countOfLines;
        String[][] action = {};
        boolean[] boolArg = {};
        String[] text;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            countOfLines = (int) Files.lines(Path.of(path)).count();
            action = new String[countOfLines][];
            boolArg = new boolean[countOfLines];
            for (int i = 0; i < countOfLines; i++) {
                text = reader.readLine().split(",");
                action[i] = new String[text.length - 1];
                for (int j = 0; j < text.length - 1; j++) {
                    action[i][j] = text[j];
                }
                if (text[text.length - 1].equals("false")) boolArg[i] = false;
                if (text[text.length - 1].equals("true")) boolArg[i] = true;
            }
        } catch (IOException e) {
            System.out.println("No data to read");
            System.exit(0);
        }
        newEvent(action);
        show(action, boolArg);
    }

    private static void newEvent(String[][] action) {
        for (int i = 0; i < action.length; i++) {
            if (includes(action[i], "ел арахис") && !includes(action[i], "чистил зубы")) {
                action[i][action[i].length - 1] = "арахис-зубы";
            }
        }
    }

    private static void show(String[][] action, boolean[] boolArg) {
        System.out.println("Для корреляции > 0.1 или < -0.1");
        for (String event : journalEvents(action)) {
            double correlation = phi(tableFor(event, action, boolArg));
            if (correlation > 0.1 || correlation < -0.1) System.out.println(event + ":\t" + correlation);
        }
    }

    private static double phi(int[] table) {
        return (table[3] * table[0] - table[2] * table[1]) /
                Math.sqrt((table[2] + table[3]) * (table[0] + table[1]) * (table[1] + table[3]) * (table[0] + table[2]));
    }

    private static int[] tableFor(String event, String[][] action, boolean[] boolArg) {
        int[] table = {0, 0, 0, 0};
        for (int i = 0; i < action.length; i++) {
            String[] events = action[i];
            int index = 0;
            if (includes(events, event)) index += 1;
            if (boolArg[i]) index += 2;
            table[index] += 1;
        }
        return table;
    }

    private static boolean includes(String[] events, String event) {
        for (String s : events) {
            if (s.equals(event)) return true;
        }
        return false;
    }

    private static String[] journalEvents(String[][] action) {
        String tmp = "";
        String[] events = tmp.split(",");
        for (int i = 0; i < action.length; i++) {
            for (int j = 0; j < action[i].length; j++) {
                if (!includes(events, action[i][j])) tmp += action[i][j] + ",";
                events = tmp.split(",");
            }
        }
        return events;
    }
}

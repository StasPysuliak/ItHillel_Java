package home.work4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileToArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path as in the example: G:\\Java\\JavaHomeWork\\src\\home\\work4\\journalEvents_ru.csv \nPath = ");
        String path = scanner.next();
        BufferedReader reader = getDataFromFile(path);
        BufferedReader bufferedReader = getDataFromFile(path);
        int countOfLines = countOfLine(bufferedReader);
        String[][] action = new String[countOfLines][];
        boolean[] boolArg = new boolean[countOfLines];
        String[] text;

        try {
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

        showArrays(action, boolArg, countOfLines);
    }

    private static void showArrays(String[][] action, boolean[] boolArg, int countOfLines) {
        for (int i = 0; i < countOfLines; i++) {
            System.out.println(Arrays.toString(action[i]));
        }
        System.out.println(Arrays.toString(boolArg));
    }

    private static BufferedReader getDataFromFile(String path) {
        try {
            return new BufferedReader(new FileReader(new File(path)));

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            System.exit(0);
        }
        return null;
    }

    private static int countOfLine(BufferedReader bufferedReader) {
        try {
            String text = bufferedReader.readLine();
            int i = 0;
            while (text != null) {
                if (text.equals("") && i == 0) {
                    System.out.println("File is empty");
                    System.exit(0);
                }
                if (text.equals("")) break;
                i++;
                text = bufferedReader.readLine();
            }
            return i;
        } catch (IOException e) {
            System.out.println("No data to read");
            System.exit(0);
        }
        return 0;
    }


}

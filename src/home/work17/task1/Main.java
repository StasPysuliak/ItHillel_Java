package home.work17.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Dictionary dictionary = new Dictionary();
        String word;
        try {
            while (true) {
                System.out.println("0.exit\n" +
                        "1.Translate phrase\n" +
                        "2.Add new word");
                switch (Integer.parseInt(bf.readLine())) {
                    case 0: {
                        return;
                    }

                    case 1: {
                        System.out.println("write phrase");
                        word = bf.readLine().toLowerCase();
                        if (!word.equals("")) {
                            System.out.println(dictionary.translate(word));
                        } else {
                            System.out.println("incorrect entry\n");
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("write in new word and translate " + "example: двері = door");
                        word = bf.readLine().toLowerCase();
                        if (!word.equals("") && word.indexOf(" = ") > 0) {
                            dictionary.addWordToDictionary(word);
                        } else {
                            System.out.println("incorrect entry\n");
                        }
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
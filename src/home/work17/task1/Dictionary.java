package home.work17.task1;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public void addWordToDictionary(String word) {
        String[] newWord = word.split(" = ");
        dictionary.put(newWord[1], newWord[0]);
        System.out.println("word added");
    }

    public StringBuilder translate(String line) {
        String[] arr = line.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!dictionary.containsKey(arr[i])) {
                System.out.println("non-existed\n");
                System.exit(0);
            }
            stringBuilder.append(dictionary.get(arr[i]));
            stringBuilder.append(" ");
        }
        return stringBuilder;
    }
}

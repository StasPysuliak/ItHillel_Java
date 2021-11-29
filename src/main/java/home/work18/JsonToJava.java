package home.work18;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class JsonToJava {
    ArrayList<DayJournal> getJournal(String path) {
        Gson gson = new Gson();
        ArrayList<DayJournal> journal = null;
        try {
            journal = gson.fromJson(new FileReader(path), new TypeToken<ArrayList<DayJournal>>() {}.getType());
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (NullPointerException e) {
            System.out.println("File is empty");
        }
        return journal;
    }
}

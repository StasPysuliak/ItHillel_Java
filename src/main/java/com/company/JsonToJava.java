package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class JsonToJava {
    void parser(String path) {
        Gson gson = new Gson();
        List<DayJournal> journal = null;
        try {
            journal = gson.fromJson(new FileReader(path), new TypeToken<ArrayList<DayJournal>>() {}.getType());
            show(journal);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (NullPointerException e) {
            System.out.println("File is empty");
        }
    }

    private void show(List<DayJournal> journal) {
        for (DayJournal user : journal) {
            System.out.println(user);
        }
    }
}

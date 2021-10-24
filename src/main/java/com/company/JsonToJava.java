package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonToJava {
    public static void main(String[] args) {

        Gson gson = new Gson();
        String path = "G:\\Java\\JavaHomeWork\\src\\main\\java\\com\\company\\journal_ru.json";
        List<DayJournal> journal = null;

        try {
            journal = gson.fromJson(new FileReader(path), new TypeToken<ArrayList<DayJournal>>(){}.getType());
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

        for(DayJournal user : journal) {
            System.out.println(user);
        }

    }
}

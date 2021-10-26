package com.company;

public class Main {
    public static void main(String[] args) {
        String path = "G:\\Java\\JavaHomeWork\\src\\main\\java\\com\\company\\journal_ru.json";
        JsonToJava jsonToJava = new JsonToJava();
        jsonToJava.parser(path);
    }
}

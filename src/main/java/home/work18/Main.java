package home.work18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "src\\main\\resources\\journal_ru.json";
        Options options = new Options(path);
//        options.show();
//        options.newEvent();
//        options.show();
        System.out.println(options.journalEvents().size());
    }
}
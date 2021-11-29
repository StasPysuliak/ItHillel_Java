package home.work18;

public class Main {
    public static void main(String[] args) {
        String path = "G:\\Java\\JavaHomeWork\\src\\main\\java\\home\\work18\\journal_ru.json";
        JsonToJava jsonToJava = new JsonToJava();
        jsonToJava.getJournal(path);
    }
}
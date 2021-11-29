package home.work18;

public class Main {
    public static void main(String[] args) {
        String path = "G:\\Java\\JavaHomeWork\\src\\main\\java\\home\\work18\\journal_ru.json";
        Options options = new Options(path);
        options.show();
        options.newEvent();
        options.show();
    }
}
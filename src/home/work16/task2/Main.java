package home.work16.task2;

public class Main {
    public static void main(String[] args) {
        NumGenerator numGenerator = new NumGenerator(10, 10, 25);
        System.out.println("List: " + numGenerator.generateList());
        System.out.println("Set:  " + numGenerator.generateSet());
    }
}

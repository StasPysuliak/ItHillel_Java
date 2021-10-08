package home.work5;

import java.util.Scanner;

public class HardRecursion {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        int number = correctNumber();

        if (result(number) != null) System.out.println(result(number));
        else System.out.println("Solution is not found");
    }

    private static String result(int number) {
        find(1, "1", number);
        return find(1, "1", number);
    }

    private static String find(int current, String history, int number) {
        if (current == number) return history;
        else if (current > number) return null;
        else {
            if (find(current + 5, "(" + history + " + 5)", number) != null)
                return find(current + 5, "(" + history + " + 5)", number);
            if (find(current * 3, "(" + history + " * 3)", number) != null)
                return find(current * 3, "(" + history + " * 3)", number);
        }
        return null;
    }

    private static int correctNumber() {                            //check the entered number
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) number = scanner.nextInt();
        else {
            System.out.println("Wrong argument.Please enter a number");
            System.exit(0);
        }
        return number;
    }

}
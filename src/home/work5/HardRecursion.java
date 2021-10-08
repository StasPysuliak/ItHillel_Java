package home.work5;

import java.util.Scanner;

public class HardRecursion {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        int number = correctNumber();
        int current = 1;
        String strRes = "1";
        String res = (find(current, strRes, number));
        System.out.println(res != null ? res : "Solution is not found");

    }

    private static String find(int current, String strRes, int number) {
        String str;
        if (current == number) return strRes;
        else if (current > number) return null;
        else {
            str = find(current + 5, "(" + strRes + " + 5)", number);
            if (str != null) return str;
            str = find(current * 3, "(" + strRes + " * 3)", number);
            return str;
        }
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
package home.work10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] data = str.split(" ");
        String[] str1 = data[0].split(",");
        String[] str2 = data[2].split(",");

//        if (!Fraction.validationArguments(str1[1]) && !Fraction.validationArguments(str2[1])){
//            System.out.println("Incorrect arguments");
//            System.exit(0);
//        }

        Fraction fraction1 = new Fraction(Integer.parseInt(str1[0]), Short.parseShort(str1[1]));
        Fraction fraction2 = new Fraction(Integer.parseInt(str2[0]), Short.parseShort(str2[1]));
        switch (data[1]) {
            case "plus":
                System.out.println(Arrays.toString(Fraction.addition(fraction1, fraction2)));
                break;
            case "minus":
                System.out.println(Arrays.toString(Fraction.subtraction(fraction1, fraction2)));
                break;
            default:
                System.out.println("Non-existent function");
        }
    }
}
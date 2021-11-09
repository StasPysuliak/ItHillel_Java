package home.work10;

import org.w3c.dom.ls.LSOutput;

public class Fraction {

    private int intPart;
    private short decimalPart;
    private String str;

    public Fraction(int intPart, short decimalPart) {
        this.intPart = intPart;
        this.decimalPart = decimalPart;
    }

    public Fraction(String str) {
        this.str = str;
    }

    static int[] addition(Fraction num1, Fraction num2) {
        int num1decimalPart = num1.decimalPart;
        int num2decimalPart = num2.decimalPart;
        int num1Length = length(num1.decimalPart);
        int num2Length = length(num2.decimalPart);
        int intPartRes = num1.intPart + num2.intPart;
        int decimalPartRes;

        if (num1.intPart < 0) num1decimalPart *= -1;
        if (num2.intPart < 0) num2decimalPart *= -1;

        if (num1Length < num2Length) {
            num1decimalPart = exponentiation(num1decimalPart, num2Length - num1Length);             //alignment of numbers
            num1Length = length(num1decimalPart);
            decimalPartRes = num1decimalPart + num2decimalPart;
        } else {
            num2decimalPart = exponentiation(num2decimalPart, num1Length - num2Length);             //alignment of numbers
            num2Length = length(num2decimalPart);
            decimalPartRes = num2decimalPart + num1decimalPart;
        }

        if ((length(decimalPartRes) > num1Length || length(decimalPartRes) > num2Length) && decimalPartRes < 0) {
            decimalPartRes += exponentiation(1, length(decimalPartRes));
            intPartRes--;
        }
        if ((length(decimalPartRes) > num1Length || length(decimalPartRes) > num2Length) && decimalPartRes > 0) {
            decimalPartRes -= exponentiation(1, length(decimalPartRes));
            intPartRes++;
        }



        return new int[]{intPartRes, decimalPartRes};
    }


    static int[] subtraction(Fraction num1, Fraction num2) {
        int num1decimalPart = num1.decimalPart;
        int num2decimalPart = num2.decimalPart;
        int num1Length = length(num1.decimalPart);
        int num2Length = length(num2.decimalPart);
        int intPartRes = num1.intPart - num2.intPart;
        int decimalPartRes;

        if (num1.intPart < 0) num1decimalPart *= -1;
        if (num2.intPart < 0) num2decimalPart *= -1;

        if (num1Length < num2Length) {
            num1decimalPart = exponentiation(num1decimalPart, num2Length - num1Length);

            decimalPartRes = num1decimalPart - num2decimalPart;
        } else {
            num2decimalPart = exponentiation(num2decimalPart, num1Length - num2Length);

            decimalPartRes = num2decimalPart - num1decimalPart;
        }

        if ((length(decimalPartRes) > num1Length || length(decimalPartRes) > num2Length) && decimalPartRes < 0) {
            decimalPartRes -= exponentiation(1, length(decimalPartRes));
            intPartRes--;
        }
        if (length(decimalPartRes) > num1Length || length(decimalPartRes) > num2Length) {
            decimalPartRes -= exponentiation(1, length(decimalPartRes));
            intPartRes--;
        }



        return new int[]{intPartRes, decimalPartRes};
    }

    private static int length(int num) {
        if (num < 0) num*=-1;
        return num < 10 ? 0 : length(num / 10) + 1;
    }

    private static int exponentiation(int num, int count) {
        return count == 0 ? num : exponentiation(num, count - 1) * 10;
    }

    static boolean validationArguments(String str) {
        if (Integer.parseInt(str) > Short.MAX_VALUE || Integer.parseInt(str) < 0) {
            return false;
        }
        return true;
    }

}

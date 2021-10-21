package home.work1;

public class Calculator {
    public static void main(String[] args) {

        int arg1 = 0;
        int arg2 = 0;
        int res = 0;
        char opt = ' ';
        String out = " ";

        try {
            arg1 = Integer.parseInt(args[0]);
            arg2 = Integer.parseInt(args[2]);

            switch (args[1]) {

                case "plus":
                    res = arg1 + arg2;
                    opt = '+';
                    break;

                case "minus":
                    res = arg1 - arg2;
                    opt = '-';
                    break;

                case "divide":
                    if (arg2 == 0) {                                                    //Сhecking division by zero is very important.
                        out = "Error.Division by zero.Try again samurai";
                        break;
                    }
                    res = arg1 / arg2;
                    opt = '/';
                    break;

                case "multiply":
                    res = arg1 * arg2;
                    opt = '*';
                    break;

                default:
                    out = "Wrong arguments.Pleas try do it as in the example: " + "\t" + "java Calculator 4 multiply 5";
                    break;
            }
        } catch (Exception ex) {
            out = "Wrong arguments.Pleas try do it as in the example: " + "\t" + "java Calculator 4 multiply 5";
        } finally {
            if (opt != ' ') System.out.println("> " + arg1 + " " + opt + " " + arg2 + " = " + res);
            System.out.println("\n" + out);
        }

    }
}

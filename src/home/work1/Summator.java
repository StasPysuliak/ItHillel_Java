package home.work1;

public class Summator {
    public static void main(String[] args) {

        int arg1;
        int arg2;
        int res;
        String out = "";

        try {
            arg1 = Integer.parseInt(args[0]);
            arg2 = Integer.parseInt(args[1]);
            res = arg1 + arg2;
            out = "> Result: " + arg1 + " + " + arg2 + " = " + res;
        } catch (Exception ex) {
            out = "Wrong arguments.Please try do it as in the example: " + "\t" + "java Summator 2 2";
        } finally {
            System.out.println("\n" + out);
        }

    }
}

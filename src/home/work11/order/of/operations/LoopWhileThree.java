package home.work11.order.of.operations;

public class LoopWhileThree {
    public static void main(String[] arg) {
        int count = 10;

        int i = 0;
        while (i < count) {
            int k = 0;
            while (k < count) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
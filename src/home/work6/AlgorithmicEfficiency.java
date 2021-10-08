package home.work6;

public class AlgorithmicEfficiency {
    public static void main(String[] args) {
        /*
        checked for 1000 and 100000 items
        the difference is impressive
        1,000,000 did not have enough patience to get the result
        */
        SpeedOfMethods speedOfMethods = new SpeedOfMethods();

        System.out.println("Enter number of elements: ");
        int size = speedOfMethods.correctNumber();
        System.out.println("Enter the number you want to find in the array: ");
        int x = speedOfMethods.correctNumber();
        System.out.println();

        speedOfMethods.show(size, x);

    }
}

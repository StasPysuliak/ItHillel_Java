package home.work13.flower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Options options = new Options();
        Scanner scanner = new Scanner(System.in);
        int[] bunch = new int[3];

        System.out.println("Amount of Roses: ");
        bunch[0] = scanner.nextInt();

        System.out.println("Amount of Chamomile: ");
        bunch[1] = scanner.nextInt();

        System.out.println("Amount of Tulip: ");
        bunch[2] = scanner.nextInt();

        options.getFlower(bunch);
    }
}

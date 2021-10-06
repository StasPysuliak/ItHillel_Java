package home.work2.home;

import java.util.Scanner;

public class LangtonsAnt {

    private static int[] arr = {1, 0, 0, 0};
    private static int antX;
    private static int antY;

    public static void main(String[] args) {

        System.out.println("Enter the height");
        int row = correctNumber();
        System.out.println("Enter the width");
        int column = correctNumber();
        System.out.println("Enter a number of steps");
        int n = correctNumber();
        System.out.println("Enter antX = ");
        antX = correctNumber();
        System.out.println("Enter antY = ");
        antY = correctNumber();

//        antX = (int) (column / 4 + Math.random() * (column - column / 2));  that the ant appeared in a random place
//        antY = (int) (row / 4 + Math.random() * (row - row / 2));

        char[][] field = new char[row][column];
        fieldGenerator(field, row, column);
        showGameField(field, row, column);

        for (int i = 0; i < n; i++) {
            moveTheAnt(field);
            showGameField(field, row, column);
        }
    }

    private static int correctNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) number = scanner.nextInt();
        else {
            System.out.println("Wrong argument. Please enter a number");
            System.exit(0);
        }
        return number;
    }

    private static void fieldGenerator(char[][] field, int fieldHeight, int fieldWidth) {
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldWidth; j++) {
                field[i][j] = 'W';
            }
        }
    }

    private static void showGameField(char[][] field, int fieldHeight, int fieldWidth) {
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldWidth; j++) {
                if (i == antY && j == antX) System.out.print("\u001B[31m" + field[i][j]);
                else {
                    if (field[i][j] == 'B') System.out.print("\u001B[37m" + 'B');
                    if (field[i][j] == 'W') System.out.print("\u001B[30m" + 'W');
                }
            }
            System.out.println();
        }
        if (antX < 0 || antX >= fieldWidth || antY < 0 || antY >= fieldHeight) {
            System.out.println("The ant went beyond the playing field");
            System.exit(0);
        }
    }

    private static String antTarget(int look) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 1 && look == 0) {
                arr[i] = 0;
                if (i == 0) {
                    arr[i + 3] = 1;
                    break;
                }
                arr[i - 1] = 1;
                break;
            }
            if (arr[i] == 1 && look == 1) {
                arr[i] = 0;
                if (i == 3) {
                    arr[i - 3] = 1;
                    break;
                }
                arr[i + 1] = 1;
                break;
            }
        }
        if (arr[0] == 1) return "North";
        if (arr[1] == 1) return "West";
        if (arr[2] == 1) return "South";
        else return "East";
    }

    private static void moveTheAnt(char[][] field) {
        String pos = " ";
        if (field[antY][antX] == 'B') {
            field[antY][antX] = 'W';
            pos = antTarget(0);
            System.out.println("Black -> White. Will go to " + pos);
        } else if (field[antY][antX] == 'W') {
            field[antY][antX] = 'B';
            pos = antTarget(1);
            System.out.println("White -> Black. Will go to " + pos);
        }
        if (pos.equals("North")) antY--;
        if (pos.equals("West")) antX--;
        if (pos.equals("South")) antY++;
        if (pos.equals("East")) antX++;
    }

}

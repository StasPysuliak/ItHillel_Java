package home.work2.home;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        int fieldSize = 5;
        char[][] gameField = new char[fieldSize][fieldSize];
        fieldGenerator(gameField, fieldSize);
        showGameField(gameField, fieldSize);
        System.out.println("Enter the coordinates X and Y between 1 - " + fieldSize);
        gamePlay(gameField, fieldSize);

    }

    private static void gamePlay(char[][] gameField, int fieldSize) {
        String message = " ";
        int column;
        int row;
        char player;


        for (int i = 0; i < fieldSize * fieldSize; i++) {

            if ((i % 2) == 0) {
                System.out.println("Player1 = ");
                player = 'X';
            } else {
                System.out.println("Player2 = ");
                player = 'O';
            }

            System.out.println("enter X: ");
            row = correctNumber() - 1;
            System.out.println("enter Y: ");
            column = correctNumber() - 1;

            if (column < 0 || column >= fieldSize || row < 0 || row >= fieldSize) {
                System.out.println("Wrong coordinates.Coordinates must be from 1 " + fieldSize + ".Try again");
                i--;
                continue;
            }


            if (gameField[column][row] == 'X' || gameField[column][row] == 'O') {
                System.out.println("This field is already taken. Please select another one.");
                i--;
                continue;
            }

            gameField[column][row] = player;

            showGameField(gameField, fieldSize);

            if (victory(gameField, fieldSize)) {
                message = "Win " + player;
                break;
            }
            if (i == 8) System.out.println("Game Over");

        }
        System.out.println(message);
    }

    private static int correctNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) number = scanner.nextInt();
        else {
            System.out.println("Wrong argument.Please enter a number");
            System.exit(0);
        }
        return number;
    }

    private static void fieldGenerator(char[][] gameField, int fieldSize) {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                gameField[i][j] = '*';
            }
        }
    }

    private static void showGameField(char[][] gameField, int fieldSize) {
        for (int i = 0; i < fieldSize; i++) {
            System.out.println(Arrays.toString(gameField[i]));
        }
    }

    private static boolean victory(char[][] gameField, int fieldSize) {
        int xVinRow;
        int oVinRow;
        int xVinColumn;
        int oVinColumn;
        int xVinDiagonalL = 0;
        int oVinDiagonalL = 0;
        int xVinDiagonalR = 0;
        int oVinDiagonalR = 0;

        for (int i = 0, k = fieldSize - 1; i < fieldSize; i++, k--) {
            xVinRow = 0;
            oVinRow = 0;
            xVinColumn = 0;
            oVinColumn = 0;

            if (gameField[i][i] == 'X') xVinDiagonalL++;
            if (gameField[i][i] == 'O') oVinDiagonalL++;
            if (gameField[i][k] == 'X') xVinDiagonalR++;
            if (gameField[i][k] == 'O') oVinDiagonalR++;

            for (int j = 0; j < fieldSize; j++) {
                if (gameField[i][j] == 'X') xVinRow++;
                if (gameField[i][j] == 'O') oVinRow++;
                if (gameField[j][i] == 'X') xVinColumn++;
                if (gameField[j][i] == 'O') oVinColumn++;


                if (xVinRow == fieldSize || oVinRow == fieldSize ||
                        xVinColumn == fieldSize || oVinColumn == fieldSize ||
                        xVinDiagonalL == fieldSize || oVinDiagonalL == fieldSize ||
                        xVinDiagonalR == fieldSize || oVinDiagonalR == fieldSize) return true;
            }
        }
        return false;
    }
}
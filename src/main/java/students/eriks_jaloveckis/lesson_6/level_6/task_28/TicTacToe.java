package students.eriks_jaloveckis.lesson_6.level_6.task_28;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == playerToCheck && field[i][1] == playerToCheck && field[i][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) ||
                    (field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForHorizontals(field, playerToCheck);
    }


    public boolean isDrawPosition(int[][] field) {
        if (isWinPosition(field, 0) || isWinPosition(field, 1)) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (field[i][i] == -1) {
                return false;
            }
        }
        return true;
    }

    public int[][] createField() {
        return new int[][]{
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1},
        };
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first coordinate: ");
        int a = scanner.nextInt();
        System.out.print("Enter second coordinate: ");
        int b = scanner.nextInt();
        return new Move(a, b);
    }

    public void printFieldToConsole(int[][] field) {
        for (int rows = 0; rows < 3; rows++) {
            System.out.println("\n");
            for (int columns = 0; columns < field[rows].length; columns++) {
                System.out.print(field[rows][columns] + "\t");
            }
        }
        System.out.println();
        System.out.println();
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;

            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}

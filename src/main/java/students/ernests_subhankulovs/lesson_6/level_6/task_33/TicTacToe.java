package students.ernests_subhankulovs.lesson_6.level_6.task_33;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length ; j++) {
                if (field[i][j] == playerToCheck) {
                    counter++;
                }
            }
            if (counter == field[i].length) {
                return true;
            }
            else {
                counter = 0;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == playerToCheck) {
                    counter++;
                }
            }
            if (counter == field.length) {
                return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
                if (field[i][i] == playerToCheck) {
                    counter++;
                }
        }
        if (counter == field.length) {
            return true;
        } else {
            counter = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][field.length - i - 1] == playerToCheck) {
                    counter++;
                }
            }
            return (counter == field.length);
        }
    }

    public boolean isWin(int[][] field, int playerToCheck) {
        return (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck));
    }

    public boolean isDraw(int[][] field) {
        if (!isWin(field, 0) && !isWin(field, 1)) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j] == -1) {
                        return false;
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    public int[][] createField() {
        int[][] array = new int[3][3];
        for (int[] row : array) {
            Arrays.fill(row, -1);
        }
        return array;
    }

    public Move getNextMove(int[][] field) {
        int x = 0;
        int y = 0;
        boolean moveAllowed;
        Scanner scanner = new Scanner(System.in);
        do {
            do {
                moveAllowed = true;
                System.out.println("Enter the X coordinate of Your next move:");
                x = scanner.nextInt();
                System.out.println("Enter the Y coordinate of Your next move:");
                y = scanner.nextInt();
                if (x < 0 || x > 2 || y < 0 || y > 2) {
                    System.out.println("The coordinates must be within the field!");
                    System.out.println();
                    moveAllowed = false;
                }
            } while (!moveAllowed);
            if (field[x][y] != -1) {
                System.out.println("This move is not allowed!");
                printFieldToConsole(field);
            }
        } while (field[x][y] != -1);
        return new Move(x, y);
    }

    public Move calculateNextMove(int[][] field) {
        int x = 0;
        int y = 0;
        boolean moveAllowed;
        Random random = new Random();
        do {
            do {
                moveAllowed = true;
                x = random.nextInt(3) -1;
                y = random.nextInt(3) -1;
                if (x < 0 || x > 2 || y < 0 || y > 2) {
                    moveAllowed = false;
                }
            } while (!moveAllowed);
        } while (field[x][y] != -1);
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print("[");
            for (int j = 0; j < field.length; j++) {
                if (j < field.length - 1) {
                    if (field[i][j] != -1) {
                        System.out.print(field[i][j] + ",  ");
                    }
                    else {
                        System.out.print(field[i][j] + ", ");
                    }
                }
                else {
                    if (field[i][j] != -1) {
                        System.out.print(" " + field[i][j]);
                    }
                    else {
                        System.out.print(field[i][j]);
                    }
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void play() {
        int[][] field = createField();
        printFieldToConsole(field);
        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("Player 0:");
            Move move0 = getNextMove(field);
            field[move0.getX()][move0.getY()] = 0;
            System.out.println();
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
            System.out.println();
            System.out.println("Player 1:");
            Move move1 = calculateNextMove(field);
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}

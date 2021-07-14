package students.vija_m.lesson_6.level_6.task_30;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == playerToCheck &&
                    field[i][1] == playerToCheck &&
                    field[i][2] == playerToCheck
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == playerToCheck &&
                    field[1][i] == playerToCheck &&
                    field[2][i] == playerToCheck
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return ( field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck
        ) || (
                field[2][0] == playerToCheck &&
                        field[1][1] == playerToCheck &&
                        field[0][2] == playerToCheck );
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return ( isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck) );
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
                {-1, -1, -1}
        };
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для игры в Крестики-нолики введите, пожалуйста, координаты клетки куда Вы хотите походить.");
        System.out.println("Координата x (число 0, 1 или 2): ");
        int x = scanner.nextInt();
        System.out.println("Координата y (число 0, 1 или 2): ");
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println();
        System.out.println("*****");
        for (int[] ints : field) {
            for (int j = 0; j < ints.length; j++) {
                char cell = switch (ints[j]) {
                    case 0 -> 'O';
                    case 1 -> 'X';
                    default -> '-';
                };
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("*****");
        System.out.println();
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            Move move0 = getNextMove();
            System.out.println("Ситуация на игровом поле:");
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
            System.out.println("Ситуация на игровом поле:");
            printFieldToConsole(field);
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

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}





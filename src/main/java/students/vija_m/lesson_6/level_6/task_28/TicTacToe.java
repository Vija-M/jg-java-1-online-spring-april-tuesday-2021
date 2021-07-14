package students.vija_m.lesson_6.level_6.task_28;

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
        System.out.println("Для игры в Крестики-нолики введите, пожалуйста, координаты клетки куда хотите походить.");
        System.out.println("Координата x: ");
        int x = scanner.nextInt();
        System.out.println("Координата y: ");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }
}




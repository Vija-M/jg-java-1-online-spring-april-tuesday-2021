package students.ernests_subhankulovs.lesson_6.level_6.task_27;

import java.util.Arrays;
import java.util.Random;

class TicTacToe {

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

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck));
    }

    public boolean isDrawPosition(int[][] field) {
        if (!isWinPosition(field, 0) && !isWinPosition(field, 1)) {
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

}

package students.ernests_subhankulovs.lesson_6.level_5.task_23;

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
}

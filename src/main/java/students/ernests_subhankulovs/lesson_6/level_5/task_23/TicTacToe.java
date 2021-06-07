package students.ernests_subhankulovs.lesson_6.level_5.task_23;

import java.util.Arrays;
import java.util.Random;

class TicTacToe {

    public static void main(String[] args) {
        int[][] field = new int[3][3];
        Random random = new Random();
        TicTacToe ticTacToe = new TicTacToe();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = random.nextInt(3) - 1;
            }
        }

        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }

        System.out.println(ticTacToe.isWinPositionForVerticals(field, 0));
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
}

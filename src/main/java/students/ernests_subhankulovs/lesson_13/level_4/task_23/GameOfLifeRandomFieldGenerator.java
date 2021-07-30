package students.ernests_subhankulovs.lesson_13.level_4.task_23;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int row, int column) {
        Random random = new Random();
        boolean[][] field = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }
}

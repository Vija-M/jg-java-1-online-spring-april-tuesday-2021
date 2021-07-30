package students.ernests_subhankulovs.lesson_13.level_4.task_24;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        Random random = new Random();
        boolean[][] field = new boolean[fieldWidth][fieldHeight];
        for (int i = 0; i < fieldWidth; i++) {
            for (int j = 0; j < fieldHeight; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }
}

package students.ernests_subhankulovs.lesson_13.level_3.task_13;

class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = currentGeneration;
        int liveStreak = 0;
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                if (j > 0) {
                    if (currentGeneration[i][j - 1]) {
                        liveStreak++;
                    }
                }
                if (i > 0) {
                    if (currentGeneration[i - 1][j]) {
                        liveStreak++;
                    }
                }
                if (i > 0 && j > 0) {
                    if (currentGeneration[i - 1][j - 1]) {
                        liveStreak++;
                    }
                }
                if (j < currentGeneration[i].length - 1) {
                    if (currentGeneration[i][j + 1]) {
                        liveStreak++;
                    }
                }
                if (i < currentGeneration.length - 1) {
                    if (currentGeneration[i + 1][j]){
                        liveStreak++;
                    }
                }
                if (i < currentGeneration.length - 1 && j < currentGeneration[i].length - 1) {
                    if (currentGeneration[i + 1][j + 1]) {
                        liveStreak++;
                    }
                }
                if (i < currentGeneration.length - 1 && j > 0) {
                    if (currentGeneration[i + 1][j - 1]) {
                        liveStreak++;
                    }
                }
                if (j < currentGeneration[i].length - 1 && i > 0) {
                    if (currentGeneration[i - 1][j + 1]) {
                        liveStreak++;
                    }
                }
                if (liveStreak < 2) {
                    nextGeneration[i][j] = false;
                }
                liveStreak = 0;
            }
        }
        return nextGeneration;
    }
}

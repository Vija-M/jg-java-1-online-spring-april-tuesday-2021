package students.ernests_subhankulovs.lesson_13.level_3.task_16;

class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int i = 0; i < currentGeneration.length; i++) {
            System.arraycopy(currentGeneration[i], 0, nextGeneration[i], 0, currentGeneration[i].length);
        }
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
                if (liveStreak < 2 || liveStreak > 3) {
                    nextGeneration[i][j] = false;
                }
                liveStreak = 0;
            }
        }
        return nextGeneration;
    }
}

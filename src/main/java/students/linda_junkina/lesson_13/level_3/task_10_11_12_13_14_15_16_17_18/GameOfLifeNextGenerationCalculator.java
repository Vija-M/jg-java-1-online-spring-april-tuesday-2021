package students.linda_junkina.lesson_13.level_3.task_10_11_12_13_14_15_16_17_18;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration.length];

        int numberOfNeighbors = 0;
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration.length; j++) {
                if (j > 0) {
                    if (currentGeneration[i][j - 1]) {
                        numberOfNeighbors++;
                    }
                }
                if (i > 0) {
                    if (currentGeneration[i - 1][j]) {
                        numberOfNeighbors++;
                    }
                }
                if (j <= currentGeneration.length - 1) {
                    if (currentGeneration[i][j + 1]) {
                        numberOfNeighbors++;
                    }
                }
                if (i <= currentGeneration.length - 1) {
                    if (currentGeneration[i + 1][j]) {
                        numberOfNeighbors++;
                    }
                }
                if (i > 0 && j > 0) {
                    if (currentGeneration[i - 1][j - 1]) {
                        numberOfNeighbors++;
                    }
                }
                if (i <= currentGeneration.length - 1 && j <= currentGeneration.length - 1) {
                    if (currentGeneration[i + 1][j + 1]) {
                        numberOfNeighbors++;
                    }
                }
                if (i > 0 && j <= currentGeneration.length - 1) {
                    if (currentGeneration[i - 1][j + 1]) {
                        numberOfNeighbors++;
                    }
                }
                if (i <= currentGeneration.length - 1 && j > 0) {
                    if (currentGeneration[i + 1][j - 1]) {
                        numberOfNeighbors++;
                    }
                }
                if (numberOfNeighbors < 2 || numberOfNeighbors > 3) {
                    nextGeneration[i][j] = false;
                }
                if (numberOfNeighbors == 3 || numberOfNeighbors == 2) {
                    if (currentGeneration[i][j] = true) {
                        nextGeneration[i][j] = true;
                    }
                }
                if (numberOfNeighbors == 3) {
                    if (currentGeneration[i][j] = false) {
                        nextGeneration[i][j] = true;
                    }
                }
            }
        }
        return currentGeneration;
    }
}

package students.vija_m.lesson_6.level_5.task_23;

class TicTacToe {
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
}

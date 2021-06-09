package students.vija_m.lesson_6.level_5.task_24;

class TicTacToe {
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        for (int i = 0; i < 3; i++) {
            if (( field[0][0] == playerToCheck &&
                    field[1][1] == playerToCheck &&
                    field[2][2] == playerToCheck
            ) || (
                    field[2][0] == playerToCheck &&
                            field[1][1] == playerToCheck &&
                            field[0][2] == playerToCheck )) {
                return true;
            }
        }
        return false;
    }
}

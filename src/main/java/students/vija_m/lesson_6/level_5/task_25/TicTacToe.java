package students.vija_m.lesson_6.level_5.task_25;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == playerToCheck &&
                    field[i][1] == playerToCheck &&
                    field[i][2] == playerToCheck
            ) {
                return true;
            }
        }
        return false;
    }

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

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (( field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck
        ) || (
                field[2][0] == playerToCheck &&
                        field[1][1] == playerToCheck &&
                        field[0][2] == playerToCheck )) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return ( isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck) );
    }
}


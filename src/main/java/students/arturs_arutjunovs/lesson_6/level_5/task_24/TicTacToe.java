package students.arturs_arutjunovs.lesson_6.level_5.task_24;

class TicTacToe {

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == playerToCheck) {
                counter++;
            }
        }
        if (counter == field.length) {
            return true;
        } else {
            counter = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][field.length - i - 1] == playerToCheck) {
                    counter++;
                }
            }
            return (counter == field.length);
        }
    }
}

package students.eriks_jaloveckis.lesson_6.level_6.task_27;

class TicTacToe {
    public int[][] createField() {
        int emptyCell = -1;
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++)
                field[i][j] = emptyCell;
        }
        return field;
    }
}

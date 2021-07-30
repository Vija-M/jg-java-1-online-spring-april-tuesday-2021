package students.ernests_subhankulovs.lesson_13.level_4.task_25;

class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {
        for (boolean[] row : field) {
            for (boolean column : row) {
                if (column) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}

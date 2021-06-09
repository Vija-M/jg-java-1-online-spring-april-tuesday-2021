package students.vija_m.lesson_6.level_5.task_24;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.firstWinnerFirstDiagonalTest();
        test.firstWinnerSecondDiagonalTest();
        test.secondWinnerFirstDiagonalTest();
        test.secondWinnerSecondDiagonalTest();
        test.noWinnerTest();
    }

    void firstWinnerFirstDiagonalTest() {
        int[][] field = {{0, -1, 1}, {0, 0, 1}, {-1, 1, 0}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 0), "1st diagonal (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 1), "1st diagonal (if the winner isn't the 2nd player)");
    }

    void firstWinnerSecondDiagonalTest() {
        int[][] field = {{1, -1, 0}, {-1, 0, 1}, {0, 1, -1}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 0), "2nd diagonal (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 1), "2nd diagonal (if the winner isn't the 2nd player)");
    }


    void secondWinnerFirstDiagonalTest() {
        int[][] field = {{1, 1, -1}, {-1, 1, 0}, {-1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 0), "1st diagonal (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 1), "1st diagonal (if the winner is the 2nd player)");
    }

    void secondWinnerSecondDiagonalTest() {
        int[][] field = {{0, 0, 1}, {0, 1, -1}, {1, -1, -1}};
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 0), "2nd diagonal (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 1), "2nd diagonal (if the winner is the 2nd player)");
    }

    void noWinnerTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 0), "No winner (1st player)");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 1), "No winner (2nd player)");
    }

    private void assertTest(boolean expected, boolean real, String testName) {
        if (expected == real) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }
}

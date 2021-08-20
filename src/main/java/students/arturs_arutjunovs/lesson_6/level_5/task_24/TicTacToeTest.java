package students.arturs_arutjunovs.lesson_6.level_5.task_24;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();

        test.firstDiagonalPlayer1_Test();
        test.firstDiagonalPlayer2_Test();
        test.secondDiagonalPlayer1_Test();
        test.secondDiagonalPlayer2_Test();
    }

    void firstDiagonalPlayer1_Test() {
        int[][] field = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player wins - 1st diagonal");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player doesn't win - 1st diagonal");
    }

    void firstDiagonalPlayer2_Test() {
        int[][] field = {{1, 0, -1}, {0, 1, 0}, {-1, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player wins - 1st diagonal");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player doesn't win - 1st diagonal");
    }

    void secondDiagonalPlayer1_Test() {
        int[][] field = {{0, 1, 0}, {-1, 0, 1}, {0, -1, 0}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player wins - 2nd diagonal");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player doesn't win - 2n diagonal");
    }

    void secondDiagonalPlayer2_Test() {
        int[][] field = {{1, 0, 1}, {0, 1, 0}, {1, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player wins - 2nd diagonal");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player doesn't win - 2nd diagonal");
    }

    private void assertTest(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

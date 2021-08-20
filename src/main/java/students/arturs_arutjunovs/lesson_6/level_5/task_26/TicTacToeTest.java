package students.arturs_arutjunovs.lesson_6.level_5.task_26;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();

        test.testDrawPosition();
        test.testDrawPositionGameNotFinished();
        test.testDrawWinnerPosition();

    }

    void testDrawPosition() {
        int[][] field = {{0, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        assertTest(true, ticTacToe.isDrawPosition(field), "Test -> Draw position");
    }

    void testDrawPositionGameNotFinished() {
        int[][] field = {{0, 1, -1}, {1, 1, 0}, {0, 0, 1}};
        assertTest(false, ticTacToe.isDrawPosition(field), "Test -> Draw position - game not finished");
    }

    void testDrawWinnerPosition() {
        int[][] field = {{1, 1, 1}, {1, 1, 0}, {0, 0, 1}};
        assertTest(false, ticTacToe.isDrawPosition(field), "Test -> Draw winner position");
    }

    private void assertTest(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

package students.ernests_subhankulovs.lesson_6.level_5.task_22;

class TicTacToeTest {

    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testFirstLineFirstPlayer();
        ticTacToeTest.testFirstLineSecondPlayer();
        ticTacToeTest.testSecondLineFirstPlayer();
        ticTacToeTest.testSecondLineSecondPlayer();
        ticTacToeTest.testThirdLineFirstPlayer();
        ticTacToeTest.testThirdLineSecondPlayer();
        ticTacToeTest.testNoWinner();
    }

    void testFirstLineFirstPlayer() {
        int[][] field = {{0, 0, 0}, {-1, 0, -1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player wins - 1st horizontal line");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player doesn't win - 1st horizontal line");
    }

    void testFirstLineSecondPlayer() {
        int[][] field = {{1, 1, 1}, {-1, 0, -1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player wins - 1st horizontal line");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player doesn't win - 1st horizontal line");
    }

    void testSecondLineFirstPlayer() {
        int[][] field = {{-1, 0, -1}, {0, 0, 0}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player wins - 2nd horizontal line");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player doesn't win - 2nd horizontal line");

    }

    void testSecondLineSecondPlayer() {
        int[][] field = { {-1, 0, -1}, {1, 1, 1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player wins - 2nd horizontal line");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player doesn't win - 2nd horizontal line");
    }

    void testThirdLineFirstPlayer() {
        int[][] field = { {-1, 0, -1}, {0, -1, 0}, {0, 0, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player wins - 3rd horizontal line");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player doesn't win - 3rd horizontal line");

    }

    void testThirdLineSecondPlayer() {
        int[][] field = { {-1, 0, -1}, {0, -1, 0}, {1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player wins - 3rdt horizontal line");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player doesn't win - 3rd horizontal line");
    }

    void testNoWinner() {
        int[][] field = { {1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player doesn't - no winning horizontal lines");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player doesn't - no winning horizontal lines");
    }

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

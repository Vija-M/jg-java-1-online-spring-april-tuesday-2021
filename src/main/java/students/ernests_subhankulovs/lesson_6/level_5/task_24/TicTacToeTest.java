package students.ernests_subhankulovs.lesson_6.level_5.task_24;

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
        ticTacToeTest.testFirstColumnFirstPlayer();
        ticTacToeTest.testFirstColumnSecondPlayer();
        ticTacToeTest.testSecondColumnFirstPlayer();
        ticTacToeTest.testSecondColumnSecondPlayer();
        ticTacToeTest.testThirdColumnFirstPlayer();
        ticTacToeTest.testThirdColumnSecondPlayer();
        ticTacToeTest.testNoWinnerHorizontally();
        ticTacToeTest.testNoWinnerVertically();
        ticTacToeTest.testFirstDiagonalFirstPlayer();
        ticTacToeTest.testFirstDiagonalSecondPlayer();
        ticTacToeTest.testSecondDiagonalFirstPlayer();
        ticTacToeTest.testSecondDiagonalSecondPlayer();
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

    void testFirstColumnFirstPlayer() {
        int[][] field = {{0, -1, 0}, {0, 0, -1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player wins - 1st vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player doesn't win - 1st vertical column");
    }

    void testFirstColumnSecondPlayer() {
        int[][] field = {{1, -1, 0}, {1, 0, -1}, {1, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player wins - 1st vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player doesn't win - 1st vertical column");
    }

    void testSecondColumnFirstPlayer() {
        int[][] field = {{-1, 0, 0}, {-1, 0, -1}, {0, 0, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player wins - 2nd vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player doesn't win - 2nd vertical column");
    }

    void testSecondColumnSecondPlayer() {
        int[][] field = {{-1, 1, 0}, {0, 1, -1}, {-1, 1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player wins - 2nd vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player doesn't win - 2nd vertical column");
    }

    void testThirdColumnFirstPlayer() {
        int[][] field = {{-1, 0, 0}, {-1, 1, 0}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player wins - 3rd vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player doesn't win - 3rd vertical column");
    }

    void testThirdColumnSecondPlayer() {
        int[][] field = {{-1, 0, 1}, {0, -1, 1}, {-1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player wins - 3rd vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player doesn't win - 3rd vertical column");
    }

    void testFirstDiagonalFirstPlayer() {
        int[][] field = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player wins - 1st diagonal");
        assertTestResult(false, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player doesn't win - 1st diagonal");
    }

    void testFirstDiagonalSecondPlayer() {
        int[][] field = {{1, 0, -1}, {0, 1, 0}, {-1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player wins - 1st diagonal");
        assertTestResult(false, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player doesn't win - 1st diagonal");
    }

    void testSecondDiagonalFirstPlayer() {
        int[][] field = {{0, 1, 0}, {-1, 0, 1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player wins - 2nd diagonal");
        assertTestResult(false, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player doesn't win - 2n diagonal");
    }

    void testSecondDiagonalSecondPlayer() {
        int[][] field = {{1, 0, 1}, {0, 1, 0}, {1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPositionForDiagonals(field, 1), "Test if 2nd player wins - 2nd diagonal");
        assertTestResult(false, ticTacToe.isWinPositionForDiagonals(field, 0), "Test if 1st player doesn't win - 2nd diagonal");
    }

    void testNoWinnerHorizontally() {
        int[][] field = { {1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player doesn't - no winning horizontal lines");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player doesn't - no winning horizontal lines");
    }

    void testNoWinnerVertically() {
        int[][] field = { {1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player doesn't - no winning vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player doesn't - no winning vertical column");
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

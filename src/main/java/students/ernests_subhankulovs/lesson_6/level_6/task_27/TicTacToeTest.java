package students.ernests_subhankulovs.lesson_6.level_6.task_27;

import java.util.Arrays;

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
        System.out.println();
        System.out.println("The next tests are made with an unified method:");
        System.out.println();
        ticTacToeTest.testWinnerFirstLineFirstPlayer();
        ticTacToeTest.testWinnerFirstLineSecondPlayer();
        ticTacToeTest.testWinnerSecondLineFirstPlayer();
        ticTacToeTest.testWinnerSecondLineSecondPlayer();
        ticTacToeTest.testWinnerThirdLineFirstPlayer();
        ticTacToeTest.testWinnerThirdLineSecondPlayer();
        ticTacToeTest.testWinnerFirstColumnFirstPlayer();
        ticTacToeTest.testWinnerFirstColumnSecondPlayer();
        ticTacToeTest.testWinnerSecondColumnFirstPlayer();
        ticTacToeTest.testWinnerSecondColumnSecondPlayer();
        ticTacToeTest.testWinnerThirdColumnFirstPlayer();
        ticTacToeTest.testWinnerThirdColumnSecondPlayer();
        ticTacToeTest.testWinnerNoWinnerHorizontally();
        ticTacToeTest.testWinnerNoWinnerVertically();
        ticTacToeTest.testWinnerFirstDiagonalFirstPlayer();
        ticTacToeTest.testWinnerFirstDiagonalSecondPlayer();
        ticTacToeTest.testWinnerSecondDiagonalFirstPlayer();
        ticTacToeTest.testWinnerSecondDiagonalSecondPlayer();
        ticTacToeTest.testDrawPosition();
        ticTacToeTest.testNonDrawPosition();
        ticTacToeTest.testWinPositionForDraw();
        ticTacToeTest.testFieldCreation();
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
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 0), "Test if 1st player doesn't win - no winning horizontal lines");
        assertTestResult(false, ticTacToe.isWinPositionForHorizontals(field, 1), "Test if 2nd player doesn't win - no winning horizontal lines");
    }

    void testNoWinnerVertically() {
        int[][] field = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test if 1st player doesn't win - no winning vertical column");
        assertTestResult(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test if 2nd player doesn't win - no winning vertical column");
    }

    void testWinnerFirstLineFirstPlayer() {
        int[][] field = {{0, 0, 0}, {-1, 0, -1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 1st horizontal line");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 1st horizontal line");
    }

    void testWinnerFirstLineSecondPlayer() {
        int[][] field = {{1, 1, 1}, {-1, 0, -1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 1st horizontal line");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 1st horizontal line");
    }

    void testWinnerSecondLineFirstPlayer() {
        int[][] field = {{-1, 0, -1}, {0, 0, 0}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 2nd horizontal line");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 2nd horizontal line");

    }

    void testWinnerSecondLineSecondPlayer() {
        int[][] field = { {-1, 0, -1}, {1, 1, 1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 2nd horizontal line");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 2nd horizontal line");
    }

    void testWinnerThirdLineFirstPlayer() {
        int[][] field = { {-1, 0, -1}, {0, -1, 0}, {0, 0, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 3rd horizontal line");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 3rd horizontal line");

    }

    void testWinnerThirdLineSecondPlayer() {
        int[][] field = { {-1, 0, -1}, {0, -1, 0}, {1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 3rdt horizontal line");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 3rd horizontal line");
    }

    void testWinnerFirstColumnFirstPlayer() {
        int[][] field = {{0, -1, 0}, {0, 0, -1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 1st vertical column");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 1st vertical column");
    }

    void testWinnerFirstColumnSecondPlayer() {
        int[][] field = {{1, -1, 0}, {1, 0, -1}, {1, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 1st vertical column");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 1st vertical column");
    }

    void testWinnerSecondColumnFirstPlayer() {
        int[][] field = {{-1, 0, 0}, {-1, 0, -1}, {0, 0, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 2nd vertical column");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 2nd vertical column");
    }

    void testWinnerSecondColumnSecondPlayer() {
        int[][] field = {{-1, 1, 0}, {0, 1, -1}, {-1, 1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 2nd vertical column");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 2nd vertical column");
    }

    void testWinnerThirdColumnFirstPlayer() {
        int[][] field = {{-1, 0, 0}, {-1, 1, 0}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 3rd vertical column");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 3rd vertical column");
    }

    void testWinnerThirdColumnSecondPlayer() {
        int[][] field = {{-1, 0, 1}, {0, -1, 1}, {-1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 3rd vertical column");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 3rd vertical column");
    }

    void testWinnerFirstDiagonalFirstPlayer() {
        int[][] field = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 1st diagonal");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 1st diagonal");
    }

    void testWinnerFirstDiagonalSecondPlayer() {
        int[][] field = {{1, 0, -1}, {0, 1, 0}, {-1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 1st diagonal");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 1st diagonal");
    }

    void testWinnerSecondDiagonalFirstPlayer() {
        int[][] field = {{0, 1, 0}, {-1, 0, 1}, {0, -1, 0}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 0), "Test if 1st player wins - 2nd diagonal");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - 2n diagonal");
    }

    void testWinnerSecondDiagonalSecondPlayer() {
        int[][] field = {{1, 0, 1}, {0, 1, 0}, {1, 1, 1}};
        assertTestResult(true, ticTacToe.isWinPosition(field, 1), "Test if 2nd player wins - 2nd diagonal");
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - 2nd diagonal");
    }

    void testWinnerNoWinnerHorizontally() {
        int[][] field = { {1, 0, 1}, {0, -1, 0}, {1, 0, 1}};
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - no winning horizontal lines");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - no winning horizontal lines");
    }

    void testWinnerNoWinnerVertically() {
        int[][] field = {{1, 0, 1}, {0, -1, 0}, {1, 0, 1}};
        assertTestResult(false, ticTacToe.isWinPosition(field, 0), "Test if 1st player doesn't win - no winning vertical column");
        assertTestResult(false, ticTacToe.isWinPosition(field, 1), "Test if 2nd player doesn't win - no winning vertical column");
    }

    void testDrawPosition() {
        int[][] field = {{1, 0, 1}, {1, 0, 0}, {0, 1, 1}};
        assertTestResult(true, ticTacToe.isDrawPosition(field), "Test draw position");
    }

    void testNonDrawPosition() {
        int[][] field = {{-1, 0, 1}, {1, 1, 0}, {0, 0, 1}};
        assertTestResult(false, ticTacToe.isDrawPosition(field), "Test an unfinished game - not a draw position");
    }

    void testWinPositionForDraw() {
        int[][] field = {{1, 0, 1}, {1, 1, 0}, {0, 0, 1}};
        assertTestResult(false, ticTacToe.isDrawPosition(field), "Test a win scenario - not a draw position");
    }

    void testFieldCreation() {
        int[][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        assertArrayComparison(field, ticTacToe.createField(), "Test new TicTacToe field creation");
    }

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    private void assertArrayComparison(int[][] expectedArray, int[][] actualArray, String testName) {
        boolean arraysAreDifferent = false;
        for (int i = 0; i < actualArray.length; i++) {
            for (int j = 0; j < actualArray.length; j++) {
                if (actualArray[i][j] != expectedArray[i][j]) {
                    arraysAreDifferent = true;
                    break;
                }
            }
        }
        if (!arraysAreDifferent) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

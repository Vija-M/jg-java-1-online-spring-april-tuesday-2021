package students.vija_m.lesson_6.level_5.task_22;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.firstWinnerFirstLineTest();
        test.firstWinnerSecondLineTest();
        test.firstWinnerThirdLineTest();
        test.secondWinnerFirstLineTest();
        test.secondWinnerSecondLineTest();
        test.secondWinnerThirdLineTest();
        test.twoWinnersTest();
        test.noWinnerTest();
    }

    void firstWinnerFirstLineTest() {
        int[][] field = {{0, 0, 0}, {1, -1, 1}, {-1, 1, -1}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "1st line (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 1), "1st line (if the winner isn't the 2nd player)");
    }

    void firstWinnerSecondLineTest() {
        int[][] field = {{1, -1, 1}, {0, 0, 0}, {-1, 1, -1}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "2nd line (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 1), "2nd line (if the winner isn't the 2nd player)");
    }

    void firstWinnerThirdLineTest() {
        int[][] field = {{-1, 1, -1}, {1, -1, 1}, {0, 0, 0}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "3rd line (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 1), "3rd line (if the winner isn't the 2nd player)");
    }

    void secondWinnerFirstLineTest() {
        int[][] field = {{1, 1, 1}, {0, -1, 0}, {-1, 0, -1}};
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 0), "1st line (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 1), "1st line (if the winner is the 2nd player)");
    }

    void secondWinnerSecondLineTest() {
        int[][] field = {{0, -1, 0}, {1, 1, 1}, {-1, 0, -1}};
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 0), "2nd line (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 1), "2nd line (if the winner is the 2nd player)");
    }

    void secondWinnerThirdLineTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 1, 1}};
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 0), "3rd line (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 1), "3rd line (if the winner is the 2nd player)");
    }

    void twoWinnersTest() {
        int[][] field = {{0, 0, 0}, {0, -1, 0}, {1, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Two winners (1st player)");
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 1), "Two einners (2nd player)");
    }

    void noWinnerTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 0), "No winner (1st player)");
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 1), "No winner (2nd player)");
    }

    private void assertTest(boolean expected, boolean real, String testName) {
        if (expected == real) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }
}

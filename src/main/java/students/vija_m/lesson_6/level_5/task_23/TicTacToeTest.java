package students.vija_m.lesson_6.level_5.task_23;

class TicTacToeTest {

    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.firstWinnerFirstColumnTest();
        test.firstWinnerSecondColumnTest();
        test.firstWinnerThirdColumnTest();
        test.secondWinnerFirstColumnTest();
        test.secondWinnerSecondColumnTest();
        test.secondWinnerThirdColumnTest();
        test.twoWinnersTest();
        test.noWinnerTest();
    }

    void firstWinnerFirstColumnTest() {
        int[][] field = {{0, -1, 1}, {0, -1, 1}, {0, 1, -1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "1st column (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "1st column (if the winner isn't the 2nd player)");
    }

    void firstWinnerSecondColumnTest() {
        int[][] field = {{1, 0, 1}, {-1, 0, 1}, {-1, 0, -1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "2nd column (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "2nd column (if the winner isn't the 2nd player)");
    }

    void firstWinnerThirdColumnTest() {
        int[][] field = {{-1, 1, 0}, {1, -1, 0}, {-1, 1, 0}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "3rd column (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "3rd column (if the winner isn't the 2nd player)");
    }

    void secondWinnerFirstColumnTest() {
        int[][] field = {{1, 1, -1}, {1, -1, 0}, {1, 0, -1}};
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "1st column (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "1st column (if the winner is the 2nd player)");
    }

    void secondWinnerSecondColumnTest() {
        int[][] field = {{0, 1, 0}, {0, 1, -1}, {-1, 1, -1}};
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "2nd column (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "2nd column (if the winner is the 2nd player)");
    }

    void secondWinnerThirdColumnTest() {
        int[][] field = {{-1, 0, 1}, {0, -1, 1}, {0, -1, 1}};
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "3rd column (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "3rd column (if the winner is the 2nd player)");
    }

    void twoWinnersTest() {
        int[][] field = {{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Two winners (1st player)");
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Two einners (2nd player)");
    }

    void noWinnerTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "No winner (1st player)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "No winner (2nd player)");
    }

    private void assertTest(boolean expected, boolean real, String testName) {
        if (expected == real) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }
}
package students.vija_m.lesson_6.level_5.task_25;


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
        test.twoWinnersLineTest();
        test.noWinnerLineTest();
        test.firstWinnerFirstColumnTest();
        test.firstWinnerSecondColumnTest();
        test.firstWinnerThirdColumnTest();
        test.secondWinnerFirstColumnTest();
        test.secondWinnerSecondColumnTest();
        test.secondWinnerThirdColumnTest();
        test.twoWinnersColumnTest();
        test.noWinnerColumnTest();
        test.firstWinnerFirstDiagonalTest();
        test.firstWinnerSecondDiagonalTest();
        test.secondWinnerFirstDiagonalTest();
        test.secondWinnerSecondDiagonalTest();
        test.noWinnerDiagonalTest();
        System.out.println();
        test.newFirstWinnerFirstLineTest();
        test.newFirstWinnerSecondLineTest();
        test.newFirstWinnerThirdLineTest();
        test.newSecondWinnerFirstLineTest();
        test.newSecondWinnerSecondLineTest();
        test.newSecondWinnerThirdLineTest();
        test.newFirstWinnerFirstColumnTest();
        test.newFirstWinnerSecondColumnTest();
        test.newFirstWinnerThirdColumnTest();
        test.newSecondWinnerFirstColumnTest();
        test.newSecondWinnerSecondColumnTest();
        test.newSecondWinnerThirdColumnTest();
        test.newFirstWinnerFirstDiagonalTest();
        test.newFirstWinnerSecondDiagonalTest();
        test.newSecondWinnerFirstDiagonalTest();
        test.newSecondWinnerSecondDiagonalTest();
        test.newTwoWinnersTest();
        test.newNoWinnerTest();
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

    void twoWinnersLineTest() {
        int[][] field = {{0, 0, 0}, {0, -1, 0}, {1, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Two winners (1st player)");
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 1), "Two winners (2nd player)");
    }

    void noWinnerLineTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 0), "No winner (1st player)");
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 1), "No winner (2nd player)");
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

    void twoWinnersColumnTest() {
        int[][] field = {{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Two winners (1st player)");
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Two winners (2nd player)");
    }

    void noWinnerColumnTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "No winner (1st player)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "No winner (2nd player)");
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

    void noWinnerDiagonalTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 0), "No winner (1st player)");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 1), "No winner (2nd player)");
    }

    void newFirstWinnerFirstLineTest() {
        int[][] field = {{0, 0, 0}, {1, -1, 1}, {-1, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "1st line (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "1st line (if the winner isn't the 2nd player)");
    }

    void newFirstWinnerSecondLineTest() {
        int[][] field = {{1, -1, 1}, {0, 0, 0}, {-1, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "2nd line (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "2nd line (if the winner isn't the 2nd player)");
    }

    void newFirstWinnerThirdLineTest() {
        int[][] field = {{-1, 1, -1}, {1, -1, 1}, {0, 0, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "3rd line (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "3rd line (if the winner isn't the 2nd player)");
    }

    void newSecondWinnerFirstLineTest() {
        int[][] field = {{1, 1, 1}, {0, -1, 0}, {-1, 0, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "1st line (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "1st line (if the winner is the 2nd player)");
    }

    void newSecondWinnerSecondLineTest() {
        int[][] field = {{0, -1, 0}, {1, 1, 1}, {-1, 0, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "2nd line (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "2nd line (if the winner is the 2nd player)");
    }

    void newSecondWinnerThirdLineTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 1, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "3rd line (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "3rd line (if the winner is the 2nd player)");
    }

    void newFirstWinnerFirstColumnTest() {
        int[][] field = {{0, -1, 1}, {0, -1, 1}, {0, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "1st column (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "1st column (if the winner isn't the 2nd player)");
    }

    void newFirstWinnerSecondColumnTest() {
        int[][] field = {{1, 0, 1}, {-1, 0, 1}, {-1, 0, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "2nd column (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "2nd column (if the winner isn't the 2nd player)");
    }

    void newFirstWinnerThirdColumnTest() {
        int[][] field = {{-1, 1, 0}, {1, -1, 0}, {-1, 1, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "3rd column (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "3rd column (if the winner isn't the 2nd player)");
    }

    void newSecondWinnerFirstColumnTest() {
        int[][] field = {{1, 1, -1}, {1, -1, 0}, {1, 0, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "1st column (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "1st column (if the winner is the 2nd player)");
    }

    void newSecondWinnerSecondColumnTest() {
        int[][] field = {{0, 1, 0}, {0, 1, -1}, {-1, 1, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "2nd column (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "2nd column (if the winner is the 2nd player)");
    }

    void newSecondWinnerThirdColumnTest() {
        int[][] field = {{-1, 0, 1}, {0, -1, 1}, {0, -1, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "3rd column (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "3rd column (if the winner is the 2nd player)");
    }

    void newFirstWinnerFirstDiagonalTest() {
        int[][] field = {{0, -1, 1}, {0, 0, 1}, {-1, 1, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "1st diagonal (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "1st diagonal (if the winner isn't the 2nd player)");
    }

    void newFirstWinnerSecondDiagonalTest() {
        int[][] field = {{1, -1, 0}, {-1, 0, 1}, {0, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "2nd diagonal (if the winner is the 1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "2nd diagonal (if the winner isn't the 2nd player)");
    }

    void newSecondWinnerFirstDiagonalTest() {
        int[][] field = {{1, 1, -1}, {-1, 1, 0}, {-1, 0, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "1st diagonal (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "1st diagonal (if the winner is the 2nd player)");
    }

    void newSecondWinnerSecondDiagonalTest() {
        int[][] field = {{0, 0, 1}, {0, 1, -1}, {1, -1, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "2nd diagonal (if the winner isn't the 1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "2nd diagonal (if the winner is the 2nd player)");
    }

    void newTwoWinnersTest() {
        int[][] field = {{0, 0, 0}, {0, -1, 0}, {1, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Two winners (1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Two winners (2nd player)");
    }

    void newNoWinnerTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "No winner (1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "No winner (2nd player)");
    }


    private void assertTest(boolean expected, boolean real, String testName) {
        if (expected == real) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }
}

package students.arturs_arutjunovs.lesson_6.level_5.task_25;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();

        test.player1_HorizontalLine1_Test();
        test.player1_HorizontalLine2_Test();
        test.player1_HorizontalLine3_Test();
        test.player2_HorizontalLine1_Test();
        test.player2_HorizontalLine2_Test();
        test.player2_HorizontalLine3_Test();
        test.player1_VerticalLine1_Test();
        test.player1_VerticalLine2_Test();
        test.player1_VerticalLine3_Test();
        test.player2_VerticalLine1_Test();
        test.player2_VerticalLine2_Test();
        test.player2_VerticalLine3_Test();
        test.player1_DiagonalLine1_Test();
        test.player1_DiagonalLine2_Test();
        test.player2_DiagonalLine1_Test();
        test.player2_DiagonalLine2_Test();
        test.twoWinnersTest();
        test.noWinnersTest();
    }

    void player1_HorizontalLine1_Test() {
        int[][] field = {{0, 0, 0}, {1, -1, 1}, {-1, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 1st line -> if winner is 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 1st line -> if winner isn't the 2nd player");
    }

    void player1_HorizontalLine2_Test() {
        int[][] field = {{1, -1, 1}, {0, 0, 0}, {-1, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 2nd line -> if winner is the 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 2nd line -> if winner isn't the 2nd player");
    }

    void player1_HorizontalLine3_Test() {
        int[][] field = {{-1, 1, -1}, {1, -1, 1}, {0, 0, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 3rd line -> if winner is the 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 3rd line -> if winner isn't the 2nd player");
    }

    void player2_HorizontalLine1_Test() {
        int[][] field = {{1, 1, 1}, {0, -1, 0}, {-1, 0, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 1st line -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 1st line -> if the winner is the 2nd player");
    }

    void player2_HorizontalLine2_Test() {
        int[][] field = {{0, -1, 0}, {1, 1, 1}, {-1, 0, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 2nd line -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 2nd line -> if the winner is the 2nd player");
    }

    void player2_HorizontalLine3_Test() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 1, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 3rd line -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 3rd line -> if the winner is the 2nd player");
    }

    void player1_VerticalLine1_Test() {
        int[][] field = {{0, -1, 1}, {0, -1, 1}, {0, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 1st column -> if the winner is the 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 1st column -> if the winner isn't the 2nd player");
    }

    void player1_VerticalLine2_Test() {
        int[][] field = {{1, 0, 1}, {-1, 0, 1}, {-1, 0, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 2nd column -> if the winner is the 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 2nd column -> if the winner isn't the 2nd player");
    }

    void player1_VerticalLine3_Test() {
        int[][] field = {{-1, 1, 0}, {1, -1, 0}, {-1, 1, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 3rd column -> if the winner is the 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 3rd column -> if the winner isn't the 2nd player");
    }

    void player2_VerticalLine1_Test() {
        int[][] field = {{1, 1, -1}, {1, -1, 0}, {1, 0, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 1st column -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 1st column -> if the winner is the 2nd player");
    }

    void player2_VerticalLine2_Test() {
        int[][] field = {{0, 1, 0}, {0, 1, -1}, {-1, 1, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 2nd column -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 2nd column -> if the winner is the 2nd player");
    }

    void player2_VerticalLine3_Test() {
        int[][] field = {{-1, 0, 1}, {0, -1, 1}, {0, -1, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 3rd column -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 3rd column -> if the winner is the 2nd player");
    }

    void player1_DiagonalLine1_Test() {
        int[][] field = {{0, -1, 1}, {0, 0, 1}, {-1, 1, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 1st diagonal -> if the winner is the 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 1st diagonal -> if the winner isn't the 2nd player");
    }

    void player1_DiagonalLine2_Test() {
        int[][] field = {{1, -1, 0}, {-1, 0, 1}, {0, 1, -1}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Test 2nd diagonal -> if the winner is the 1st player");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test 2nd diagonal -> if the winner isn't the 2nd player");
    }

    void player2_DiagonalLine1_Test() {
        int[][] field = {{1, 1, -1}, {-1, 1, 0}, {-1, 0, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 1st diagonal -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 1st diagonal -> if the winner is the 2nd player");
    }

    void player2_DiagonalLine2_Test() {
        int[][] field = {{0, 0, 1}, {0, 1, -1}, {1, -1, -1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test 2nd diagonal -> if the winner isn't the 1st player");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test 2nd diagonal -> if the winner is the 2nd player");
    }

    void twoWinnersTest() {
        int[][] field = {{0, 0, 0}, {0, -1, 0}, {1, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Test -> Two winners (1st player)");
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Test -> Two winners (2nd player)");
    }

    void noWinnersTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Test -> No winner (1st player)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Test -> No winner (2nd player)");
    }

    private void assertTest(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

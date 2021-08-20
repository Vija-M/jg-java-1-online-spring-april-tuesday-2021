package students.arturs_arutjunovs.lesson_6.level_5.task_23;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();

        test.player1_Line1VerticalTest();
        test.player1_Line2VerticalTest();
        test.player1_Line3VerticalTest();
        test.player2_Line1VerticalTest();
        test.player2_Line2VerticalTest();
        test.player2_Line3VerticalTest();
        test.twoWinnersVerticalTest();
        test.noWinnersVerticalTest();
    }

    void player1_Line1VerticalTest() {
        int[][] field = {{0, -1, 1}, {0, -1, 1}, {0, 1, -1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Test -> if the winner - 1st player (1st line)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> if the winner - not a 2nd player (1st line)");
    }

    void player1_Line2VerticalTest() {
        int[][] field = {{1, 0, 1}, {-1, 0, 1}, {-1, 0, -1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Test -> if the winner - 1st player (2nd line)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> if the winner - not a 2nd player (2nd line)");
    }

    void player1_Line3VerticalTest() {
        int[][] field = {{-1, 1, 0}, {1, -1, 0}, {-1, 1, 0}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Test -> if the winner - 1st player (3rd line)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> if the winner - not a 2nd player (3rd line)");
    }

    void player2_Line1VerticalTest() {
        int[][] field = {{1, 1, -1}, {1, -1, 0}, {1, 0, -1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> if the winner - 2nd player (1st line)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test -> if the winner - not a 1st player (1st line)");

    }

    void player2_Line2VerticalTest() {
        int[][] field = {{0, 1, 0}, {0, 1, -1}, {-1, 1, -1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> if the winner - 2nd player (2nd line)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "est -> if the winner - not a 1st player (2nd line)");

    }

    void player2_Line3VerticalTest() {
        int[][] field = {{-1, 0, 1}, {0, -1, 1}, {0, -1, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> if the winner - 2nd player (3rd line)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test -> if the winner - not a 1st player (3rd line)");

    }

    void twoWinnersVerticalTest() {
        int[][] field = {{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Test -> if the both are winners (1st player)");
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> if the both are winners (2nd player)");
    }

    void noWinnersVerticalTest() {
        int[][] field = {{-1, 0, -1}, {0, -1, 0}, {1, 0, 1}};
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "Test -> No winners (1st player)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "Test -> No winners (2nd player)");
    }

    private void assertTest(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

package students.eriks_jaloveckis.lesson_6.level_5.task_22;
class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.test1();
        ticTacToeTest.test2();
        ticTacToeTest.test3();
        ticTacToeTest.test4();
        ticTacToeTest.test5();

    }

    public void assertTest(boolean expected, boolean realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " IS OK!");
        } else {
            System.out.println(text + " FAIL!");
        }
    }

    public void test1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{-1, 1, 0}, {1, 1, 1}, {0, 0, 1}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 1), "Win (1) - second line");
    }

    public void test2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 0, 0}, {-1, 1, 1}, {0, 1, 0}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Win (0) - first line");
    }

    public void test3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0}, {1, -1, 1}, {0, 0, 0}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Win (0) - last line");
    }
    public void test4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, 1}, {1, -1, 1}, {0, 0, 0}};
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 0), "Win first (1)");
        assertTest(true, ticTacToe.isWinPositionForHorizontals(field, 1), "Win second (0)");
    }
    public void test5() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, -1, 1}, {1, -1, 1}, {0, 1, 0}};
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 0), "Lose (1)");
        assertTest(false, ticTacToe.isWinPositionForHorizontals(field, 1), "Lose (0)");
    }
}



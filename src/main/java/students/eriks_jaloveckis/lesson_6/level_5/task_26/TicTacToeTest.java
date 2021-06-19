package students.eriks_jaloveckis.lesson_6.level_5.task_26;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.horizontalTest();
        ticTacToeTest.verticalTest();
        ticTacToeTest.diagonalTest();
        ticTacToeTest.isWinTest();
        ticTacToeTest.isDrawTest();

    }

    public void horizontalTest() {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public void verticalTest() {
        test6();
        test7();
        test8();
        test9();
        test10();
    }

    public void diagonalTest() {
        test11();
        test12();
        test13();
        test14();
        test15();
    }

    public void isWinTest() {
        test16();
        test17();
        test18();
        test19();
    }

    public void isDrawTest() {
        test20();
        test21();
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

    public void test6() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, 0}, {1, 0, 1}, {1, 0, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Win (1 verticals) - first line");
    }

    public void test7() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{-1, 0, 0}, {1, 0, 1}, {0, 0, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Win (0 verticals) - second line");
    }

    public void test8() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{-1, 1, 1}, {1, 0, 1}, {0, 0, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Win (1 verticals) - last line");
    }

    public void test9() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 1), "Win (1 verticals) - second line");
        assertTest(true, ticTacToe.isWinPositionForVerticals(field, 0), "Win (0 verticals) - first line");
    }

    public void test10() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, -1, 1}, {0, -1, 1}, {0, 1, 0}};
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 0), "Lose (1)");
        assertTest(false, ticTacToe.isWinPositionForVerticals(field, 1), "Lose (0)");
    }

    public void test11() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 1), "Win (1 diagonals) ->");
    }

    public void test12() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 0, 1}, {1, 1, 0}, {1, 1, 0}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 1), "Win (1 diagonals) <-");
    }

    public void test13() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 0, 1}, {1, 0, 1}, {1, 1, 0}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 0), "Win (0 diagonals) ->");
    }

    public void test14() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0}, {1, 0, 0}, {0, 1, 0}};
        assertTest(true, ticTacToe.isWinPositionForDiagonals(field, 0), "Win (0 diagonals) <-");
    }

    public void test15() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0}, {1, 1, 1}, {1, 1, 0}};
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 0), "Lose (0)");
        assertTest(false, ticTacToe.isWinPositionForDiagonals(field, 1), "Lose (1)");
    }

    public void test16() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{-1, 1, 0}, {1, 1, 1}, {0, 0, 1}};
        assertTest(true, ticTacToe.isWinPosition(field, 1), "Win (1) - horizontal");
    }

    public void test17() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0}, {0, -1, 1}, {0, 0, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Win (0) - vertical");
    }

    public void test18() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 0, 1}, {1, 0, 1}, {1, 1, 0}};
        assertTest(true, ticTacToe.isWinPosition(field, 0), "Win (0) - diagonals");
    }

    public void test19() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, -1, 1}, {1, -1, 1}, {0, 1, 0}};
        assertTest(false, ticTacToe.isWinPosition(field, 0), "Lose (1)");
        assertTest(false, ticTacToe.isWinPosition(field, 1), "Lose (0)");
    }

    public void test20() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0}, {1, 0, 0}, {0, 1, 1}};
        assertTest(true, ticTacToe.isDrawPosition(field), "Draw Position");
    }

    public void test21() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 0, 1}, {1, 1, 0}, {1, 1, 0}};
        assertTest(true, ticTacToe.isDrawPosition(field), "Draw Position x2");
    }
}

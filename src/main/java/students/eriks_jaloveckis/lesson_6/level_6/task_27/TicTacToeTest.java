package students.eriks_jaloveckis.lesson_6.level_6.task_27;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.test1();
    }

    public void assertTest(int[][] expected, int[][] realResult, String text) {
        if (Arrays.deepEquals(expected, realResult)) {
            System.out.println(text + " OK!");
        } else {
            System.out.println(text + " FAIL!");
        }
    }

    public void test1() {
        TicTacToe ticTacToe = new TicTacToe();
        assertTest(new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}}, ticTacToe.createField(), "-1");

    }


}



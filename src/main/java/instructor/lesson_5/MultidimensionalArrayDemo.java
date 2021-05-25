package instructor.lesson_5;

import java.util.Arrays;

class MultidimensionalArrayDemo {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', '.'},
                {'O', 'X', 'X'},
                {'.', '.', 'O'},
        };

        int row = 0;
        int col = 2;

        System.out.println("board[row][col] = " + board[row][col]);

        board[row][col] = 'X';

        System.out.println("board[row][col] = " + board[row][col]);

        System.out.println("Arrays.toString(board[0]) = " + Arrays.toString(board[0]));
        System.out.println("Arrays.toString(board[1]) = " + Arrays.toString(board[1]));
        System.out.println("Arrays.toString(board[2]) = " + Arrays.toString(board[2]));

        System.out.println(Arrays.deepToString(board));

    }
}

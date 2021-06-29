package students.ernests_subhankulovs.lesson_9.level_7.task_34;

class Board {

    public static final int rows = 6;
    public static final int columns = 7;

    Piece[][] board = new Piece[rows][columns];

    public Board() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                board[row][column] = null;
            }
        }
    }

    public boolean addPiece(int columnToAdd, String color) {
        if (columnToAdd >= 0 && columnToAdd < columns) {
            if (board[0][columnToAdd] == null) {
                for (int row = rows - 1; row >= 0; row--) {
                    if (board[row][columnToAdd] == null) {
                        board[row][columnToAdd] = new Piece(color);
                        return true;
                    }
                }
            }
            else {
                System.err.println("This column is full! Choose another one!");
                return false;
            }
        }
        else {
            System.err.println("You are trying to place the piece to a cell that does not exist!");
            return false;
        }
        return false;
    }

    public void showBoard() {
        System.out.println();
        for (int column = 0; column < columns + 1; column++) {
            System.out.print("_ ");
        }
        System.out.println();
        for (int row = 0; row < rows; row++) {
            System.out.print("|");
            for (int column = 0; column < columns; column++) {
                if (board[row][column] == null) {
                    System.out.print("_");
                }
                else {
                    System.out.print(board[row][column].getColor());
                }
                System.out.print("|");
            }
            System.out.println();
        }
        for (int column = 0; column < columns + 1; column++) {
            System.out.print("_ ");
        }
    }

    public boolean checkForWinner(String winningColor) {
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                if (board[row][column] != null) {
                    if (checkVertically(row, column, winningColor)
                     || checkHorizontally(row, column, winningColor)
                     || checkDiagonally(row, column, winningColor)) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }

    public boolean checkVertically(int row, int column, String winningColor) {
        int winningStreak = 3;
        for (int winRow = row + 1; winRow < rows; winRow++) {
            if (board[winRow][column].getColor().equals(winningColor)) {
                winningStreak--;
                if (winningStreak == 0) {
                    return true;
                }
            }
            else {
                winningStreak = 3;
            }
        }
        return false;
    }

    public boolean checkHorizontally(int row, int column, String winningColor) {
        int winningStreak = 4;
        for (int winColumn = column - 3; winColumn <= column + 3; winColumn++) {
            if (winColumn < 0) {
                continue;
            }
            if (winColumn >= columns) {
                break;
            }
            if (board[row][winColumn] != null && board[row][winColumn].getColor().equals(winningColor)) {
                winningStreak--;
                if (winningStreak == 0) {
                    return true;
                }
            }
            else {
                winningStreak = 4;
            }
        }
        return false;
    }

    private boolean checkDiagonally(int row, int column, String winningColor) {
        int winningStreak = 4;
        boolean[] diagonalDirections = {true, false};
        for (boolean diagonalDirection : diagonalDirections) {
            int reverser = diagonalDirection ? 1 : -1;
            for (int winRow = row - 3, winColumn = column - (3 * reverser); winRow <= row + 3; winRow++, winColumn += reverser) {
                if (!diagonalDirection) {
                    if (winRow < 0 || winColumn < 0) {
                        continue;
                    }
                    if (winRow >= rows || winColumn >= columns) {
                        break;
                    }
                }
                else {
                    if (winRow < 0 || winColumn >= columns) {
                        continue;
                    }
                    if (winRow >= rows || winColumn < 0) {
                        break;
                    }
                }
                if (board[winRow][winColumn] != null && board[winRow][winColumn].getColor().equals(winningColor)) {
                    if (--winningStreak == 0) return true;
                }
                else {
                    winningStreak = 4;
                }
            }
        }
        return false;
    }
}

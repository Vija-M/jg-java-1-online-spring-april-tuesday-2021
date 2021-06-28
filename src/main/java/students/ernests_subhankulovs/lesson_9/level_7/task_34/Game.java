package students.ernests_subhankulovs.lesson_9.level_7.task_34;

import java.util.Random;
import java.util.Scanner;

class Game {
    private Board board;
    private String player1Color;
    private String player2Color;
    private boolean isPlayer1Playing;

    public Game(String player1Color, String player2Color) {
        this.board = new Board();
        this.player1Color = player1Color;
        this.player2Color = player2Color;

        isPlayer1Playing = (new Random()).nextBoolean();
    }

    public void startGame() {
        String color;
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            if (isPlayer1Playing) {
                color = player1Color;
                board.showBoard();
                System.out.println("Player Y - your turn!");
            }
            else {
                color = player2Color;
                board.showBoard();
                System.out.println("Player R - your turn!");
            }

            System.out.println("Please select the column you want to put your piece in:");
            System.out.println("Choose between 1 and " + board.getColumns() + ":");
            int column = scanner.nextInt() - 1;
            boolean success = board.addPiece(column, color);
            if (success) {
                if (checkForWinner(column)) {
                    running = false;
                    board.showBoard();
                    if (isPlayer1Playing) {
                        System.out.println("Player Y won!");
                    }
                    else {
                        System.out.println("Player R won!");
                    }
                }
                isPlayer1Playing = !isPlayer1Playing;
            }
        }
    }

    public boolean checkForWinner(int column) {
        String winningColor = isPlayer1Playing ? player1Color : player2Color;
        return board.checkForWinner(winningColor);
    }
}

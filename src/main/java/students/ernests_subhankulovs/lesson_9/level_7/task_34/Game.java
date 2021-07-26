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
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            String color = isPlayer1Playing ? player1Color : player2Color;
            board.showBoard();
            System.out.println("Player " + color + " - your turn!");

            System.out.println("Please select the column you want to put your piece in:");
            System.out.println("Choose between 1 and " + Board.columns + ":");
            int column = scanner.nextInt() - 1;
            if (board.addPiece(column, color)) {
                if (hasWon(color)) {
                    running = false;
                    board.showBoard();
                    System.out.println("Player " + color + " won!");
                }
                isPlayer1Playing = !isPlayer1Playing;
            }
        }
    }

    private boolean hasWon(String playerColor) {
        return board.checkForWinner(playerColor);
    }
}

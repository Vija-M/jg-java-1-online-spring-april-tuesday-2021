package students.ernests_subhankulovs.lesson_9.level_7.task_34;

import java.util.Scanner;

class Connect4Demo {
    public static void main(String[] args) {
        boolean endGame = false;
        String choice;
        Scanner scanner = new Scanner(System.in);
        while (!endGame) {
            Game game = new Game("Y", "R");
            game.startGame();
            do {
                System.out.println("End game?");
                System.out.println("Y - End game");
                System.out.println("N - New game");
                choice = scanner.nextLine();
                switch (choice) {
                    case ("Y") -> endGame = true;
                    case ("N") -> endGame = false;
                    default -> System.err.println("Wrong input!");
                }
            } while (!choice.equals("Y") && !choice.equals("N"));
        }
    }
}

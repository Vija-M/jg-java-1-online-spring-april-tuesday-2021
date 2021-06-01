package instructor.lesson_6.slot;

import java.util.Scanner;

class GameControl {

    boolean promptPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Play again? 🤩 [y/n]: ");
        return scanner.nextLine().equalsIgnoreCase("y");
    }
}

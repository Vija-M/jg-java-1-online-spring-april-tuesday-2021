package instructor.lesson_6.slot;

class SlotMachine {

    private int balance;
    private Carousel carousel;
    private GameControl gameControl;

    SlotMachine(int balance, Carousel carousel, GameControl gameControl) {
        this.balance = balance;
        this.carousel = carousel;
        this.gameControl = gameControl;
    }

    void play() {

        int loseCounter = 0;

        while (true) {

            printNextRound();

            if (!gameControl.promptPlay()) {
                System.out.println("See you soon! Thank you for your money! 🤑");
                break;
            }

            carousel.spin();
            carousel.print();

            if (carousel.isWin()) {
                System.out.println("YOU WON! 🍾💰");
                balance += 50;
                loseCounter = 0;
            } else {
                System.out.println("YOU LOST! 🥲💸");
                balance -= 5;
                loseCounter++;
            }

            if (loseCounter == 5) {
                System.out.println("Worry not! Here is your bonus: 5$ 👍");
                balance += 5;
                loseCounter = 0;
            }

            if (balance <= 0) {
                System.out.println("Please, deposit! 💵");
                break;
            }
        }

    }

    private void printNextRound() {
        System.out.println();
        System.out.println("-= NEXT ROUND =-");
        System.out.println("Your balance: " + balance + "$");
    }
}

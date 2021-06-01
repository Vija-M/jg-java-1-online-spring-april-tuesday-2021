package instructor.lesson_6.slot;

class SlotMachineApplication {

    public static void main(String[] args) {

        Carousel carousel = new Carousel();
        GameControl gameControl = new GameControl();

        int initialBalance = 500;

        SlotMachine slotMachine = new SlotMachine(initialBalance, carousel, gameControl);

        slotMachine.play();

    }
}

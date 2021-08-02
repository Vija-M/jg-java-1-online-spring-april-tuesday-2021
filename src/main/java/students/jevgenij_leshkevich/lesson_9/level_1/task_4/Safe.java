package students.jevgenij_leshkevich.lesson_9.level_1.task_4;

class Safe {

    public int pinCode;
    public double cashAmount;

    public Safe(int pinCode, double cashAmount) {
        this.pinCode = pinCode;
        this.cashAmount = cashAmount;
    }

    void showDetails() {
        System.out.println("PIN code: " + pinCode);
        System.out.println("Cash amount: " + cashAmount);
        System.out.println();
    }

}
